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
package io.opensec.six.oval.model.unix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The file state defines the different metadata associate with a UNIX file.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileState
    extends StateType
{

    //{0..1}
    private EntityStateStringType    filepath;
    private EntityStateStringType    path;
    private EntityStateStringType    filename;
    private EntityStateStringType    type;
    private EntityStateIntType       group_id;
    private EntityStateIntType       user_id;
    private EntityStateIntType       a_time;
    private EntityStateIntType       c_time;
    private EntityStateIntType       m_time;
    private EntityStateIntType       size;

    private EntityStateBoolType       suid;
    private EntityStateBoolType       sgid;
    private EntityStateBoolType       sticky;
    private EntityStateBoolType       uread;
    private EntityStateBoolType       uwrite;
    private EntityStateBoolType       uexec;
    private EntityStateBoolType       gread;
    private EntityStateBoolType       gwrite;
    private EntityStateBoolType       gexec;
    private EntityStateBoolType       oread;
    private EntityStateBoolType       owrite;
    private EntityStateBoolType       oexec;
    private EntityStateBoolType       has_extended_acl;



    /**
     * Constructor.
     */
    public FileState()
    {
        this( null, 0 );
    }


    public FileState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public FileState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.file;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.FILE;
    }



    /**
     */
    public void setFilepath(
                    final EntityStateStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityStateStringType getFilepath()
    {
        return filepath;
    }


    public FileState filepath(
                    final EntityStateStringType filepath
                    )
    {
        setFilepath( filepath );
        return this;
    }



    /**
     */
    public void setPath(
                    final EntityStateStringType path
                    )
    {
        this.path = path;
    }


    public EntityStateStringType getPath()
    {
        return path;
    }


    public FileState path(
                    final EntityStateStringType path
                    )
    {
        setPath( path );
        return this;
    }



    /**
     */
    public void setFilename(
                    final EntityStateStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityStateStringType getFilename()
    {
        return filename;
    }


    public FileState filename(
                    final EntityStateStringType filename
                    )
    {
        setFilename( filename );
        return this;
    }



    /**
     */
    public void setType(
                    final EntityStateStringType type
                    )
    {
        this.type = type;
    }


    public EntityStateStringType getType()
    {
        return type;
    }



    /**
     */
    public void setGroupId(
                    final EntityStateIntType group_id
                    )
    {
        this.group_id = group_id;
    }


    public EntityStateIntType getGroupId()
    {
        return group_id;
    }


    public FileState groupId(
                    final EntityStateIntType group_id
                    )
    {
        setGroupId( group_id );
        return this;
    }



    /**
     */
    public void setUserId(
                    final EntityStateIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityStateIntType getUserId()
    {
        return user_id;
    }


    public FileState userId(
                    final EntityStateIntType user_id
                    )
    {
        setUserId( user_id );
        return this;
    }



    /**
     */
    public void setATime(
                    final EntityStateIntType a_time
                    )
    {
        this.a_time = a_time;
    }


    public EntityStateIntType getATime()
    {
        return a_time;
    }



    /**
     */
    public void setCTime(
                    final EntityStateIntType c_time
                    )
    {
        this.c_time = c_time;
    }


    public EntityStateIntType getCTime()
    {
        return c_time;
    }



    /**
     */
    public void setMTime(
                    final EntityStateIntType m_time
                    )
    {
        this.m_time = m_time;
    }


    public EntityStateIntType getMTime()
    {
        return m_time;
    }



    /**
     */
    public void setSize(
                    final EntityStateIntType size
                    )
    {
        this.size = size;
    }


    public EntityStateIntType getSize()
    {
        return size;
    }



    /**
     */
    public void setSuid(
                    final EntityStateBoolType suid
                    )
    {
        this.suid= suid;
    }


    public EntityStateBoolType getSuid()
    {
        return suid;
    }



    /**
     */
    public void setSgid(
                    final EntityStateBoolType sgid
                    )
    {
        this.sgid= sgid;
    }


    public EntityStateBoolType getSgid()
    {
        return sgid;
    }



    /**
     */
    public void setSticky(
                    final EntityStateBoolType sticky
                    )
    {
        this.sticky = sticky;
    }


    public EntityStateBoolType getSticky()
    {
        return sticky;
    }



    /**
     */
    public void setUread(
                    final EntityStateBoolType uread
                    )
    {
        this.uread = uread;
    }


    public EntityStateBoolType getUread()
    {
        return uread;
    }


    /**
     */
    public void setUwrite(
                    final EntityStateBoolType uwrite
                    )
    {
        this.uwrite = uwrite;
    }


    public EntityStateBoolType getUwrite()
    {
        return uwrite;
    }



    /**
     */
    public void setUexec(
                    final EntityStateBoolType uexec
                    )
    {
        this.uexec = uexec;
    }


    public EntityStateBoolType getUexec()
    {
        return uexec;
    }



    /**
     */
    public void setGread(
                    final EntityStateBoolType gread
                    )
    {
        this.gread = gread;
    }


    public EntityStateBoolType getGread()
    {
        return gread;
    }


    /**
     */
    public void setGwrite(
                    final EntityStateBoolType gwrite
                    )
    {
        uwrite = gwrite;
    }


    public EntityStateBoolType getGwrite()
    {
        return gwrite;
    }



    /**
     */
    public void setGexec(
                    final EntityStateBoolType gexec
                    )
    {
        this.gexec = gexec;
    }


    public EntityStateBoolType getGexec()
    {
        return gexec;
    }



    /**
     */
    public void setOread(
                    final EntityStateBoolType oread
                    )
    {
        this.oread = oread;
    }


    public EntityStateBoolType getOread()
    {
        return oread;
    }


    /**
     */
    public void setOwrite(
                    final EntityStateBoolType owrite
                    )
    {
        this.owrite = owrite;
    }


    public EntityStateBoolType getOwrite()
    {
        return owrite;
    }



    /**
     */
    public void setOexec(
                    final EntityStateBoolType oexec
                    )
    {
        this.oexec = oexec;
    }


    public EntityStateBoolType getOexec()
    {
        return oexec;
    }



    /**
     */
    public void setHasExtendedAcl(
                    final EntityStateBoolType has_extended_acl
                    )
    {
        this.has_extended_acl = has_extended_acl;
    }


    public EntityStateBoolType getHasExtendedAcl()
    {
        return has_extended_acl;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getFilepath() );
        ref_list.add( getPath() );
        ref_list.add( getFilename() );
        ref_list.add( getType() );
        ref_list.add( getGroupId() );
        ref_list.add( getUserId() );
        ref_list.add( getATime() );
        ref_list.add( getCTime() );
        ref_list.add( getMTime() );
        ref_list.add( getSize() );

        ref_list.add( getSuid() );
        ref_list.add( getSgid() );
        ref_list.add( getSticky() );

        ref_list.add( getUread() );
        ref_list.add( getUwrite() );
        ref_list.add( getUexec() );
        ref_list.add( getGread() );
        ref_list.add( getGwrite() );
        ref_list.add( getGexec() );
        ref_list.add( getOread() );
        ref_list.add( getOwrite() );
        ref_list.add( getOexec() );

        ref_list.add( getHasExtendedAcl() );

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
        if (!(obj instanceof FileState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "file_state[" + super.toString()
             + ", filepath="            + getFilepath()
             + ", path="                + getPath()
             + ", filename="            + getFilename()
             + ", type="                + getType()
             + ", group_id="            + getGroupId()
             + ", user_id="             + getUserId()
             + ", a_time="              + getATime()
             + ", c_time="              + getCTime()
             + ", m_time="              + getMTime()
             + ", size="                + getSize()
             + ", suid="                + getSuid()
             + ", sgid="                + getSgid()
             + ", sticky="              + getSticky()
             + ", uread="               + getUread()
             + ", uwrite="              + getUwrite()
             + ", uexec="               + getUexec()
             + ", gread="               + getGread()
             + ", gwrite="              + getGwrite()
             + ", gexec="               + getGexec()
             + ", oread="               + getOread()
             + ", owrite="              + getOwrite()
             + ", oexec="               + getOexec()
             + ", has_extended_acl="    + getHasExtendedAcl()
             + "]";
    }

}
//FileState
