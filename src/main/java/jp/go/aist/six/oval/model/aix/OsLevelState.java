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
package jp.go.aist.six.oval.model.aix;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateVersionType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The oslevel_state defines the information about maintenance level (system version).
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OsLevelState.java 3142 2013-05-13 02:20:30Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class OsLevelState
    extends StateType
{

    //{0..1}
    private EntityStateVersionType  maintenance_level;



    /**
     * Constructor.
     */
    public OsLevelState()
    {
        this( null, 0 );
    }


    public OsLevelState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public OsLevelState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.OSLEVEL;
    }



    /**
     */
    public void setMaintenanceLevel(
                    final EntityStateVersionType maintenance_level
                    )
    {
        this.maintenance_level = maintenance_level;
    }


    public EntityStateVersionType getMaintenanceLevel()
    {
        return maintenance_level;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getMaintenanceLevel() );

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
        if (!(obj instanceof OsLevelState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "oslevel_state[" + super.toString()
                        + ", maintenance_level="      + getMaintenanceLevel()
             + "]";
    }

}
//
