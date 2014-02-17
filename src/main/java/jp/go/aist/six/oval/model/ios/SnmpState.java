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
package jp.go.aist.six.oval.model.ios;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SnmpState.java 3200 2013-07-05 10:51:14Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SnmpState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   access_list;
    private EntityStateStringType   community_name;



    /**
     * Constructor.
     */
    public SnmpState()
    {
        this( null, 0 );
    }


    public SnmpState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SnmpState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.IOS;
        _oval_component = ComponentType.SNMP;
    }




    /**
     */
    public void setAccessList(
                    final EntityStateStringType access_list
                    )
    {
        this.access_list = access_list;
    }


    public EntityStateStringType getAccessList()
    {
        return access_list;
    }



    /**
     */
    public void setCommunityName(
                    final EntityStateStringType community_name
                    )
    {
        this.community_name = community_name;
    }


    public EntityStateStringType getCommunityName()
    {
        return community_name;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getAccessList() );
        ref_list.add( getCommunityName() );

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
        if (!(obj instanceof SnmpState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "snmp_state[" + super.toString()
                        + ", access_list="      + getAccessList()
                        + ", community_name="   + getCommunityName()
             + "]";
    }

}
//
