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
/*
*  @product.title@
 *  Copyright (C) @product.copyright-year@
 *    @product.vendor@
 *    Registration Number: @product.registration-number@
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

import jp.go.aist.six.oval.model.common.DatatypeEnumeration;



/**
 * The LiteralComponent type defines a literal value to be used as a component.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: LiteralComponentType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LiteralComponentType
    extends ComponentGroup
{

    private String  content;
    //{xsd:anySimpleType}


    public static final DatatypeEnumeration  DEFAULT_DATATYPE =
        DatatypeEnumeration.STRING;

    private DatatypeEnumeration  datatype;
    //{optional, default="string"}



    /**
     * Constructor.
     */
    public LiteralComponentType()
    {
    }


    public LiteralComponentType(
                    final String content
                    )
    {
        setContent( content );
    }



    /**
     */
    public void setContent(
                    final String content
                    )
    {
        this.content = content;
    }


    public String getContent()
    {
        return content;
    }



    /**
     */
    public void setDatatype(
                    final DatatypeEnumeration datatype
                    )
    {
        this.datatype = datatype;
    }


    public DatatypeEnumeration getDatatype()
    {
        return datatype;
    }


    public static DatatypeEnumeration datatype(
                    final LiteralComponentType obj
                    )
    {
        DatatypeEnumeration  datatype = obj.getDatatype();
        return (datatype == null ? DEFAULT_DATATYPE : datatype);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[datatype=" + getDatatype()
             + ", " + getContent()
             + "]";
    }

}
// LiteralComponentType
