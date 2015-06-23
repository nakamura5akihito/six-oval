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
package io.opensec.six.oval.model.esx;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The patch56_state defines the different information that can be used to evaluate
 * the specified VMware ESX Serer patch.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Patch56State
    extends StateType
{

    //{0..1}
    private EntityStateStringType           patch_name;
    private EntityStateIntType              knowledge_base_id;
    private EntityStateIntType              bundle_id;
    private EntityStateClassificationType   classification;
    private EntityStateSupportLevelType     support_level;

    private EntityStateBoolType             status;
    /* NOTE: The Java bean property name "status" conflicts with the one in the super class.
     * So, we rename the property name to "installationSatus", as like one in the AIX schema.
     */


    /**
     * Constructor.
     */
    public Patch56State()
    {
        this( null, 0 );
    }


    public Patch56State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public Patch56State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.PATCH56;
    }




    /**
     */
    public void setPatchName(
                    final EntityStateStringType patch_name
                    )
    {
        this.patch_name = patch_name;
    }


    public EntityStateStringType getPatchName()
    {
        return patch_name;
    }



    /**
     */
    public void setKnowledgeBaseId(
                    final EntityStateIntType knowledge_base_id
                    )
    {
        this.knowledge_base_id = knowledge_base_id;
    }


    public EntityStateIntType getKnowledgeBaseId()
    {
        return knowledge_base_id;
    }



    /**
     */
    public void setBundleId(
                    final EntityStateIntType bundle_id
                    )
    {
        this.bundle_id = bundle_id;
    }


    public EntityStateIntType getBundleId()
    {
        return bundle_id;
    }



    /**
     */
    public void setClassification(
                    final EntityStateClassificationType classification
                    )
    {
        this.classification = classification;
    }


    public EntityStateClassificationType getClassification()
    {
        return classification;
    }



    /**
     */
    public void setSupportLevel(
                    final EntityStateSupportLevelType support_level
                    )
    {
        this.support_level = support_level;
    }


    public EntityStateSupportLevelType getSupportLevel()
    {
        return support_level;
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
        ref_list.add( getPatchName() );
        ref_list.add( getKnowledgeBaseId() );
        ref_list.add( getBundleId() );
        ref_list.add( getClassification() );
        ref_list.add( getSupportLevel() );
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
        if (!(obj instanceof Patch56State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch56_state[" + super.toString()
                        + ", patch_name="           + getPatchName()
                        + ", knowledge_base_id="    + getKnowledgeBaseId()
                        + ", bundle_id="            + getBundleId()
                        + ", classification="       + getClassification()
                        + ", support_level="        + getSupportLevel()
                        + ", status="               + getInstallationStatus()
             + "]";
    }

}
//
