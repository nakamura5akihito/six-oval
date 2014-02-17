package jp.go.aist.six.oval.core;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import jp.go.aist.six.oval.core.repository.OvalDocumentInstaller;
import jp.go.aist.six.oval.model.common.ClassEnumeration;
import jp.go.aist.six.oval.model.definitions.DefinitionType;
import jp.go.aist.six.oval.repository.DefinitionQueryParams;
import jp.go.aist.six.util.repository.QueryResults;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;



/**
 */
@RunWith( Enclosed.class )
public class OvalAnalyzer
{

    private static final  String  _OUTPUT_DIR_ = "analysis";

    private static void _mkdirs()
    {
        File  dir = new File( _OUTPUT_DIR_ );
        dir.mkdirs();
    }


    private static File _createOutputFile(
                    final String filename
                    )
    {
        File  file = new File( _OUTPUT_DIR_, filename );
        return file;
    }



    /**
     */
    public static class CountEntries
    extends OvalTestBase
    {

        public CountEntries()
        {
            super( SixOvalContext.repository() );
        }


        @Before
        public void setUp()
        {
            _mkdirs();
        }


        /**
         * OVAL Stat (yearly)
         * -- number of definitions whose class is vuln(Mitre) or patch(RedHat) --
         *
         * Year, OVALs (Mitre), OVALs(Red Hat)
         * 1999, countM1,       countR1
         * 2000, countM2,       countR2
         * ...
         */
        @Test
        public void reportNumberOfEntriesByYear()
        throws Exception
        {
            int  year_begin = 1999;
            int  year_end   = 2012;

            String  time_span = String.valueOf( year_begin ) + "-" + year_end;
            File  file = _createOutputFile(
                            "oval-entries_by-year_" + time_span
                            + "_" + System.currentTimeMillis() + ".txt" );
            PrintStream  output_file = new PrintStream( file );

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


        /**
         */
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
            params.setDeprecated( "!true" );    //remove "deprecated" definitions
            params.setRefId( cve_pattern );

            QueryResults<DefinitionType>  query_results = _getRepository().findDefinition( params );
            List<DefinitionType>  def_list = query_results.getElements();

            return def_list;
        }
    }
    //




    ///////////////////////////////////////////////////////////////////////
    //  Setup
    ///////////////////////////////////////////////////////////////////////

    private static final String  _DATA_DIR_ = "src/test/resources/data/20130313";

    private static final String[]  _DATA_FILENAMES_ = new String[] {
        "20130313_mitre_vuln_macos.xml",
        "20130313_mitre_vuln_unix.xml",
        "20130313_mitre_vuln_windows.xml",

        //        "20130313_mitre_vuln.xml"

        "20130313_com.redhat.rhsa-all.xml"
    };



    /**
     * Setup:
     */
    public static class Setup
//    extends OvalTestBase
    {

        public Setup()
        {
//            super( SixOvalContext.repository() );
        }


        public static String[] dataFilepathList()
        {
            List<String>  filepath_list = new ArrayList<String>();
            for (String  filename : _DATA_FILENAMES_) {
                filepath_list.add( _DATA_DIR_ + "/" + filename );
            }

            return filepath_list.toArray( new String[0] );
        }


        @Test
        public void installData()
        throws Exception
        {
            OvalDocumentInstaller  installer = new OvalDocumentInstaller();
            installer.execute( dataFilepathList() );
        }

    }
    //




    ///////////////////////////////////////////////////////////////////////
    //  common functions


    /**
     */
    private static void _println(
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


}
//
