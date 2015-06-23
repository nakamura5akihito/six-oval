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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemRecordType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.EntityItemVersionType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The cmdlet_item represents a PowerShell cmdlet, the parameters supplied to it,
 * and the value it returned.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CmdletItem
    extends ItemType
{

    //{0..1, nillable="true"}
    private EntityItemStringType      module_name;
//  private EntityItemStringType      module_name = new EntityItemStringType();
    private EntityItemGUIDType        module_id;
//  private EntityItemGUIDType        module_id = new EntityItemGUIDType();
    private EntityItemVersionType     module_version;
//    private EntityItemVersionType     module_version = new EntityItemVersionType();

    //{0..1}
    private EntityItemCmdletVerbType  verb;
    private EntityItemStringType      noun;

    //{0..1, nillable="true"}
    private EntityItemRecordType      parameters;
//    private EntityItemRecordType    parameters = new EntityItemRecordType();
    private EntityItemRecordType      select;
//    private EntityItemRecordType    select = new EntityItemRecordType();

    //{0..*}
    private final Collection<EntityItemRecordType>  value = new ArrayList<EntityItemRecordType>();



    /**
     * Constructor.
     */
    public CmdletItem()
    {
        this( 0 );
    }


    public CmdletItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.CMDLET;
    }



    /**
     */
    public void setModuleName(
                    final EntityItemStringType module_name
                    )
    {
        this.module_name = module_name;
    }


    public EntityItemStringType getModuleName()
    {
        return module_name;
    }



    /**
     */
    public void setModuleId(
                    final EntityItemGUIDType module_id
                    )
    {
        this.module_id = module_id;
    }


    public EntityItemGUIDType getModuleId()
    {
        return module_id;
    }



    /**
     */
    public void setModuleVersion(
                    final EntityItemVersionType module_version
                    )
    {
        this.module_version = module_version;
    }


    public EntityItemVersionType getModuleVersion()
    {
        return module_version;
    }



    /**
     */
    public void setVerb(
                    final EntityItemCmdletVerbType verb
                    )
    {
        this.verb = verb;
    }


    public EntityItemCmdletVerbType getVerb()
    {
        return verb;
    }



    /**
     */
    public void setNoun(
                    final EntityItemStringType noun
                    )
    {
        this.noun = noun;
    }


    public EntityItemStringType getNoun()
    {
        return noun;
    }



    /**
     */
    public void setParameters(
                    final EntityItemRecordType parameters
                    )
    {
        this.parameters = parameters;
    }


    public EntityItemRecordType getParameters()
    {
        return parameters;
    }



    /**
     */
    public void setSelect(
                    final EntityItemRecordType select
                    )
    {
        this.select = select;
    }


    public EntityItemRecordType getSelect()
    {
        return select;
    }



    /**
     */
    public void setValue(
                    final Collection<? extends EntityItemRecordType> values
                    )
    {
        if (value != values) {
            value.clear();
            if (values != null  &&  values.size() > 0) {
                value.addAll( values );
            }
        }
    }


    public boolean addValue(
                    final EntityItemRecordType value
                    )
    {
        if (value == null) {
            return false;
        }

        return this.value.add( value );
    }


    public Collection<EntityItemRecordType> getValue()
    {
        return value;
    }


    public Iterator<EntityItemRecordType> iterateValue()
    {
        return value.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "cmdlet_item[" + super.toString()
                        + ", module_name="      + getModuleName()
                        + ", module_id="        + getModuleId()
                        + ", module_version="   + getModuleVersion()
                        + ", verb="             + getVerb()
                        + ", noun="             + getNoun()
                        + ", parameters="       + getParameters()
                        + ", select="           + getSelect()
                        + ", value="            + getValue()
             + "]";
    }

}
//
