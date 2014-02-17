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
package jp.go.aist.six.oval.model.linux;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateBoolType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The selinuxboolean state defines the different information
 * that can be used to evaluate the specified SELinux boolean.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SelinuxBooleanState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SelinuxBooleanState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           name;
    private EntityStateBoolType             current_status;
    private EntityStateBoolType             pending_status;



    /**
     * Constructor.
     */
    public SelinuxBooleanState()
    {
        this( null, 0 );
    }


    public SelinuxBooleanState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SelinuxBooleanState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.selinuxboolean;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.SELINUXBOOLEAN;
    }



    /**
     */
    public void setName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
    }


    public EntityStateStringType getName()
    {
        return name;
    }



    /**
     */
    public void setCurrentStatus(
                    final EntityStateBoolType current_status
                    )
    {
        this.current_status = current_status;
    }


    public EntityStateBoolType getCurrentStatus()
    {
        return current_status;
    }



    /**
     */
    public void setPendingStatus(
                    final EntityStateBoolType pending_status
                    )
    {
        this.pending_status = pending_status;
    }


    public EntityStateBoolType getPendingStatus()
    {
        return pending_status;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getName() );
        ref_list.add( getCurrentStatus() );
        ref_list.add( getPendingStatus() );

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
        if (!(obj instanceof SelinuxBooleanState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "selinuxboolean_state[" + super.toString()
                        + ", name="             + getName()
                        + ", current_status="   + getCurrentStatus()
                        + ", pending_status="   + getPendingStatus()
             + "]";
    }

}
//SelinuxBooleanState
