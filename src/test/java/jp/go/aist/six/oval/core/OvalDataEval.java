/**
 * SIX OVAL - http://code.google.com/p/six-oval/
 * Copyright (C) 2010
 *   National Institute of Advanced Industrial Science and Technology (AIST)
 *   Registration Number: H22PRO-1124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.go.aist.six.oval.core;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import jp.go.aist.six.oval.model.AffectedCpeList;
import jp.go.aist.six.oval.model.Cpe;
import jp.go.aist.six.oval.model.OvalObject;
import jp.go.aist.six.oval.model.common.ClassEnumeration;
import jp.go.aist.six.oval.model.definitions.AffectedType;
import jp.go.aist.six.oval.model.definitions.DefinitionType;
import jp.go.aist.six.oval.model.definitions.Product;
import jp.go.aist.six.oval.model.definitions.ReferenceType;
import jp.go.aist.six.oval.model.redhat.Advisory;
import jp.go.aist.six.oval.repository.DefinitionQueryParams;
import jp.go.aist.six.oval.repository.OvalRepository;
import jp.go.aist.six.util.repository.QueryResults;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: OvalDataEval.java 3126 2013-04-30 09:41:49Z nakamura5akihito@gmail.com $
 */
public class OvalDataEval
{

    private OvalRepository  _oval_repository;



    /**
     */
    public OvalDataEval()
    {
    }



    /**
     */
    @Before
    public void setUp()
    throws Exception
    {
        _oval_repository = SixOvalContext.repository().getRepository();
    }


    ///////////////////////////////////////////////////////////////////////
    //  repository support methods
    ///////////////////////////////////////////////////////////////////////


    /**
     * Mitre OVAL Def, vulnerability class
     */
    private List<DefinitionType> _findVulnDefByYearMitre(
                    final int year
                    )
    throws Exception
    {
        return _findVulnDef( ClassEnumeration.VULNERABILITY,
                        "oval:org.mitre.oval:def:*",
                        "CVE-" + year + "-*"
                        );
    }


    /**
     * Red Hat OVAL Def, patch class
     */
    private List<DefinitionType> _findVulnDefByYearRedHat(
                    final int year
                    )
    throws Exception
    {
        return _findVulnDef( ClassEnumeration.PATCH,
                        "oval:com.redhat.rhsa:def:*",
                        "CVE-" + year + "-*"
                        );
    }



    private List<DefinitionType> _findVulnDef(
                    final ClassEnumeration  def_class,
                    final String oval_id_pattern,
                    final String cve_pattern
                    )
    throws Exception
    {
        DefinitionQueryParams  params = new DefinitionQueryParams();
        params.setDefinitionClass( def_class );
        params.setId( oval_id_pattern );
        params.setDeprecated( "!true" );    //deprecated
        params.setRefId( cve_pattern );

        QueryResults<DefinitionType>  query_results = _oval_repository.findDefinition( params );
        List<DefinitionType>  def_list = query_results.getElements();

        return def_list;
    }




    ///////////////////////////////////////////////////////////////////////
    // year-OVAL
    ///////////////////////////////////////////////////////////////////////

    /**
     * OVAL Stat (yearly)
     * -- number of definitions whose class is vuln(Mitre) or patch(RedHat) --
     *
     * 1999, count1, [OVAL def list1]
     * 2000, count2, [OVAL def list2]
     * ...
     */
    @Test
    public void reportOvalStatByYear()
    throws Exception
    {
        int  year_begin = 1999;
        int  year_end   = 2012;

        String  time_span = String.valueOf( year_begin ) + "-" + year_end;
        PrintStream  output_file = new PrintStream(
                        "oval-stat_by-year_" + time_span + "_" + System.currentTimeMillis() + ".txt" );
        _println( output_file, "Year,OVALs (Mitre),OVALs(Red Hat)" );

        List<DefinitionType>  def_list = null;
        for (int  year = year_begin; year <= year_end; year++) {
            StringBuffer  line = new StringBuffer();
            line.append( year );

            def_list = _findVulnDefByYearMitre( year );
            line.append( "," ).append( def_list.size() );

            def_list = _findVulnDefByYearRedHat( year );
            line.append( "," ).append( def_list.size() );

            _println( output_file, line.toString() );
        }

    }


