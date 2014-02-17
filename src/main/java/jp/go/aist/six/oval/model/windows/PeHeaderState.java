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
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The peheader_state defines the different metadata associated with the header of a PE file.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PeHeaderState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PeHeaderState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   header_signature;
    private EntityStatePeTargetMachineType  target_machine_type;
    private EntityStateIntType      number_of_sections;
    private EntityStateIntType      time_date_stamp;
    private EntityStateIntType      pointer_to_symbol_table;
    private EntityStateIntType      number_of_symbols;
    private EntityStateIntType      size_of_optional_header;

    private EntityStateBoolType     image_file_relocs_stripped;
    private EntityStateBoolType     image_file_executable_image;
    private EntityStateBoolType     image_file_line_nums_stripped;
    private EntityStateBoolType     image_file_local_syms_stripped;
    private EntityStateBoolType     image_file_aggresive_ws_trim;
    private EntityStateBoolType     image_file_large_address_aware;
    private EntityStateBoolType     image_file_16bit_machine;
    private EntityStateBoolType     image_file_bytes_reversed_lo;
    private EntityStateBoolType     image_file_32bit_machine;
    private EntityStateBoolType     image_file_debug_stripped;
    private EntityStateBoolType     image_file_removable_run_from_swap;
    private EntityStateBoolType     image_file_system;
    private EntityStateBoolType     image_file_dll;
    private EntityStateBoolType     image_file_up_system_only;
    private EntityStateBoolType     image_file_bytes_reveresed_hi;

    private EntityStateIntType      magic_number;
    private EntityStateIntType      major_linker_version;
    private EntityStateIntType      minor_linker_version;
    private EntityStateIntType      size_of_code;
    private EntityStateIntType      size_of_initialized_data;
    private EntityStateIntType      size_of_uninitialized_data;
    private EntityStateIntType      address_of_entry_point;
    private EntityStateIntType      base_of_code;
    private EntityStateIntType      base_of_data;
    private EntityStateIntType      image_base_address;
    private EntityStateIntType      section_alignment;
    private EntityStateIntType      file_alignment;
    private EntityStateIntType      major_operating_system_version;
    private EntityStateIntType      minor_operating_system_version;
    private EntityStateIntType      major_image_version;
    private EntityStateIntType      minor_image_version;
    private EntityStateIntType      major_subsystem_version;
    private EntityStateIntType      minor_susbsystem_version;
    private EntityStateIntType      size_of_image;
    private EntityStateIntType      size_of_headers;
    private EntityStateIntType      checksum;

    private EntityStatePeSubsystemType  subsystem;
    private EntityStateIntType      dll_characteristics;
    private EntityStateIntType      size_of_stack_reserve;
    private EntityStateIntType      size_of_stack_commit;
    private EntityStateIntType      size_of_heap_reserve;
    private EntityStateIntType      size_of_heap_commit;
    private EntityStateIntType      loader_flags;
    private EntityStateIntType      number_of_rva_and_sizes;
    private EntityStateIntType      real_number_of_directory_entries;



    /**
     * Constructor.
     */
    public PeHeaderState()
    {
        this( null, 0 );
    }


    public PeHeaderState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PeHeaderState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PEHEADER;
    }



    /**
     */
    public void setHeaderSignature(
                    final EntityStateStringType header_signature
                    )
    {
        this.header_signature = header_signature;
    }


    public EntityStateStringType getHeaderSignature()
    {
        return header_signature;
    }



    /**
     */
    public void setTargetMachineType(
                    final EntityStatePeTargetMachineType target_machine_type
                    )
    {
        this.target_machine_type = target_machine_type;
    }


    public EntityStatePeTargetMachineType getTargetMachineType()
    {
        return target_machine_type;
    }



    /**
     */
    public void setNumberOfSections(
                    final EntityStateIntType number_of_sections
                    )
    {
        this.number_of_sections = number_of_sections;
    }


    public EntityStateIntType getNumberOfSections()
    {
        return number_of_sections;
    }



    /**
     */
    public void setTimeDateStamp(
                    final EntityStateIntType time_date_stamp
                    )
    {
        this.time_date_stamp = time_date_stamp;
    }


    public EntityStateIntType getTimeDateStamp()
    {
        return time_date_stamp;
    }



    /**
     */
    public void setPointerToSymbolTable(
                    final EntityStateIntType pointer_to_symbol_table
                    )
    {
        this.pointer_to_symbol_table = pointer_to_symbol_table;
    }


    public EntityStateIntType getPointerToSymbolTable()
    {
        return pointer_to_symbol_table;
    }



    /**
     */
    public void setNumberOfSymbols(
                    final EntityStateIntType number_of_symbols
                    )
    {
        this.number_of_symbols = number_of_symbols;
    }


    public EntityStateIntType getNumberOfSymbols()
    {
        return number_of_symbols;
    }



    /**
     */
    public void setSizeOfOptionalHeader(
                    final EntityStateIntType size_of_optional_header
                    )
    {
        this.size_of_optional_header = size_of_optional_header;
    }


    public EntityStateIntType getSizeOfOptionalHeader()
    {
        return size_of_optional_header;
    }



    /**
     */
    public void setImageFileRelocsStripped(
                    final EntityStateBoolType image_file_relocs_stripped
                    )
    {
        this.image_file_relocs_stripped = image_file_relocs_stripped;
    }


    public EntityStateBoolType getImageFileRelocsStripped()
    {
        return image_file_relocs_stripped;
    }



    /**
     */
    public void setImageFileExecutableImage(
                    final EntityStateBoolType image_file_executable_image
                    )
    {
        this.image_file_executable_image = image_file_executable_image;
    }


    public EntityStateBoolType getImageFileExecutableImage()
    {
        return image_file_executable_image;
    }



    /**
     */
    public void setImageFileLineNumsStripped(
                    final EntityStateBoolType image_file_line_nums_stripped
                    )
    {
        this.image_file_line_nums_stripped = image_file_line_nums_stripped;
    }


    public EntityStateBoolType getImageFileLineNumsStripped()
    {
        return image_file_line_nums_stripped;
    }



    /**
     */
    public void setImageFileLocalSymsStripped(
                    final EntityStateBoolType image_file_local_syms_stripped
                    )
    {
        this.image_file_local_syms_stripped = image_file_local_syms_stripped;
    }


    public EntityStateBoolType getImageFileLocalSymsStripped()
    {
        return image_file_local_syms_stripped;
    }



    /**
     */
    public void setImageFileAggresiveWsTrim(
                    final EntityStateBoolType image_file_aggresive_ws_trim
                    )
    {
        this.image_file_aggresive_ws_trim = image_file_aggresive_ws_trim;
    }


    public EntityStateBoolType getImageFileAggresiveWsTrim()
    {
        return image_file_aggresive_ws_trim;
    }



    /**
     */
    public void setImageFileLargeAddressAware(
                    final EntityStateBoolType image_file_large_address_aware
                    )
    {
        this.image_file_large_address_aware = image_file_large_address_aware;
    }


    public EntityStateBoolType getImageFileLargeAddressAware()
    {
        return image_file_large_address_aware;
    }



    /**
     */
    public void setImageFile16BitMachine(
                    final EntityStateBoolType image_file_16bit_machine
                    )
    {
        this.image_file_16bit_machine = image_file_16bit_machine;
    }


    public EntityStateBoolType getImageFile16BitMachine()
    {
        return image_file_16bit_machine;
    }



    /**
     */
    public void setImageFileBytesReversedLo(
                    final EntityStateBoolType image_file_bytes_reversed_lo
                    )
    {
        this.image_file_bytes_reversed_lo = image_file_bytes_reversed_lo;
    }


    public EntityStateBoolType getImageFileBytesReversedLo()
    {
        return image_file_bytes_reversed_lo;
    }



    /**
     */
    public void setImageFile32BitMachine(
                    final EntityStateBoolType image_file_32bit_machine
                    )
    {
        this.image_file_32bit_machine = image_file_32bit_machine;
    }


    public EntityStateBoolType getImageFile32BitMachine()
    {
        return image_file_32bit_machine;
    }



    /**
     */
    public void setImageFileDebugStripped(
                    final EntityStateBoolType image_file_debug_stripped
                    )
    {
        this.image_file_debug_stripped = image_file_debug_stripped;
    }


    public EntityStateBoolType getImageFileDebugStripped()
    {
        return image_file_debug_stripped;
    }



    /**
     */
    public void setImageFileRemovableRunFromSwap(
                    final EntityStateBoolType image_file_removable_run_from_swap
                    )
    {
        this.image_file_removable_run_from_swap = image_file_removable_run_from_swap;
    }


    public EntityStateBoolType getImageFileRemovableRunFromSwap()
    {
        return image_file_removable_run_from_swap;
    }



    /**
     */
    public void setImageFileSystem(
                    final EntityStateBoolType image_file_system
                    )
    {
        this.image_file_system = image_file_system;
    }


    public EntityStateBoolType getImageFileSystem()
    {
        return image_file_system;
    }



    /**
     */
    public void setImageFileDll(
                    final EntityStateBoolType image_file_dll
                    )
    {
        this.image_file_dll = image_file_dll;
    }


    public EntityStateBoolType getImageFileDll()
    {
        return image_file_dll;
    }



    /**
     */
    public void setImageFileUpSystemOnly(
                    final EntityStateBoolType image_file_up_system_only
                    )
    {
        this.image_file_up_system_only = image_file_up_system_only;
    }


    public EntityStateBoolType getImageFileUpSystemOnly()
    {
        return image_file_up_system_only;
    }



    /**
     */
    public void setImageFileBytesReveresedHi(
                    final EntityStateBoolType image_file_bytes_reveresed_hi
                    )
    {
        this.image_file_bytes_reveresed_hi = image_file_bytes_reveresed_hi;
    }


    public EntityStateBoolType getImageFileBytesReveresedHi()
    {
        return image_file_bytes_reveresed_hi;
    }



    /**
     */
    public void setMagicNumber(
                    final EntityStateIntType magic_number
                    )
    {
        this.magic_number = magic_number;
    }


    public EntityStateIntType getMagicNumber()
    {
        return magic_number;
    }



    /**
     */
    public void setMajorLinkerVersion(
                    final EntityStateIntType major_linker_version
                    )
    {
        this.major_linker_version = major_linker_version;
    }


    public EntityStateIntType getMajorLinkerVersion()
    {
        return major_linker_version;
    }



    /**
     */
    public void setMinorLinkerVersion(
                    final EntityStateIntType minor_linker_version
                    )
    {
        this.minor_linker_version = minor_linker_version;
    }


    public EntityStateIntType getMinorLinkerVersion()
    {
        return minor_linker_version;
    }



    /**
     */
    public void setSizeOfCode(
                    final EntityStateIntType size_of_code
                    )
    {
        this.size_of_code = size_of_code;
    }


    public EntityStateIntType getSizeOfCode()
    {
        return size_of_code;
    }



    /**
     */
    public void setSizeOfInitializedData(
                    final EntityStateIntType size_of_initialized_data
                    )
    {
        this.size_of_initialized_data = size_of_initialized_data;
    }


    public EntityStateIntType getSizeOfInitializedData()
    {
        return size_of_initialized_data;
    }



    /**
     */
    public void setSizeOfUninitializedData(
                    final EntityStateIntType size_of_uninitialized_data
                    )
    {
        this.size_of_uninitialized_data = size_of_uninitialized_data;
    }


    public EntityStateIntType getSizeOfUninitializedData()
    {
        return size_of_uninitialized_data;
    }



    /**
     */
    public void setAddressOfEntryPoint(
                    final EntityStateIntType address_of_entry_point
                    )
    {
        this.address_of_entry_point = address_of_entry_point;
    }


    public EntityStateIntType getAddressOfEntryPoint()
    {
        return address_of_entry_point;
    }



    /**
     */
    public void setBaseOfCode(
                    final EntityStateIntType base_of_code
                    )
    {
        this.base_of_code = base_of_code;
    }


    public EntityStateIntType getBaseOfCode()
    {
        return base_of_code;
    }



    /**
     */
    public void setBaseOfData(
                    final EntityStateIntType base_of_data
                    )
    {
        this.base_of_data = base_of_data;
    }


    public EntityStateIntType getBaseOfData()
    {
        return base_of_data;
    }



    /**
     */
    public void setImageBaseAddress(
                    final EntityStateIntType image_base_address
                    )
    {
        this.image_base_address = image_base_address;
    }


    public EntityStateIntType getImageBaseAddress()
    {
        return image_base_address;
    }



    /**
     */
    public void setSectionAlignment(
                    final EntityStateIntType section_alignment
                    )
    {
        this.section_alignment = section_alignment;
    }


    public EntityStateIntType getSectionAlignment()
    {
        return section_alignment;
    }



    /**
     */
    public void setFileAlignment(
                    final EntityStateIntType file_alignment
                    )
    {
        this.file_alignment = file_alignment;
    }


    public EntityStateIntType getFileAlignment()
    {
        return file_alignment;
    }



    /**
     */
    public void setMajorOperatingSystemVersion(
                    final EntityStateIntType major_operating_system_version
                    )
    {
        this.major_operating_system_version = major_operating_system_version;
    }


    public EntityStateIntType getMajorOperatingSystemVersion()
    {
        return major_operating_system_version;
    }



    /**
     */
    public void setMinorOperatingSystemVersion(
                    final EntityStateIntType minor_operating_system_version
                    )
    {
        this.minor_operating_system_version = minor_operating_system_version;
    }


    public EntityStateIntType getMinorOperatingSystemVersion()
    {
        return minor_operating_system_version;
    }



    /**
     */
    public void setMajorImageVersion(
                    final EntityStateIntType major_image_version
                    )
    {
        this.major_image_version = major_image_version;
    }


    public EntityStateIntType getMajorImageVersion()
    {
        return major_image_version;
    }



    /**
     */
    public void setMinorImageVersion(
                    final EntityStateIntType minor_image_version
                    )
    {
        this.minor_image_version = minor_image_version;
    }


    public EntityStateIntType getMinorImageVersion()
    {
        return minor_image_version;
    }



    /**
     */
    public void setMajorSubsystemVersion(
                    final EntityStateIntType major_subsystem_version
                    )
    {
        this.major_subsystem_version = major_subsystem_version;
    }


    public EntityStateIntType getMajorSubsystemVersion()
    {
        return major_subsystem_version;
    }



    /**
     */
    public void setMinorSusbsystemVersion(
                    final EntityStateIntType minor_susbsystem_version
                    )
    {
        this.minor_susbsystem_version = minor_susbsystem_version;
    }


    public EntityStateIntType getMinorSusbsystemVersion()
    {
        return minor_susbsystem_version;
    }



    /**
     */
    public void setSizeOfImage(
                    final EntityStateIntType size_of_image
                    )
    {
        this.size_of_image = size_of_image;
    }


    public EntityStateIntType getSizeOfImage()
    {
        return size_of_image;
    }



    /**
     */
    public void setSizeOfHeaders(
                    final EntityStateIntType size_of_headers
                    )
    {
        this.size_of_headers = size_of_headers;
    }


    public EntityStateIntType getSizeOfHeaders()
    {
        return size_of_headers;
    }



    /**
     */
    public void setChecksum(
                    final EntityStateIntType checksum
                    )
    {
        this.checksum = checksum;
    }


    public EntityStateIntType getChecksum()
    {
        return checksum;
    }



    /**
     */
    public void setSubsystem(
                    final EntityStatePeSubsystemType subsystem
                    )
    {
        this.subsystem = subsystem;
    }


    public EntityStatePeSubsystemType getSubsystem()
    {
        return subsystem;
    }



    /**
     */
    public void setDllCharacteristics(
                    final EntityStateIntType dll_characteristics
                    )
    {
        this.dll_characteristics = dll_characteristics;
    }


    public EntityStateIntType getDllCharacteristics()
    {
        return dll_characteristics;
    }



    /**
     */
    public void setSizeOfStackReserve(
                    final EntityStateIntType size_of_stack_reserve
                    )
    {
        this.size_of_stack_reserve = size_of_stack_reserve;
    }


    public EntityStateIntType getSizeOfStackReserve()
    {
        return size_of_stack_reserve;
    }



    /**
     */
    public void setSizeOfStackCommit(
                    final EntityStateIntType size_of_stack_commit
                    )
    {
        this.size_of_stack_commit = size_of_stack_commit;
    }


    public EntityStateIntType getSizeOfStackCommit()
    {
        return size_of_stack_commit;
    }



    /**
     */
    public void setSizeOfHeapReserve(
                    final EntityStateIntType size_of_heap_reserve
                    )
    {
        this.size_of_heap_reserve = size_of_heap_reserve;
    }


    public EntityStateIntType getSizeOfHeapReserve()
    {
        return size_of_heap_reserve;
    }



    /**
     */
    public void setSizeOfHeapCommit(
                    final EntityStateIntType size_of_heap_commit
                    )
    {
        this.size_of_heap_commit = size_of_heap_commit;
    }


    public EntityStateIntType getSizeOfHeapCommit()
    {
        return size_of_heap_commit;
    }



    /**
     */
    public void setLoaderFlags(
                    final EntityStateIntType loader_flags
                    )
    {
        this.loader_flags = loader_flags;
    }


    public EntityStateIntType getLoaderFlags()
    {
        return loader_flags;
    }



    /**
     */
    public void setNumberOfRvaAndSizes(
                    final EntityStateIntType number_of_rva_and_sizes
                    )
    {
        this.number_of_rva_and_sizes = number_of_rva_and_sizes;
    }


    public EntityStateIntType getNumberOfRvaAndSizes()
    {
        return number_of_rva_and_sizes;
    }



    /**
     */
    public void setRealNumberOfDirectoryEntries(
                    final EntityStateIntType real_number_of_directory_entries
                    )
    {
        this.real_number_of_directory_entries = real_number_of_directory_entries;
    }


    public EntityStateIntType getRealNumberOfDirectoryEntries()
    {
        return real_number_of_directory_entries;
    }




    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getHeaderSignature() );
        ref_list.add( getTargetMachineType() );
        ref_list.add( getNumberOfSections() );
        ref_list.add( getTimeDateStamp() );
        ref_list.add( getPointerToSymbolTable() );
        ref_list.add( getNumberOfSymbols() );
        ref_list.add( getSizeOfOptionalHeader() );

        ref_list.add( getImageFileRelocsStripped() );
        ref_list.add( getImageFileExecutableImage() );
        ref_list.add( getImageFileLineNumsStripped() );
        ref_list.add( getImageFileLocalSymsStripped() );
        ref_list.add( getImageFileAggresiveWsTrim() );
        ref_list.add( getImageFileLargeAddressAware() );
        ref_list.add( getImageFile16BitMachine() );
        ref_list.add( getImageFileBytesReversedLo() );
        ref_list.add( getImageFile32BitMachine() );
        ref_list.add( getImageFileDebugStripped() );
        ref_list.add( getImageFileRemovableRunFromSwap() );
        ref_list.add( getImageFileSystem() );
        ref_list.add( getImageFileDll() );
        ref_list.add( getImageFileUpSystemOnly() );
        ref_list.add( getImageFileBytesReveresedHi() );

        ref_list.add( getMagicNumber() );
        ref_list.add( getMajorLinkerVersion() );
        ref_list.add( getMinorLinkerVersion() );
        ref_list.add( getSizeOfCode() );
        ref_list.add( getSizeOfInitializedData() );
        ref_list.add( getSizeOfUninitializedData() );
        ref_list.add( getAddressOfEntryPoint() );
        ref_list.add( getBaseOfCode() );
        ref_list.add( getBaseOfData() );

        ref_list.add( getImageBaseAddress() );
        ref_list.add( getSectionAlignment() );
        ref_list.add( getFileAlignment() );
        ref_list.add( getMajorOperatingSystemVersion() );
        ref_list.add( getMinorOperatingSystemVersion() );
        ref_list.add( getMajorImageVersion() );
        ref_list.add( getMinorImageVersion() );
        ref_list.add( getMajorSubsystemVersion() );
        ref_list.add( getMinorSusbsystemVersion() );
        ref_list.add( getSizeOfImage() );
        ref_list.add( getSizeOfHeaders() );
        ref_list.add( getChecksum() );

        ref_list.add( getSubsystem() );
        ref_list.add( getDllCharacteristics() );
        ref_list.add( getSizeOfStackReserve() );
        ref_list.add( getSizeOfStackCommit() );
        ref_list.add( getSizeOfHeapReserve() );
        ref_list.add( getSizeOfHeapCommit() );
        ref_list.add( getLoaderFlags() );
        ref_list.add( getNumberOfRvaAndSizes() );
        ref_list.add( getRealNumberOfDirectoryEntries() );

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
        if (!(obj instanceof PeHeaderState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "peheader_state[" + super.toString()
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
