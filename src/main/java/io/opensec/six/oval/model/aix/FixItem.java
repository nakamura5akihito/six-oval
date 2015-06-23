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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import org.mongodb.morphia.annotations.Property;



/**
 * From /usr/sbin/instfix -iavk APARNum Command.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FixItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType  apar_number;

    //renamed from "abstract" to "description" because "abstract" is Java reserved word.
    @Property( "abstract" )
    private EntityItemStringType  description;

    private EntityItemStringType  symptom;
    private EntityItemFixInstallationStatusType  installation_status;



    /**
     * Constructor.
     */
    public FixItem()
    {
        this( 0 );
    }


    public FixItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.FIX;
    }



    /**
     */
    public void setAparNumber(
                    final EntityItemStringType apar_number
                    )
    {
        this.apar_number = apar_number;
    }


    public EntityItemStringType getAparNumber()
    {
        return apar_number;
    }



    /**
     */
    public void setAbstract(
                    final EntityItemStringType description
                    )
    {
        this.description = description;
    }


    public EntityItemStringType getAbstract()
    {
        return description;
    }



    /**
     */
    public void setSymptom(
                    final EntityItemStringType symptom
                    )
    {
        this.symptom = symptom;
    }


    public EntityItemStringType getSymptom()
    {
        return symptom;
    }



    /**
     */
    public void setInstallationStatus(
                    final EntityItemFixInstallationStatusType installation_status
                    )
    {
        this.installation_status = installation_status;
    }


    public EntityItemFixInstallationStatusType getInstallationStatus()
    {
        return installation_status;
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
        if (!(obj instanceof FixItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fix_item[" + super.toString()
                        + ", apar_number="          + getAparNumber()
                        + ", abstract="             + getAbstract()
                        + ", symptom="              + getSymptom()
                        + ", installation_status="  + getInstallationStatus()
                        + "]";
    }

}
//
