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

import jp.go.aist.six.oval.repository.OvalRepository;
import jp.go.aist.six.oval.xml.OvalXmlMapper;
import jp.go.aist.six.util.core.config.spring.SpringContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Application Context using the Spring Framework.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SixOvalContext.java 3178 2013-06-18 07:42:11Z nakamura5akihito@gmail.com $
 */
public abstract class SixOvalContext
    extends SpringContext
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( SixOvalContext.class );



    /**
     * XML Configuration Properties.
     */
    public class Xml
    {
        public static final String  SCHEMA_LOCATION = "six.oval.xml.schemaLocation";
        public static final String  SCHEMA_VERSION  = "six.oval.xml.schemaVersion";
    }



    ///////////////////////////////////////////////////////////////////////

    private static BasicContext            _BASIC_CONTEXT_;
    private static RepositoryContext  _REPOSITORY_CONTEXT_;
    private static WebServerContext   _WEB_SERVER_CONTEXT_;
    private static WebClientContext   _WEB_CLIENT_CONTEXT_;


    /**
     * Returns the basic context.
     *
     * @return
     *  the basic context.
     */
    public static synchronized BasicContext basic()
    {
        if (_BASIC_CONTEXT_ == null) {
            _BASIC_CONTEXT_ = new BasicContext();
        }

        return _BASIC_CONTEXT_;
    }


    /**
     * Returns the repository context.
     *
     * @return
     *  the repository context.
     */
    public static synchronized RepositoryContext repository()
    {
        if (_REPOSITORY_CONTEXT_ == null) {
            _REPOSITORY_CONTEXT_ = new RepositoryContext();
        }

        return _REPOSITORY_CONTEXT_;
    }


    /**
     * Returns the web server context.
     *
     * @return
     *  the web server context.
     */
    public static synchronized WebServerContext webServer()
    {
        if (_WEB_SERVER_CONTEXT_ == null) {
            _WEB_SERVER_CONTEXT_ = new WebServerContext();
        }

        return _WEB_SERVER_CONTEXT_;
    }



    /**
     * Returns the web client context.
     *
     * @return
     *  the web client context.
     */
    public static synchronized WebClientContext webClient()
    {
        if (_WEB_CLIENT_CONTEXT_ == null) {
            _WEB_CLIENT_CONTEXT_ = new WebClientContext();
        }

        return _WEB_CLIENT_CONTEXT_;
    }



    /**
     * Constructor.
     */
    protected SixOvalContext()
    {
    }


    protected SixOvalContext(
                    final String config_location
                    )
    {
        super( config_location, new String[] {
                        "classpath:jp/go/aist/six/oval/core/six-oval_defaults.properties",
                        "classpath:six-oval.properties"
                    } );

//        super( config_location, new String[] {
//                        "six-oval-default-properties",
//                        "six-oval-properties"
//                    } );

        //The following code does not work.
        //The second parameter is passed to the super class as a null.
//        super( config_location, _PROPERTY_BEANS_ );
    }



    /**
     * Returns an XmlMapper instance which is dedicated to the OVAL Domain Model.
     *
     * @throws  OvalConfigurationException
     *  when it is NOT possible to create an instance.
     */
    public OvalXmlMapper getXmlMapper()
    {
        OvalXmlMapper  mapper = getBean( "oval-xml-mapper", OvalXmlMapper.class );
        return mapper;
    }



    /**
     * Returns an OvalRepository instance.
     *
     * @throws  OvalConfigurationException
     *  when it is NOT possible to create an instance.
     */
    public abstract OvalRepository getRepository();




    ///////////////////////////////////////////////////////////////////////
    //  nested classes
    ///////////////////////////////////////////////////////////////////////

    /**
     * A basic context which supports XML handling only.
     */
    public static class BasicContext
    extends SixOvalContext
    {
        public static final String  CONTEXT_PATH =
                        "jp/go/aist/six/oval/core/six-oval_context-basic.xml";


        public BasicContext()
        {
            super( CONTEXT_PATH );
        }



        @Override
        public OvalRepository getRepository()
        {
            throw new UnsupportedOperationException();
        }
    }
    //



    /**
     */
    public static class RepositoryContext
    extends SixOvalContext
    {
        public static final String  CONTEXT_PATH =
                        "jp/go/aist/six/oval/core/six-oval_context-repository.xml";


        public RepositoryContext()
        {
            super( CONTEXT_PATH );
        }


        public RepositoryContext(
                        final String context_path
                        )
        {
            super( context_path );
        }



        @Override
        public OvalRepository getRepository()
        {
            OvalRepository  repository = getBean( "oval-repository", OvalRepository.class );
            _LOG_.debug( "bean: " + repository.getClass() );

            return repository;
        }
    }
    //



    /**
     */
    public static class WebServerContext
    extends RepositoryContext
    {
        public static final String  CONTEXT_PATH =
                        "jp/go/aist/six/oval/core/six-oval_context-web-server.xml";


        public WebServerContext()
        {
            super( CONTEXT_PATH );
        }

    }
    //



    /**
     */
    public static class WebClientContext
    extends SixOvalContext
    {
        public static final String  CONTEXT_PATH =
                        "jp/go/aist/six/oval/core/six-oval_context-web-client.xml";


        public WebClientContext()
        {
            super( CONTEXT_PATH );
        }


        @Override
        public OvalRepository getRepository()
        {
            OvalRepository  repository = getBean( "http-oval-repository-client", OvalRepository.class );

            return repository;
        }
    }
    //

}
//

