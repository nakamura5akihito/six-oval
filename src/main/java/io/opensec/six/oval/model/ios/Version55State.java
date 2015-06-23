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
package io.opensec.six.oval.model.ios;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateIOSVersionType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The version55 state defines the version information held within a Cisco IOS Train.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Version55State
    extends StateType
{

    //{0..1}
    private EntityStateIntType          major_version;
    private EntityStateIntType          minor_version;
    private EntityStateIntType          release;
    private EntityStateStringType       train_identifier;
    private EntityStateIntType          rebuild;
    private EntityStateStringType       subrebuild;
    private EntityStateStringType       mainline_rebuild;
    private EntityStateIOSVersionType   version_string;



    /**
     * Constructor.
     */
    public Version55State()
    {
        this( null, 0 );
    }


    public Version55State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public Version55State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.IOS;
        _oval_component = ComponentType.VERSION55;
    }



    /**
     */
    public void setMajorVersion(
                    final EntityStateIntType major_version
                    )
    {
        this.major_version = major_version;
    }


    public EntityStateIntType getMajorVersion()
    {
        return major_version;
    }



    /**
     */
    public void setMinorVersion(
                    final EntityStateIntType minor_version
                    )
    {
        this.minor_version = minor_version;
    }


    public EntityStateIntType getMinorVersion()
    {
        return minor_version;
    }



    /**
     */
    public void setRelease(
                    final EntityStateIntType release
                    )
    {
        this.release = release;
    }


    public EntityStateIntType getRelease()
    {
        return release;
    }



    /**
     */
    public void setTrainIdentifier(
                    final EntityStateStringType train_identifier
                    )
    {
        this.train_identifier = train_identifier;
    }


    public EntityStateStringType getTrainIdentifier()
    {
        return train_identifier;
    }



    /**
     */
    public void setRebuild(
                    final EntityStateIntType rebuild
                    )
    {
        this.rebuild = rebuild;
    }


    public EntityStateIntType getRebuild()
    {
        return rebuild;
    }



    /**
     */
    public void setSubrebuild(
                    final EntityStateStringType subrebuild
                    )
    {
        this.subrebuild = subrebuild;
    }


    public EntityStateStringType getSubrebuild()
    {
        return subrebuild;
    }



    /**
     */
    public void setMainlineRebuild(
                    final EntityStateStringType mainline_rebuild
                    )
    {
        this.mainline_rebuild = mainline_rebuild;
    }


    public EntityStateStringType getMainlineRebuild()
    {
        return mainline_rebuild;
    }



    /**
     */
    public void setVersionString(
                    final EntityStateIOSVersionType version_string
                    )
    {
        this.version_string = version_string;
    }


    public EntityStateIOSVersionType getVersionString()
    {
        return version_string;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getMajorVersion() );
        ref_list.add( getMinorVersion() );
        ref_list.add( getRelease() );
        ref_list.add( getTrainIdentifier() );
        ref_list.add( getRebuild() );
        ref_list.add( getSubrebuild() );
        ref_list.add( getMainlineRebuild() );
        ref_list.add( getVersionString() );

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
        if (!(obj instanceof Version55State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "version55_state[" + super.toString()
                        + ", major_version="    + getMajorVersion()
                        + ", minor_version="    + getMinorVersion()
                        + ", release="          + getRelease()
                        + ", train_identifier=" + getTrainIdentifier()
                        + ", rebuild="          + getRebuild()
                        + ", subrebuild="       + getSubrebuild()
                        + ", mainline_rebuild=" + getMainlineRebuild()
                        + ", version_string="   + getVersionString()
             + "]";
    }
}
//
