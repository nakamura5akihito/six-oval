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
/*
*  @product.title@
 *  Copyright (C) @product.copyright-year@
 *    @product.vendor@
 *    Registration Number: @product.registration-number@
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
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The partition state defines the different information
 * associated with a partition.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PartitionState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   mount_point;
    private EntityStateStringType   device;
    private EntityStateStringType   uuid;
    private EntityStateStringType   fs_type;
    private EntityStateStringType   mount_options;
    private EntityStateIntType      total_space;
    private EntityStateIntType      space_used;
    private EntityStateIntType      space_left;



    /**
     * Constructor.
     */
    public PartitionState()
    {
        this( null, 0 );
    }


    public PartitionState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PartitionState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.partition;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.PARTITION;
    }



    /**
     */
    public void setMountPoint(
                    final EntityStateStringType mount_point
                    )
    {
        this.mount_point = mount_point;
    }


    public EntityStateStringType getMountPoint()
    {
        return mount_point;
    }



    /**
     */
    public void setDevice(
                    final EntityStateStringType device
                    )
    {
        this.device = device;
    }


    public EntityStateStringType getDevice()
    {
        return device;
    }



    /**
     */
    public void setUuid(
                    final EntityStateStringType uuid
                    )
    {
        this.uuid = uuid;
    }


    public EntityStateStringType getUuid()
    {
        return uuid;
    }



    /**
     */
    public void setFsType(
                    final EntityStateStringType fs_type
                    )
    {
        this.fs_type = fs_type;
    }


    public EntityStateStringType getFsType()
    {
        return fs_type;
    }



    /**
     */
    public void setMountOptions(
                    final EntityStateStringType mount_options
                    )
    {
        this.mount_options = mount_options;
    }


    public EntityStateStringType getMountOptions()
    {
        return mount_options;
    }



    /**
     */
    public void setTotalSpace(
                    final EntityStateIntType total_space
                    )
    {
        this.total_space = total_space;
    }


    public EntityStateIntType getTotalSpace()
    {
        return total_space;
    }



    /**
     */
    public void setSpaceUsed(
                    final EntityStateIntType space_used
                    )
    {
        this.space_used = space_used;
    }


    public EntityStateIntType getSpaceUsed()
    {
        return space_used;
    }



    /**
     */
    public void setSpaceLeft(
                    final EntityStateIntType space_left
                    )
    {
        this.space_left = space_left;
    }


    public EntityStateIntType getSpaceLeft()
    {
        return space_left;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getMountPoint() );
        ref_list.add( getDevice() );
        ref_list.add( getUuid() );
        ref_list.add( getFsType() );
        ref_list.add( getMountOptions() );
        ref_list.add( getTotalSpace() );
        ref_list.add( getSpaceUsed() );
        ref_list.add( getSpaceLeft() );

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
        if (!(obj instanceof PartitionState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "partition_state[" + super.toString()
                        + ", mount_point="      + getMountPoint()
                        + ", device="           + getDevice()
                        + ", uuid="             + getUuid()
                        + ", fs_type="          + getFsType()
                        + ", mount_options="    + getMountOptions()
                        + ", total_space="      + getTotalSpace()
                        + ", space_used="       + getSpaceUsed()
                        + ", space_left="       + getSpaceLeft()
                        + "]";
    }

}
//PartitionState
