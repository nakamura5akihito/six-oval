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
package jp.go.aist.six.oval.core.interpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import jp.go.aist.six.oval.interpreter.Option;
import jp.go.aist.six.oval.interpreter.Options;
import jp.go.aist.six.oval.interpreter.OvalInterpreterException;
import jp.go.aist.six.util.core.web.spring.Http;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;



/**
 * An ovaldi wrapper that enables network transfer of OVAL data.
 *
 * <ul>
 *   <li>-o filename|URL: path to the oval definitions XML file</li>
 *   <li>-r filename|URL: save oval-results to the specified XML file</li>
 * </ul>
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: NetworkingOvaldiProxy.java 3083 2013-03-14 07:24:56Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/interpreter.html">OVAL Interpreter</a>
 */
public class NetworkingOvaldiProxy
    extends OvaldiProxy
{

    /**
     * Command line entry point.
     *
     * @param args
     *  the OVAL Interpreter program and its arguments.
     */
    public static void main(
                    final String[] args
                    )
    throws Exception
    {
//        if (args.length < 1) {
//            System.err.println( "no argument specified" );
//            System.exit( 1 );
//        }

        List<String>  options = Arrays.asList( args );
        NetworkingOvaldiProxy  ovaldi = new NetworkingOvaldiProxy( options );

        int  exit_value = ovaldi.execute();
        System.exit( exit_value );
    }




    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( NetworkingOvaldiProxy.class );



    private static enum NetworkOperation
    {
        INPUT,
        OUTPUT;
    }


    private static enum NetworkResource
    {
        OVAL_DEFINITIONS ( OvaldiOption.OVAL_DEFINITIONS,   NetworkOperation.INPUT  ),
        OVAL_RESULTS     ( OvaldiOption.OVAL_RESULTS,       NetworkOperation.OUTPUT );


        public final OvaldiOption  option;
        public final NetworkOperation  operation;

        /**
         * Constructor.
         */
        NetworkResource(
                        final OvaldiOption option,
                        final NetworkOperation type
                        )
        {
            this.option = option;
            operation = type;
        }
    }



    private String  _tmpFilePrefix;
    private File  _tmpDir;



    /**
     * Constructor.
     */
    public NetworkingOvaldiProxy()
    {
    }


    public NetworkingOvaldiProxy(
                    final Options options
                    )
    {
        super( options );
    }


    public NetworkingOvaldiProxy(
                    final List<String> options
                    )
    {
        super( options );
    }




    ///////////////////////////////////////////////////////////////////////
    //  process control
    ///////////////////////////////////////////////////////////////////////

    /**
     *
     */
    private void _init()
    {
        _tmpFilePrefix = _createTmpFilePrefix();
        _tmpDir = _getTmpDir();

        _LOG_.debug( "tmp file prefix: " + _tmpFilePrefix );
        _LOG_.debug( "tmp dir: " + _tmpDir );
    }



    /**
     * @throws  OvalInterpreterException
     */
   private void _preProcess(
                   final Options localizedOptions
                   )
   {
       for (NetworkResource  res : NetworkResource.values()) {
           _validateNetworkResourceOption( res.option );

           String  file_location = localizedOptions.get( res.option );
           if (file_location != null) {
               URL  url = _toURL( file_location );
               if (url == null) {
                   // local filepath as it is
               } else {
                   //This option argument is an URL.
                   File  file = _createTmpFile( res.option.defaultArgument );
                   if (res.operation == NetworkOperation.INPUT) {
                       //If input, download the resource and save it to a local file.
                       _httpGet( url, file, res.option.contentType );
                   }

                   //Replace the ovaldi command option for local execution.
                   localizedOptions.set( res.option, file.getAbsolutePath() );

               }
           }
       }

//       try {
//           Thread.sleep( 1000 );
//       } catch (InterruptedException ex) {
//           //ignorable
//       }
   }



    /**
     *
     * @throws  OvalInterpreterException
     */
    private void _postProcess(
                    final Options localizedOptions
                    )
    {
        Options  originalOptions = getOptions();

        for (NetworkResource  res : NetworkResource.values()) {
            if (res.operation == NetworkOperation.OUTPUT) {
                String  original_file_location = originalOptions.get( res.option );
                if (original_file_location != null) {
                    URL  url = _toURL( original_file_location );
                    if (url == null) {
                        // local filepath
                    } else {
                        /**
                         * This option argument is an URL.
                         * Obtain the local filepath, and send the file to the remote execution.
                         */
                        String  filepath = localizedOptions.get( res.option );
                        _httpPost( url, new File( filepath ), res.option.contentType );
                    }
                }
            }
        }
    }
//    {
//        Options originalOptions = getOptions();
//        for (Option option : _NETWORK_OUTPUT_OPTIONS_) {
//            String original_file_location = originalOptions.get( option );
//            if (original_file_location != null) {
//                URL url = _toURL( original_file_location );
//                if (url == null) {
//                    // local filepath
//                } else {
//                    /**
//                     * This option argument is an URL. Obtain the local
//                     * filepath, and send the file to the remote execution.
//                     */
//                    String filepath = localizedOptions.get( option );
//                    _httpPost( url, new File( filepath ), option.contentType );
//                }
//            }
//        }
//    }



    /**
     * TODO: Send all the error results to the given locations.
     * @param netOptions
     */
    private void _postErrorProcess()
    {
    }




    ///////////////////////////////////////////////////////////////////////
    //  files & dirs
    ///////////////////////////////////////////////////////////////////////

    private static final SimpleDateFormat  _FORMATTER_ =
                    new SimpleDateFormat( "yyyyMMdd'T'HHmmss.SSS" );


    /**
     * A prefix string like "yyyyMMdd'T'HHmmss'_oval_'".
     */
    private String _createTmpFilePrefix()
    {
        String  prefix = _FORMATTER_.format( new Date() );
        prefix = prefix + "_oval_";

        return prefix;
    }



    /**
     * Obtains the directory for tmp files.
     * It is obtained from the Java system property.
     */
    private File _getTmpDir()
    {
        String  dirpath = System.getProperty( "java.io.tmpdir" );
        File  dir = new File( dirpath, "six-oval" );
        if (dir.exists()) {
            if (dir.canWrite()  &&  dir.canRead()) {
                //OK!!!
            } else {
                throw new IllegalStateException(
                                "tmp directory not found or not ready: path=" + dirpath );
            }
        } else {
            dir.mkdirs();
        }


//        if (dir.exists()  &&  dir.canWrite()  &&  dir.canRead()) {
//            //OK!!!
//        } else {
//            throw new IllegalStateException(
//                            "tmp directory not found or not ready: path=" + dirpath );
//        }

        return dir;
    }



    /**
     * Creates a tmp file.
     */
    private File _createTmpFile(
                    final String postfix
                    )
    {
        _LOG_.debug( "creating tmp file: dir=" + _tmpDir
                        + ", prefix=" + _tmpFilePrefix
                        + ", postfix=" + postfix );

        String  filename = _tmpFilePrefix + postfix;
        File  file = new File( _tmpDir, filename );

        _LOG_.debug( "tmp file created: " + file );
        return file;
    }




    ///////////////////////////////////////////////////////////////////////
    //  network resources
    ///////////////////////////////////////////////////////////////////////

    /**
     */
    private URL _toURL(
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
    private void _validateNetworkResourceOption(
                    final Option option
                    )
    {
        if (option.hasArgument
                        &&  option.defaultArgument != null
                        &&  option.contentType != null) {
            //valid option!!!
        } else {
            throw new IllegalStateException(
                            "INTERNAL ERROR: option not configured for networking resource: "
                                            + option );
        }
    }



    //=====================================================================
    // HTTP support
    //=====================================================================

    /**
     * HTTP GET to file
     *
     * @throws  OvalInterpreterException
     */
    protected void _httpGet(
                    final URL from_url,
                    final File to_file,
                    final String content_type
                    )
    {
        _LOG_.debug( "GET: from URL=" + from_url
                        + ", to file=" + to_file
                        + ", content-type=" + content_type );

        FileOutputStream  out_stream = null;
        try {
            MediaType  media_type = MediaType.valueOf( content_type );
            List<MediaType>  accept_media_types = Collections.singletonList( media_type );
            Http.getTo( from_url, new FileOutputStream( to_file ), accept_media_types );
        } catch (Exception ex) {
            _LOG_.error( "HTTP GET error: " + ex );
            throw new OvalInterpreterException( ex );
        } finally {
            if (out_stream != null) {
                try {
                    out_stream.flush();
                    out_stream.close();
                } catch (Exception ex) {
                    //ignorable
                }
            }
        }
    }



    /**
     * HTTP POST file
     *
     * @throws  OvalInterpreterException
     */
    protected String _httpPost(
                    final URL to_url,
                    final File from_file,
                    final String content_type
                    )
    {
        _LOG_.debug( "HTTP POST: to URL=" + to_url
                        + ", from file=" + from_file
                        + ", content-type=" + content_type );

        String  location = null;
        try {
            MediaType  media_type = MediaType.valueOf( content_type );
            location = Http.postFrom( to_url, new FileInputStream( from_file ), media_type );
        } catch (Exception ex) {
            _LOG_.error( "HTTP POST error: " + ex );
            throw new OvalInterpreterException( ex );
        }

        _LOG_.debug( "HTTP POST: new resource URI=" + location );

        return location;
    }



    //*********************************************************************
    //  OvalInterpreter
    //*********************************************************************

    @Override
    public int execute()
    {
        _init();

        /**
         * NOTE: Copy the options as a backup.
         * The original options are re-configured to invoke local OvalInterpreter.
         * The backup is used in the post process to send the results
         * to the given locations, if required.
         */
        Options  localizedOptions = new OvaldiOptions( getOptions() );
        _preProcess( localizedOptions );

        OvaldiProxy  ovaldi = new OvaldiProxy( localizedOptions );
        ovaldi.setExecutablePath( getExecutablePath() );
        ovaldi.setWorkingDir( getWorkingDir() );
        int  exitValue = ovaldi.execute();

        if (exitValue == 0) {
            _postProcess( localizedOptions );
        } else {
            _postErrorProcess();
        }

        return exitValue;
    }

}
//

