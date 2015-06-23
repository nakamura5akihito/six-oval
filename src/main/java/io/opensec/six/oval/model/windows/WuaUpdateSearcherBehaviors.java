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
 * The WuaUpdateSearcherBehaviors defines behaviors that allow
 * a more detailed definition of the wuaupdatesearcher object being specified.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class WuaUpdateSearcherBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_INCLUDE_SUPERSEDED_UPDATES = Boolean.TRUE;

    private Boolean  include_superseded_updates;
    //{optional, default='true'}



    /**
     * Constructor.
     */
    public WuaUpdateSearcherBehaviors()
    {
    }



    /**
     */
    public void setIncludeSupersededUpdates(
                    final Boolean include_superseded_updates
                    )
    {
        this.include_superseded_updates = include_superseded_updates;
    }


    public Boolean getIncludeSupersededUpdates()
    {
        return include_superseded_updates;
    }


    public static Boolean includeSupersededUpdates(
                    final WuaUpdateSearcherBehaviors obj
                    )
    {
        Boolean  include_superseded_updates = obj.getIncludeSupersededUpdates();
        return (include_superseded_updates == null
                        ? DEFAULT_INCLUDE_SUPERSEDED_UPDATES
                        : include_superseded_updates);
    }





    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + (includeSupersededUpdates( this ) ? 0 : 1);

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

        if (!(obj instanceof WuaUpdateSearcherBehaviors)) {
            return false;
        }

        if (super.equals( obj )) {
            WuaUpdateSearcherBehaviors  other = (WuaUpdateSearcherBehaviors)obj;
            if (includeSupersededUpdates( this ) == includeSupersededUpdates( other )) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", include_superseded_updates=" + getIncludeSupersededUpdates()
                        ;
    }

}
//WuaUpdateSearcherBehaviors
