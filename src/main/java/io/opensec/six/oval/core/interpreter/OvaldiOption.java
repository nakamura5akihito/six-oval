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
import java.util.Arrays;
import java.util.Collection;




/**
 * The definition of the ovaldi command options.
 *
 *
 * @author  Akihito Nakamura, AIST
 */
public class OvaldiOption
    extends Option
{

    //==============================================================
    // input resources
    //==============================================================

    public static final OvaldiOption OVAL_DEFINITIONS = new OvaldiOption(
                    "path to the oval definitions XML file",
                    "-o", true, "filename", "definitions.xml",
                    "application/xml",
                    "opensec.oval.ovaldi.definitions"
    );

    public static final OvaldiOption EVALUATE_DEFINITIONS = new OvaldiOption(
                    "evaluate the specified list of definitions \n" +
                    "(supply definition IDs as a comma seperated list)",
                    "-e", true, "definition IDs", null,
                    "text/plain",
                    "opensec.oval.ovaldi.definition_ids"
    );

    public static final OvaldiOption OVAL_XML_DIR = new OvaldiOption(
                    "path to the directory that contains the OVAL schema and other xml resources",
                    "-a", true, "dir name", null,
                    null,
                    "opensec.oval.ovaldi.xml_dir"
    );

    public static final OvaldiOption MD5_HASH = new OvaldiOption(
                    "MD5 checksum expected for the current OVAL Definitions document",
                    null, true, "MD5Hash", null,
                    null,
                    "opensec.oval.ovaldi.md5hash"
    );


    //==============================================================
    // output resources
    //==============================================================

    public static final OvaldiOption OVAL_SC = new OvaldiOption(
                    "save system-characteristics data to the specified XML file",
                    "-d", true, "filename", "system-characteristics.xml",
                    "application/xml",
                    "opensec.oval.ovaldi.system_characteristics"
    );


    public static final OvaldiOption OVAL_RESULTS = new OvaldiOption(
                    "save oval-results to the specified XML file",
                    "-r", true, "filename", "results.xml",
                    "application/xml",
                    "opensec.oval.ovaldi.results"
    );


    public static final OvaldiOption OVAL_TRANSFORMED_RESULTS = new OvaldiOption(
                    "output xsl transform results to the specified file",
                    "-x", true, "filename", "results.html",
                    "text/html",
                    "opensec.oval.ovaldi.transformed_results"
    );


    //==============================================================
    // control
    //==============================================================

    public static final OvaldiOption NO_VERIFY = new OvaldiOption(
                    "do not verify the oval-definitions file with an MD5 hash",
                    "-m", false, null, null,
                    "boolean",
                    "opensec.oval.ovaldi.no_verify"
    );


    public static final OvaldiOption PRINT_ALL_INFO = new OvaldiOption(
                    "print all information and error messages",
                    "-p", false, null, null,
                    "boolean",
                    "opensec.oval.ovaldi.print_all_info"
    );


    public static final OvaldiOption LOG_LEVEL = new OvaldiOption(
                    "log messages at the specified level \n"
                    + "(DEBUG = 1, INFO = 2, MESSAGE = 3, FATAL = 4)",
                    "-l", true, "integer", "2",
                    "int",
                    "opensec.oval.ovaldi.log_level"
    );




    private static final Option[]  _DEFINED_VALUES_ = new OvaldiOption[] {
        OVAL_DEFINITIONS,
        EVALUATE_DEFINITIONS,
        OVAL_SC,
        OVAL_RESULTS,
        OVAL_TRANSFORMED_RESULTS,
        NO_VERIFY,
        OVAL_XML_DIR,
        MD5_HASH,
        PRINT_ALL_INFO,
        LOG_LEVEL
    };


    private static final Collection<Option>  _VALUES_ = Arrays.asList( _DEFINED_VALUES_ );
//        new ArrayList<Option>();




    /**
     * Constructor.
     */
    protected OvaldiOption(
                    final String  description,
                    final String  command,
                    final boolean hasArgument,
                    final String  argumentName,
                    final String  defaultArgument,
                    final String  contentType,
                    final String  systemProperty
                    )
    {
        super( description, command, hasArgument, argumentName, defaultArgument, contentType, systemProperty );
    }




    /**
     */
    public static Collection<Option> values()
    {
        return _VALUES_;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
//OvaldiOption

