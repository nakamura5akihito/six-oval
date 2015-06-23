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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateRecordType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.EntityStateVersionType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The cmdlet_state allows for assertions about the presence of PowerShell
 * cmdlet related properties and values obtained from a cmdlet.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CmdletState
    extends StateType
{

    private EntityStateStringType      module_name;
    private EntityStateGUIDType        module_id;
    private EntityStateVersionType     module_version;
    private EntityStateCmdletVerbType  verb;
    private EntityStateStringType      noun;
    private EntityStateRecordType      parameters;
    private EntityStateRecordType      select;
    private EntityStateRecordType      value;



    /**
     * Constructor.
     */
    public CmdletState()
    {
        this( null, 0 );
    }


    public CmdletState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public CmdletState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.CMDLET;
    }



    /**
     */
    public void setModuleName(
                    final EntityStateStringType module_name
                    )
    {
        this.module_name = module_name;
    }


    public EntityStateStringType getModuleName()
    {
        return module_name;
    }



    /**
     */
    public void setModuleId(
                    final EntityStateGUIDType module_id
                    )
    {
        this.module_id = module_id;
    }


    public EntityStateGUIDType getModuleId()
    {
        return module_id;
    }



    /**
     */
    public void setModuleVersion(
                    final EntityStateVersionType module_version
                    )
    {
        this.module_version = module_version;
    }


    public EntityStateVersionType getModuleVersion()
    {
        return module_version;
    }



    /**
     */
    public void setVerb(
                    final EntityStateCmdletVerbType verb
                    )
    {
        this.verb = verb;
    }


    public EntityStateCmdletVerbType getVerb()
    {
        return verb;
    }



    /**
     */
    public void setNoun(
                    final EntityStateStringType noun
                    )
    {
        this.noun = noun;
    }


    public EntityStateStringType getNoun()
    {
        return noun;
    }



    /**
     */
    public void setParameters(
                    final EntityStateRecordType parameters
                    )
    {
        this.parameters = parameters;
    }


    public EntityStateRecordType getParameters()
    {
        return parameters;
    }



    /**
     */
    public void setSelect(
                    final EntityStateRecordType select
                    )
    {
        this.select = select;
    }


    public EntityStateRecordType getSelect()
    {
        return select;
    }



    /**
     */
    public void setValue(
                    final EntityStateRecordType value
                    )
    {
        this.value = value;
    }


    public EntityStateRecordType getValue()
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

        ref_list.add( getModuleName() );
        ref_list.add( getModuleId() );
        ref_list.add( getModuleVersion() );
        ref_list.add( getVerb() );
        ref_list.add( getNoun() );
        ref_list.add( getParameters() );
        ref_list.add( getSelect() );
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
        if (!(obj instanceof CmdletState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "cmdlet_state[" + super.toString()
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