    /**
     * OVAL Stat (yearly CVEs), Mitre
     *
     * 1999, count1, [cve-list1]
     * 2000, count2, [cve-list2]
     * ...
     */
    @Test
    public void reportOvalStatByYearCveMitre()
    throws Exception
    {
        int  year_begin = 1999;
//        int  year_begin = 2010;
        int  year_end   = 2012;

        String  time_span = String.valueOf( year_begin ) + "-" + year_end;
        PrintStream  output_file = new PrintStream(
                        "oval-stat_by-year-cve_mitre_" + time_span + "_" + System.currentTimeMillis() + ".txt" );

        for (int  year = year_begin; year <= year_end; year++) {
            List<DefinitionType>  def_list = _findVulnDefByYearMitre( year );
            SortedSet<String>  year_cve_list = _buildYearCveList( def_list, year );

            StringBuffer  line = new StringBuffer();
            line.append( year );
            line.append( "," ).append( year_cve_list.size() );
            line.append( "," ).append( year_cve_list );

            _println( output_file, line.toString() );
        }

    }



    /**
     * Picks up the specified year CVE IDs from the given definitions.
     */
    private SortedSet<String> _buildYearCveList(
                    final Collection<DefinitionType> def_list,
                    final int year
                    )
    {
        SortedSet<String>  cve_set = new TreeSet<String>();

        String  cve_prefix = "CVE-";
        if (year != 0) {
            cve_prefix = cve_prefix + String.valueOf( year );
        }

        for (DefinitionType  def : def_list) {
            if (def.getDeprecated() == Boolean.TRUE) {
                continue;
            }

            Collection<ReferenceType>  ref_list = def.getMetadata().getReference();
            if (ref_list != null) {
                for (ReferenceType  ref : ref_list) {
                    if ("CVE".equals( ref.getSource() )) {
                        String  cve_id = ref.getRefId();
                        if (cve_id.startsWith( cve_prefix )) {
                            cve_set.add( cve_id );
                        }
                    }
                }
            }
        }

        return cve_set;
    }




    /**
     * OVAL Stat (yearly CVEs), Red Hat
     *
     * 1999, count1, [cve-list1]
     * 2000, count2, [cve-list2]
     * ...
     */
    @Test
    public void reportOvalStatByYearCveRedHat()
    throws Exception
    {
        int  year_begin = 1999;
//        int  year_begin = 2010;
        int  year_end   = 2012;

        String  time_span = String.valueOf( year_begin ) + "-" + year_end;
        PrintStream  output_file = new PrintStream(
                        "oval-stat_by-year-cve_redhat_" + time_span + "_" + System.currentTimeMillis() + ".txt" );

        for (int  year = year_begin; year <= year_end; year++) {
            List<DefinitionType>  def_list = _findVulnDefByYearRedHat( year );
            SortedSet<String>  year_cve_list = _buildYearCveList( def_list, year );

            StringBuffer  line = new StringBuffer();
            line.append( year );
            line.append( "," ).append( year_cve_list.size() );
            line.append( "," ).append( year_cve_list );

            _println( output_file, line.toString() );
        }

    }





    ///////////////////////////////////////////////////////////////////////
    // OVAL-CVE
    ///////////////////////////////////////////////////////////////////////

    /**
     *  OVAL product coverage, name unification required!!!
     */
    private static final Map<String,String> _createProductNameMapping()
    {
        Map<String,String>  map = new HashMap<String,String>();

        String  ie = "microsoft ie";
        map.put( "microsoft internet explorer",                     ie );
        map.put( "microsoft internet explorer 10",                  ie );
        map.put( "microsoft internet explorer 5.01",                ie );
        map.put( "microsoft internet explorer 6",                   ie );
        map.put( "microsoft internet explorer 7",                   ie );
        map.put( "microsoft internet explorer 8",                   ie );
        map.put( "microsoft internet explorer 9",                   ie );
        map.put( "internet explorer is installed on the system.",   ie );

        String  java = "sun-oracle jdk-jre";
        map.put( "java development kit",        java );
        map.put( "java runtime environment",    java );
        map.put( "oracle java se",              java );
        map.put( "java development kit",        java );
        map.put( "java runtime environment",    java );

        String  office = "microsoft office";
        map.put( "microsoft office xp",             office );
        map.put( "microsoft office xp sp2",         office );
        map.put( "microsoft office xp sp3",         office );
        map.put( "microsoft office 2000",           office );
        map.put( "microsoft office 2000 sp3",       office );
        map.put( "microsoft office 2002",           office );
        map.put( "microsoft office 2003",           office );
        map.put( "microsoft office 2007",           office );
        map.put( "microsoft office 2008",           office );
        map.put( "microsoft office 2008 for mac",   office );
        map.put( "microsoft office 2010",           office );
        map.put( "microsoft office 2011 for mac",   office );

        String  excel = "microsoft excel";
        map.put( "microsoft excel 97",             excel );
        map.put( "microsoft excel 2000",           excel );
        map.put( "microsoft excel 2002",           excel );
        map.put( "microsoft excel 2003",           excel );
        map.put( "microsoft excel 2007",           excel );
        map.put( "microsoft excel 2010",           excel );

        String  adobe_reader = "adobe reader";
        map.put( "adobe acrobat reader",    adobe_reader );

        String  flash = "adobe flash player";
        map.put( "flash player",            flash );

        return map;
    }

