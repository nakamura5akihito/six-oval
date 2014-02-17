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
package jp.go.aist.six.oval.model.redhat;

import jp.go.aist.six.oval.model.OvalObject;



/**
 * A reference to CVE entry.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Cve.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Cve
    implements OvalObject
{

    private String  href;

    private String  id;



    /**
     * Constructor.
     */
    public Cve()
    {
    }


    public Cve(
                    final String id,
                    final String href
                    )
    {
        setId( id );
        setHref( href );
    }



    /**
     */
    public void setId(
                    final String id
                    )
    {
        this.id = id;
    }


    public String getId()
    {
        return id;
    }



    /**
     */
    public void setHref(
                    final String href
                    )
    {
        this.href = href;
    }


    public String getHref()
    {
        return href;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "cve[id=" + getId()
                        + ", href=" + getHref()
                        + "]";
    }

}
//Cve
