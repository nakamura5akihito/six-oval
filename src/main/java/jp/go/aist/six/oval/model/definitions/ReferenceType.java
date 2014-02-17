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
package jp.go.aist.six.oval.model.definitions;

import jp.go.aist.six.oval.model.OvalObject;



/**
 * A link from the OVAL Definition to a definitive external reference.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ReferenceType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ReferenceType
    implements OvalObject
{

    private String  source;
    //{required}


    private String  ref_id;
    //{required}


    private String  ref_url;
    //{optional, xsd:anyURI}



    /**
     * Constructor.
     */
    public ReferenceType()
    {
    }


    public ReferenceType(
                    final String source,
                    final String ref_id
                    )
    {
        this( source, ref_id, null );
    }


    public ReferenceType(
                    final String source,
                    final String ref_id,
                    final String ref_url
                    )
    {
        setSource( source );
        setRefId( ref_id );
        setRefUrl( ref_url );
    }



    /**
     */
    public void setSource(
                    final String source
                    )
    {
        this.source = source;
    }


    public String getSource()
    {
        return source;
    }



    /**
     */
    public void setRefId(
                    final String ref_id
                    )
    {
        this.ref_id = ref_id;
    }


    public String getRefId()
    {
        return ref_id;
    }



    /**
     */
    public void setRefUrl(
                    final String ref_url
                    )
    {
        this.ref_url = ref_url;
    }


    public String getRefUrl()
    {
        return ref_url;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        String  source = getSource();
        result = prime * result + ((source == null) ? 0 : source.hashCode());

        String  id = getRefId();
        result = prime * result + ((id == null) ? 0 : id.hashCode());

//        String  url = getReferenceURL();
//        result = prime * result + ((url == null) ? 0 : url.hashCode());

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

        if (!(obj instanceof ReferenceType)) {
            return false;
        }

        ReferenceType  other = (ReferenceType)obj;
        String  other_id = other.getRefId();
        String   this_id =  this.getRefId();
        if (this_id == other_id
                        ||  (this_id != null
                                        &&  this_id.equals( other_id ))) {
            String  other_source = other.getSource();
            String   this_source =  this.getSource();
            if (this_source == other_source
                            ||  (this_source != null
                                            &&  this_source.equals( other_source ))) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[source=" + getSource()
                        + ", ref_id=" + getRefId()
                        + ", ref_url=" + getRefUrl()
                        + "]";
    }

}
// ReferenceType
