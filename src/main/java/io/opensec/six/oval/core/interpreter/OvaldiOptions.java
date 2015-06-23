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
package io.opensec.six.oval.core.interpreter;

import io.opensec.six.oval.interpreter.Option;
import io.opensec.six.oval.interpreter.Options;
import io.opensec.six.oval.interpreter.OvalInterpreterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * A collection of the ovaldi options.
 *
 * @author  Akihito Nakamura, AIST
 */
public class OvaldiOptions
    extends Options
{

//    /**
//     * Logger.
//     */
//    private static final Logger  _LOG_ = LoggerFactory.getLogger( OvaldiOptions.class );



    /**
     * Constructor.
     */
    public OvaldiOptions()
    {
    }


    public OvaldiOptions(
                    final Map<Option, String> options
                    )
    {
        super( options );
    }


    public OvaldiOptions(
                    final Options options
                    )
    {
        super( options );
    }



    /**
     * A factory method.
     *
     * @throws  OvalInterpreterException
     */
    public static Options fromCommandLine(
                    final List<String> args
                    )
    {
        Options  options = new OvaldiOptions();
        if (args == null  ||  args.size() == 0) {
            return options;
        }

        Map<String, Option>  map = new HashMap<String, Option>();
        for (Option  option : OvaldiOption.values()) {
            map.put( option.command, option );
        }

        int  num_strings = args.size();
        for (int  i = 0; i < num_strings; i++) {
            String  string = args.get( i );
            Option  option = map.get( string );

            if (option == null) {
                if (string.startsWith( "-" )) {
                    throw new OvalInterpreterException(
                                    "unknown command option: " + string );
                }

                // MD5Hash
                options.set( OvaldiOption.MD5_HASH, string );

            } else {
                if (option.hasArgument) {
                    if ((i + 1) < num_strings) {
                        String  arg_value = args.get( i + 1 );
                        i++;
                        options.set( option, arg_value );
                    } else {
                        throw new OvalInterpreterException(
                                        "invalid command line: "
                                        + String.valueOf( args )
                                        + ", error around: " + string );
                    }
                } else {
                    // no-argument option
                    options.set( option );
                }
            }
        }

        return options;
    }



    //*********************************************************************
    //  Options
    //*********************************************************************

    @Override
    public List<String> toCommandLine()
    {
        List<String>  command_line = new ArrayList<String>();

        for (Option  option : OvaldiOption.values()) {
            if (contains( option )) {
                command_line.add( option.command );  //e.g. "-o"
                if (option.hasArgument) {
                    String  value = get( option );
                    if (value == null) {
                        throw new OvalInterpreterException(
                                        "no command argument: " + option );
                    }
                    command_line.add( value );       //e.g. "def.xml"
                }
            }
        }

//        _LOG_.debug( "command line: " + String.valueOf( command_line ) );
        return command_line;
    }

}
//

