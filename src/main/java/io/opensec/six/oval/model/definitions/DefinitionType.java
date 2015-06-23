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
package io.opensec.six.oval.model.definitions;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.ElementType;
import io.opensec.six.oval.model.common.ClassEnumeration;
import java.util.ArrayList;
import java.util.Collection;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;



/**
 * A single OVAL Definition.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.def.definition" )                //Morphhia
//@Document( collection="oval.def.definition.spring" )     //Spring
public class DefinitionType
    extends DefinitionsElement
{

    private MetadataType  metadata;
    //{1..1}


    private NotesType  notes;
    //{0..1}


    private CriteriaType  criteria;
    //{0..1}

//    @Transient
//    private String  _criteriaXml;


    @Property( "class" )
    private ClassEnumeration  definitionClass;
    //{required}


    // SIX: extended properties //
    protected final ComponentType    _oval_component = null;

//    private String  _lastModifiedDate;
//    private final Collection<Cve>  _relatedCve = new ArrayList<Cve>();

//    private static <K,V> HashMap<K,V> _createHashMap()
//    {
//        return new HashMap<K,V>();
//    }
//
//    private final Map<DefinitionsElement.Type,Set<String>>  _referencing_elements = _createHashMap();


    //NOTE: Create Assoc class and persist the instances in the isolated collection.
//    private final Map<DefinitionsElement.Type,Set<String>>  _referencing_elements =
//                    new EnumMap<DefinitionsElement.Type,Set<String>>( DefinitionsElement.Type.class );


    /**
     * Constructor.
     */
    public DefinitionType()
    {
        this( null, 0 );
    }


    public DefinitionType(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public DefinitionType(
                    final String id,
                    final int version,
                    final ClassEnumeration clazz
                    )
    {
        this( id, version, clazz, null );
    }


    public DefinitionType(
                    final String id,
                    final int version,
                    final ClassEnumeration clazz,
                    final MetadataType metadata
                    )
    {
        super( id, version );
        setDefinitionClass( clazz );
        setMetadata( metadata );

//        _definitions_element_type = DefinitionsElement.Type.definition;
    }



    /**
     */
    public void setMetadata(
                    final MetadataType metadata
                    )
    {
        this.metadata = metadata;
    }


    public MetadataType getMetadata()
    {
        if (metadata == null) {
            metadata = new MetadataType();
        }
        return metadata;
    }


    public DefinitionType metadata(
                    final MetadataType metadata
                    )
    {
        setMetadata( metadata );
        return this;
    }



    /**
     */
    public void setNotes(
                    final NotesType notes
                    )
    {
        this.notes = notes;
    }


    /**
     */
    public NotesType getNotes()
    {
        return notes;
    }



    /**
     */
    public void setCriteria(
                    final CriteriaType criteria
                    )
    {
        this.criteria = criteria;
    }


    public CriteriaType getCriteria()
    {
        return criteria;
    }


    public DefinitionType criteria(
                    final CriteriaType criteria
                    )
    {
        setCriteria( criteria );
        return this;
    }



//    /**
//     */
//    public void xmlSetCriteria(
//                    final String xml
//                    )
//    {
//        _criteriaXml = xml;
//    }
//
//
//    public String xmlGetCriteria()
//    {
//        return _criteriaXml;
//    }



    /**
     */
    public void setDefinitionClass(
                    final ClassEnumeration clazz
                    )
    {
        definitionClass = clazz;
    }


    public ClassEnumeration getDefinitionClass()
    {
        return definitionClass;
    }



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public final ElementType ovalGetType()
    {
        return ElementType.DEFINITION;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

//    @Override
//    public final Type ovalGetElementType()
//    {
//        return DefinitionsElement.Type.DEFINITION;
//    }



    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        _collectElementRef( ref_list, getCriteria() );

        return ref_list;
    }


    private void _collectElementRef(
                    final Collection<? super ElementRef> ref_list,
                    final CriteriaType criteria
                    )
    {
        if (criteria == null) {
            return;
        }

        for (CriteriaElement  e : criteria.getElements()) {
            if (ElementRef.class.isInstance( e )) {
                ElementRef  ref = ElementRef.class.cast( e );
                ref_list.add( ref );
            }

            if (CriteriaType.class.isInstance( e )) {
                CriteriaType  inner_criteria = CriteriaType.class.cast( e );
                _collectElementRef( ref_list, inner_criteria );
            }
        }
    }



//    /**
//     */
//    public void setLastModifiedDate(
//                    final String date
//                    )
//    {
//        _lastModifiedDate = date;
//    }
//
//
//    public String getLastModifiedDate()
//    {
//        if (_lastModifiedDate == null) {
//            MetadataType  meta = getMetadata();
//            if (meta != null) {
//                _lastModifiedDate = meta.getLastModifiedDate();
//            }
//        }
//
//        return _lastModifiedDate;
//    }
//
//
//
//    /**
//     */
//    public void setRelatedCve(
//                    final Collection<Cve> cves
//                    )
//    {
//        if (cves != _relatedCve) {
//            _relatedCve.clear();
//
//            if (cves != null  &&  cves.size() > 0) {
//                _relatedCve.addAll( cves );
//            }
//        }
//    }
//
//
//    private transient boolean  _relatedCveComputed = false;
//
//    public Collection<Cve> getRelatedCve()
//    {
//        if (! _relatedCveComputed) {
//            MetadataType  meta = getMetadata();
//            if (meta != null) {
//                _relatedCve.addAll( meta.getRelatedCve() );
//            }
//            _relatedCveComputed = true;
//        }
//
//        return _relatedCve;
//    }


//    /**
//     */
//    public java.util.Set<String> referingElementIds()
//    {
//        java.util.Set<String>  ids = new HashSet<String>();
//        _collectReferingElementIds( ids, getCriteria() );
//
//        return ids;
//    }
//
//
//    private void _collectReferingElementIds(
//                    final java.util.Set<String> ids,
//                    final CriteriaType criteria
//                    )
//    {
//        if (criteria == null) {
//            return;
//        }
//
//        for (CriteriaElement  e : criteria.getElements()) {
//            if (CriterionType.class.isInstance( e )) {
//                CriterionType  criterion = CriterionType.class.cast( e );
//                _collectReferingElementIds( ids, criterion );
//            } else if (ExtendDefinitionType.class.isInstance( e )) {
//                ExtendDefinitionType  extend_definition = ExtendDefinitionType.class.cast( e );
//                _collectReferingElementIds( ids, extend_definition );
//            } else if (CriteriaType.class.isInstance( e )) {
//                CriteriaType  inner_criteria = CriteriaType.class.cast( e );
//                _collectReferingElementIds( ids, inner_criteria );
//            }
//        }
//    }
//
//
//    private void _collectReferingElementIds(
//                    final java.util.Set<String> ids,
//                    final CriterionType criterion
//                    )
//    {
//        if (criterion == null) {
//            return;
//        }
//
//        String  tst_id = criterion.getTestRef();
//        ids.add( tst_id );
//    }
//
//
//    private void _collectReferingElementIds(
//                    final java.util.Set<String> ids,
//                    final ExtendDefinitionType extend_definition
//                    )
//    {
//        if (extend_definition == null) {
//            return;
//        }
//
//        String  def_id = extend_definition.getDefinitionRef();
//        ids.add( def_id );
//    }




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
        if (!(obj instanceof DefinitionType)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "[" + super.toString()
                        + ", class=" + getDefinitionClass()
                        + ", metadata=" + getMetadata()
//                        + ", " + getCriteria()
                        + ", notes=" + getNotes()
                        + "]";
    }

}
//
