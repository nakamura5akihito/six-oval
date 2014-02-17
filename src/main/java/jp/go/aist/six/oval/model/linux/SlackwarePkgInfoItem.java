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
package jp.go.aist.six.oval.model.linux;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * This item describes info related to Slackware packages.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SlackwarePkgInfoItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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
