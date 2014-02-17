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
package jp.go.aist.six.oval.model.esx;

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * This enumeration defines a number of behaviors that allow a more detailed definition
 * of the visdkmanagedobject object being specified.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ViSdkManagedEntityEnumeration.java 3151 2013-05-14 03:31:09Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum ViSdkManagedEntityEnumeration
    implements OvalEnumeration
{

    CLUSTER_COMPUTER_RESOURCE       ( "ClusterComputerResource" ),
    COMPUTE_RESOURCE                ( "ComputeResource" ),
    DATACENTER                      ( "Datacenter" ),
    DATASTORE                       ( "Datastore" ),
    DISTRIBUTED_VIRTUAL_PORTGROUP   ( "DistributedVirtualPortgroup" ),
    DISTRIBUTED_VIRTUAL_SWITCH      ( "DistributedVirtualSwitch" ),
    FOLDER                          ( "Folder" ),
    HOST_SYSTEM                     ( "HostSystem" ),
    NETWORK                         ( "Network" ),
    RESOURCE_POOL                   ( "ResourcePool" ),
    VIRTUAL_APP                     ( "VirtualApp" ),
    VIRTUAL_MACHINE                 ( "VirtualMachine" );




    /**
     * A factory method.
     */
    public static ViSdkManagedEntityEnumeration fromValue(
                    final String value
                    )
    {
        for (ViSdkManagedEntityEnumeration  e : ViSdkManagedEntityEnumeration.values()) {
            if (e.value.equals( value )) {
                return e;
            }
        }

        throw new IllegalArgumentException( value );
    }



    private String  value = null;



    /**
     * Constructor.
     */
    ViSdkManagedEntityEnumeration(
                    final String value
                    )
    {
        this.value = value;
    }


    public String value()
    {
        return value;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return value;
    }

}
//
