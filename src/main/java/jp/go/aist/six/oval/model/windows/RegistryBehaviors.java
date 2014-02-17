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

import jp.go.aist.six.oval.model.common.AbstractBehaviors;
import jp.go.aist.six.oval.model.common.WindowsViewEnumeration;



/**
 * The RegistryBehaviors type defines a number of behaviors
 * that allow a more detailed definition of the registry object being specified.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegistryBehaviors.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegistryBehaviors
    extends AbstractBehaviors
{

    /**
     * The default windowsView: "64_bit".
     */
    public static final WindowsViewEnumeration  DEFAULT_WINDOWS_VIEW =
                    WindowsViewEnumeration.WINDOWS_64_BIT;

    private WindowsViewEnumeration  windows_view;
    //{optional, default="64_bit"}



    /**
     * Constructor.
     */
    public RegistryBehaviors()
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
                    final RegistryBehaviors obj
                    )
    {
        WindowsViewEnumeration  windows_view = obj.getWindowsView();
        return (windows_view == null ? DEFAULT_WINDOWS_VIEW : windows_view);
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
        if (!(obj instanceof RegistryBehaviors)) {
            return false;
        }

        if (super.equals( obj )) {
            RegistryBehaviors  other = (RegistryBehaviors)obj;
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
//RegistryBehaviors
