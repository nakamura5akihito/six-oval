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
package io.opensec.six.oval.model.independent;

import io.opensec.six.oval.model.common.AbstractRecurseFileBehaviors;
import io.opensec.six.oval.model.common.RecurseEnumeration;
import io.opensec.six.oval.model.common.WindowsViewEnumeration;



/**
 * The FileBehaviors type defines a number of behaviors
 * that allow a more detailed definition of a set of files
 * or file related items to collect.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileBehaviors
    extends AbstractRecurseFileBehaviors
{

    public static final WindowsViewEnumeration  DEFAULT_WINDOWS_VIEW
    = WindowsViewEnumeration.WINDOWS_64_BIT;

    private WindowsViewEnumeration  windows_view;
    //{optional, default="64_bit"}



    /**
     * Constructor.
     */
    public FileBehaviors()
    {
    }



    /**
     */
    public void setWindowsView(
                    final WindowsViewEnumeration windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public WindowsViewEnumeration getWindowsView()
    {
        return windows_view;
    }


    public static final WindowsViewEnumeration windowsView(
                    final FileBehaviors obj
                    )
    {
        WindowsViewEnumeration  windows_view = obj.getWindowsView();
        return (windows_view == null ? DEFAULT_WINDOWS_VIEW : windows_view);
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
        final int  prime = 37;
        int  result = super.hashCode();

        result = prime * result + windowsView( this ).hashCode();

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof FileBehaviors)) {
            return false;
        }

        if (super.equals( obj )) {
            FileBehaviors  other = (FileBehaviors)obj;
            if (windowsView( this ) == windowsView( other )) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", windows_view=" + getWindowsView()
                        ;
    }

}
// FileBehaviors
