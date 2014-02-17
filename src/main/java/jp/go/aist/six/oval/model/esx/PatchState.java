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
import jp.go.aist.six.oval.model.definitions.EntityStateBoolType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The patch_state defines the information about a specific patch.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PatchState.java 3155 2013-05-16 02:58:00Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.6:
 *             Replaced by the patch56 state and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class PatchState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           patch_number;

    private EntityStateBoolType             status;
    /* NOTE: The Java bean property name "status" conflicts with the one in the super class.
     * So, we rename the property name to "installationSatus", as like one in the AIX schema.
     */



    /**
     * Constructor.
     */
    public PatchState()
    {
        this( null, 0 );
    }


    public PatchState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PatchState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.PATCH;
    }




    /**
     */
    public void setPatchNumber(
                    final EntityStateStringType patch_number
                    )
    {
        this.patch_number = patch_number;
    }


    public EntityStateStringType getPatchNumber()
    {
        return patch_number;
    }



    /**
     */
    public void setInstallationStatus(
                    final EntityStateBoolType status
                    )
    {
        this.status = status;
    }


    public EntityStateBoolType getInstallationStatus()
    {
        return status;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getPatchNumber() );
        ref_list.add( getInstallationStatus() );

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
        if (!(obj instanceof PatchState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch_state[" + super.toString()
                        + ", patch_number="         + getPatchNumber()
                        + ", status="               + getInstallationStatus()
             + "]";
    }

}
//
