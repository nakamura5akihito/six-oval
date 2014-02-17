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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The uname state defines the information about the hardware
 * the machine is running one.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: UnameState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UnameState
    extends StateType
{

    private EntityStateStringType  machine_class;
    //{0..1}

    private EntityStateStringType  node_name;
    //{0..1}

    private EntityStateStringType  os_name;
    //{0..1}

    private EntityStateStringType  os_release;
    //{0..1}

    private EntityStateStringType  os_version;
    //{0..1}

    private EntityStateStringType  processor_type;
    //{0..1}



//    private final EntityPropertyMap<UnameProperty>  _properties =
//        UnameProperty.createPropertyMap();



    /**
     * Constructor.
     */
    public UnameState()
    {
        this( null, 0 );
    }


    public UnameState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public UnameState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.uname;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.UNAME;
    }



    /**
     */
    public void setMachineClass(
                    final EntityStateStringType machine_class
                    )
    {
        this.machine_class = machine_class;
//        _properties.setProperty( UnameProperty.MACHINE_CLASS, machineClass );
    }


    public EntityStateStringType getMachineClass()
    {
        return machine_class;
//        return _properties.getProperty(
//                        UnameProperty.MACHINE_CLASS, EntityStateStringType.class );
    }


    public UnameState machineClass(
                    final EntityStateStringType machine_class
                    )
    {
        setMachineClass( machine_class );
        return this;
    }



    /**
     */
    public void setNodeName(
                    final EntityStateStringType node_name
                    )
    {
        this.node_name = node_name;
//        _properties.setProperty( UnameProperty.NODE_NAME, nodeName );
    }


    public UnameState nodeName(
                    final EntityStateStringType nodeName
                    )
    {
        setNodeName( nodeName );
        return this;
    }


    public EntityStateStringType getNodeName()
    {
        return node_name;
//        return _properties.getProperty(
//                        UnameProperty.NODE_NAME, EntityStateStringType.class );
    }



    /**
     */
    public void setOsName(
                    final EntityStateStringType os_name
                    )
    {
        this.os_name = os_name;
//        _properties.setProperty( UnameProperty.OS_NAME, name );
    }


    public EntityStateStringType getOsName()
    {
        return os_name;
//        return _properties.getProperty(
//                        UnameProperty.OS_NAME, EntityStateStringType.class );
    }


    public UnameState osName(
                    final EntityStateStringType os_name
                    )
    {
        setOsName( os_name );
        return this;
    }



    /**
     */
    public void setOsRelease(
                    final EntityStateStringType os_release
                    )
    {
        this.os_release = os_release;
//        _properties.setProperty( UnameProperty.OS_RELEASE, release );
    }


    public EntityStateStringType getOsRelease()
    {
        return os_release;
//        return _properties.getProperty(
//                        UnameProperty.OS_RELEASE, EntityStateStringType.class );
    }


    public UnameState osRelease(
                    final EntityStateStringType release
                    )
    {
        setOsRelease( release );
        return this;
    }



    /**
     */
    public void setOsVersion(
                    final EntityStateStringType os_version
                    )
    {
        this.os_version = os_version;
//        _properties.setProperty( UnameProperty.OS_VERSION, version );
    }


    public EntityStateStringType getOsVersion()
    {
        return os_version;
//        return _properties.getProperty(
//                        UnameProperty.OS_VERSION, EntityStateStringType.class );
    }


    public UnameState osVersion(
                    final EntityStateStringType os_version
                    )
    {
        setOsVersion( os_version );
        return this;
    }



    /**
     */
    public void setProcessorType(
                    final EntityStateStringType type
                    )
    {
        processor_type = type;
//        _properties.setProperty( UnameProperty.PROCESSOR_TYPE, type );
    }


    public EntityStateStringType getProcessorType()
    {
        return processor_type;
//        return _properties.getProperty(
//                        UnameProperty.PROCESSOR_TYPE, EntityStateStringType.class );
    }


    public UnameState processorType(
                    final EntityStateStringType type
                    )
    {
        setProcessorType( type );
        return this;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getMachineClass() );
        ref_list.add( getNodeName() );
        ref_list.add( getOsName() );
        ref_list.add( getOsRelease() );
        ref_list.add( getOsVersion() );
        ref_list.add( getProcessorType() );

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
        if (!(obj instanceof UnameState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "uname_state[" + super.toString()
                        + ", machine_class=" + getMachineClass()
                        + ", node_name=" + getNodeName()
                        + ", os_name=" + getOsName()
                        + ", os_release=" + getOsRelease()
                        + ", os_version=" + getOsVersion()
                        + ", processor_type=" + getProcessorType()
//                        + ", " + String.valueOf( _properties )
                        + "]";
    }

}
// UnameState
