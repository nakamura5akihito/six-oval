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
package jp.go.aist.six.oval.model.mitre;

import jp.go.aist.six.oval.model.OvalObject;




/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Contributor.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Contributor
    implements OvalObject
{

    private String  name;
    //{xsd:string?}


    private String  organization;
    //{xsd:string}



    /**
     * Constructor.
     */
    public Contributor()
    {
    }


    public Contributor(
                    final String name,
                    final String organization
                    )
    {
        setName( name );
        setOrganization( organization );
    }



    /**
     */
    public void setName(
                    final String name
                    )
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }



    /**
     */
    public void setOrganization(
                    final String organization
                    )
    {
        this.organization = organization;
    }


    public String getOrganization()
    {
        return organization;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "contributor[organization=" + getOrganization()
                        + ", name=" + getName()
                        + "]";
    }

}
// Contributor
