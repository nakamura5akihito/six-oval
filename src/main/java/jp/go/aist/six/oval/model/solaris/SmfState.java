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
package jp.go.aist.six.oval.model.solaris;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The smf_state element defines the different information associated with
 * a specific smf controlled service.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SmfState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SmfState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           fmri;
    private EntityStateStringType           service_name;
    private EntityStateSmfServiceStateType  service_state;
    private EntityStateSmfProtocolType      protocol;
    private EntityStateStringType           server_executable;
    private EntityStateStringType           server_arguements;
    private EntityStateStringType           exec_as_user;



    /**
     * Constructor.
     */
    public SmfState()
    {
        this( null, 0 );
    }


    public SmfState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SmfState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.SMF;
    }



    /**
     */
    public void setFmri(
                    final EntityStateStringType fmri
                    )
    {
        this.fmri = fmri;
    }


    public EntityStateStringType getFmri()
    {
        return fmri;
    }



    /**
     */
    public void setServiceName(
                    final EntityStateStringType service_name
                    )
    {
        this.service_name = service_name;
    }


    public EntityStateStringType getServiceName()
    {
        return service_name;
    }



    /**
     */
    public void setServiceState(
                    final EntityStateSmfServiceStateType service_state
                    )
    {
        this.service_state = service_state;
    }


    public EntityStateSmfServiceStateType getServiceState()
    {
        return service_state;
    }



    /**
     */
    public void setProtocol(
                    final EntityStateSmfProtocolType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityStateSmfProtocolType getProtocol()
    {
        return protocol;
    }



    /**
     */
    public void setServerExecutable(
                    final EntityStateStringType server_executable
                    )
    {
        this.server_executable = server_executable;
    }


    public EntityStateStringType getServerExecutable()
    {
        return server_executable;
    }



    /**
     */
    public void setServerArguements(
                    final EntityStateStringType server_arguements
                    )
    {
        this.server_arguements = server_arguements;
    }


    public EntityStateStringType getServerArguements()
    {
        return server_arguements;
    }



    /**
     */
    public void setExecAsUser(
                    final EntityStateStringType exec_as_user
                    )
    {
        this.exec_as_user = exec_as_user;
    }


    public EntityStateStringType getExecAsUser()
    {
        return exec_as_user;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getFmri() );
        ref_list.add( getServiceName() );
        ref_list.add( getServiceState() );
        ref_list.add( getProtocol() );
        ref_list.add( getServerExecutable() );
        ref_list.add( getServerArguements() );
        ref_list.add( getExecAsUser() );

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
        if (!(obj instanceof SmfState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "smf_state[" + super.toString()
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
