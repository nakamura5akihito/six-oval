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
package io.opensec.six.oval.model.definitions;



/**
 * The glob_to_regex function takes a single string component representing shell glob pattern
 * and produces a single value that corresponds to result of a conversion of the original
 * glob pattern into Perl 5's regular expression pattern.
 * The glob_noescape attribute defines the way how the backslash ('\') character should be interpreted.
 * It defaults to 'false' meaning backslash should be interpreted as an escape character
 * (backslash is allowed to be used as an escape character).
 * If the glob_noescape attribute would be set to 'true' it instructs the glob_to_regex function
 * to interpret the backslash ('\') character as a literal, rather than as an escape character
 * (backslash is *not* allowed to be used as an escape character).
 * For example given the input glob pattern would be '\*' then the resulting Perl 5's
 * regular expression would be '^\\.*$' in the default (glob_noescape=false) case
 * (here '\' would be interpreted as an escape character), and would produce '^\.*$'
 * in glob_noescape=true case (since here '\' would be interpreted as an literal).
 * Similarly the output for '\?' glob pattern would be '^\\.$' (default, glob_noescape=false case),
 * and '^\.$' for glob_noescape=true case.
 * The glob_to_regex function will fail to perform the conversion and return an error
 * when the provided string argument (to represent glob pattern) does not represent
 * a syntactically correct glob pattern.
 * For example given the 'a*b?[' as the argument to be converted, glob_to_regex would
 * return an error since there's missing the corresponding closing bracket
 * in the provided glob pattern argument.
 * Also, it is necessary to mention that the glob_to_regex function respects the default
 * behaviour for the input glob pattern and output Perl 5's regular expression spaces.
 * Namely this means that:
 * <ul>
 * <li>glob_to_regex will rule out matches having special meaning, such as:
 * '.' as a representation of the current working directory,
 * '..' as a representation of the parent directory of the current working directory,</li>
 * <li>glob_to_regex will rule out matches starting with '.' (e.g. dotfiles) unless the provided glob pattern itself starts with the '.' character too,</li>
 * <li>glob_to_regex will not perform case-sensitivity transformation (alphabetical characters will be copied from input glob pattern space to output Perl 5's regular expression pattern space intact). It is kept as a responsibility of the OVAL content author to provide input glob pattern argument in such case so the resulting Perl 5's regular expression pattern will match the expected pathname entries according to the case of preference,</li>
 * <li>glob_to_regex will not perform any possible brace expansion. Therefore glob patterns like '{pat,pat,pat}' would be converted into Perl 5's regular expression syntax in original un-expanded form (kept for any potential subsequent expansion to be performed by Perl 5's regular expression engine in the moment of the use of that resulting regular expression),</li>
 * <li>glob_to_regex will not perform tilde ('~') character substitution to user name home directory pathname. The tilde ('~') character will be passed to Perl 5's regular expression engine intact. If user name home directory pathname glob pattern behaviour is expected, the pathname of the user name home directory needs to be specified in the original glob pattern already,</li>
 * <li>glob_to_regex function will not perform any custom changes wrt to the ordering of items (perform any additional sorting of set of pathnames represented by the provided glob pattern argument).</li>
 * </ul>
 * The RegexCapture function captures a single substring from a string component.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GlobToRegexFunctionType
    extends FunctionGroup
{

    private ComponentGroup  component;
    //{1..1}


    public static final Boolean  DEFAULT_GLOB_NOESCAPE = Boolean.FALSE;

    private Boolean  glob_noescape;
    //{optional, default='false'}



    /**
     * Constructor.
     */
    public GlobToRegexFunctionType()
    {
    }



    /**
     */
    public void setComponent(
                    final ComponentGroup component
                    )
    {
        this.component = component;
    }


    public ComponentGroup getComponent()
    {
        return component;
    }



    /**
     */
    public void setGlobNoescape(
                    final Boolean glob_noescape
                    )
    {
        this.glob_noescape = glob_noescape;
    }


    public Boolean getGlobNoescape()
    {
        return glob_noescape;
    }


    public static Boolean globNoescape(
                    final GlobToRegexFunctionType obj
                    )
    {
        if (obj == null) {
            throw new IllegalArgumentException( "null GlobToRegexFunctionType" );
        }

        Boolean  glob_noescape = obj.getGlobNoescape();
        return (glob_noescape == null ? DEFAULT_GLOB_NOESCAPE : glob_noescape);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "glob_to_regex[glob_noescape=" + getGlobNoescape()
             + ", " + getComponent()
             + "]";
    }

}
// GlobToRegexFunctionType
