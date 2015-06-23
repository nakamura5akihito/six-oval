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
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The windows user_sid item allows the different groups (identified by SID)
 * that a user belongs to be collected.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UserSidItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType       user_sid;
    private EntityItemBoolType         enabled;
    private EntityItemStringType       group_sid;



    /**
     * Constructor.
     */
    public UserSidItem()
    {
        this( 0 );
    }


    public UserSidItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public UserSidItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.USER_SID;
    }



    /**
     */
    public void setUserSid(
                    final EntityItemStringType user_sid
                    )
    {
        this.user_sid = user_sid;
    }


    public EntityItemStringType getUserSid()
    {
        return user_sid;
    }



    /**
     */
    public void setEnabled(
                    final EntityItemBoolType enabled
                    )
    {
        this.enabled = enabled;
    }


    public EntityItemBoolType getEnabled()
    {
        return enabled;
    }



    /**
     */
    public void setGroupSid(
                    final EntityItemStringType group_sid
                    )
    {
        this.group_sid = group_sid;
    }


    public EntityItemStringType getGroupSid()
    {
        return group_sid;
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
        if (!(obj instanceof UserSidItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "user_sid_item[" + super.toString()
                        + ", user_sid="     + getUserSid()
                        + ", enabled="      + getEnabled()
                        + ", group_sid="    + getGroupSid()
             + "]";
    }
}
//
