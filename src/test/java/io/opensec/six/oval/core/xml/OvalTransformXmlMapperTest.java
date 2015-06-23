package io.opensec.six.oval.core.xml;

import io.opensec.six.oval.core.SixOvalContext;
import io.opensec.six.oval.core.TestUtil;
import io.opensec.six.oval.xml.OvalXmlMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;



/**
 * Tests: OvalXmlMapper.
 *
 * @author  Akihito Nakamura, AIST
 */
@RunWith( Enclosed.class )
public class OvalTransformXmlMapperTest
{
    private OvalXmlMapper  _xmlMapper = null;
    private File  _outputDir = null;



    protected OvalTransformXmlMapperTest()
    {
        _xmlMapper = SixOvalContext.basic().getXmlMapper();

        String  tmp_dirpath = System.getProperty( "java.io.tmpdir" );
        _outputDir = new File( tmp_dirpath, "six-oval" );
//        System.out.println( "tmp output dir: " + _outputDir );
        _outputDir.mkdirs();
    }



    protected OvalXmlMapper _getXmlMapper()
    {
        return _xmlMapper;
    }



    protected File _getOutputDir()
    {
        return _outputDir;
    }



    protected void _testUnmarshalAllXmlsInDir(
                    final String input_rootdir_path,
                    final String input_subdir_path
                    )
    throws Exception
    {
        File  output_dir = new File( _getOutputDir(), input_subdir_path );
        output_dir.mkdirs();

        File  input_dir = new File( input_rootdir_path, input_subdir_path );
        File[]  input_xml_files = TestUtil.listXmlFiles( input_dir );
        for (File  input_xml_file : input_xml_files) {
            System.out.println( input_subdir_path + " : " + input_xml_file.getName() );
            /* (1) unmarshal */
            Object  obj = _getXmlMapper().unmarshal( new FileInputStream( input_xml_file ) );

            /* (2) marshal */
            File  output_xml_file = new File( output_dir, "unmarshalled_" + input_xml_file.getName() );
            _getXmlMapper().marshal( obj, new FileWriter( output_xml_file ) );

            /* (3) unmarshal */
            obj = _getXmlMapper().unmarshal( new FileInputStream( output_xml_file ) );
        }
    }



    /**
     * TEST: Mitre OVAL Repository / definition / 5.10
     *
     * @see <a href="http://oval.mitre.org/repository/">OVAL Repository</a>
     */
    @RunWith( Theories.class )
    public static class MitreOvalDef510
    extends OvalTransformXmlMapperTest
    {
        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/mitre-oval-def-5_10";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "unix",
            "windows"
        };



        public MitreOvalDef510()
        {
        }



        @Theory
        public void testUnmarshal(
                        final String input_subdir_path
                        )
        throws Exception
        {
            _testUnmarshalAllXmlsInDir( INPUT_ROOTDIR_PATH, input_subdir_path );
        }

    }
    //



    /**
     * TEST: RedHat OVAL Repository / definition / 5.3
     *
     * @see <a href="http://oval.mitre.org/repository/">OVAL Repository</a>
     */
    @RunWith( Theories.class )
    public static class RedhatOvalDef53
    extends OvalTransformXmlMapperTest
    {
        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/redhat-oval-def-5_3";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "unix"
        };



        public RedhatOvalDef53()
        {
        }



        @Theory
        public void testUnmarshal(
                        final String input_subdir_path
                        )
        throws Exception
        {
            _testUnmarshalAllXmlsInDir( INPUT_ROOTDIR_PATH, input_subdir_path );
        }

    }
    //




//    /**
//     * XML test: Mitre OVAL Repository content and ovaldi output results.
//     *
//     * @see <a href="http://oval.mitre.org/repository/">OVAL Repository</a>
//     */
//    @RunWith( Theories.class )
//    public static class MitreOvalRepositoryContent
//    extends OvalTransformXmlMapperTest
//    {
//
//        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval5/mitre";
//
//
//        @DataPoints
//        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
////            "20130313"
//            "aix",
//            "esx",
//            "ios",
//            "linux",
//            "macos",
//            "pixos",
//            "solaris",
//            "windows"
//        };
//
//
//
//        public MitreOvalRepositoryContent()
//        {
//        }
//
//
//
//        @Theory
//        public void testUnmarshal(
//                        final String input_subdir_path
//                        )
//        throws Exception
//        {
//            _testUnmarshalAllXmlsInDir( INPUT_ROOTDIR_PATH, input_subdir_path );
//        }
//
//    }
//    //MitreOvalRepositoryContent



    /**
     * TEST: OVAL test content / definition / 5.10
     *
     * @see <a href="http://oval.mitre.org/repository/">OVAL Repository</a>
     */
    @RunWith( Theories.class )
    public static class OvalTestContent510
    extends OvalTransformXmlMapperTest
    {
        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/oval-test-content_5_10_1_3";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "linux",
            "macos",
            "solaris",
            "windows",
            "support/var"
        };



        public OvalTestContent510()
        {
        }



        @Theory
        public void testUnmarshal(
                        final String input_subdir_path
                        )
        throws Exception
        {
            _testUnmarshalAllXmlsInDir( INPUT_ROOTDIR_PATH, input_subdir_path );
        }

    }
    //OvalTestContent

}
//
