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

import io.opensec.six.oval.model.common.WindowsViewEnumeration;
import io.opensec.six.oval.model.sc.EntityItemStringType;



/**
 * The EntityItemWindowsViewType restricts a string value
 * to a specific set of values: 32-bit and 64-bit.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemWindowsViewType
    extends EntityItemStringType
{

    /**
     * Constructor.
     */
    public EntityItemWindowsViewType()
    {
    }


    public EntityItemWindowsViewType(
                    final String content
                    )
    {
        super( content );
    }



    public EntityItemWindowsViewType(
                    final WindowsViewEnumeration content
                    )
    {
        super( (content == null ? null : content.value()) );
    }



    //**************************************************************
    //  EntityItemBase
    //**************************************************************

    @Override
    public void setContent(
                    final String content
                    )
    {
        if (content != null) {
            //validation
            WindowsViewEnumeration.fromValue( content );
        }

        super.setContent( content );
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
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityItemWindowsViewType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//EntityItemWindowsViewType
