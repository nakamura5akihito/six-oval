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
import jp.go.aist.six.oval.model.definitions.EntityStateIOSVersionType;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The version state defines the version information held within a Cisco IOS Train.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: VersionState.java 3197 2013-07-05 08:11:39Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.5:
 *             Replaced by the version55 state and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class VersionState
    extends StateType
{

    //{0..1}
    private EntityStateIntType              major_release;
    private EntityStateIntType              train_number;
    private EntityStateTrainIdentifierType  train_identifier;
    private EntityStateIOSVersionType       version_string;



    /**
     * Constructor.
     */
    public VersionState()
    {
        this( null, 0 );
    }


    public VersionState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public VersionState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.IOS;
        _oval_component = ComponentType.VERSION;
    }



    /**
     */
    public void setMajorRelease(
                    final EntityStateIntType major_release
                    )
    {
        this.major_release = major_release;
    }


    public EntityStateIntType getMajorRelease()
    {
        return major_release;
    }



    /**
     */
    public void setTrainNumber(
                    final EntityStateIntType train_number
                    )
    {
        this.train_number = train_number;
    }


    public EntityStateIntType getTrainNumber()
    {
        return train_number;
    }



    /**
     */
    public void setTrainIdentifier(
                    final EntityStateTrainIdentifierType train_identifier
                    )
    {
        this.train_identifier = train_identifier;
    }


    public EntityStateTrainIdentifierType getTrainIdentifier()
    {
        return train_identifier;
    }



    /**
     */
    public void setVersionString(
                    final EntityStateIOSVersionType version_string
                    )
    {
        this.version_string = version_string;
    }


    public EntityStateIOSVersionType getVersionString()
    {
        return version_string;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getMajorRelease() );
        ref_list.add( getTrainNumber() );
        ref_list.add( getTrainIdentifier() );
        ref_list.add( getVersionString() );

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
        if (!(obj instanceof VersionState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "version_state[" + super.toString()
                        + ", major_release="    + getMajorRelease()
                        + ", train_number="     + getTrainNumber()
                        + ", train_identifier=" + getTrainIdentifier()
                        + ", version_string="   + getVersionString()
             + "]";
    }
}
//
