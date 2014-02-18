package jp.go.aist.six.oval.core.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import jp.go.aist.six.oval.core.SixOvalContext;
import jp.go.aist.six.oval.core.TestUtil;
import jp.go.aist.six.oval.xml.OvalXmlMapper;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;



/**
 * Tests: OvalXmlMapper.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalTransformXmlMapperTest.java 3199 2013-07-05 10:38:17Z nakamura5akihito@gmail.com $
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
     * Mitre OVAL Repository / definition / 5.10
     *
     * @see http://oval.mitre.org/repository/
     */
    @RunWith( Theories.class )
    public static class MitreOvalDef510
    extends OvalTransformXmlMapperTest
    {

        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/mitre/oval-def-5_10";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
            "unix"
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




//    /**
//     * XML test: Mitre OVAL Repository content and ovaldi output results.
//     *
//     * @see http://oval.mitre.org/repository/
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
     * OVAL test content / definition / 5.10
     *
     * @see http://oval.mitre.org/repository/about/testcontent.html
     */
    @RunWith( Theories.class )
    public static class OvalTestContent510
    extends OvalTransformXmlMapperTest
    {

        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval/oval-test-content_5_10_1_3";
//        public static final String  INPUT_ROOTDIR_PATH = "src/test/resources/data/oval5/ovaltc-5.10.1.3";


        @DataPoints
        public static String[]  INPUT_SUBDIR_PATHS = new String[] {
//            "definitions",
//            "independent",
            "linux",
            "macos",
            "solaris",
//            "unix",
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
