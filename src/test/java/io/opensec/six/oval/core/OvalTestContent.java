package io.opensec.six.oval.core;

import java.io.File;
import org.junit.experimental.theories.DataPoints;



/**
 * OVAL Test Content.
 *
 * @author  Akihito Nakamura, AIST
 */
public class OvalTestContent
{

    public static final String  TOP_DIR = "src/test/resources/data/oval5/ovaltc-5.10.1.3";


    /**
     */
    @DataPoints
    public static String[]  SUB_DIRS = new String[] {
        "definitions",
        "independent",
        "linux",
        "macos",
        "solaris",
        "windows",
        "support/var"
    };



    /**
     */
    public static File[] listTestContentXmlFiles(
                    final String dir_path
                    )
    throws Exception
    {
        File  dir = new File( TOP_DIR, dir_path );
        File[]  in_xml_files = TestUtil.listXmlFiles( dir );

        return in_xml_files;
    }

}
//