    private static final Map<String,String>  _PRODUCT_NAME_MAP_ = _createProductNameMapping();


    /**
     */
    private static final String _correctProductName(
                    final String name
                    )
    {
        String  product_name = name.toLowerCase();
        //NOTE: there may be upper case name, lower case name, and mixture name
        // e.g. "Adobe AIR" and "Adobe Air"

        String  correct_name = _PRODUCT_NAME_MAP_.get( product_name );

        return (correct_name == null ? product_name : correct_name);
    }



    /**
     * product1, count1, [cve-list1]
     * product2, count2, [cve-list2]
     * ...
     */
    @Test
    public void reportOvalStatByProductCveMitre()
    throws Exception
    {
//        int  year_begin = 1999;
        int  year_begin = 2010;
        int  year_end   = 2012;

        String  time_span = String.valueOf( year_begin ) + "-" + year_end;
        PrintStream  output_file = new PrintStream(
                        "oval-stat_by-product_cve_mitre_" + time_span + "_" + System.currentTimeMillis() + ".txt" );

        Map<String,Collection<String>>  total_map = new TreeMap<String,Collection<String>>();

        for (int  year = year_begin; year <= year_end; year++) {
            List<DefinitionType>  def_list = _findVulnDefByYearMitre( year );

            Map<String,Collection<String>>  year_map = new TreeMap<String,Collection<String>>();
            _buildProductCveMapping( year_map, def_list, year );
            _printProductMapping( output_file,
                            "\n[[[ OVAL Stat by Product (CVE, " + year + ") ]]]",
                            year_map
                            );

            _buildProductCveMapping( total_map, def_list, 0 );
        }

        _printProductMapping( output_file,
                        "\n[[[ OVAL Stat by Product (CVE, " + time_span + ") ]]]",
                        total_map
                        );

    }



