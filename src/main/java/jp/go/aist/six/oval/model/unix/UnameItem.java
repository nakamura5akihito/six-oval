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
package jp.go.aist.six.oval.model.unix;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * Information about the hardware the machine is running on.
 * This information is the parsed equivalent of uname -a.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: UnameItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UnameItem
    extends ItemType
{

    private EntityItemStringType  machine_class;
    //{0..1}

    private EntityItemStringType  node_name;
    //{0..1}

    private EntityItemStringType  os_name;
    //{0..1}

    private EntityItemStringType  os_release;
    //{0..1}

    private EntityItemStringType  os_version;
    //{0..1}

    private EntityItemStringType  processor_type;
    //{0..1}

//    private final Map<UnameProperty,EntityItemStringType>  _properties =
//        new EnumMap<UnameProperty,EntityItemStringType>( UnameProperty.class );



    /**
     * Constructor.
     */
    public UnameItem()
    {
        this( 0 );
    }


    public UnameItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public UnameItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        this( id, status,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null
                        );
    }


    public UnameItem(
                    final int id,
                    final StatusEnumeration status,
                    final String machineClass,
                    final String nodeName,
                    final String osName,
                    final String osRelease,
                    final String osVersion,
                    final String processorType
                    )
    {
        this( id, status,
                        (machineClass == null ? null : new EntityItemStringType( machineClass )),
                        (nodeName == null ? null : new EntityItemStringType( nodeName )),
                        (osName == null ? null : new EntityItemStringType( osName )),
                        (osRelease == null ? null : new EntityItemStringType( osRelease )),
                        (osVersion == null ? null : new EntityItemStringType( osVersion )),
                        (processorType == null ? null : new EntityItemStringType( processorType ))
                        );
    }


    public UnameItem(
                    final int id,
                    final StatusEnumeration status,
                    final EntityItemStringType machineClass,
                    final EntityItemStringType nodeName,
                    final EntityItemStringType osName,
                    final EntityItemStringType osRelease,
                    final EntityItemStringType osVersion,
                    final EntityItemStringType processorType
                    )
    {
        super( id, status );
        setMachineClass( machineClass );
        setNodeName( nodeName );
        setOsName( osName );
        setOsRelease( osRelease );
        setOsVersion( osVersion );
        setProcessorType( processorType );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.uname;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.UNAME;
    }



    /**
     */
    public void setMachineClass(
                    final EntityItemStringType machine_class
                    )
    {
        this.machine_class = machine_class;
//        _properties.put( UnameProperty.MACHINE_CLASS, machineClass );
    }


    public EntityItemStringType getMachineClass()
    {
        return machine_class;
//        return _properties.get( UnameProperty.MACHINE_CLASS );
    }



    /**
     */
    public void setNodeName(
                    final EntityItemStringType node_name
                    )
    {
        this.node_name = node_name;
//        _properties.put( UnameProperty.NODE_NAME, node_name );
    }


    public EntityItemStringType getNodeName()
    {
        return node_name;
//        return _properties.get( UnameProperty.NODE_NAME );
    }



    /**
     */
    public void setOsName(
                    final EntityItemStringType os_name
                    )
    {
        this.os_name = os_name;
//        _properties.put( UnameProperty.OS_NAME, os_name );
    }


    public EntityItemStringType getOsName()
    {
        return os_name;
//        return _properties.get( UnameProperty.OS_NAME );
    }



    /**
     */
    public void setOsRelease(
                    final EntityItemStringType os_release
                    )
    {
        this.os_release = os_release;
//        _properties.put( UnameProperty.OS_RELEASE, os_release );
    }


    public EntityItemStringType getOsRelease()
    {
        return os_release;
//        return _properties.get( UnameProperty.OS_RELEASE );
    }



    /**
     */
    public void setOsVersion(
                    final EntityItemStringType os_version
                    )
    {
        this.os_version = os_version;
//        _properties.put( UnameProperty.OS_VERSION, os_version );
    }


    public EntityItemStringType getOsVersion()
    {
        return os_version;
//        return _properties.get( UnameProperty.OS_VERSION );
    }



    /**
     */
    public void setProcessorType(
                    final EntityItemStringType processor_type
                    )
    {
        this.processor_type = processor_type;
//        _properties.put( UnameProperty.PROCESSOR_TYPE, processor_type );
    }


    public EntityItemStringType getProcessorType()
    {
        return processor_type;
//        return _properties.get( UnameProperty.PROCESSOR_TYPE );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "uname_item[" + super.toString()
             + ", machine_class="   + getMachineClass()
             + ", node_name="       + getNodeName()
             + ", os_name="         + getOsName()
             + ", os_release="      + getOsRelease()
             + ", os_version="      + getOsVersion()
             + ", processor_type="  + getProcessorType()
             + "]";
    }

}
// UnameItem
