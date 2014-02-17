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

import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: LinuxPkgInfoState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class LinuxPkgInfoState
    extends StateType
{

    private EntityStateStringType  name;
    //{0..1}

    private EntityStateStringType  arch;
    //{0..1}

    private EntityStateAnySimpleType  version;
    //{0..1}


//    private final EntityPropertyMap<LinuxPkgProperty>  _properties =
//        LinuxPkgProperty.createPropertyMap();



    /**
     * Constructor.
     */
    public LinuxPkgInfoState()
    {
        this( null, 0 );
    }


    public LinuxPkgInfoState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );
    }



//    /**
//     */
//    protected EntityPropertyMap<LinuxPkgProperty> _getProperties()
//    {
//        return _properties;
//    }



    /**
     */
    public void setName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
//        _setProperty( LinuxPkgProperty.NAME, name );
    }


    public EntityStateStringType getName()
    {
        return name;
//        return _getProperty(
//                        LinuxPkgProperty.NAME, EntityStateStringType.class );
    }



    /**
     */
    public void setArch(
                    final EntityStateStringType arch
                    )
    {
        this.arch = arch;
//        _setProperty( LinuxPkgProperty.ARCH, arch );
    }


    public EntityStateStringType getArch()
    {
        return arch;
//        return _getProperty(
//                        LinuxPkgProperty.ARCH, EntityStateStringType.class );
    }



    /**
     */
    public void setVersion(
                    final EntityStateAnySimpleType version
                    )
    {
        this.version = version;
//        _setProperty( LinuxPkgProperty.VERSION, version );
    }


    public EntityStateAnySimpleType getVersion()
    {
        return version;
//        return _getProperty(
//                        LinuxPkgProperty.VERSION, EntityStateAnySimpleType.class );
    }



    //**************************************************************
    //  State
    //**************************************************************

//    @Override
//    public Iterator<EntityAttributeGroup> iterateProperties()
//    {
//        return _properties.iterateProperties();
//    }



//    /**
//     */
//    protected <T extends EntityAttributeGroup> T _getProperty(
//                    final LinuxPkgProperty key,
//                    final Class<T> type
//                    )
//    {
//        return _properties.getProperty( key, type );
//    }
//
//
//
//    /**
//     */
//    protected void _setProperty(
//                    final LinuxPkgProperty key,
//                    final EntityAttributeGroup value
//                    )
//    {
//        _properties.setProperty( key, value );
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return super.toString()
                        + ", name=" + getName()
                        + ", arch=" + getArch()
                        + ", version=" + getVersion()
                        ;
    }

}
// LinuxPkgInfoState
