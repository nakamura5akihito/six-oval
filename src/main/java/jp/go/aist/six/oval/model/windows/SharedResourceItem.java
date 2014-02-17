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
package jp.go.aist.six.oval.model.windows;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SharedResourceItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SharedResourceItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   netname;
    private EntityItemSharedResourceTypeType      shared_type;
    private EntityItemIntType      max_uses;
    private EntityItemIntType      current_uses;
    private EntityItemStringType   local_path;
    private EntityItemBoolType     access_read_permission;
    private EntityItemBoolType     access_write_permission;
    private EntityItemBoolType     access_create_permission;
    private EntityItemBoolType     access_exec_permission;
    private EntityItemBoolType     access_delete_permission;
    private EntityItemBoolType     access_atrib_permission;
    private EntityItemBoolType     access_perm_permission;
    private EntityItemBoolType     access_all_permission;



    /**
     * Constructor.
     */
    public SharedResourceItem()
    {
        this( 0 );
    }


    public SharedResourceItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public SharedResourceItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.sharedresource;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SHAREDRESOURCE;
    }



    /**
     */
    public void setNetname(
                    final EntityItemStringType netname
                    )
    {
        this.netname = netname;
    }


    public EntityItemStringType getNetname()
    {
        return netname;
    }



    /**
     */
    public void setSharedType(
                    final EntityItemSharedResourceTypeType shared_type
                    )
    {
        this.shared_type = shared_type;
    }


    public EntityItemSharedResourceTypeType getSharedType()
    {
        return shared_type;
    }



    /**
     */
    public void setMaxUses(
                    final EntityItemIntType max_uses
                    )
    {
        this.max_uses = max_uses;
    }


    public EntityItemIntType getMaxUses()
    {
        return max_uses;
    }



    /**
     */
    public void setCurrentUses(
                    final EntityItemIntType current_uses
                    )
    {
        this.current_uses = current_uses;
    }


    public EntityItemIntType getCurrentUses()
    {
        return current_uses;
    }



    /**
     */
    public void setLocalPath(
                    final EntityItemStringType local_path
                    )
    {
        this.local_path = local_path;
    }


    public EntityItemStringType getLocalPath()
    {
        return local_path;
    }



    /**
     */
    public void setAccessReadPermission(
                    final EntityItemBoolType access_read_permission
                    )
    {
        this.access_read_permission = access_read_permission;
    }


    public EntityItemBoolType getAccessReadPermission()
    {
        return access_read_permission;
    }



    /**
     */
    public void setAccessWritePermission(
                    final EntityItemBoolType access_write_permission
                    )
    {
        this.access_write_permission = access_write_permission;
    }


    public EntityItemBoolType getAccessWritePermission()
    {
        return access_write_permission;
    }



    /**
     */
    public void setAccessCreatePermission(
                    final EntityItemBoolType access_create_permission
                    )
    {
        this.access_create_permission = access_create_permission;
    }


    public EntityItemBoolType getAccessCreatePermission()
    {
        return access_create_permission;
    }



    /**
     */
    public void setAccessExecPermission(
                    final EntityItemBoolType access_exec_permission
                    )
    {
        this.access_exec_permission = access_exec_permission;
    }


    public EntityItemBoolType getAccessExecPermission()
    {
        return access_exec_permission;
    }



    /**
     */
    public void setAccessDeletePermission(
                    final EntityItemBoolType access_delete_permission
                    )
    {
        this.access_delete_permission = access_delete_permission;
    }


    public EntityItemBoolType getAccessDeletePermission()
    {
        return access_delete_permission;
    }



    /**
     */
    public void setAccessAtribPermission(
                    final EntityItemBoolType access_atrib_permission
                    )
    {
        this.access_atrib_permission = access_atrib_permission;
    }


    public EntityItemBoolType getAccessAtribPermission()
    {
        return access_atrib_permission;
    }



    /**
     */
    public void setAccessPermPermission(
                    final EntityItemBoolType access_perm_permission
                    )
    {
        this.access_perm_permission = access_perm_permission;
    }


    public EntityItemBoolType getAccessPermPermission()
    {
        return access_perm_permission;
    }



    /**
     */
    public void setAccessAllPermission(
                    final EntityItemBoolType access_all_permission
                    )
    {
        this.access_all_permission = access_all_permission;
    }


    public EntityItemBoolType getAccessAllPermission()
    {
        return access_all_permission;
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
        if (!(obj instanceof SharedResourceItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sharedresource_item[" + super.toString()
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
//SharedResourceItem
