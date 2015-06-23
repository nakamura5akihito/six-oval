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

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * This item describes info related to Slackware packages.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SlackwarePkgInfoItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType  name;
    private EntityItemStringType  version;
    private EntityItemStringType  architecture;
    private EntityItemStringType  revision;



    /**
     * Constructor.
     */
    public SlackwarePkgInfoItem()
    {
        this( 0 );
    }


    public SlackwarePkgInfoItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.slackwarepkginfo;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.SLACKWAREPKGINFO;
    }



    /**
     */
    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }


    public EntityItemStringType getName()
    {
        return name;
    }



    /**
     */
    public void setArchitecture(
                    final EntityItemStringType architecture
                    )
    {
        this.architecture = architecture;
    }


    public EntityItemStringType getArchitecture()
    {
        return architecture;
    }



    /**
     */
    public void setVersion(
                    final EntityItemStringType version
                    )
    {
        this.version = version;
    }


    public EntityItemStringType getVersion()
    {
        return version;
    }



    /**
     */
    public void setRevision(
                    final EntityItemStringType revision
                    )
    {
        this.revision = revision;
    }


    public EntityItemStringType getRevision()
    {
        return revision;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "slackwarepkginfo_item[" + super.toString()
                        + ", name="         + getName()
                        + ", architecture=" + getArchitecture()
                        + ", version="      + getVersion()
                        + ", revision="     + getRevision()
             + "]";
    }

}
//SlackwarePkgInfoItem
