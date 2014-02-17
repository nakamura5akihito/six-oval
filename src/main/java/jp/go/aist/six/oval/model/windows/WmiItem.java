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
package jp.go.aist.six.oval.model.windows;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The wmi item outlines information to be checked through Microsoft's WMI interface.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: WmiItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.7:
 *             Replaced by the wmi57 item and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class WmiItem
    extends ItemType
{

    private EntityItemStringType  namespace;
    //{0..1}

    private EntityItemStringType  wql;
    //{0..1}

    private final Collection<EntityItemAnySimpleType>  result =
        new ArrayList<EntityItemAnySimpleType>();
    //{0..*}



    /**
     * Constructor.
     */
    public WmiItem()
    {
        this( 0 );
    }


    public WmiItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.wmi;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.WMI;
    }



    /**
     */
    public void setNamespace(
                    final EntityItemStringType namespace
                    )
    {
        this.namespace = namespace;
    }


    public EntityItemStringType getNamespace()
    {
        return namespace;
    }



    /**
     */
    public void setWql(
                    final EntityItemStringType wql
                    )
    {
        this.wql = wql;
    }


    public EntityItemStringType getWql()
    {
        return wql;
    }



    /**
     */
    public void setResult(
                    final Collection<? extends EntityItemAnySimpleType> results
                    )
    {
        if (results != result ) {
            result.clear();
            if (results != null  &&  results.size() > 0) {
                result.addAll( results );
            }
        }
    }


    public Collection<EntityItemAnySimpleType> getResult()
    {
        return result;
    }


    public Iterator<EntityItemAnySimpleType> iterateResult()
    {
        return result.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "wmi_item[" + super.toString()
             + ", namespace="   + getNamespace()
             + ", wql="         + getWql()
             + ", result="      + getResult()
             + "]";
    }

}
// WmiItem
