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
package io.opensec.six.oval.model.linux;

import io.opensec.six.oval.model.common.AbstractRecurseFileBehaviors;
import io.opensec.six.oval.model.common.RecurseEnumeration;



/**
 * The FileBehaviors defines a number of behaviors
 * that allow a more detailed definition of a set of files
 * or file related items to collect.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileBehaviors
    extends AbstractRecurseFileBehaviors
{

    /**
     * Constructor.
     */
    public FileBehaviors()
    {
    }



    //**************************************************************
    //  AbstractRecurseFileBehaviors
    //**************************************************************

    @Override
    public void setRecurse(
                    final RecurseEnumeration recurse
                    )
    {
        if (recurse != null) {
            if (recurse == RecurseEnumeration.DIRECTORIES
                            ||  recurse == RecurseEnumeration.SYMLINKS
                            ||  recurse == RecurseEnumeration.SYMLINKS_AND_DIRECTORIES
                            ) {
                // valid value!!!
            }
        }

        super.setRecurse( recurse );
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

        if (!(obj instanceof FileBehaviors)) {
            return false;
        }

        return super.equals( obj );
    }

}
//FileBehaviors
