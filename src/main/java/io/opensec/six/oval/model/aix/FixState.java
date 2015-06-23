/**
 * SIX OVAL - https://nakamura5akihito.github.io/
 * Copyright (C) 2010 Akihito Nakamura
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
package io.opensec.six.oval.model.aix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;
import org.mongodb.morphia.annotations.Property;



/**
 * The fix_state defines the different information associated
 * with a specific fix installed on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FixState
    extends StateType
{

    //{0..1}
    private EntityStateStringType                   apar_number;

    @Property( "abstract" )
    private EntityStateStringType                   apar_abstract;
    //renamed!!!
    // "abstract" is Java reserved keyword.

    private EntityStateStringType                   symptom;
    private EntityStateFixInstallationStatusType    installation_status;



    /**
     * Constructor.
     */
    public FixState()
    {
        this( null, 0 );
    }


    public FixState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public FixState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.FIX;
    }




    /**
     */
    public void setAparNumber(
                    final EntityStateStringType apar_number
                    )
    {
        this.apar_number = apar_number;
    }


    public EntityStateStringType getAparNumber()
    {
        return apar_number;
    }



    /**
     */
    public void setAbstract(
                    final EntityStateStringType apar_abstract
                    )
    {
        this.apar_abstract = apar_abstract;
    }


    public EntityStateStringType getAbstract()
    {
        return apar_abstract;
    }



    /**
     */
    public void setSymptom(
                    final EntityStateStringType symptom
                    )
    {
        this.symptom = symptom;
    }


    public EntityStateStringType getSymptom()
    {
        return symptom;
    }



    /**
     */
    public void setInstallationStatus(
                    final EntityStateFixInstallationStatusType installation_status
                    )
    {
        this.installation_status = installation_status;
    }


    public EntityStateFixInstallationStatusType getInstallationStatus()
    {
        return installation_status;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getAparNumber() );
        ref_list.add( getAbstract() );
        ref_list.add( getSymptom() );
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
        if (!(obj instanceof FixState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fix_state[" + super.toString()
                        + ", apar_number="          + getAparNumber()
                        + ", abstract="             + getAbstract()
                        + ", symptom="              + getSymptom()
                        + ", installation_status="  + getInstallationStatus()
             + "]";
    }

}
//
