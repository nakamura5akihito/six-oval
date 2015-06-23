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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.EntityItemVersionType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The file item describes Windows file metadata.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType    filepath;
    private EntityItemStringType    path;

    //{nillable="true"}
    private EntityItemStringType    filename;

    private EntityItemStringType    owner;
    private EntityItemIntType       size;
    private EntityItemIntType       a_time;
    private EntityItemIntType       c_time;
    private EntityItemIntType       m_time;
    private EntityItemStringType    ms_checksum;
    private EntityItemVersionType   version;
    private EntityItemFileTypeType  type;
    private EntityItemStringType    development_class;
    private EntityItemStringType    company;
    private EntityItemStringType    internal_name;
    private EntityItemStringType    language;
    private EntityItemStringType    original_filename;
    private EntityItemStringType    product_name;
    private EntityItemVersionType   product_version;

    private EntityItemWindowsViewType  windows_view;
    //{0..1}


//    private final Map<FileProperty, EntityAttributeGroup>  _properties =
//        new EnumMap<FileProperty, EntityAttributeGroup>( FileProperty.class );



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
        this( id, status,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemIntType)null,
                        (EntityItemIntType)null,
                        (EntityItemIntType)null,
                        (EntityItemIntType)null,
                        (EntityItemStringType)null,
                        (EntityItemVersionType)null,
                        (EntityItemFileTypeType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemStringType)null,
                        (EntityItemVersionType)null
                        );
    }


