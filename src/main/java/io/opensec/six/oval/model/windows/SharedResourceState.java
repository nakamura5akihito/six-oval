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
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The sharedresource state defines the different metadata
 * associated with a Windows shared resource.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SharedResourceState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   netname;
    private EntityStateSharedResourceTypeType      shared_type;
    private EntityStateIntType      max_uses;
    private EntityStateIntType      current_uses;
    private EntityStateStringType   local_path;
    private EntityStateBoolType     access_read_permission;
    private EntityStateBoolType     access_write_permission;
    private EntityStateBoolType     access_create_permission;
    private EntityStateBoolType     access_exec_permission;
    private EntityStateBoolType     access_delete_permission;
    private EntityStateBoolType     access_atrib_permission;
    private EntityStateBoolType     access_perm_permission;
    private EntityStateBoolType     access_all_permission;



    /**
     * Constructor.
     */
    public SharedResourceState()
    {
        this( null, 0 );
    }


    public SharedResourceState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SharedResourceState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.sharedresource;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SHAREDRESOURCE;
    }



    /**
     */
    public void setNetname(
                    final EntityStateStringType netname
                    )
    {
        this.netname = netname;
    }


    public EntityStateStringType getNetname()
    {
        return netname;
    }



    /**
     */
    public void setSharedType(
                    final EntityStateSharedResourceTypeType shared_type
                    )
    {
        this.shared_type = shared_type;
    }


    public EntityStateSharedResourceTypeType getSharedType()
    {
        return shared_type;
    }



    /**
     */
    public void setMaxUses(
                    final EntityStateIntType max_uses
                    )
    {
        this.max_uses = max_uses;
    }


    public EntityStateIntType getMaxUses()
    {
        return max_uses;
    }



    /**
     */
    public void setCurrentUses(
                    final EntityStateIntType current_uses
                    )
    {
        this.current_uses = current_uses;
    }


    public EntityStateIntType getCurrentUses()
    {
        return current_uses;
    }



    /**
     */
    public void setLocalPath(
                    final EntityStateStringType local_path
                    )
    {
        this.local_path = local_path;
    }


    public EntityStateStringType getLocalPath()
    {
        return local_path;
    }



    /**
     */
    public void setAccessReadPermission(
                    final EntityStateBoolType access_read_permission
                    )
    {
        this.access_read_permission = access_read_permission;
    }


    public EntityStateBoolType getAccessReadPermission()
    {
        return access_read_permission;
    }



    /**
     */
    public void setAccessWritePermission(
                    final EntityStateBoolType access_write_permission
                    )
    {
        this.access_write_permission = access_write_permission;
    }


    public EntityStateBoolType getAccessWritePermission()
    {
        return access_write_permission;
    }



    /**
     */
    public void setAccessCreatePermission(
                    final EntityStateBoolType access_create_permission
                    )
    {
        this.access_create_permission = access_create_permission;
    }


    public EntityStateBoolType getAccessCreatePermission()
    {
        return access_create_permission;
    }



    /**
     */
    public void setAccessExecPermission(
                    final EntityStateBoolType access_exec_permission
                    )
    {
        this.access_exec_permission = access_exec_permission;
    }


    public EntityStateBoolType getAccessExecPermission()
    {
        return access_exec_permission;
    }



    /**
     */
    public void setAccessDeletePermission(
                    final EntityStateBoolType access_delete_permission
                    )
    {
        this.access_delete_permission = access_delete_permission;
    }


    public EntityStateBoolType getAccessDeletePermission()
    {
        return access_delete_permission;
    }



    /**
     */
    public void setAccessAtribPermission(
                    final EntityStateBoolType access_atrib_permission
                    )
    {
        this.access_atrib_permission = access_atrib_permission;
    }


    public EntityStateBoolType getAccessAtribPermission()
    {
        return access_atrib_permission;
    }



    /**
     */
    public void setAccessPermPermission(
                    final EntityStateBoolType access_perm_permission
                    )
    {
        this.access_perm_permission = access_perm_permission;
    }


    public EntityStateBoolType getAccessPermPermission()
    {
        return access_perm_permission;
    }



    /**
     */
    public void setAccessAllPermission(
                    final EntityStateBoolType access_all_permission
                    )
    {
        this.access_all_permission = access_all_permission;
    }


    public EntityStateBoolType getAccessAllPermission()
    {
        return access_all_permission;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getNetname() );
        ref_list.add( getSharedType() );
        ref_list.add( getMaxUses() );
        ref_list.add( getCurrentUses() );
        ref_list.add( getLocalPath() );
        ref_list.add( getAccessReadPermission() );
        ref_list.add( getAccessWritePermission() );
        ref_list.add( getAccessCreatePermission() );
        ref_list.add( getAccessExecPermission() );
        ref_list.add( getAccessDeletePermission() );
        ref_list.add( getAccessAtribPermission() );
        ref_list.add( getAccessPermPermission() );
        ref_list.add( getAccessAllPermission() );

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
        if (!(obj instanceof SharedResourceState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sharedresource_state[" + super.toString()
             + ", netname="                     + getNetname()
             + ", shared_type="                 + getSharedType()
             + ", max_uses="                    + getMaxUses()
             + ", current_users="               + getCurrentUses()
             + ", local_path="                  + getLocalPath()
             + ", access_read_permission="      + getAccessReadPermission()
             + ", access_write_permission="     + getAccessWritePermission()
             + ", access_create_permission="    + getAccessCreatePermission()
             + ", access_exec_permission="      + getAccessExecPermission()
             + ", access_delete_permission="    + getAccessDeletePermission()
             + ", access_atrib_permission="     + getAccessAtribPermission()
             + ", access_perm_permission="      + getAccessPermPermission()
             + ", access_all_permission="       + getAccessAllPermission()
             + "]";
    }
}
//SharedResourceState
