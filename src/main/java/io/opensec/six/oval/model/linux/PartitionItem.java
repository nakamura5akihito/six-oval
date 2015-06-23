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
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * The partition item stores information about a partition on the local system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PartitionItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   mount_point;
    private EntityItemStringType   device;
    private EntityItemStringType   uuid;
    private EntityItemStringType   fs_type;
    private EntityItemStringType   mount_options;
    private EntityItemIntType      total_space;
    private EntityItemIntType      space_used;
    private EntityItemIntType      space_left;



    /**
     * Constructor.
     */
    public PartitionItem()
    {
        this( 0 );
    }


    public PartitionItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.partition;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.PARTITION;
    }



    /**
     */
    public void setMountPoint(
                    final EntityItemStringType mount_point
                    )
    {
        this.mount_point = mount_point;
    }


    public EntityItemStringType getMountPoint()
    {
        return mount_point;
    }



    /**
     */
    public void setDevice(
                    final EntityItemStringType device
                    )
    {
        this.device = device;
    }


    public EntityItemStringType getDevice()
    {
        return device;
    }



    /**
     */
    public void setUuid(
                    final EntityItemStringType uuid
                    )
    {
        this.uuid = uuid;
    }


    public EntityItemStringType getUuid()
    {
        return uuid;
    }



    /**
     */
    public void setFsType(
                    final EntityItemStringType fs_type
                    )
    {
        this.fs_type = fs_type;
    }


    public EntityItemStringType getFsType()
    {
        return fs_type;
    }



    /**
     */
    public void setMountOptions(
                    final EntityItemStringType mount_options
                    )
    {
        this.mount_options = mount_options;
    }


    public EntityItemStringType getMountOptions()
    {
        return mount_options;
    }



    /**
     */
    public void setTotalSpace(
                    final EntityItemIntType total_space
                    )
    {
        this.total_space = total_space;
    }


    public EntityItemIntType getTotalSpace()
    {
        return total_space;
    }



    /**
     */
    public void setSpaceUsed(
                    final EntityItemIntType space_used
                    )
    {
        this.space_used = space_used;
    }


    public EntityItemIntType getSpaceUsed()
    {
        return space_used;
    }



    /**
     */
    public void setSpaceLeft(
                    final EntityItemIntType space_left
                    )
    {
        this.space_left = space_left;
    }


    public EntityItemIntType getSpaceLeft()
    {
        return space_left;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "partition_item[" + super.toString()
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
//partitionItem
