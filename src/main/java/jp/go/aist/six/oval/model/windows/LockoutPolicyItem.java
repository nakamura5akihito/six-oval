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
package jp.go.aist.six.oval.model.windows;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The lockoutpolicy item enumerates various attributes
 * associated with lockout information for users and global groups
 * in the security database.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: LockoutPolicyItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LockoutPolicyItem
    extends ItemType
{

    private EntityItemIntType  force_logoff;
    //{0..1}

    private EntityItemIntType  lockout_duration;
    //{0..1}

    private EntityItemIntType  lockout_observation_window;
    //{0..1}

    private EntityItemIntType  lockout_threshold;
    //{0..1}



    /**
     * Constructor.
     */
    public LockoutPolicyItem()
    {
        this( 0 );
    }


    public LockoutPolicyItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.lockoutpolicy;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.LOCKOUTPOLICY;
    }



    /**
     */
    public void setForceLogoff(
                    final EntityItemIntType force_logoff
                    )
    {
        this.force_logoff = force_logoff;
    }


    public EntityItemIntType getForceLogoff()
    {
        return force_logoff;
    }



    /**
     */
    public void setLockoutDuration(
                    final EntityItemIntType lockout_duration
                    )
    {
        this.lockout_duration = lockout_duration;
    }


    public EntityItemIntType getLockoutDuration()
    {
        return lockout_duration;
    }



    /**
     */
    public void setLockoutObservationWindow(
                    final EntityItemIntType lockout_observation_window
                    )
    {
        this.lockout_observation_window = lockout_observation_window;
    }


    public EntityItemIntType getLockoutObservationWindow()
    {
        return lockout_observation_window;
    }



    /**
     */
    public void setLockoutThreshold(
                    final EntityItemIntType lockout_threshold
                    )
    {
        this.lockout_threshold = lockout_threshold;
    }


    public EntityItemIntType getLockoutThreshold()
    {
        return lockout_threshold;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "lockoutpolicy_item[" + super.toString()
                        + ", force_logoff="                 + getForceLogoff()
                        + ", lockout_duration="             + getLockoutDuration()
                        + ", lockout_obervation_window="    + getLockoutObservationWindow()
                        + ", lockout_threshold="            + getLockoutThreshold()
             + "]";
    }

}
//LockoutPolicyItem
