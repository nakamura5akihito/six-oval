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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The slackwarepkginfo state defines the different information
 * that can be used to evaluate the specified package.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SlackwarePkgInfoState
    extends StateType
{

    //{0..1}
    private EntityStateStringType  name;
    private EntityStateStringType  version;
    private EntityStateStringType  architecture;
    private EntityStateStringType  revision;



    /**
     * Constructor.
     */
    public SlackwarePkgInfoState()
    {
        this( null, 0 );
    }


    public SlackwarePkgInfoState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.slackwarepkginfo;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.SLACKWAREPKGINFO;
    }



    /**
     */
    public void setName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
    }


    public EntityStateStringType getName()
    {
        return name;
    }



    /**
     */
    public void setArchitecture(
                    final EntityStateStringType architecture
                    )
    {
        this.architecture = architecture;
    }


    public EntityStateStringType getArchitecture()
    {
        return architecture;
    }



    /**
     */
    public void setVersion(
                    final EntityStateStringType version
                    )
    {
        this.version = version;
    }


    public EntityStateStringType getVersion()
    {
        return version;
    }



    /**
     */
    public void setRevision(
                    final EntityStateStringType revision
                    )
    {
        this.revision = revision;
    }


    public EntityStateStringType getRevision()
    {
        return revision;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getName() );
        ref_list.add( getVersion() );
        ref_list.add( getArchitecture() );
        ref_list.add( getRevision() );

        return ref_list;
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
        if (!(obj instanceof SlackwarePkgInfoState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "slackwarepkginfo_state[" + super.toString()
                        + ", name="         + getName()
                        + ", version="      + getVersion()
                        + ", architecture=" + getArchitecture()
                        + ", revision="     + getRevision()
                        + "]";
    }

}
//SlackwarePkgInfoState
