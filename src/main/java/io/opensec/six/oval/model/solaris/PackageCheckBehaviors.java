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
package io.opensec.six.oval.model.solaris;

import io.opensec.six.oval.model.OvalObject;



/**
 * The PackageCheckBehaviors complex type defines a set of behaviors
 * that for controlling how installed packages are checked.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PackageCheckBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_FILEATTRIBUTES_ONLY = Boolean.FALSE;

    private Boolean  fileattributes_only;
    //{optional, default="false"}


    public static final Boolean  DEFAULT_FILECONTENTS_ONLY = Boolean.FALSE;

    private Boolean  filecontents_only;
    //{optional, default="false"}


    public static final Boolean  DEFAULT_NO_VOLATILEEDITABLE = Boolean.FALSE;

    private Boolean  no_volatileeditable;
    //{optional, default="false"}



    /**
     * Constructor.
     */
    public PackageCheckBehaviors()
    {
    }



    /**
     */
    public void setFileattributesOnly(
                    final Boolean fileattributes_only
                    )
    {
        this.fileattributes_only = fileattributes_only;
    }


    public Boolean getFileattributesOnly()
    {
        return fileattributes_only;
    }


    public static final Boolean fileattributesOnly(
                    final PackageCheckBehaviors obj
                    )
    {
        Boolean  fileattributes_only = obj.getFileattributesOnly();
        return (fileattributes_only == null ? DEFAULT_FILEATTRIBUTES_ONLY : fileattributes_only);
    }



    /**
     */
    public void setFilecontentsOnly(
                    final Boolean filecontents_only
                    )
    {
        this.filecontents_only = filecontents_only;
    }


    public Boolean getFilecontentsOnly()
    {
        return filecontents_only;
    }


    public static final Boolean filecontentsOnly(
                    final PackageCheckBehaviors obj
                    )
    {
        Boolean  filecontents_only = obj.getFilecontentsOnly();
        return (filecontents_only == null ? DEFAULT_FILECONTENTS_ONLY : filecontents_only);
    }



    /**
     */
    public void setNoVolatileeditable(
                    final boolean no_volatileeditable
                    )
    {
        this.no_volatileeditable = no_volatileeditable;
    }


    public Boolean getNoVolatileeditable()
    {
        return no_volatileeditable;
    }


    public static final Boolean noVolatileeditable(
                    final PackageCheckBehaviors obj
                    )
    {
        Boolean  no_volatileeditable = obj.getNoVolatileeditable();
        return (no_volatileeditable == null ? DEFAULT_NO_VOLATILEEDITABLE : no_volatileeditable);
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + fileattributesOnly( this ).hashCode();
        result = prime * result + filecontentsOnly( this ).hashCode();
        result = prime * result + noVolatileeditable( this ).hashCode();

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

        if (!(obj instanceof PackageCheckBehaviors)) {
            return false;
        }

        PackageCheckBehaviors  other = (PackageCheckBehaviors)obj;
        if (fileattributesOnly( this ) == fileattributesOnly( other )) {
            if (filecontentsOnly( this ) == filecontentsOnly( other )) {
                if (noVolatileeditable( this ) == noVolatileeditable( other )) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[fileattributes_only=" + getFileattributesOnly()
                        + ", filecontents_only=" + getFilecontentsOnly()
                        + ", no_volatileeditable=" + getNoVolatileeditable()
                        + "]";
    }

}
//
