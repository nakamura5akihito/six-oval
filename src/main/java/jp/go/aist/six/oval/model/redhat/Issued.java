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
 * A date when a Red Hat security advisory was issued.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Issued.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Issued
    implements OvalObject
{

    private String  date;



    /**
     * Constructor.
     */
    public Issued()
    {
    }


    public Issued(
                    final String date
                    )
    {
        setDate( date );
    }



    /**
     */
    public void setDate(
                    final String date
                    )
    {
        this.date = date;
    }


    public String getDate()
    {
        return date;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "issued[date=" + getDate()
                        + "]";
    }

}
//Issued
