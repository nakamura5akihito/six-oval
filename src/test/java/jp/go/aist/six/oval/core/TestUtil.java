package jp.go.aist.six.oval.core;

import java.io.File;
import java.io.FilenameFilter;



/**
 * @author  Akihito Nakamura, AIST
 * @version $Id: TestUtil.java 3157 2013-05-17 08:56:56Z nakamura5akihito@gmail.com $
 */
public class TestUtil
{

    /**
     * Creates a file list from directory path and/or file path.
     */
    public static File[] listXmlFiles(
                    final String dir_path
                    )
    throws Exception
    {
        return listXmlFiles( new File( dir_path ) );
    }


    public static File[] listXmlFiles(
                    final File dir
                    )
    throws Exception
    {
        File[]  list = dir.listFiles( new XmlFilenameFilter() );

        return list;
    }



    /**
     */
    public static class XmlFilenameFilter
    implements FilenameFilter
    {

        public XmlFilenameFilter()
        {
        }


        public boolean accept(
                        final File dir,
                        final String name
                        )
        {
            return name.endsWith( ".xml" );
        }

    }
    //XmlFilenameFilter

}
//
