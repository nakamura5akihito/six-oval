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
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateRecordType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Wmi57State.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Wmi57State
    extends StateType
{

    private EntityStateStringType  namespace;
    //{0..1}

    private EntityStateStringType  wql;
    //{0..1}

    private EntityStateRecordType  result;
    //{0..1, unique="field/@name"}



    /**
     * Constructor.
     */
    public Wmi57State()
    {
        this( null, 0 );
    }


    public Wmi57State(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.wmi57;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.WMI57;
    }



    /**
     */
    public void setNamespace(
                    final EntityStateStringType namespace
                    )
    {
        this.namespace = namespace;
    }


    public EntityStateStringType getNamespace()
    {
        return namespace;
    }



    /**
     */
    public void setWql(
                    final EntityStateStringType wql
                    )
    {
        this.wql = wql;
    }


    public EntityStateStringType getWql()
    {
        return wql;
    }



    /**
     */
    public void setResult(
                    final EntityStateRecordType result
                    )
    {
        this.result = result;
    }


    public EntityStateRecordType getResult()
    {
        return result;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getNamespace() );
        ref_list.add( getWql() );
        ref_list.add( getResult() );

        return ref_list;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof Wmi57State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "wmi57_state[" + super.toString()
                        + ", " + getNamespace()
                        + ", " + getWql()
                        + ", " + getResult()
                        + "]";
    }

}
//Wmi57State
