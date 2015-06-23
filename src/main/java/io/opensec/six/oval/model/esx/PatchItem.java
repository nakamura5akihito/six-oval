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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * Installation information about a specific patch in the VMware ESX server.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PatchItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType            patch_number;
    private EntityItemStringType            patch_name;
    private EntityItemIntType               knowledge_base_id;
    private EntityItemIntType               bundle_id;
    private EntityItemClassificationType    classification;
    private EntityItemSupportLevelType      support_level;

    private EntityItemBoolType              status;
    /* NOTE: The Java bean property name "status" conflicts with the one in the super class.
     * So, we rename the property name to "installationSatus", as like one in the AIX schema.
     */



    /**
     * Constructor.
     */
    public PatchItem()
    {
        this( 0 );
    }


    public PatchItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.PATCH;
    }



    /**
     */
    public void setPatchNumber(
                    final EntityItemStringType patch_number
                    )
    {
        this.patch_number = patch_number;
    }


    public EntityItemStringType getPatchNumber()
    {
        return patch_number;
    }



    /**
     */
    public void setPatchName(
                    final EntityItemStringType patch_name
                    )
    {
        this.patch_name = patch_name;
    }


    public EntityItemStringType getPatchName()
    {
        return patch_name;
    }



    /**
     */
    public void setKnowledgeBaseId(
                    final EntityItemIntType knowledge_base_id
                    )
    {
        this.knowledge_base_id = knowledge_base_id;
    }


    public EntityItemIntType getKnowledgeBaseId()
    {
        return knowledge_base_id;
    }



    /**
     */
    public void setBundleId(
                    final EntityItemIntType bundle_id
                    )
    {
        this.bundle_id = bundle_id;
    }


    public EntityItemIntType getBundleId()
    {
        return bundle_id;
    }



    /**
     */
    public void setClassification(
                    final EntityItemClassificationType classification
                    )
    {
        this.classification = classification;
    }


    public EntityItemClassificationType getClassification()
    {
        return classification;
    }



    /**
     */
    public void setSupportLevel(
                    final EntityItemSupportLevelType support_level
                    )
    {
        this.support_level = support_level;
    }


    public EntityItemSupportLevelType getSupportLevel()
    {
        return support_level;
    }



    /**
     */
    public void setInstalltaionStatus(
                    final EntityItemBoolType status
                    )
    {
        this.status = status;
    }


    public EntityItemBoolType getInstalltaionStatus()
    {
        return status;
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
        if (!(obj instanceof PatchItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch_item[" + super.toString()
                        + ", patch_number="         + getPatchNumber()
                        + ", patch_name="           + getPatchName()
                        + ", knowledge_base_id="    + getKnowledgeBaseId()
                        + ", bundle_id="            + getBundleId()
                        + ", classification="       + getClassification()
                        + ", support_level="        + getSupportLevel()
                        + ", status="               + getInstalltaionStatus()
                        + "]";
    }

}
//
