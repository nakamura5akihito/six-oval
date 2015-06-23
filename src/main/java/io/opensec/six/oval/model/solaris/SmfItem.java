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
package io.opensec.six.oval.model.solaris;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The smf_item is used to hold information related to service management facility
 * controlled services.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SmfItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType           fmri;
    private EntityItemStringType           service_name;
    private EntityItemSmfServiceStateType  service_state;
    private EntityItemSmfProtocolType      protocol;
    private EntityItemStringType           server_executable;
    private EntityItemStringType           server_arguements;
    private EntityItemStringType           exec_as_user;



    /**
     * Constructor.
     */
    public SmfItem()
    {
        this( 0 );
    }


    public SmfItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public SmfItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.SMF;
    }



    /**
     */
    public void setFmri(
                    final EntityItemStringType fmri
                    )
    {
        this.fmri = fmri;
    }


    public EntityItemStringType getFmri()
    {
        return fmri;
    }



    /**
     */
    public void setServiceName(
                    final EntityItemStringType service_name
                    )
    {
        this.service_name = service_name;
    }


    public EntityItemStringType getServiceName()
    {
        return service_name;
    }



    /**
     */
    public void setServiceState(
                    final EntityItemSmfServiceStateType service_state
                    )
    {
        this.service_state = service_state;
    }


    public EntityItemSmfServiceStateType getServiceState()
    {
        return service_state;
    }



    /**
     */
    public void setProtocol(
                    final EntityItemSmfProtocolType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityItemSmfProtocolType getProtocol()
    {
        return protocol;
    }



    /**
     */
    public void setServerExecutable(
                    final EntityItemStringType server_executable
                    )
    {
        this.server_executable = server_executable;
    }


    public EntityItemStringType getServerExecutable()
    {
        return server_executable;
    }



    /**
     */
    public void setServerArguements(
                    final EntityItemStringType server_arguements
                    )
    {
        this.server_arguements = server_arguements;
    }


    public EntityItemStringType getServerArguements()
    {
        return server_arguements;
    }



    /**
     */
    public void setExecAsUser(
                    final EntityItemStringType exec_as_user
                    )
    {
        this.exec_as_user = exec_as_user;
    }


    public EntityItemStringType getExecAsUser()
    {
        return exec_as_user;
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
        if (!(obj instanceof SmfItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "smf_item[" + super.toString()
                        + ", fmri="                 + getFmri()
                        + ", service_name="         + getServiceName()
                        + ", service_state="        + getServiceState()
                        + ", protocol="             + getProtocol()
                        + ", server_executable="    + getServerExecutable()
                        + ", server_arguements="    + getServerArguements()
                        + ", exec_as_user="         + getExecAsUser()
             + "]";
    }

}
//