//    public FileItem(
//                    final int id,
//                    final Status status,
//                    final String path,
//                    final String filename,
//                    final String owner,
//                    final String company,
//                    final String productName,
//                    final String productVersion
//                    )
//    {
//        this( id, status );
//        setPath( path );
//        setFilename( filename );
//        setOwner( owner );
//        setCompany( company );
//        setProductName( productName );
//        setProductVersion( productVersion );
//    }


    public FileItem(
                    final int id,
                    final StatusEnumeration status,
                    final String filepath,
                    final String path,
                    final String filename,
                    final String owner,
                    final long size,
                    final long atime,
                    final long ctime,
                    final long mtime,
                    final String checksum,
                    final String version,
                    final FileTypeEnumeration type,
                    final String devclass,
                    final String company,
                    final String internalname,
                    final String language,
                    final String originalFilename,
                    final String productName,
                    final String productVersion
                    )
    {
        super( id, status );

        setFilepath( new EntityItemStringType( filepath ) );
        setPath( new EntityItemStringType( path ) );
        setFilename( new EntityItemStringType( filename ) );
        setOwner( new EntityItemStringType( owner ) );
        setSize( new EntityItemIntType( size ) );
        setATime( new EntityItemIntType( atime ) );
        setCTime( new EntityItemIntType( ctime ) );
        setMTime( new EntityItemIntType( mtime ) );
        setMsChecksum( new EntityItemStringType( checksum ) );
        setVersion( new EntityItemVersionType( version ) );
        setType( new EntityItemFileTypeType( type ) );
        setDevelopmentClass( new EntityItemStringType( devclass ) );
        setCompany( new EntityItemStringType( company ) );
        setInternalName( new EntityItemStringType( internalname ) );
        setLanguage( new EntityItemStringType( language ) );
        setOriginalFilename( new EntityItemStringType( originalFilename ) );
        setProductName( new EntityItemStringType( productName ) );
        setProductVersion( new EntityItemVersionType( productVersion ) );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.file;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.FILE;
    }


    public FileItem(
                    final int id,
                    final StatusEnumeration status,
                    final EntityItemStringType filepath,
                    final EntityItemStringType path,
                    final EntityItemStringType filename,
                    final EntityItemStringType owner,
                    final EntityItemIntType size,
                    final EntityItemIntType atime,
                    final EntityItemIntType ctime,
                    final EntityItemIntType mtime,
                    final EntityItemStringType checksum,
                    final EntityItemVersionType version,
                    final EntityItemFileTypeType type,
                    final EntityItemStringType devclass,
                    final EntityItemStringType company,
                    final EntityItemStringType internalname,
                    final EntityItemStringType language,
                    final EntityItemStringType originalFilename,
                    final EntityItemStringType productName,
                    final EntityItemVersionType productVersion
                    )
    {
        super( id, status );

        setFilepath( filepath );
        setPath( path );
        setFilename( filename );
        setOwner( owner );
        setSize( size );
        setATime( atime );
        setCTime( ctime );
        setMTime( mtime );
        setMsChecksum( checksum );
        setVersion( version );
        setType( type );
        setDevelopmentClass( devclass );
        setCompany( company );
        setInternalName( internalname );
        setLanguage( language );
        setOriginalFilename( originalFilename );
        setProductName( productName );
        setProductVersion( productVersion );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.file;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.FILE;
    }



    /**
     */
    public void setFilepath(
                    final EntityItemStringType filepath
                    )
    {
        this.filepath = filepath;
//        _properties.put( FileProperty.FILEPATH, filepath );
    }


    public EntityItemStringType getFilepath()
    {
        return filepath;
//        return (EntityItemStringType)_properties.get( FileProperty.FILEPATH );
    }


    public FileItem filepath(
                    final String filepath
                    )
    {
        setFilepath( new EntityItemStringType( filepath ) );
        return this;
    }



    /**
     */
    public void setPath(
                    final EntityItemStringType path
                    )
    {
        this.path = path;
//        _properties.put( FileProperty.PATH, path );
    }


    public EntityItemStringType getPath()
    {
        return path;
//        return (EntityItemStringType)_properties.get( FileProperty.PATH );
    }


    public FileItem path(
                    final String path
                    )
    {
        setPath( new EntityItemStringType( path ) );
        return this;
    }



    /**
     */
    public void setFilename(
                    final EntityItemStringType filename
                    )
    {
        this.filename = filename;
//        _properties.put( FileProperty.FILENAME, filename );
    }


    public EntityItemStringType getFilename()
    {
        return filename;
//        return (EntityItemStringType)_properties.get( FileProperty.FILENAME );
    }


    public FileItem filename(
                    final String filename
                    )
    {
        setFilename( new EntityItemStringType( filename ) );
        return this;
    }



    /**
     */
    public void setOwner(
                    final EntityItemStringType owner
                    )
    {
        this.owner = owner;
//        _properties.put( FileProperty.OWNER, owner );
    }


    public EntityItemStringType getOwner()
    {
        return owner;
//        return (EntityItemStringType)_properties.get( FileProperty.OWNER );
    }


    public FileItem owner(
                    final String owner
                    )
    {
        setOwner( new EntityItemStringType( owner ) );
        return this;
    }



    /**
     */
    public void setSize(
                    final EntityItemIntType size
                    )
    {
        this.size = size;
//        _properties.put( FileProperty.SIZE, size );
    }


    public EntityItemIntType getSize()
    {
        return size;
//        return (EntityItemIntType)_properties.get( FileProperty.SIZE );
    }


    public FileItem size(
                    final String size
                    )
    {
        setSize( new EntityItemIntType( size ) );
        return this;
    }



    /**
     */
    public void setATime(
                    final EntityItemIntType a_time
                    )
    {
        this.a_time = a_time;
//        _properties.put( FileProperty.A_TIME, atime );
    }


    public EntityItemIntType getATime()
    {
        return a_time;
//        return (EntityItemIntType)_properties.get( FileProperty.A_TIME );
    }


    public FileItem aTime(
                    final String a_time
                    )
    {
        setATime( new EntityItemIntType( a_time ) );
        return this;
    }



    /**
     */
    public void setCTime(
                    final EntityItemIntType c_time
                    )
    {
        this.c_time = c_time;
//        _properties.put( FileProperty.C_TIME, cTime );
    }


    public EntityItemIntType getCTime()
    {
        return c_time;
//        return (EntityItemIntType)_properties.get( FileProperty.C_TIME );
    }


    public FileItem cTime(
                    final String c_time
                    )
    {
        setCTime( new EntityItemIntType( c_time ) );
        return this;
    }



    /**
     */
    public void setMTime(
                    final EntityItemIntType m_time
                    )
    {
        this.m_time = m_time;
//        _properties.put( FileProperty.M_TIME, m_time );
    }


    public EntityItemIntType getMTime()
    {
        return m_time;
//        return (EntityItemIntType)_properties.get( FileProperty.M_TIME );
    }


    public FileItem mTime(
                    final String m_time
                    )
    {
        setMTime( new EntityItemIntType( m_time ) );
        return this;
    }



    /**
     */
    public void setMsChecksum(
                    final EntityItemStringType ms_checksum
                    )
    {
        this.ms_checksum = ms_checksum;
//        _properties.put( FileProperty.MS_CHECKSUM, ms_checksum );
    }


    public EntityItemStringType getMsChecksum()
    {
        return ms_checksum;
//        return (EntityItemStringType)_properties.get( FileProperty.MS_CHECKSUM );
    }


    public FileItem msChecksum(
                    final String ms_checksum
                    )
    {
        setMsChecksum( new EntityItemStringType( ms_checksum ) );
        return this;
    }



    /**
     */
    public void setVersion(
                    final EntityItemVersionType version
                    )
    {
        this.version = version;
//        _properties.put( FileProperty.VERSION, version );
    }


    public EntityItemVersionType getVersion()
    {
        return version;
//        return (EntityItemVersionType)_properties.get( FileProperty.VERSION );
    }


    public FileItem version(
                    final String version
                    )
    {
        setVersion( new EntityItemVersionType( version ) );
        return this;
    }



    /**
     */
    public void setType(
                    final EntityItemFileTypeType type
                    )
    {
        this.type = type;
//        _properties.put( FileProperty.TYPE, type );
    }


    public EntityItemFileTypeType getType()
    {
        return type;
//        return (EntityItemFileTypeType)_properties.get( FileProperty.TYPE );
    }


    public FileItem type(
                    final FileTypeEnumeration type
                    )
    {
        setType( new EntityItemFileTypeType( type ) );
        return this;
    }



    /**
     */
    public void setDevelopmentClass(
                    final EntityItemStringType development_class
                    )
    {
        this.development_class = development_class;
//        _properties.put( FileProperty.DEVELOPMENT_CLASS, developmentClass );
    }


    public EntityItemStringType getDevelopmentClass()
    {
        return development_class;
//        return (EntityItemStringType)_properties.get( FileProperty.DEVELOPMENT_CLASS );
    }


    public FileItem developmentClass(
                    final String development_class
                    )
    {
        setDevelopmentClass( new EntityItemStringType( development_class ) );
        return this;
    }



    /**
     */
    public void setCompany(
                    final EntityItemStringType company
                    )
    {
        this.company = company;
//        _properties.put( FileProperty.COMPANY, company );
    }


    public EntityItemStringType getCompany()
    {
        return company;
//        return (EntityItemStringType)_properties.get( FileProperty.COMPANY );
    }


    public FileItem company(
                    final String company
                    )
    {
        setCompany( new EntityItemStringType( company ) );
        return this;
    }



    /**
     */
    public void setInternalName(
                    final EntityItemStringType internal_name
                    )
    {
        this.internal_name = internal_name;
//        _properties.put( FileProperty.INTERNAL_NAME, internalName );
    }


    public EntityItemStringType getInternalName()
    {
        return internal_name;
//        return (EntityItemStringType)_properties.get( FileProperty.INTERNAL_NAME );
    }


    public FileItem internalName(
                    final String internal_name
                    )
    {
        setInternalName( new EntityItemStringType( internal_name ) );
        return this;
    }



    /**
     */
    public void setLanguage(
                    final EntityItemStringType language
                    )
    {
        this.language = language;
//        _properties.put( FileProperty.LANGUAGE, language );
    }


    public EntityItemStringType getLanguage()
    {
        return language;
//        return (EntityItemStringType)_properties.get( FileProperty.LANGUAGE );
    }


    public FileItem language(
                    final String language
                    )
    {
        setLanguage( new EntityItemStringType( language ) );
        return this;
    }



    /**
     */
    public void setOriginalFilename(
                    final EntityItemStringType original_filename
                    )
    {
        this.original_filename = original_filename;
//        _properties.put( FileProperty.ORIGINAL_FILENAME, originalFilename );
    }


    public EntityItemStringType getOriginalFilename()
    {
        return original_filename;
//        return (EntityItemStringType)_properties.get( FileProperty.ORIGINAL_FILENAME );
    }


    public FileItem originalFilename(
                    final String original_filename
                    )
    {
        setOriginalFilename( new EntityItemStringType( original_filename ) );
        return this;
    }



    /**
     */
    public void setProductName(
                    final EntityItemStringType product_name
                    )
    {
        this.product_name = product_name;
//        _properties.put( FileProperty.PRODUCT_NAME, productName );
    }


    public EntityItemStringType getProductName()
    {
        return product_name;
//        return (EntityItemStringType)_properties.get( FileProperty.PRODUCT_NAME );
    }


    public FileItem productName(
                    final String product_name
                    )
    {
        setProductName( new EntityItemStringType( product_name ) );
        return this;
    }



    /**
     */
    public void setProductVersion(
                    final EntityItemVersionType product_version
                    )
    {
        this.product_version = product_version;
//        _properties.put( FileProperty.PRODUCT_VERSION, productVersion );
    }


    public EntityItemVersionType getProductVersion()
    {
        return product_version;
//        return (EntityItemVersionType)_properties.get( FileProperty.PRODUCT_VERSION );
    }


    public FileItem productVersion(
                    final String product_version
                    )
    {
        setProductVersion( new EntityItemVersionType( product_version ) );
        return this;
    }



    /**
     */
    public void setWindowsView(
                    final EntityItemWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityItemWindowsViewType getWindowsView()
    {
        return windows_view;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "file_item[" + super.toString()
             + ", filepath="            + getFilepath()
             + ", path="                + getPath()
             + ", filename="            + getFilename()
             + ", owner="               + getOwner()
             + ", size="                + getSize()
             + ", a_time="              + getATime()
             + ", c_time="              + getCTime()
             + ", m_time="              + getMTime()
             + ", ms_checksum="         + getMsChecksum()
             + ", version="             + getVersion()
             + ", type="                + getType()
             + ", development_class="   + getDevelopmentClass()
             + ", company="             + getCompany()
             + ", internal_name="       + getInternalName()
             + ", language="            + getLanguage()
             + ", original_filename="   + getOriginalFilename()
             + ", product_name="        + getProductName()
             + ", product_version="     + getProductVersion()
             + ", windows_view="        + getWindowsView()
//                        + ", " + _properties
             + "]";
    }

}
// FileItem
