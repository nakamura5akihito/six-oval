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
package jp.go.aist.six.oval.model.unix;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * The file item holds information about the individual files found on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: FileItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType    filepath;
    private EntityItemStringType    path;

    //{nillable="true"}
    private EntityItemStringType    filename = new EntityItemStringType();

    private EntityItemStringType    type;
    private EntityItemIntType       group_id;
    private EntityItemIntType       user_id;
    private EntityItemIntType       a_time;
    private EntityItemIntType       c_time;
    private EntityItemIntType       m_time;
    private EntityItemIntType       size;

    private EntityItemBoolType       suid;
    private EntityItemBoolType       sgid;
    private EntityItemBoolType       sticky;
    private EntityItemBoolType       uread;
    private EntityItemBoolType       uwrite;
    private EntityItemBoolType       uexec;
    private EntityItemBoolType       gread;
    private EntityItemBoolType       gwrite;
    private EntityItemBoolType       gexec;
    private EntityItemBoolType       oread;
    private EntityItemBoolType       owrite;
    private EntityItemBoolType       oexec;
    private EntityItemBoolType       has_extended_acl;



    /**
     * Constructor.
     */
    public FileItem()
    {
        this( 0 );
    }


    public FileItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public FileItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.file;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.FILE;
    }



    /**
     */
    public void setFilepath(
                    final EntityItemStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityItemStringType getFilepath()
    {
        return filepath;
    }



    /**
     */
    public void setPath(
                    final EntityItemStringType path
                    )
    {
        this.path = path;
    }


    public EntityItemStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setFilename(
                    final EntityItemStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityItemStringType getFilename()
    {
        return filename;
    }



    /**
     */
    public void setType(
                    final EntityItemStringType type
                    )
    {
        this.type = type;
    }


    public EntityItemStringType getType()
    {
        return type;
    }



    /**
     */
    public void setGroupId(
                    final EntityItemIntType group_id
                    )
    {
        this.group_id = group_id;
    }


    public EntityItemIntType getGroupId()
    {
        return group_id;
    }


    public FileItem groupId(
                    final EntityItemIntType group_id
                    )
    {
        setGroupId( group_id );
        return this;
    }



    /**
     */
    public void setUserId(
                    final EntityItemIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityItemIntType getUserId()
    {
        return user_id;
    }



    /**
     */
    public void setATime(
                    final EntityItemIntType a_time
                    )
    {
        this.a_time = a_time;
    }


    public EntityItemIntType getATime()
    {
        return a_time;
    }



    /**
     */
    public void setCTime(
                    final EntityItemIntType c_time
                    )
    {
        this.c_time = c_time;
    }


    public EntityItemIntType getCTime()
    {
        return c_time;
    }



    /**
     */
    public void setMTime(
                    final EntityItemIntType m_time
                    )
    {
        this.m_time = m_time;
    }


    public EntityItemIntType getMTime()
    {
        return m_time;
    }



    /**
     */
    public void setSize(
                    final EntityItemIntType size
                    )
    {
        this.size = size;
    }


    public EntityItemIntType getSize()
    {
        return size;
    }



    /**
     */
    public void setSuid(
                    final EntityItemBoolType suid
                    )
    {
        this.suid= suid;
    }


    public EntityItemBoolType getSuid()
    {
        return suid;
    }



    /**
     */
    public void setSgid(
                    final EntityItemBoolType sgid
                    )
    {
        this.sgid= sgid;
    }


    public EntityItemBoolType getSgid()
    {
        return sgid;
    }



    /**
     */
    public void setSticky(
                    final EntityItemBoolType sticky
                    )
    {
        this.sticky = sticky;
    }


    public EntityItemBoolType getSticky()
    {
        return sticky;
    }



    /**
     */
    public void setUread(
                    final EntityItemBoolType uread
                    )
    {
        this.uread = uread;
    }


    public EntityItemBoolType getUread()
    {
        return uread;
    }


    /**
     */
    public void setUwrite(
                    final EntityItemBoolType uwrite
                    )
    {
        this.uwrite = uwrite;
    }


    public EntityItemBoolType getUwrite()
    {
        return uwrite;
    }



    /**
     */
    public void setUexec(
                    final EntityItemBoolType uexec
                    )
    {
        this.uexec = uexec;
    }


    public EntityItemBoolType getUexec()
    {
        return uexec;
    }



    /**
     */
    public void setGread(
                    final EntityItemBoolType gread
                    )
    {
        this.gread = gread;
    }


    public EntityItemBoolType getGread()
    {
        return gread;
    }


    /**
     */
    public void setGwrite(
                    final EntityItemBoolType gwrite
                    )
    {
        uwrite = gwrite;
    }


    public EntityItemBoolType getGwrite()
    {
        return gwrite;
    }



    /**
     */
    public void setGexec(
                    final EntityItemBoolType gexec
                    )
    {
        this.gexec = gexec;
    }


    public EntityItemBoolType getGexec()
    {
        return gexec;
    }



    /**
     */
    public void setOread(
                    final EntityItemBoolType oread
                    )
    {
        this.oread = oread;
    }


    public EntityItemBoolType getOread()
    {
        return oread;
    }


    /**
     */
    public void setOwrite(
                    final EntityItemBoolType owrite
                    )
    {
        this.owrite = owrite;
    }


    public EntityItemBoolType getOwrite()
    {
        return owrite;
    }



    /**
     */
    public void setOexec(
                    final EntityItemBoolType oexec
                    )
    {
        this.oexec = oexec;
    }


    public EntityItemBoolType getOexec()
    {
        return oexec;
    }



    /**
     */
    public void setHasExtendedAcl(
                    final EntityItemBoolType has_extended_acl
                    )
    {
        this.has_extended_acl = has_extended_acl;
    }


    public EntityItemBoolType getHasExtendedAcl()
    {
        return has_extended_acl;
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
        if (!(obj instanceof FileItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "file_item[" + super.toString()
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
//FileItem
