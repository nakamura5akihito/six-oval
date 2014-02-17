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

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * The peheader_item describes the metadata associated with a PE file header.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PeHeaderItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PeHeaderItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   header_signature;
    private EntityItemPeTargetMachineType  target_machine_type;
    private EntityItemIntType      number_of_sections;
    private EntityItemIntType      time_date_stamp;
    private EntityItemIntType      pointer_to_symbol_table;
    private EntityItemIntType      number_of_symbols;
    private EntityItemIntType      size_of_optional_header;

    private EntityItemBoolType     image_file_relocs_stripped;
    private EntityItemBoolType     image_file_executable_image;
    private EntityItemBoolType     image_file_line_nums_stripped;
    private EntityItemBoolType     image_file_local_syms_stripped;
    private EntityItemBoolType     image_file_aggresive_ws_trim;
    private EntityItemBoolType     image_file_large_address_aware;
    private EntityItemBoolType     image_file_16bit_machine;
    private EntityItemBoolType     image_file_bytes_reversed_lo;
    private EntityItemBoolType     image_file_32bit_machine;
    private EntityItemBoolType     image_file_debug_stripped;
    private EntityItemBoolType     image_file_removable_run_from_swap;
    private EntityItemBoolType     image_file_system;
    private EntityItemBoolType     image_file_dll;
    private EntityItemBoolType     image_file_up_system_only;
    private EntityItemBoolType     image_file_bytes_reveresed_hi;

    private EntityItemIntType      magic_number;
    private EntityItemIntType      major_linker_version;
    private EntityItemIntType      minor_linker_version;
    private EntityItemIntType      size_of_code;
    private EntityItemIntType      size_of_initialized_data;
    private EntityItemIntType      size_of_uninitialized_data;
    private EntityItemIntType      address_of_entry_point;
    private EntityItemIntType      base_of_code;
    private EntityItemIntType      base_of_data;
    private EntityItemIntType      image_base_address;
    private EntityItemIntType      section_alignment;
    private EntityItemIntType      file_alignment;
    private EntityItemIntType      major_operating_system_version;
    private EntityItemIntType      minor_operating_system_version;
    private EntityItemIntType      major_image_version;
    private EntityItemIntType      minor_image_version;
    private EntityItemIntType      major_subsystem_version;
    private EntityItemIntType      minor_susbsystem_version;
    private EntityItemIntType      size_of_image;
    private EntityItemIntType      size_of_headers;
    private EntityItemIntType      checksum;

    private EntityItemPeSubsystemType  subsystem;
    private EntityItemIntType      dll_characteristics;
    private EntityItemIntType      size_of_stack_reserve;
    private EntityItemIntType      size_of_stack_commit;
    private EntityItemIntType      size_of_heap_reserve;
    private EntityItemIntType      size_of_heap_commit;
    private EntityItemIntType      loader_flags;
    private EntityItemIntType      number_of_rva_and_sizes;
    private EntityItemIntType      real_number_of_directory_entries;



    /**
     * Constructor.
     */
    public PeHeaderItem()
    {
        this( 0 );
    }


    public PeHeaderItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public PeHeaderItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PEHEADER;
    }



    /**
     */
    public void setHeaderSignature(
                    final EntityItemStringType header_signature
                    )
    {
        this.header_signature = header_signature;
    }


    public EntityItemStringType getHeaderSignature()
    {
        return header_signature;
    }



    /**
     */
    public void setTargetMachineType(
                    final EntityItemPeTargetMachineType target_machine_type
                    )
    {
        this.target_machine_type = target_machine_type;
    }


    public EntityItemPeTargetMachineType getTargetMachineType()
    {
        return target_machine_type;
    }



    /**
     */
    public void setNumberOfSections(
                    final EntityItemIntType number_of_sections
                    )
    {
        this.number_of_sections = number_of_sections;
    }


    public EntityItemIntType getNumberOfSections()
    {
        return number_of_sections;
    }



    /**
     */
    public void setTimeDateStamp(
                    final EntityItemIntType time_date_stamp
                    )
    {
        this.time_date_stamp = time_date_stamp;
    }


    public EntityItemIntType getTimeDateStamp()
    {
        return time_date_stamp;
    }



    /**
     */
    public void setPointerToSymbolTable(
                    final EntityItemIntType pointer_to_symbol_table
                    )
    {
        this.pointer_to_symbol_table = pointer_to_symbol_table;
    }


    public EntityItemIntType getPointerToSymbolTable()
    {
        return pointer_to_symbol_table;
    }



    /**
     */
    public void setNumberOfSymbols(
                    final EntityItemIntType number_of_symbols
                    )
    {
        this.number_of_symbols = number_of_symbols;
    }


    public EntityItemIntType getNumberOfSymbols()
    {
        return number_of_symbols;
    }



    /**
     */
    public void setSizeOfOptionalHeader(
                    final EntityItemIntType size_of_optional_header
                    )
    {
        this.size_of_optional_header = size_of_optional_header;
    }


    public EntityItemIntType getSizeOfOptionalHeader()
    {
        return size_of_optional_header;
    }



    /**
     */
    public void setImageFileRelocsStripped(
                    final EntityItemBoolType image_file_relocs_stripped
                    )
    {
        this.image_file_relocs_stripped = image_file_relocs_stripped;
    }


    public EntityItemBoolType getImageFileRelocsStripped()
    {
        return image_file_relocs_stripped;
    }



    /**
     */
    public void setImageFileExecutableImage(
                    final EntityItemBoolType image_file_executable_image
                    )
    {
        this.image_file_executable_image = image_file_executable_image;
    }


    public EntityItemBoolType getImageFileExecutableImage()
    {
        return image_file_executable_image;
    }



    /**
     */
    public void setImageFileLineNumsStripped(
                    final EntityItemBoolType image_file_line_nums_stripped
                    )
    {
        this.image_file_line_nums_stripped = image_file_line_nums_stripped;
    }


    public EntityItemBoolType getImageFileLineNumsStripped()
    {
        return image_file_line_nums_stripped;
    }



    /**
     */
    public void setImageFileLocalSymsStripped(
                    final EntityItemBoolType image_file_local_syms_stripped
                    )
    {
        this.image_file_local_syms_stripped = image_file_local_syms_stripped;
    }


    public EntityItemBoolType getImageFileLocalSymsStripped()
    {
        return image_file_local_syms_stripped;
    }



    /**
     */
    public void setImageFileAggresiveWsTrim(
                    final EntityItemBoolType image_file_aggresive_ws_trim
                    )
    {
        this.image_file_aggresive_ws_trim = image_file_aggresive_ws_trim;
    }


    public EntityItemBoolType getImageFileAggresiveWsTrim()
    {
        return image_file_aggresive_ws_trim;
    }



    /**
     */
    public void setImageFileLargeAddressAware(
                    final EntityItemBoolType image_file_large_address_aware
                    )
    {
        this.image_file_large_address_aware = image_file_large_address_aware;
    }


    public EntityItemBoolType getImageFileLargeAddressAware()
    {
        return image_file_large_address_aware;
    }



    /**
     */
    public void setImageFile16BitMachine(
                    final EntityItemBoolType image_file_16bit_machine
                    )
    {
        this.image_file_16bit_machine = image_file_16bit_machine;
    }


    public EntityItemBoolType getImageFile16BitMachine()
    {
        return image_file_16bit_machine;
    }



    /**
     */
    public void setImageFileBytesReversedLo(
                    final EntityItemBoolType image_file_bytes_reversed_lo
                    )
    {
        this.image_file_bytes_reversed_lo = image_file_bytes_reversed_lo;
    }


    public EntityItemBoolType getImageFileBytesReversedLo()
    {
        return image_file_bytes_reversed_lo;
    }



    /**
     */
    public void setImageFile32BitMachine(
                    final EntityItemBoolType image_file_32bit_machine
                    )
    {
        this.image_file_32bit_machine = image_file_32bit_machine;
    }


    public EntityItemBoolType getImageFile32BitMachine()
    {
        return image_file_32bit_machine;
    }



    /**
     */
    public void setImageFileDebugStripped(
                    final EntityItemBoolType image_file_debug_stripped
                    )
    {
        this.image_file_debug_stripped = image_file_debug_stripped;
    }


    public EntityItemBoolType getImageFileDebugStripped()
    {
        return image_file_debug_stripped;
    }



    /**
     */
    public void setImageFileRemovableRunFromSwap(
                    final EntityItemBoolType image_file_removable_run_from_swap
                    )
    {
        this.image_file_removable_run_from_swap = image_file_removable_run_from_swap;
    }


    public EntityItemBoolType getImageFileRemovableRunFromSwap()
    {
        return image_file_removable_run_from_swap;
    }



    /**
     */
    public void setImageFileSystem(
                    final EntityItemBoolType image_file_system
                    )
    {
        this.image_file_system = image_file_system;
    }


    public EntityItemBoolType getImageFileSystem()
    {
        return image_file_system;
    }



    /**
     */
    public void setImageFileDll(
                    final EntityItemBoolType image_file_dll
                    )
    {
        this.image_file_dll = image_file_dll;
    }


    public EntityItemBoolType getImageFileDll()
    {
        return image_file_dll;
    }



    /**
     */
    public void setImageFileUpSystemOnly(
                    final EntityItemBoolType image_file_up_system_only
                    )
    {
        this.image_file_up_system_only = image_file_up_system_only;
    }


    public EntityItemBoolType getImageFileUpSystemOnly()
    {
        return image_file_up_system_only;
    }



    /**
     */
    public void setImageFileBytesReveresedHi(
                    final EntityItemBoolType image_file_bytes_reveresed_hi
                    )
    {
        this.image_file_bytes_reveresed_hi = image_file_bytes_reveresed_hi;
    }


    public EntityItemBoolType getImageFileBytesReveresedHi()
    {
        return image_file_bytes_reveresed_hi;
    }



    /**
     */
    public void setMagicNumber(
                    final EntityItemIntType magic_number
                    )
    {
        this.magic_number = magic_number;
    }


    public EntityItemIntType getMagicNumber()
    {
        return magic_number;
    }



    /**
     */
    public void setMajorLinkerVersion(
                    final EntityItemIntType major_linker_version
                    )
    {
        this.major_linker_version = major_linker_version;
    }


    public EntityItemIntType getMajorLinkerVersion()
    {
        return major_linker_version;
    }



    /**
     */
    public void setMinorLinkerVersion(
                    final EntityItemIntType minor_linker_version
                    )
    {
        this.minor_linker_version = minor_linker_version;
    }


    public EntityItemIntType getMinorLinkerVersion()
    {
        return minor_linker_version;
    }



    /**
     */
    public void setSizeOfCode(
                    final EntityItemIntType size_of_code
                    )
    {
        this.size_of_code = size_of_code;
    }


    public EntityItemIntType getSizeOfCode()
    {
        return size_of_code;
    }



    /**
     */
    public void setSizeOfInitializedData(
                    final EntityItemIntType size_of_initialized_data
                    )
    {
        this.size_of_initialized_data = size_of_initialized_data;
    }


    public EntityItemIntType getSizeOfInitializedData()
    {
        return size_of_initialized_data;
    }



    /**
     */
    public void setSizeOfUninitializedData(
                    final EntityItemIntType size_of_uninitialized_data
                    )
    {
        this.size_of_uninitialized_data = size_of_uninitialized_data;
    }


    public EntityItemIntType getSizeOfUninitializedData()
    {
        return size_of_uninitialized_data;
    }



    /**
     */
    public void setAddressOfEntryPoint(
                    final EntityItemIntType address_of_entry_point
                    )
    {
        this.address_of_entry_point = address_of_entry_point;
    }


    public EntityItemIntType getAddressOfEntryPoint()
    {
        return address_of_entry_point;
    }



    /**
     */
    public void setBaseOfCode(
                    final EntityItemIntType base_of_code
                    )
    {
        this.base_of_code = base_of_code;
    }


    public EntityItemIntType getBaseOfCode()
    {
        return base_of_code;
    }



    /**
     */
    public void setBaseOfData(
                    final EntityItemIntType base_of_data
                    )
    {
        this.base_of_data = base_of_data;
    }


    public EntityItemIntType getBaseOfData()
    {
        return base_of_data;
    }



    /**
     */
    public void setImageBaseAddress(
                    final EntityItemIntType image_base_address
                    )
    {
        this.image_base_address = image_base_address;
    }


    public EntityItemIntType getImageBaseAddress()
    {
        return image_base_address;
    }



    /**
     */
    public void setSectionAlignment(
                    final EntityItemIntType section_alignment
                    )
    {
        this.section_alignment = section_alignment;
    }


    public EntityItemIntType getSectionAlignment()
    {
        return section_alignment;
    }



    /**
     */
    public void setFileAlignment(
                    final EntityItemIntType file_alignment
                    )
    {
        this.file_alignment = file_alignment;
    }


    public EntityItemIntType getFileAlignment()
    {
        return file_alignment;
    }



    /**
     */
    public void setMajorOperatingSystemVersion(
                    final EntityItemIntType major_operating_system_version
                    )
    {
        this.major_operating_system_version = major_operating_system_version;
    }


    public EntityItemIntType getMajorOperatingSystemVersion()
    {
        return major_operating_system_version;
    }



    /**
     */
    public void setMinorOperatingSystemVersion(
                    final EntityItemIntType minor_operating_system_version
                    )
    {
        this.minor_operating_system_version = minor_operating_system_version;
    }


    public EntityItemIntType getMinorOperatingSystemVersion()
    {
        return minor_operating_system_version;
    }



    /**
     */
    public void setMajorImageVersion(
                    final EntityItemIntType major_image_version
                    )
    {
        this.major_image_version = major_image_version;
    }


    public EntityItemIntType getMajorImageVersion()
    {
        return major_image_version;
    }



    /**
     */
    public void setMinorImageVersion(
                    final EntityItemIntType minor_image_version
                    )
    {
        this.minor_image_version = minor_image_version;
    }


    public EntityItemIntType getMinorImageVersion()
    {
        return minor_image_version;
    }



    /**
     */
    public void setMajorSubsystemVersion(
                    final EntityItemIntType major_subsystem_version
                    )
    {
        this.major_subsystem_version = major_subsystem_version;
    }


    public EntityItemIntType getMajorSubsystemVersion()
    {
        return major_subsystem_version;
    }



    /**
     */
    public void setMinorSusbsystemVersion(
                    final EntityItemIntType minor_susbsystem_version
                    )
    {
        this.minor_susbsystem_version = minor_susbsystem_version;
    }


    public EntityItemIntType getMinorSusbsystemVersion()
    {
        return minor_susbsystem_version;
    }



    /**
     */
    public void setSizeOfImage(
                    final EntityItemIntType size_of_image
                    )
    {
        this.size_of_image = size_of_image;
    }


    public EntityItemIntType getSizeOfImage()
    {
        return size_of_image;
    }



    /**
     */
    public void setSizeOfHeaders(
                    final EntityItemIntType size_of_headers
                    )
    {
        this.size_of_headers = size_of_headers;
    }


    public EntityItemIntType getSizeOfHeaders()
    {
        return size_of_headers;
    }



    /**
     */
    public void setChecksum(
                    final EntityItemIntType checksum
                    )
    {
        this.checksum = checksum;
    }


    public EntityItemIntType getChecksum()
    {
        return checksum;
    }



    /**
     */
    public void setSubsystem(
                    final EntityItemPeSubsystemType subsystem
                    )
    {
        this.subsystem = subsystem;
    }


    public EntityItemPeSubsystemType getSubsystem()
    {
        return subsystem;
    }



    /**
     */
    public void setDllCharacteristics(
                    final EntityItemIntType dll_characteristics
                    )
    {
        this.dll_characteristics = dll_characteristics;
    }


    public EntityItemIntType getDllCharacteristics()
    {
        return dll_characteristics;
    }



    /**
     */
    public void setSizeOfStackReserve(
                    final EntityItemIntType size_of_stack_reserve
                    )
    {
        this.size_of_stack_reserve = size_of_stack_reserve;
    }


    public EntityItemIntType getSizeOfStackReserve()
    {
        return size_of_stack_reserve;
    }



    /**
     */
    public void setSizeOfStackCommit(
                    final EntityItemIntType size_of_stack_commit
                    )
    {
        this.size_of_stack_commit = size_of_stack_commit;
    }


    public EntityItemIntType getSizeOfStackCommit()
    {
        return size_of_stack_commit;
    }



    /**
     */
    public void setSizeOfHeapReserve(
                    final EntityItemIntType size_of_heap_reserve
                    )
    {
        this.size_of_heap_reserve = size_of_heap_reserve;
    }


    public EntityItemIntType getSizeOfHeapReserve()
    {
        return size_of_heap_reserve;
    }



    /**
     */
    public void setSizeOfHeapCommit(
                    final EntityItemIntType size_of_heap_commit
                    )
    {
        this.size_of_heap_commit = size_of_heap_commit;
    }


    public EntityItemIntType getSizeOfHeapCommit()
    {
        return size_of_heap_commit;
    }



    /**
     */
    public void setLoaderFlags(
                    final EntityItemIntType loader_flags
                    )
    {
        this.loader_flags = loader_flags;
    }


    public EntityItemIntType getLoaderFlags()
    {
        return loader_flags;
    }



    /**
     */
    public void setNumberOfRvaAndSizes(
                    final EntityItemIntType number_of_rva_and_sizes
                    )
    {
        this.number_of_rva_and_sizes = number_of_rva_and_sizes;
    }


    public EntityItemIntType getNumberOfRvaAndSizes()
    {
        return number_of_rva_and_sizes;
    }



    /**
     */
    public void setRealNumberOfDirectoryEntries(
                    final EntityItemIntType real_number_of_directory_entries
                    )
    {
        this.real_number_of_directory_entries = real_number_of_directory_entries;
    }


    public EntityItemIntType getRealNumberOfDirectoryEntries()
    {
        return real_number_of_directory_entries;
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
        if (!(obj instanceof PeHeaderItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "peheader_item[" + super.toString()
                        + ", header_signature="                + getHeaderSignature()
                        + ", target_machine_type="                    + getTargetMachineType()
                        + ", number_of_sections="                + getNumberOfSections()
                        + ", time_date_stamp="             + getTimeDateStamp()
                        + ", pointer_to_symbol_table="         + getPointerToSymbolTable()
                        + ", number_of_symbols="   + getNumberOfSymbols()
                        + ", size_of_optional_header="      + getSizeOfOptionalHeader()
                        + ", image_file_relocs_stripped="            + getImageFileRelocsStripped()
                        + ", image_file_executable_image="            + getImageFileExecutableImage()
                        + ", image_file_line_nums_stripped="            + getImageFileLineNumsStripped()
                        + ", image_file_local_syms_stripped="            + getImageFileLocalSymsStripped()
                        + ", image_file_aggresive_ws_trim="           + getImageFileAggresiveWsTrim()
                        + ", image_file_large_address_aware="         + getImageFileLargeAddressAware()
                        + ", image_file_16bit_machine="             + getImageFile16BitMachine()
                        + ", image_file_bytes_reversed_lo="          + getImageFileBytesReversedLo()
                        + ", image_file_32bit_machine="         + getImageFile32BitMachine()
                        + ", image_file_debug_stripped="        + getImageFileDebugStripped()
                        + ", image_file_removable_run_from_swap="            + getImageFileRemovableRunFromSwap()
                        + ", image_file_system="           + getImageFileSystem()
                        + ", image_file_dll="            + getImageFileDll()
                        + ", image_file_up_system_only="       + getImageFileUpSystemOnly()
                        + ", image_file_bytes_reveresed_hi="    + getImageFileBytesReveresedHi()

                        + ", magic_number=" + getMagicNumber()
                        + ", major_linker_version=" + getMajorLinkerVersion()
                        + ", minor_linker_version=" + getMinorLinkerVersion()
                        + ", size_of_code=" + getSizeOfCode()
                        + ", size_of_initialized_data=" + getSizeOfInitializedData()
                        + ", size_of_uninitialized_data=" + getSizeOfUninitializedData()
                        + ", address_of_entry_point=" + getAddressOfEntryPoint()
                        + ", base_of_code=" + getBaseOfCode()
                        + ", base_of_data=" + getBaseOfData()

                        + ", image_base_address="   + getImageBaseAddress()
                        + ", section_alignment="    + getSectionAlignment()
                        + ", file_alignment="     + getFileAlignment()
                        + ", major_operating_system_version="  + getMajorOperatingSystemVersion()
                        + ", minor_operating_system_version="  + getMinorOperatingSystemVersion()
                        + ", major_image_version="  + getMajorImageVersion()
                        + ", minor_image_version="   + getMinorImageVersion()
                        + ", major_subsystem_version="   + getMajorSubsystemVersion()
                        + ", minor_susbsystem_version="   + getMinorSusbsystemVersion()
                        + ", size_of_image="   + getSizeOfImage()
                        + ", size_of_headers="   + getSizeOfHeaders()
                        + ", checksum="   + getChecksum()

                        + ", magic_number="   + getSubsystem()
                        + ", major_linker_version="    + getDllCharacteristics()
                        + ", minor_linker_version="     + getSizeOfStackReserve()
                        + ", size_of_code="  + getSizeOfStackCommit()
                        + ", size_of_initialized_data="  + getSizeOfHeapReserve()
                        + ", size_of_uninitialized_data="  + getSizeOfHeapCommit()
                        + ", address_of_entry_point="   + getLoaderFlags()
                        + ", base_of_code="   + getNumberOfRvaAndSizes()
                        + ", base_of_data="   + getRealNumberOfDirectoryEntries()
             + "]";
    }
}
//
