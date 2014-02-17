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
package jp.go.aist.six.oval.model.results;

import jp.go.aist.six.oval.model.OvalObject;




/**
 * An individual directive element determines whether or not
 * a specific type of result is included in the results document.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: DirectiveType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DirectiveType
    implements OvalObject
//    implements Dependent<SystemResult>
{

    private boolean  reported;
    //{required}


    public static final ContentEnumeration  DEFAULT_CONTENT = ContentEnumeration.FULL;

    private ContentEnumeration  content;
    //{optional, default="full"}



    /**
     * Constructor.
     */
    public DirectiveType()
    {
    }


    public DirectiveType(
                    final boolean reported
                    )
    {
        setReported( reported );
    }



    /**
     */
    public void setReported(
                    final boolean reported
                    )
    {
        this.reported = reported;
    }


    public boolean isReported()
    {
        return reported;
    }



    /**
     */
    public void setContent(
                    final ContentEnumeration content
                    )
    {
        this.content = content;
    }


    public ContentEnumeration getContent()
    {
        return content;
    }


    public static final ContentEnumeration content(
                    final DirectiveType obj
                    )
    {
        ContentEnumeration  content = obj.getContent();
        return (content == null ? DEFAULT_CONTENT : content);
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + (isReported() ? 0 : 1);

        result = prime * result + content( this ).hashCode();

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

        if (!(obj instanceof DirectiveType)) {
            return false;
        }

        DirectiveType  other = (DirectiveType)obj;
        if (content( this ) == content( other )) {
            if (this.isReported() == other.isReported()) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[reported=" + isReported()
                        + ", content=" + getContent()
                        + "]";
    }

}
// DirecitiveType
