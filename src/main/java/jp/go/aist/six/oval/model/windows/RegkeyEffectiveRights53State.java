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
import jp.go.aist.six.oval.model.definitions.EntityStateBoolType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The regkeyeffectiverights53 state defines the different rights
 * that can be associated with a given regkeyeffectiverights53_object.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegkeyEffectiveRights53State.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegkeyEffectiveRights53State
    extends StateType
{

    //{0..1}
    private EntityStateRegistryHiveType  hive;
    private EntityStateStringType       key;
    private EntityStateStringType       trustee_sid;
    private EntityStateBoolType        standard_delete;
    private EntityStateBoolType        standard_read_control;
    private EntityStateBoolType        standard_write_dac;
    private EntityStateBoolType        standard_write_owner;
    private EntityStateBoolType        standard_syncronize;
    private EntityStateBoolType        access_system_security;
    private EntityStateBoolType        generic_read;
    private EntityStateBoolType        generic_write;
    private EntityStateBoolType        generic_execute;
    private EntityStateBoolType        generic_all;
    private EntityStateBoolType        key_query_value;
    private EntityStateBoolType        key_set_value;
    private EntityStateBoolType        key_create_sub_key;
    private EntityStateBoolType        key_enumerate_sub_keys;
    private EntityStateBoolType        key_notify;
    private EntityStateBoolType        key_create_link;
    private EntityStateBoolType        key_wow64_64key;
    private EntityStateBoolType        key_wow64_32key;
    private EntityStateBoolType        key_wow64_res;

    private EntityStateWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public RegkeyEffectiveRights53State()
    {
        this( null, 0 );
    }


    public RegkeyEffectiveRights53State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public RegkeyEffectiveRights53State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.regkeyeffectiverights53;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.REGKEYEFFECTIVERIGHTS53;
    }



    /**
     */
    public void setHive(
                    final EntityStateRegistryHiveType hive
                    )
    {
        this.hive = hive;
    }


    public EntityStateRegistryHiveType getHive()
    {
        return hive;
    }



    /**
     */
    public void setKey(
                    final EntityStateStringType key
                    )
    {
        this.key = key;
    }


    public EntityStateStringType getKey()
    {
        return key;
    }



    /**
     */
    public void setTrusteeSid(
                    final EntityStateStringType trustee_sid
                    )
    {
        this.trustee_sid = trustee_sid;
    }


    public EntityStateStringType getTrusteeSid()
    {
        return trustee_sid;
    }



    /**
     */
    public void setStandardDelete(
                    final EntityStateBoolType standard_delete
                    )
    {
        this.standard_delete = standard_delete;
    }


    public EntityStateBoolType getStandardDelete()
    {
        return standard_delete;
    }



    /**
     */
    public void setStandardReadControl(
                    final EntityStateBoolType standard_read_control
                    )
    {
        this.standard_read_control = standard_read_control;
    }


    public EntityStateBoolType getStandardReadControl()
    {
        return standard_read_control;
    }



    /**
     */
    public void setStandardWriteDac(
                    final EntityStateBoolType standard_write_dac
                    )
    {
        this.standard_write_dac = standard_write_dac;
    }


    public EntityStateBoolType getStandardWriteDac()
    {
        return standard_write_dac;
    }



    /**
     */
    public void setStandardWriteOwner(
                    final EntityStateBoolType standard_write_owner
                    )
    {
        this.standard_write_owner = standard_write_owner;
    }


    public EntityStateBoolType getStandardWriteOwner()
    {
        return standard_write_owner;
    }



    /**
     */
    public void setStandardSyncronize(
                    final EntityStateBoolType standard_syncronize
                    )
    {
        this.standard_syncronize = standard_syncronize;
    }


    public EntityStateBoolType getStandardSyncronize()
    {
        return standard_syncronize;
    }



    /**
     */
    public void setAccessSystemSecurity(
                    final EntityStateBoolType access_system_security
                    )
    {
        this.access_system_security = access_system_security;
    }


    public EntityStateBoolType getAccessSystemSecurity()
    {
        return access_system_security;
    }



    /**
     */
    public void setGenericRead(
                    final EntityStateBoolType generic_read
                    )
    {
        this.generic_read = generic_read;
    }


    public EntityStateBoolType getGenericRead()
    {
        return generic_read;
    }



    /**
     */
    public void setGenericWrite(
                    final EntityStateBoolType generic_write
                    )
    {
        this.generic_write = generic_write;
    }


    public EntityStateBoolType getGenericWrite()
    {
        return generic_write;
    }



    /**
     */
    public void setGenericExecute(
                    final EntityStateBoolType generic_execute
                    )
    {
        this.generic_execute = generic_execute;
    }


    public EntityStateBoolType getGenericExecute()
    {
        return generic_execute;
    }



    /**
     */
    public void setGenericAll(
                    final EntityStateBoolType generic_all
                    )
    {
        this.generic_all = generic_all;
    }


    public EntityStateBoolType getGenericAll()
    {
        return generic_all;
    }



    /**
     */
    public void setKeyQueryValue(
                    final EntityStateBoolType key_query_value
                    )
    {
        this.key_query_value = key_query_value;
    }


    public EntityStateBoolType getKeyQueryValue()
    {
        return key_query_value;
    }



    /**
     */
    public void setKeySetValue(
                    final EntityStateBoolType key_set_value
                    )
    {
        this.key_set_value = key_set_value;
    }


    public EntityStateBoolType getKeySetValue()
    {
        return key_set_value;
    }



    /**
     */
    public void setKeyCreateSubKey(
                    final EntityStateBoolType key_create_sub_key
                    )
    {
        this.key_create_sub_key = key_create_sub_key;
    }


    public EntityStateBoolType getKeyCreateSubKey()
    {
        return key_create_sub_key;
    }



    /**
     */
    public void setKeyEnumerateSubKeys(
                    final EntityStateBoolType key_enumerate_sub_keys
                    )
    {
        this.key_enumerate_sub_keys = key_enumerate_sub_keys;
    }


    public EntityStateBoolType getKeyEnumerateSubKeys()
    {
        return key_enumerate_sub_keys;
    }



    /**
     */
    public void setKeyNotify(
                    final EntityStateBoolType key_notify
                    )
    {
        this.key_notify = key_notify;
    }


    public EntityStateBoolType getKeyNotify()
    {
        return key_notify;
    }



    /**
     */
    public void setKeyCreateLink(
                    final EntityStateBoolType key_create_link
                    )
    {
        this.key_create_link = key_create_link;
    }


    public EntityStateBoolType getKeyCreateLink()
    {
        return key_create_link;
    }



    /**
     */
    public void setKeyWow6464key(
                    final EntityStateBoolType key_wow64_64key
                    )
    {
        this.key_wow64_64key = key_wow64_64key;
    }


    public EntityStateBoolType getKeyWow6464key()
    {
        return key_wow64_64key;
    }



    /**
     */
    public void setKeyWow6432key(
                    final EntityStateBoolType key_wow64_32key
                    )
    {
        this.key_wow64_32key = key_wow64_32key;
    }


    public EntityStateBoolType getKeyWow6432key()
    {
        return key_wow64_32key;
    }



    /**
     */
    public void setKeyWow64Res(
                    final EntityStateBoolType key_wow64_res
                    )
    {
        this.key_wow64_res = key_wow64_res;
    }


    public EntityStateBoolType getKeyWow64Res()
    {
        return key_wow64_res;
    }



    /**
     */
    public void setWindowsView(
                    final EntityStateWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityStateWindowsViewType getWindowsView()
    {
        return windows_view;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getHive() );
        ref_list.add( getKey() );
        ref_list.add( getTrusteeSid() );
        ref_list.add( getStandardDelete() );
        ref_list.add( getStandardReadControl() );
        ref_list.add( getStandardWriteDac() );
        ref_list.add( getStandardWriteOwner() );
        ref_list.add( getStandardSyncronize() );
        ref_list.add( getAccessSystemSecurity() );
        ref_list.add( getGenericRead() );
        ref_list.add( getGenericWrite() );
        ref_list.add( getGenericExecute() );
        ref_list.add( getGenericAll() );
        ref_list.add( getKeyQueryValue() );
        ref_list.add( getKeySetValue() );
        ref_list.add( getKeyCreateSubKey() );
        ref_list.add( getKeyEnumerateSubKeys() );
        ref_list.add( getKeyNotify() );
        ref_list.add( getKeyCreateLink() );
        ref_list.add( getKeyWow6464key() );
        ref_list.add( getKeyWow6432key() );
        ref_list.add( getKeyWow64Res() );
        ref_list.add( getWindowsView() );

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
        if (!(obj instanceof RegkeyEffectiveRights53State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "regkeyeffectiverights53_state[" + super.toString()
             + ", hive="                + getHive()
             + ", key="                    + getKey()
             + ", trustee_sid="             + getTrusteeSid()
             + ", standard_delete="         + getStandardDelete()
             + ", standard_read_control="   + getStandardReadControl()
             + ", standard_write_dac="      + getStandardWriteDac()
             + ", standard_write_owner="    + getStandardWriteOwner()
             + ", standard_syncronize="     + getStandardSyncronize()
             + ", access_system_security="  + getAccessSystemSecurity()
             + ", generic_read="            + getGenericRead()
             + ", generic_write="           + getGenericWrite()
             + ", generic_execute="         + getGenericExecute()
             + ", generic_all="             + getGenericAll()
             + ", key_query_value="         + getKeyQueryValue()
             + ", key_set_value="           + getKeySetValue()
             + ", key_create_sub_key="      + getKeyCreateSubKey()
             + ", key_enumerate_sub_keys="  + getKeyEnumerateSubKeys()
             + ", key_notify="              + getKeyNotify()
             + ", key_create_link="         + getKeyCreateLink()
             + ", key_wow64_64key="         + getKeyWow6464key()
             + ", key_wow64_32key="         + getKeyWow6432key()
             + ", key_wow64_res="           + getKeyWow64Res()
             + ", windows_view="            + getWindowsView()
             + "]";
    }
}
//RegkeyEffectiveRights53State
