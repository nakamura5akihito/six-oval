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
package jp.go.aist.six.oval.model.independent;



/**
 * The TextFileContent54Behaviors defines a number of behaviors
 * that allow a more detailed definition of the textfilecontent54 object
 * being specified.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: TextfileContent54Behaviors.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TextfileContent54Behaviors
    extends FileBehaviors
{

    public static final Boolean  DEFAULT_IGNORE_CASE = Boolean.FALSE;

    private Boolean  ignore_case;
    //{optional, default='false'}


    public static final Boolean  DEFAULT_MULTILINE = Boolean.TRUE;

    private Boolean  multiline;
    //{optional, default='true'}


    public static final Boolean  DEFAULT_SINGLELINE = Boolean.FALSE;

    private Boolean  singleline;
    //{optional, default='false'}



    /**
     * Constructor.
     */
    public TextfileContent54Behaviors()
    {
    }



    /**
     */
    public void setIgnoreCase(
                    final Boolean ignore_case
                    )
    {
        this.ignore_case = ignore_case;
    }


    public Boolean getIgnoreCase()
    {
        return ignore_case;
    }


//    public TextfileContent54Behaviors ignoreCase(
//                    final Boolean ignoreCase
//                    )
//    {
//        setIgnoreCase( ignoreCase );
//        return this;
//    }


    public static final Boolean ignoreCase(
                    final TextfileContent54Behaviors obj
                    )
    {
        Boolean  ignore_case = obj.getIgnoreCase();
        return (ignore_case == null ? DEFAULT_IGNORE_CASE : ignore_case);
    }



    /**
     */
    public void setMultiline(
                    final Boolean multiline
                    )
    {
        this.multiline = multiline;
    }


    public Boolean getMultiline()
    {
        return multiline;
    }


//    public TextfileContent54Behaviors multiline(
//                    final Boolean multiline
//                    )
//    {
//        setMultiline( multiline );
//        return this;
//    }


    public static final Boolean multiline(
                    final TextfileContent54Behaviors obj
                    )
    {
        Boolean  multiline = obj.getMultiline();
        return (multiline == null ? DEFAULT_MULTILINE : multiline);
    }



    /**
     */
    public void setSingleline(
                    final Boolean singleline
                    )
    {
        this.singleline = singleline;
    }


    public Boolean getSingleline()
    {
        return singleline;
    }


//    public TextfileContent54Behaviors singleline(
//                    final Boolean singleline
//                    )
//    {
//        setSingleline( singleline );
//        return this;
//    }


    public static final Boolean singleline(
                    final TextfileContent54Behaviors obj
                    )
    {
        Boolean  singleline = obj.getSingleline();
        return (singleline == null ? DEFAULT_SINGLELINE : singleline);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + (ignoreCase( this ).hashCode());
        result = prime * result + (multiline( this ).hashCode());
        result = prime * result + (singleline( this ).hashCode());

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TextfileContent54Behaviors)) {
            return false;
        }

        if (super.equals( obj )) {
            TextfileContent54Behaviors  other = (TextfileContent54Behaviors)obj;
            if (ignoreCase( this ) == ignoreCase( other )) {
                if (multiline( this ) == multiline( other )) {
                    if (singleline( this ) == singleline( other )) {
                        return true;
                    }
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", ignore_case=" + getIgnoreCase()
                        + ", multiline=" + getMultiline()
                        + ", singleline=" + getSingleline()
                        ;
    }

}
// TextFileContent54Behaviors
