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
package jp.go.aist.six.oval.core.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import jp.go.aist.six.oval.core.SixOvalContext;
import jp.go.aist.six.oval.xml.OvalXmlMapper;
import jp.go.aist.six.util.xml.XmlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalXmlTool.java 3126 2013-04-30 09:41:49Z nakamura5akihito@gmail.com $
 */
public class OvalXmlTool
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( OvalXmlTool.class );



    public static void main(
                    final String[] args
                    )
    {
        _LOG_.debug( "args=" + Arrays.toString( args ) );
        if (args.length == 0 ) {
            System.exit( 0 );
        }

        final String cmd = args[0];
        _LOG_.debug( "cmd=" + cmd );

        OvalXmlTool  tool = new OvalXmlTool();
        if (cmd.equals( "-dump" )) {
            if (args.length == 2) {
                String  source = args[1];
                _LOG_.debug( "source=" + source );
                tool.dump( source );
            }
        } else {
            _LOG_.debug( "unknown command: " + cmd );
        }
    }




    private final OvalXmlMapper  _mapper;



    /**
     * Constructor.
     */
    public OvalXmlTool()
    {
        _mapper = SixOvalContext.basic().getXmlMapper();
    }



    /**
     */
    public void dump(
                    final InputStream stream
                    )
    {
        Object  obj = unmarshal( stream );
        System.out.println( obj );
    }


    public void dump(
                    final String source
                    )
    {
        InputStream  stream = null;

        if (source.startsWith( "http://" )  ||  source.startsWith( "https://" )) {
            try {
                URL  url = new URL( source );
                stream = url.openStream();
            } catch (MalformedURLException m_ex) {
                throw new XmlException( m_ex );
            } catch (IOException io_ex) {
                throw new XmlException( io_ex );
            }

        } else {
            File  file = new File( source );
            if (file.exists()  &&  file.canRead()) {
                try {
                    stream = new FileInputStream( file );
                } catch (FileNotFoundException io_ex) {
                    throw new XmlException( io_ex );
                }
            } else {
                throw new XmlException( "no such file: " + source );
            }
        }

        dump( stream );
    }



    //**************************************************************
    //  XmlMapper
    //**************************************************************


    public Object unmarshal(
                    final InputStream stream
                    )
    {
        return _mapper.unmarshal( stream );
    }



    public Object unmarshal(
                    final File file
                    )
    {
        InputStream  stream = null;
        try {
            stream = new FileInputStream( file );
        } catch (FileNotFoundException ex) {
            throw new XmlException( ex );
        }

        return unmarshal( stream );
    }

}
//