    /**
     * product --- CVE IDs.
     *
     * mozilla Firefox --- CVE-2010-0176, ...
     * adobe reader    --- CVE-2012-xxxx, ...
     */
    private void _buildProductCveMapping(
                    final Map<String,Collection<String>> map,
                    final Collection<DefinitionType> def_list,
                    final int year
                    )
    {
        String  cve_prefix = "CVE-";
        if (year != 0) {
            cve_prefix = cve_prefix + String.valueOf( year );
        }

        for (DefinitionType  def : def_list) {
            if (def.getDeprecated() == Boolean.TRUE) {
                continue;
            }

            Collection<AffectedType>  affected = def.getMetadata().getAffected();
            if (affected != null) {
                for (AffectedType  a : affected) {
                    for (Product  product : a.getProduct()) {
                        String  product_name = product.getName();

                        product_name = _correctProductName( product_name );

                        Collection<String>  map_def_list = map.get( product_name );
                        if (map_def_list == null) {
                            map_def_list = new TreeSet<String>();
                            map.put( product_name, map_def_list );
                        }

                        Collection<ReferenceType>  ref_list = def.getMetadata().getReference();
                        if (ref_list != null) {
                            for (ReferenceType  ref : ref_list) {
                                if ("CVE".equals( ref.getSource() )) {
                                    String  cve_id = ref.getRefId();
                                    if (cve_id.startsWith( cve_prefix )) {
                                        map_def_list.add( cve_id );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }



    /**
     * product --- [string list].
     *
     * mozilla Firefox --- a, b, ...
     * adobe reader    --- a, b, ...
     */
    private void _printProductMapping(
                    final PrintStream output,
                    final String header,
                    final Map<String,Collection<String>> map
                    )
    {
        _println( output, header );

        for (String  product_name : map.keySet()) {
            Collection<String>  list = map.get( product_name );

            StringBuilder  line = new StringBuilder();
            line.append( product_name );
            line.append( "," ).append( (list == null ? 0 : list.size()) );
            line.append( "," ).append( list );

            _println( output, line.toString() );
        }
    }





    ///////////////////////////////////////////////////////////////////////
    // ここから下は作り直し!!!
    ///////////////////////////////////////////////////////////////////////




    //
    //
    //




    /**
     * Number of OVAL Definitions whose class is vulnerability.
     *
     * This can't be used for counting coverage of CVEs by OVALs.
     * Because multiple definitions may exist for one single CVE.
     * For example, oval:org.mitre.oval:def:1557 and oval:org.mitre.oval:def:1987
     * both checks for CVE-2005-2628.
     *
     * product1, count1, [oval-def-list1]
     * product2, count2, [oval-def-list2]
     * ...
     */
    @Test
    public void reportOvalStatByProductMitre()
    throws Exception
    {
        int  year_begin = 1999;
//        int  year_begin = 2010;
        int  year_end   = 2012;

        String  time_span = String.valueOf( year_begin ) + "-" + year_end;
        PrintStream  output_file = new PrintStream(
                        "oval-stat_by-product_mitre_" + time_span + "_" + System.currentTimeMillis() + ".txt" );

        Map<String,Collection<String>>  total_map = new TreeMap<String,Collection<String>>();

        DefinitionQueryParams  params = new DefinitionQueryParams();
        for (int  year = year_begin; year <= year_end; year++) {
            params.setDefinitionClass( ClassEnumeration.VULNERABILITY );
            params.setId( "oval:org.mitre.oval:def:*" );
//            params.setDeprecated( "!true" );
            String  cve_pattern = "CVE-" + year + "-*";
            params.setRefId( cve_pattern );

            QueryResults<DefinitionType>  query_results = _oval_repository.findDefinition( params );
            List<DefinitionType>  def_list = query_results.getElements();

            Map<String,Collection<String>>  yearly_map = new TreeMap<String,Collection<String>>();
            _buildProductMapping( yearly_map, def_list );
            _printProductMapping( output_file,
                            "\n[[[Mitre OVAL Product Coverage (" + year + ") ]]]",
                            yearly_map
                            );

            _buildProductMapping( total_map, def_list );
        }

        _printProductMapping( output_file,
                        "\n[[[ OVAL Stat by Product (" + time_span + ") ]]]",
                        total_map
                        );

    }


    /**
     * Mapping from product name to OVAL Def IDs.
     *
     * mozilla Firefox --- oval:...:7222, ...
     * adobe reader    --- oval:...:xxxx, ...
     */
    private void _buildProductMapping(
                    final Map<String,Collection<String>> map,
                    final Collection<DefinitionType> def_list
                    )
    {
        for (DefinitionType  def : def_list) {
            if (def.getDeprecated() == Boolean.TRUE) {
                continue;
            }

            Collection<AffectedType>  affected = def.getMetadata().getAffected();
            if (affected != null) {
                for (AffectedType  a : affected) {
                    for (Product  product : a.getProduct()) {
                        String  product_name = product.getName();

                        product_name = _correctProductName( product_name );

                        Collection<String>  map_def_list = map.get( product_name );
                        if (map_def_list == null) {
                            map_def_list = new TreeSet<String>();
                            map.put( product_name, map_def_list );
                        }
                        map_def_list.add( def.getOvalId() );
                    }
                }
            }
        }
    }





    ///////////////////////////////////////////////////////////////////////
    //  Red Hat
    ///////////////////////////////////////////////////////////////////////


    /**
     * Don' use this!!!
     *
     * NOTE:
     * This test does NOT report intended results.
     * All the CPE names in the advisory metadata are Red Hat platform names,
     * NOT the names of the applications really vulnerable.
     */
    @Test
    public void reportRedHatProductCoverage()
    throws Exception
    {
        PrintStream  outfile = new PrintStream(
                        "oval_product-coverage_redhat_" + System.currentTimeMillis() + ".txt" );

        Map<String,Collection<String>>  map = new TreeMap<String,Collection<String>>();

        DefinitionQueryParams  params = new DefinitionQueryParams();
        for (int  year = 1999; year <= 2013; year++) {
            params.setDefinitionClass( ClassEnumeration.PATCH );
            params.setId( "oval:com.redhat.rhsa:def:*" );
            String  cve_pattern = "CVE-" + year + "-*";
            params.setRefId( cve_pattern );

            QueryResults<DefinitionType>  query_results = _oval_repository.findDefinition( params );
            List<DefinitionType>  def_list = query_results.getElements();

            Map<String,Collection<String>>  yearly_map = new TreeMap<String,Collection<String>>();
            _buildProductMapping( yearly_map, def_list );
            _printProductMapping( outfile,
                            "\n[[[ Red Hat OVAL Product Coverage (" + year + ") ]]]",
                            yearly_map
                            );

            _buildRedHatProductMapping( map, def_list );
        }

        _printProductMapping( outfile,
                        "\n[[[ Red Hat OVAL Product Coverage (all) ]]]",
                        map
                        );
    }


    /**
     * Mapping from product name to OVAL Def IDs.
     *
     * mozilla Firefox --- oval:...:7222, ...
     * adobe reader    --- oval:...:xxxx, ...
     */
    private void _buildRedHatProductMapping(
                    final Map<String,Collection<String>> map,
                    final Collection<DefinitionType> def_list
                    )
    {
        for (DefinitionType  def : def_list) {
            Collection<OvalObject>  metadata = def.getMetadata().getAdditionalMetadata();
            if (metadata != null) {
                for (OvalObject  a : metadata) {
                    if (a instanceof Advisory) {
                        Advisory  advisory = (Advisory)a;
                        AffectedCpeList  cpe_list = advisory.getAffectedCpeList();
                        if (cpe_list == null) {
                            continue;
                        }

                        for (Cpe  cpe : cpe_list.getCpe()) {
                            CpeName  cpe_name = new CpeName( cpe.getName() );
                            String  product_name = cpe_name.getVendor() + ":" + cpe_name.getName();

//                            product_name = _correctProductName( product_name );

                            Collection<String>  map_def_list = map.get( product_name );
                            if (map_def_list == null) {
                                map_def_list = new TreeSet<String>();
                                map.put( product_name, map_def_list );
                            }
                            map_def_list.add( def.getOvalId() );
                        }
                    }
                }
            }
        }
    }






    /**
     */
    @Test
    public void reportMitreFamilyProductCoverage()
    throws Exception
    {
        PrintStream  outfile = new PrintStream(
                        "oval_family-product-coverage_mitre_" + System.currentTimeMillis() + ".txt" );

        System.out.println( "[[[Mitre OVAL Family-Product Coverage]]]" );

        Map<String,Collection<String>>  map = new TreeMap<String,Collection<String>>();

        DefinitionQueryParams  params = new DefinitionQueryParams();
        for (int  year = 1999; year <= 2013; year++) {
            params.setDefinitionClass( ClassEnumeration.VULNERABILITY );
            params.setId( "oval:org.mitre.oval:def:*" );
            String  cve_pattern = "CVE-" + year + "-*";
            params.setRefId( cve_pattern );

            QueryResults<DefinitionType>  query_results = _oval_repository.findDefinition( params );
            List<DefinitionType>  def_list = query_results.getElements();

            Map<String,Collection<String>>  yearly_map = new TreeMap<String,Collection<String>>();
            _buildFamilyProductMapping( yearly_map, def_list );
            _printProductMapping( outfile,
                            "\n[[[Mitre OVAL Family-Product Coverage (" + year + ") ]]]",
                            yearly_map
                            );

            _buildFamilyProductMapping( map, def_list );
        }

        _printProductMapping( outfile,
                        "\n[[[Mitre OVAL Family-Product Coverage (all) ]]]",
                        map
                        );
    }


    /**
     * Mapping from family/product name to OVAL Def IDs.
     *
     * windows,Mozilla Firefox --- oval:...:7222, ...
     * windows,Adobe Reader    --- oval:...:xxxx, ...
     */
    private void _buildFamilyProductMapping(
                    final Map<String,Collection<String>> map,
                    final Collection<DefinitionType> def_list
                    )
    {
        for (DefinitionType  def : def_list) {
            Collection<AffectedType>  affected = def.getMetadata().getAffected();
            if (affected != null) {
                for (AffectedType  a : affected) {
                    for (Product  product : a.getProduct()) {
                        String  product_name = a.getFamily() + "," + product.getName();
                        //NOTE: there are products supported for multiple platforms, e.g. firefox
                        // "windows,Mozilla Firefox", "linux:Mozilla Firefox"

                        product_name = product_name.toLowerCase();
                        //NOTE: there may be upper case name, lower case name, and mixture name
                        // e.g. "Adobe AIR" and "Adobe Air"

                        Collection<String>  map_def_list = map.get( product_name );
                        if (map_def_list == null) {
                            map_def_list = new TreeSet<String>();
                            map.put( product_name, map_def_list );
                        }
                        map_def_list.add( def.getOvalId() );
                    }
                }
            }
        }
    }


    /**
     */
    @Test
    public void reportRedHatCveCoverage()
    throws Exception
    {
        PrintStream  outfile = new PrintStream(
                        "oval_cve-coverage_redhat_" + System.currentTimeMillis() + ".txt" );

        System.out.println( "[[[Red Hat OVAL CVE Coverage]]]" );

        Map<String,DefinitionType>  cve_map = new TreeMap<String,DefinitionType>();

        DefinitionQueryParams  params = new DefinitionQueryParams();
        for (int  year = 1999; year <= 2013; year++) {
            params.setDefinitionClass( ClassEnumeration.PATCH );
            params.setId( "oval:com.redhat.rhsa:def:*" );
            String  cve_prefix = "CVE-" + year + "-";
            params.setRefId( cve_prefix + "*" );

            QueryResults<DefinitionType>  query_results = _oval_repository.findDefinition( params );
            List<DefinitionType>  def_list = query_results.getElements();

            Map<String,DefinitionType>  yearly_cve_map = new TreeMap<String,DefinitionType>();
            _buildCveMapping2( yearly_cve_map, def_list, cve_prefix );
            _printCveMapping( outfile,
                            "\n[[[Red Hat OVAL CVE Coverage (" + year + ") ]]]",
                            yearly_cve_map
                            );

            _buildCveMapping2( cve_map, def_list, null );
        }

        _printCveMapping( outfile,
                        "\n[[[Red Hat OVAL CVE Coverage (1999-2013) ]]]",
                        cve_map
                        );
    }


    /**
     */
    @Test
    public void reportMitreCveCoverage()
    throws Exception
    {
        PrintStream  outfile = new PrintStream(
                        "oval_cve-coverage_mitre_" + System.currentTimeMillis() + ".txt" );

        System.out.println( "[[[Mitre OVAL CVE Coverage]]]" );

        Map<String,DefinitionType>  cve_map = new TreeMap<String,DefinitionType>();

        DefinitionQueryParams  params = new DefinitionQueryParams();
        for (int  year = 1999; year <= 2013; year++) {
            params.setDefinitionClass( ClassEnumeration.VULNERABILITY );
            params.setId( "oval:org.mitre.oval:def:*" );
            String  cve_pattern = "CVE-" + year + "-*";
            params.setRefId( cve_pattern );

            QueryResults<DefinitionType>  query_results = _oval_repository.findDefinition( params );
            List<DefinitionType>  def_list = query_results.getElements();

            Map<String,DefinitionType>  yearly_cve_map = new TreeMap<String,DefinitionType>();
            _buildCveMapping( yearly_cve_map, def_list );
            _printCveMapping( outfile,
                            "\n[[[Mitre OVAL CVE Coverage (" + year + ") ]]]",
                            yearly_cve_map
                            );

            _buildCveMapping( cve_map, def_list );
        }

        _printCveMapping( outfile,
                        "\n[[[Mitre OVAL CVE Coverage (1999-2013) ]]]",
                        cve_map
                        );
    }


    /**
     */
    private void _buildCveMapping2(
                    final Map<String,DefinitionType> cve_map,
                    final Collection<DefinitionType> def_list,
                    final String cve_prefix
                    )
    {
        for (DefinitionType  def : def_list) {
            for (ReferenceType  ref : def.getMetadata().getReference()) {
                if ("CVE".equalsIgnoreCase( ref.getSource() )) {
                    String  cve = ref.getRefId();
                    if (cve != null) {
                        if (cve_prefix == null  ||  cve.startsWith( cve_prefix )) {
                            cve_map.put( cve, def );
                        }
                    }
                }
            }
        }
    }


    private void _buildCveMapping(
                    final Map<String,DefinitionType> cve_map,
                    final Collection<DefinitionType> def_list
                    )
    {
        for (DefinitionType  def : def_list) {
            String  cve = _getCveFrom( def );
            if (cve != null) {
                cve_map.put( cve, def );
            }
        }
    }



    private void _printCveMapping(
                    final PrintStream output,
                    final String header,
                    final Map<String,DefinitionType> map
                    )
    {
        _println( output, header );

        for (String  cve : map.keySet()) {
            DefinitionType  def = map.get( cve );

            StringBuilder  line = new StringBuilder();
            line.append( cve );
            line.append( "," ).append( def.getOvalId() );
            line.append( "," ).append( def.getOvalVersion() );

            _println( output, line.toString() );
        }
    }



    /**
     */
    private String _getCveFrom(
                    final DefinitionType def
                    )
    {
        String  cve = null;
        for (ReferenceType  ref : def.getMetadata().getReference()) {
            if ("CVE".equalsIgnoreCase( ref.getSource() )) {
                if (cve != null) {
                    cve = cve + " ";
                }
                cve = ref.getRefId();
            }
        }

        return cve;
    }



    /**
     */
    private void _println(
                    final PrintStream output,
                    final String txt
                    )
    {
        if (System.out != output) {
            System.out.println( txt );
            System.out.flush();
        }

        output.println( txt );
        output.flush();
    }



    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////



//    @Test
//    public void reportRedHatCveCoverage2012()
//    throws Exception
//    {
//        System.out.println( "\n//////////////////////////////////////////////////////////" );
//        System.out.println( "[[[Red Hat OVAL CVE Coverage]]]" );
//
//        DefinitionQueryParams  params = new DefinitionQueryParams();
//        params.setId( "oval:com.redhat.rhsa:def:*" );
//        params.setDefinitionClass( ClassEnumeration.PATCH );
//        params.setRefId( "CVE-2012-*" );
////        params.setRefSource( "CVE" );
//        QueryResults<DefinitionType>  query_results = _oval_repository.findDefinition( params );
//        List<DefinitionType>  def_list = query_results.getElements();
//        Map<String,String>  mapping = _createOvalCveMapping( def_list );
//
////        for (String  cve : mapping.keySet()) {
////            System.out.println( cve + "," + mapping.get( cve )  );
////        }
//
//        int  i = 1;
//        int  limit = 6535;
//        for (String  cve : mapping.keySet()) {
//            if (!cve.startsWith( "CVE-2012-" )) {
//                continue;
//            }
//            int  num = _getCveNumberAsInt( cve );
//            if (i < num) {
//                while (i < num) {
//                    System.out.println( "CVE-2012-" + _toCveNumber( i ) + "," );
//                    i++;
//                }
//            }
//
//            System.out.println( cve + "," + mapping.get( cve )  );
//            i++;
//        }
//
//        while (i <= limit) {
//            System.out.println( "CVE-2012-" + _toCveNumber( i ) + "," );
//            i++;
//        }
//    }




//    private Map<String,String>_createOvalCveMapping(
//                    final List<DefinitionType> def_list
//                    )
//    {
//        Map<String,String>  map = new TreeMap<String,String>();
//
//        for (DefinitionType  def : def_list) {
//            String  cve = _getCveFrom( def );
//            if (cve != null) {
//                map.put( cve, def.getOvalId() );
//            }
//        }
//
//        return map;
//    }



//    private int _getCveNumberAsInt(
//                    final String cve
//                    )
//    {
//        String  n = cve.substring( 9 );
//        for (int  i = 0; i < 4; i++) {
//            if (n.startsWith( "0" )) {
//                n = n.substring( 1 );
//            }
//        }
//
//        return Integer.valueOf( n );
//    }



//    private static final String[]  _ZERO_PADDING_ = new String[] {
//        "0000", "000", "00", "0", ""
//    };
//
//    private String _toCveNumber(
//                    final int i
//                    )
//    {
//        String  num = String.valueOf( i );
//        int  len = num.length();
//        num = _ZERO_PADDING_[len] + num;
//
//        return num;
//    }


}
//
