/**
 * SIX OVAL - https://nakamura5akihito.github.io/
 * Copyright (C) 2010 Akihito Nakamura
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
package io.opensec.six.oval.core.repository;

import io.opensec.six.oval.core.SixOvalContext;
import io.opensec.six.oval.model.common.ClassEnumeration;
import io.opensec.six.oval.model.common.GeneratorType;
import io.opensec.six.oval.model.definitions.DefinitionsType;
import io.opensec.six.oval.model.definitions.OvalDefinitions;
import io.opensec.six.oval.model.definitions.ReferenceType;
import io.opensec.six.oval.model.results.DefinitionType;
import io.opensec.six.oval.model.results.OvalResults;
import io.opensec.six.oval.model.results.SystemType;
import io.opensec.six.oval.model.sc.InterfaceType;
import io.opensec.six.oval.model.sc.SystemInfoType;
import io.opensec.six.oval.repository.OvalRepository;
import io.opensec.util.repository.QueryResults;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;



/**
 *
 * @author	Akihito Nakamura, AIST
 */
public class OvalRepositorySummary
{

    public static void main(
                    final String[] args
                    )
    throws Exception
    {
        final OvalRepositorySummary  ovaldi = new OvalRepositorySummary();
        ovaldi.report();
    }



    private final OvalRepository  _oval_repository;



    /**
     */
    public OvalRepositorySummary()
    throws Exception
    {
        _oval_repository = SixOvalContext.repository().getRepository();
//        _oval_repository = OvalContext.getServerInstance().getBean( OvalRepositoryImpl.class );
    }



    /**
     *
     * @throws Exception
     */
    public void report()
    throws Exception
    {
        System.out.println( "\n//////////////////////////////////////////////////////////" );
        Date  datetime = new Date();
        System.out.println( "Oval Results Report, " + datetime );

        QueryResults<OvalResults>  query_results = _oval_repository.findOvalResults();
        List<OvalResults>  oval_results_list = query_results.getElements();

        /* [count] */
        System.out.println( "\n[count]" );
        long  count = oval_results_list.size();
        System.out.println( count );

        /* [history] in the date/time order */
        Collections.sort( oval_results_list, new OvalResultsTimestampComparator() );
        System.out.println( "\n[history]" );
        for (OvalResults  res : oval_results_list) {
            String  id = res.getPersistentID();
            GeneratorType  generator = res.getGenerator();
            System.out.print( id + ", " + generator.getTimestamp() + "," );
            for (SystemType  sys : res.getResults().getSystem()) {
                System.out.print( " " + sys.getOvalSystemCharacteristics().getSystemInfo().getPrimaryHostName() );
            }
            System.out.print( "\n" );
        }

        /* [details] */
        System.out.println( "\n[details]" );
        for (OvalResults  res : oval_results_list) {
            OvalDefinitions  oval_definitions = res.getOvalDefinitions();
            DefinitionsType  definitions = (oval_definitions == null ? null : oval_definitions.getDefinitions());

            System.out.println( "----------------------------------------------------------" );
            String  id = res.getPersistentID();
            GeneratorType  generator = res.getGenerator();
            System.out.println( "ID: " + id );
            System.out.println( "date/time: " + generator.getTimestamp() );
            for (SystemType  sys : res.getResults().getSystem()) {
                SystemInfoType  sys_info = sys.getOvalSystemCharacteristics().getSystemInfo();
                System.out.println( "hostname: " + sys_info.getPrimaryHostName() );
                System.out.println( "OS: " + sys_info.getOsName() + ", " + sys_info.getOsVersion() );
                for (InterfaceType  net : sys_info.getInterfaces().getInterface()) {
                    System.out.println( "IP/Mac addr: " + net.getIpAddress() + "/" + net.getMacAddress() );
                }

                System.out.println( "[vulnerability]" );
                for (DefinitionType  def_result : sys.getDefinitions().getDefinition()) {
                    io.opensec.six.oval.model.definitions.DefinitionType  def = null;
                    String  cve = null;
                    if (definitions == null) {
                    } else {
                        def = definitions.findByOvalId( def_result.getOvalId() );
                        if (def != null) {
                            if (def.getDefinitionClass() == ClassEnumeration.VULNERABILITY
                                            ||  def.getDefinitionClass() == ClassEnumeration.PATCH) {
                            } else {
                                continue;
                            }
                            for (ReferenceType  ref : def.getMetadata().getReference()) {
                                if ("CVE".equalsIgnoreCase( ref.getSource() )) {
                                    if (cve == null) {
                                        cve = ref.getRefId();
                                    } else {
                                        cve = cve + " " + ref.getRefId();
                                    }
                                }
                            }
                        }
                    }

                    if (cve != null) {
                        System.out.print( cve + ": ");
                        System.out.println( def_result.getOvalId() + ", " + def_result.getResult() );
                    }
                }

                System.out.println( "[inventory]" );
                for (DefinitionType  def_result : sys.getDefinitions().getDefinition()) {
                    io.opensec.six.oval.model.definitions.DefinitionType  def = null;
                    String  title = null;
                    if (definitions == null) {
                    } else {
                        def = definitions.findByOvalId( def_result.getOvalId() );
                        if (def != null) {
                            if (def.getDefinitionClass() != ClassEnumeration.INVENTORY) {
                                continue;
                            }
                        }
                        title = def.getMetadata().getTitle();
                        System.out.println( title + ", " + def_result.getOvalId() + ", " + def_result.getResult() );
                    }
                }

            }
        }
    }



    public static class OvalResultsTimestampComparator
    implements Comparator<OvalResults>
    {
        @Override
        public int compare( final OvalResults o1, final OvalResults o2 )
        {
            GeneratorType  generator1 = o1.getGenerator();
            GeneratorType  generator2 = o2.getGenerator();

            return String.CASE_INSENSITIVE_ORDER.compare( generator1.getTimestamp(), generator2.getTimestamp() );
        }


        @Override
        public boolean equals( final Object obj )
        {
            return OvalResultsTimestampComparator.class.isInstance( obj );
        }
    }

}
//
