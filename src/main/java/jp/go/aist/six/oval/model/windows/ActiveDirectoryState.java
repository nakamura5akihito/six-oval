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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The activedirectory state defines the different information
 * that can be used to evaluate the specified entries in active directory.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ActiveDirectoryState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ActiveDirectoryState
    extends StateType
{

    private EntityStateNamingContextType  naming_context;
    //{0..1}

    private EntityStateStringType  relative_dn;
    //{0..1}

    private EntityStateStringType  attribute;
    //{0..1}

    private EntityStateStringType  object_class;
    //{0..1}

    private EntityStateAdstypeType  adstype;
    //{0..1}

    private EntityStateAnySimpleType  value;
    //{0..1}



    /**
     * Constructor.
     */
    public ActiveDirectoryState()
    {
        this( null, 0 );
    }


    public ActiveDirectoryState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public ActiveDirectoryState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.activedirectory;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.ACTIVEDIRECTORY;
    }



    /**
     */
    public void setNamingContext(
                    final EntityStateNamingContextType hive
                    )
    {
        naming_context = hive;
    }


    public EntityStateNamingContextType getNamingContext()
    {
        return naming_context;
    }



    /**
     */
    public void setRelativeDn(
                    final EntityStateStringType relative_dn
                    )
    {
        this.relative_dn = relative_dn;
    }


    public EntityStateStringType getRelativeDn()
    {
        return relative_dn;
    }



    /**
     */
    public void setAttribute(
                    final EntityStateStringType attribute
                    )
    {
        this.attribute = attribute;
    }


    public EntityStateStringType getAttribute()
    {
        return attribute;
    }



    /**
     */
    public void setObjectClass(
                    final EntityStateStringType object_class
                    )
    {
        this.object_class = object_class;
    }


    public EntityStateStringType getObjectClass()
    {
        return object_class;
    }



    /**
     */
    public void setAdstype(
                    final EntityStateAdstypeType adstype
                    )
    {
        this.adstype = adstype;
    }


    public EntityStateAdstypeType getAdstype()
    {
        return adstype;
    }



    /**
     */
    public void setValue(
                    final EntityStateAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityStateAnySimpleType getValue()
    {
        return value;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getNamingContext() );
        ref_list.add( getRelativeDn() );
        ref_list.add( getAttribute() );
        ref_list.add( getObjectClass() );
        ref_list.add( getAdstype() );
        ref_list.add( getValue() );

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
        if (!(obj instanceof ActiveDirectoryState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "activedirectory_state[" + super.toString()
                        + ", naming_context="   + getNamingContext()
                        + ", relative_dn="      + getRelativeDn()
                        + ", attribute="        + getAttribute()
                        + ", object_class="     + getObjectClass()
                        + ", adstype="          + getAdstype()
                        + ", value="            + getValue()
                        + "]";
    }

}
//ActiveDirectoryState
