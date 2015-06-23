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
package io.opensec.six.oval.interpreter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * A collection of OVAL Interpreter options.
 *
 * @author  Akihito Nakamura, AIST
 */
public class Options
    implements Iterable<Option>, Cloneable, Serializable
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( Options.class );




    /**
     * NOTE: This "field" is NOT "final"
     * because it has to be created whenever this object is cloned.
     * Since this "class" is NOT "final", and {@link #clone()} method
     * must return the same class as this object,
     * the copy constructor {@link #Options(Map)} can't be used.
     *
     * @see #clone()
     */
    private Map<Option, String>  _options = new HashMap<Option, String>();



    /**
     * Constructor.
     */
    public Options()
    {
    }


    public Options(
                    final Map<Option, String> options
                    )
    {
        set( options );
    }


    public Options(
                    final Options options
                    )
    {
        set( options );
    }



    /**
     *
     * @throws  OvalInterpreterException
     */
    public List<String> toCommandLine()
    {
        List<String>  command_line = new ArrayList<String>();

//        for (Option  option : Option.values()) {
        for (Option  option : this) {
//            if (contains( option )) {
                command_line.add( option.command );  //e.g. "-o"
                if (option.hasArgument) {
                    String  value = get( option );
                    if (value == null) {
                        throw new OvalInterpreterException(
                                        "no command argument: " + option );
                    }
                    command_line.add( value );       //e.g. "def.xml"
                }
//            }
        }

        _LOG_.debug( "command line: " + String.valueOf( command_line ) );
        return command_line;
    }



    /**
     */
    public Options set(
                    final Options options
                    )
    {
        if (options == null) {
            throw new IllegalArgumentException( "no option specified" );
        }

        for (Option  option : options) {
            set( option, options.get( option ) );
        }

        return this;
    }


    public Options set(
                    final Map<Option, String> options
                    )
    {
        if (options == null) {
            throw new IllegalArgumentException( "no option specified" );
        }

        if (options != _options) {
            for (Option  option : options.keySet()) {
                set( option, options.get( option ) );
            }
        }

        return this;
    }


    public Options set(
                    final Option option
                    )
    {
        set( option, null );
        return this;
    }


    public Options set(
                    final Option option,
                    final String value
                    )
    {
        if (option == null) {
            throw new IllegalArgumentException( "no option specified" );
        }

        if (option.hasArgument) {
            if (value == null  ||  value.length() == 0) {
                throw new IllegalArgumentException(
                                "no option argument specified: " + option.command );
            }
        }

        _options.put( option, value );
        return this;
    }


    public Options remove(
                    final Option option
                    )
    {
        if (option == null) {
            throw new IllegalArgumentException( "no option specified" );
        }

        _options.remove( option );
        return this;
    }


    public Options clear()
    {
        _options.clear();
        return this;
    }


    public String get(
                    final Option option
                    )
    {
        if (option == null) {
            throw new IllegalArgumentException( "no option specified" );
        }

        return _options.get( option );
    }


    public String get(
                    final Option option,
                    final String defaultValue
                    )
    {
        if (option == null) {
            throw new IllegalArgumentException( "no option specified" );
        }

        final String  value = get( option );

        return (contains( option ) ? value : defaultValue);
    }


    public boolean contains(
                    final Option option
                    )
    {
        if (option == null) {
            throw new IllegalArgumentException( "no option specified" );
        }

        return _options.containsKey( option );
    }



    //*********************************************************************
    //  java.lang.Iterable
    //*********************************************************************

    public Iterator<Option> iterator()
    {
        return _options.keySet().iterator();
    }



//    //==============================================================
//    //  individual options
//    //==============================================================
//
//    /**
//     * -o
//     */
//    public void setOvalDefinitions(
//                    final String filepath
//                    )
//    {
//        set( Option.OVAL_DEFINITIONS, filepath );
//    }
//
//
//    public String getOvalDefinitions()
//    {
//        return get( Option.OVAL_DEFINITIONS );
//    }
//
//
//
//    /**
//     * -e
//     */
//    public void setEvaluateDefinitions(
//                    final List<String> defIDs
//                    )
//    {
//        if (defIDs == null  ||  defIDs.size() == 0) {
//            remove( Option.EVALUATE_DEFINITIONS );
//        } else {
//            StringBuilder  s = new StringBuilder();
//            for (String  defID : defIDs) {
//                if (s.length() > 0) {
//                    s.append( "," );
//                }
//                s.append( defID );
//            }
//
//            setEvaluateDefinitions( s.toString() );
//        }
//    }
//
//
//    public void setEvaluateDefinitions(
//                    final String defIDs
//                    )
//    {
//        if (defIDs == null  ||  defIDs.length() == 0) {
//            remove( Option.EVALUATE_DEFINITIONS );
//        } else {
//            set( Option.EVALUATE_DEFINITIONS, defIDs );
//        }
//    }
//
//
//    public String getEvaluateDefinitions()
//    {
//        return get( Option.EVALUATE_DEFINITIONS );
//    }
//
//
//
//    /**
//     * -r
//     */
//    public void setOvalResults(
//                    final String filepath
//                    )
//    {
//        set( Option.OVAL_RESULTS, filepath );
//    }
//
//
//    public String getOvalResults()
//    {
//        return get( Option.OVAL_RESULTS );
//    }
//
//
//
//    /**
//     * -a
//     */
//    public void setOvalXmlDir(
//                    final String dirpath
//                    )
//    {
//        set( Option.OVAL_XML_DIR, dirpath );
//    }
//
//
//    public String getOvalXmlDir()
//    {
//        return get( Option.OVAL_XML_DIR );
//    }
//
//
//
//    /**
//     * -m
//     */
//    public void setNoVerify(
//                    final boolean noVerify
//                    )
//    {
//        if (noVerify) {
//            set( Option.NO_VERIFY );
//        } else {
//            remove( Option.NO_VERIFY );
//        }
//    }
//
//
//    public boolean isNoVerify()
//    {
//        return contains( Option.NO_VERIFY );
//    }
//
//
//
//    /**
//     * MD5Hash
//     */
//    public void setMD5Hash(
//                    final String hash
//                    )
//    {
//        set( Option.MD5_HASH, hash );
//    }
//
//
//    public String getMD5Hash()
//    {
//        return get( Option.MD5_HASH );
//    }



    //**************************************************************
    //  java.lang.Cloneable
    //**************************************************************

    @Override
    public Options clone()
    throws CloneNotSupportedException
    {
        Options  clone = null;
        try {
            clone = (Options)super.clone();
            clone._options = new HashMap<Option, String>( _options );
            //Copy all the mapping to a new Map object.
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }

        return clone;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "Options" + String.valueOf( _options );
    }

}
// Options

