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
package io.opensec.six.oval.core.xml;

import io.opensec.six.oval.xml.OvalXmlMapper;
import io.opensec.util.core.xml.castor.CastorXmlMapper;
import io.opensec.util.xml.XmlTransformer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author  Akihito Nakamura, AIST
 */
public class OvalTransformXmlMapper
    extends CastorXmlMapper
    implements OvalXmlMapper
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( OvalTransformXmlMapper.class );



    private XmlTransformer  _transformer;



    /**
     * Constructor.
     */
    public OvalTransformXmlMapper()
    {
        _LOG_.trace( "instantiated" );
    }



    /**
     */
    public void setTransformer(
                    final XmlTransformer transformer
                    )
    {
        _transformer = transformer;
    }



    private String _simpleMarshalToString(
                    final Object obj
                    )
    {
        StringWriter  writer = new StringWriter();
        super.marshal( obj, new StreamResult( writer ) );

        return writer.toString();
    }




    //*********************************************************************
    //  XmlMapper
    //*********************************************************************

    @Override
    public void marshal(
                    final Object obj,
                    final Result result
                    )
    {
        if (_transformer == null) {
            super.marshal( obj, result );
        } else {
            String  xml = _simpleMarshalToString( obj );
            Source  source = new StreamSource( new StringReader( xml ) );
            _transformer.transform( source, result );
        }
    }



    @Override
    public void marshal(
                    final Object obj,
                    final OutputStream stream
                    )
    {
        if (_transformer == null) {
            super.marshal( obj, stream );
        } else {
            String  xml = _simpleMarshalToString( obj );
            Source  source = new StreamSource( new StringReader( xml ) );
            Result  result = new StreamResult( stream );
            _transformer.transform( source, result );
        }
    }



    @Override
    public void marshal(
                    final Object obj,
                    final Writer writer
                    )
    {
        if (_transformer == null) {
            super.marshal( obj, writer );
        } else {
            String  xml = _simpleMarshalToString( obj );
            Source  source = new StreamSource( new StringReader( xml ) );
            Result  result = new StreamResult( writer );
            _transformer.transform( source, result );
        }
    }



    @Override
    public String marshalToString(
                    final Object obj
                    )
    {
        StringWriter  writer = new StringWriter();
        marshal( obj, writer );
        String  xml = writer.toString();

        return xml;
    }



    @Override
    public Object unmarshal(
                    final InputStream stream
                    )
    {
        Object  obj = null;

        if (_transformer == null) {
            obj = super.unmarshal( stream );
        } else {
            StringWriter  writer = new StringWriter();
            Result  result = new StreamResult( writer );
            _transformer.transform( new StreamSource( stream ), result );

            String  xml = writer.toString();
//            _LOG_.debug( "transformed XML: \n" + xml );
            obj = super.unmarshal( new StringReader( xml ) );
        }

        return obj;
    }



    @Override
    public Object unmarshal(
                    final Reader reader
                    )
    {
        Object  obj = null;
        if (_transformer == null) {
            obj = super.unmarshal( reader );
        } else {
            StringWriter  writer = new StringWriter();
            Result  result = new StreamResult( writer );
            _transformer.transform( new StreamSource( reader ), result );

            obj = super.unmarshal( new StringReader( writer.toString() ) );
        }

        return obj;
    }



    @Override
    public Object unmarshalFromString(
                    final String xml
                    )
    {
        Reader  reader = new BufferedReader( new StringReader( xml ) );
        Object  obj = unmarshal( reader );

        return obj;
    }

}
//

