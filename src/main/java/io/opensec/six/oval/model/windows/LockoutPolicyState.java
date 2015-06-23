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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The lockout policy state specifies the various attributes
 * associated with lockout information for users and global groups
 * in the security database.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LockoutPolicyState
    extends StateType
{

    private EntityStateIntType  force_logoff;
    //{0..1}

    private EntityStateIntType  lockout_duration;
    //{0..1}

    private EntityStateIntType  lockout_observation_window;
    //{0..1}

    private EntityStateIntType  lockout_threshold;
    //{0..1}



    /**
     * Constructor.
     */
    public LockoutPolicyState()
    {
        this( null, 0 );
    }


    public LockoutPolicyState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.lockoutpolicy;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.LOCKOUTPOLICY;
    }



    /**
     */
    public void setForceLogoff(
                    final EntityStateIntType force_logoff
                    )
    {
        this.force_logoff = force_logoff;
    }


    public EntityStateIntType getForceLogoff()
    {
        return force_logoff;
    }



    /**
     */
    public void setLockoutDuration(
                    final EntityStateIntType lockout_duration
                    )
    {
        this.lockout_duration = lockout_duration;
    }


    public EntityStateIntType getLockoutDuration()
    {
        return lockout_duration;
    }



    /**
     */
    public void setLockoutObservationWindow(
                    final EntityStateIntType lockout_observation_window
                    )
    {
        this.lockout_observation_window = lockout_observation_window;
    }


    public EntityStateIntType getLockoutObservationWindow()
    {
        return lockout_observation_window;
    }



    /**
     */
    public void setLockoutThreshold(
                    final EntityStateIntType lockout_threshold
                    )
    {
        this.lockout_threshold = lockout_threshold;
    }


    public EntityStateIntType getLockoutThreshold()
    {
        return lockout_threshold;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getForceLogoff() );
        ref_list.add( getLockoutDuration() );
        ref_list.add( getLockoutObservationWindow() );
        ref_list.add( getLockoutThreshold() );

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
        if (!(obj instanceof LockoutPolicyState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "lockoutpolicy_state[" + super.toString()
                        + ", force_logoff="                 + getForceLogoff()
                        + ", lockout_duration="             + getLockoutDuration()
                        + ", lockout_obervation_window="    + getLockoutObservationWindow()
                        + ", lockout_threshold="            + getLockoutThreshold()
                        + "]";
    }

}
//LockoutPolicyState
