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
import jp.go.aist.six.oval.model.definitions.EntityStateEVRStringType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: LinuxEvrPkgInfoState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class LinuxEvrPkgInfoState
    extends LinuxPkgInfoState
{

    private EntityStateAnySimpleType  epoch;
    //{0..1}

    private EntityStateAnySimpleType  release;
    //{0..1}

    private EntityStateEVRStringType  evr;
    //{0..1}



    /**
     * Constructor.
     */
    public LinuxEvrPkgInfoState()
    {
        this( null, 0 );
    }


    public LinuxEvrPkgInfoState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );
    }



    /**
     */
    public void setEpoch(
                    final EntityStateAnySimpleType epoch
                    )
    {
        this.epoch = epoch;
//        _setProperty( LinuxPkgProperty.EPOCH, epoch );
    }


    public EntityStateAnySimpleType getEpoch()
    {
        return epoch;
//        return _getProperty(
//                        LinuxPkgProperty.EPOCH, EntityStateAnySimpleType.class );
    }



    /**
     */
    public void setRelease(
                    final EntityStateAnySimpleType release
                    )
    {
        this.release = release;
//        _setProperty( LinuxPkgProperty.RELEASE, release );
    }


    public EntityStateAnySimpleType getRelease()
    {
        return release;
//        return _getProperty(
//                        LinuxPkgProperty.RELEASE, EntityStateAnySimpleType.class );
    }



    /**
     */
    public void setEvr(
                    final EntityStateEVRStringType evr
                    )
    {
        this.evr = evr;
//        _setProperty( LinuxPkgProperty.EVR, evr );
    }


    public EntityStateEVRStringType getEvr()
    {
        return evr;
//        return _getProperty(
//                        LinuxPkgProperty.EVR, EntityStateEVRStringType.class );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return super.toString()
                        + ", epoch=" + getEpoch()
                        + ", release=" + getRelease()
                        + ", evr=" + getEvr()
                        ;
    }

}
// LinuxEvrPkgInfoState
