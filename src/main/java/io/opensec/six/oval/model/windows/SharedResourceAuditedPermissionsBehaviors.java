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

import io.opensec.six.oval.model.OvalObject;



/**
 * The SharedResourceAuditedPermissionsBehaviors defines a behavior that allows
 * for a more detailed definition of the sharedresourceauditedpermissions_object being specified.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SharedResourceAuditedPermissionsBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_INCLUDE_GROUP = Boolean.TRUE;

    private Boolean  include_group;
    //{optional, default="true"}


    /**
     * Constructor.
     */
    public SharedResourceAuditedPermissionsBehaviors()
    {
    }



    /**
     */
    public void setIncludeGroup(
                    final Boolean include_group
                    )
    {
        this.include_group = include_group;
    }


    public Boolean getIncludeGroup()
    {
        return include_group;
    }


    public static final Boolean includeGroup(
                    final SharedResourceAuditedPermissionsBehaviors obj
                    )
    {
        Boolean  include_group = obj.getIncludeGroup();
        return (include_group == null ? DEFAULT_INCLUDE_GROUP : include_group);
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + includeGroup( this ).hashCode();

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SharedResourceAuditedPermissionsBehaviors)) {
            return false;
        }

        SharedResourceAuditedPermissionsBehaviors  other = (SharedResourceAuditedPermissionsBehaviors)obj;
        if (includeGroup( this ) == includeGroup( other )) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[include_group=" + getIncludeGroup()
                        + "]";
    }

}
//
