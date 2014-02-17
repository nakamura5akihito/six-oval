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
package jp.go.aist.six.oval.model.esx;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The visdkmanagedobject state enumerates the different properties
 * a Managed Entity might have.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ViSdkManagedObjectState.java 3151 2013-05-14 03:31:09Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ViSdkManagedObjectState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           property;
    private EntityStateAnySimpleType        value;



    /**
     * Constructor.
     */
    public ViSdkManagedObjectState()
    {
        this( null, 0 );
    }


    public ViSdkManagedObjectState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public ViSdkManagedObjectState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.VISDKMANAGEDOBJECT;
    }




    /**
     */
    public void setProperty(
                    final EntityStateStringType property
                    )
    {
        this.property = property;
    }


    public EntityStateStringType getProperty()
    {
        return property;
    }



    /**
     */
    public void setValue(
                    final EntityStateAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityStateAnySimpleType getValue()
    {
        return value;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getProperty() );
        ref_list.add( getValue() );

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
        if (!(obj instanceof ViSdkManagedObjectState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "visdkmanagedobject_state[" + super.toString()
                        + ", property="     + getProperty()
                        + ", value="        + getValue()
             + "]";
    }

}
//
