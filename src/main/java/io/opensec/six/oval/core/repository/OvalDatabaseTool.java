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

import io.opensec.six.oval.OvalException;
import io.opensec.six.oval.core.SixOvalContext;
import io.opensec.six.oval.core.repository.morphia.OvalDatastore;
import io.opensec.six.oval.model.definitions.DefinitionType;
import io.opensec.six.oval.model.definitions.DefinitionsElementAssoc;
import io.opensec.six.oval.model.definitions.OvalDefinitions;
import io.opensec.six.oval.model.definitions.StateType;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import io.opensec.six.oval.model.definitions.TestType;
import io.opensec.six.oval.model.definitions.VariableType;
import io.opensec.six.oval.model.results.OvalResults;
import io.opensec.six.oval.model.sc.OvalSystemCharacteristics;
import io.opensec.six.oval.xml.OvalXmlMapper;
import io.opensec.util.xml.XmlException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 * @author	Akihito Nakamura, AIST
 */
public class OvalDatabaseTool
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ =
        LoggerFactory.getLogger( OvalDatabaseTool.class );



    public static void main( final String[] args )
    {
        _LOG_.debug( "args=" + Arrays.toString( args ) );
        if (args.length == 0 ) {
            System.exit( 0 );
        }

        final String cmd = args[0];
        _LOG_.debug( "cmd=" + cmd );
        if (cmd.equals( "-install" )) {
            if (args.length == 2) {
                String  location = args[1];
                _LOG_.debug( "location=" + location );
                installOvalDefinitions( location );
            }
        } else if (cmd.equals( "-delete-all" )) {
            deleteAllData();
//        } else if (cmd.equals( "-drop-all-collections" )) {
//            _INSTANCE_.dropAllCollections();
        }
    }




//    private static final MongoDatastoreTool  _INSTANCE_ = new MongoDatastoreTool();

    private static OvalDatastore  _DATABASE_;

    private static OvalXmlMapper  _XML_MAPPER_ = null;


//    private OvalContext  _context;
//    private Mongo  _mongo;
//    private Morphia  _morphia;
//    private String  _db_name;





    /**
     * Constructor.
     */
    public OvalDatabaseTool()
    {
    }



//    private void _setUp()
//    {
//        _context = OvalContext.INSTANCE;
//        _mongo = _context.getBean( "mongo", Mongo.class );
//        _morphia = _context.getBean( "morphia", Morphia.class );
//
//        _db_name = _context.getProperty( "six.oval.repository.datastore.name" );
//        _LOG_.info( "DB name: " + _db_name );
//        for (MappedClass  clazz : _morphia.getMapper().getMappedClasses()) {
//            _LOG_.info( "% Morphia mapped collection: " + clazz.getCollectionName(), true );
//        }
//    }
//
//
//
//    public void dropAllCollections()
//    {
//        DB  db = _mongo.getDB( _db_name );
//        for (MappedClass  clazz : _morphia.getMapper().getMappedClasses()) {
//            _LOG_.info( "dropping collection: " + clazz.getCollectionName(), true );
//            db.getCollection( clazz.getCollectionName() ).drop();
//        }
//    }



    /**
     */
    private static OvalDatastore _getDatastore()
    {
        if (_DATABASE_ == null) {
            _DATABASE_ = SixOvalContext.repository().getBean( OvalDatastore.class );
        }

        return _DATABASE_;
    }


    private static OvalXmlMapper _getXmlMapper()
    {
        if (_XML_MAPPER_ == null) {
            _XML_MAPPER_ = SixOvalContext.repository().getXmlMapper();
        }

        return _XML_MAPPER_;
    }



    /**
     * @throws  XmlException
     */
    private static <T> T _unmarshalObject(
                    final Class<T> type,
                    final InputStream in_stream
                    )
    {
        Object  obj = _getXmlMapper().unmarshal( in_stream );
        T  object = type.cast( obj );

        return object;
    }



    /**
     */
    private static URL _toURL(
                    final String value
                    )
    {
        if (value == null) {
            return null;
        }

        URL  url = null;
        try {
            url = new URL( value );
        } catch (MalformedURLException ex) {
            // in case of a local file
            url = null;
        }

        return url;
    }




    /**
     */
    public static String installOvalDefinitions(
                    final String xml_location
                    )
    {
        Class<OvalDefinitions>  type = OvalDefinitions.class;

        String  pid = null;
        InputStream  in_stream = null;
        try {
            URL  url = _toURL( xml_location );
            if (url == null) {
                in_stream = new FileInputStream( xml_location );
                            //throws FileNotFoundException, SecurityException
            } else {
                in_stream = url.openStream();
                                //throws IOException
            }
            OvalDefinitions  object = _unmarshalObject( type, in_stream );
            pid = _getDatastore().save( type, object );
        } catch (IOException ex) {
            throw new OvalException( ex );
        } catch (SecurityException ex) {
            throw new OvalException( ex );
        } finally {
        	if (in_stream != null) {
        		try {
        			in_stream.close();
        		} catch (IOException ex) {
        			//ignorable!!!
        		}
        	}
        }

        return pid;
    }



    /**
     */
    public static void deleteAllData()
    {
        OvalDatastore  ds = _getDatastore();

        _LOG_.debug( "delete DefinitonsElementAssoc..." );
        ds.delete( DefinitionsElementAssoc.class );

        _LOG_.debug( "delete OvalDefinitons..." );
        ds.delete( OvalDefinitions.class );
        _LOG_.debug( "delete Definiton..." );
        ds.delete( DefinitionType.class );
        _LOG_.debug( "delete Test..." );
        ds.delete( TestType.class );
        _LOG_.debug( "delete SystemObject..." );
        ds.delete( SystemObjectType.class );
        _LOG_.debug( "delete State..." );
        ds.delete( StateType.class );
        _LOG_.debug( "delete Variable..." );
        ds.delete( VariableType.class );

        _LOG_.debug( "delete OvalSysChar..." );
        ds.delete( OvalSystemCharacteristics.class );
        _LOG_.debug( "delete OvalResults..." );
        ds.delete( OvalResults.class );
    }

}
//
