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

import io.opensec.six.oval.model.ElementType;
import io.opensec.six.oval.model.OvalObject;
import io.opensec.six.oval.model.common.OvalId;
import io.opensec.util.persist.Persistable;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;



/**
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.def.element_assoc" )
public class DefinitionsElementAssoc
    implements Persistable<String>, OvalObject
{
    public static final class Ref
    implements Serializable
    {
        private final ElementType  type;
        private final String  oval_id;


        public Ref(
                        final String oval_id
                        )
        {
            this( OvalId.elementTypeOf( oval_id ), oval_id );
        }

        public Ref(
                        final ElementType type,
                        final String oval_id
                        )
        {
            this.type = type;
            this.oval_id = oval_id;
        }

        public ElementType getType()
        {
            return type;
        }

        public String getOvalID()
        {
            return oval_id;
        }


        //**************************************************************
        //  java.lang.Object
        //**************************************************************

        @Override
        public int hashCode()
        {
            final int  prime = 37;
            int  result = 17;

            result = prime * result + (oval_id == null ? 0 : oval_id.hashCode());

            return result;
        }

        @Override
        public boolean equals(
                        final Object obj
                        )
        {
            if (this == obj) {
                return true;
            }

            if (!(obj instanceof Ref)) {
                return false;
            }

            Ref  other = (Ref)obj;
            String  other_oval_id = other.getOvalID();
            String   this_oval_id =  this.getOvalID();
            if (this_oval_id == other_oval_id
                            ||  (this_oval_id != null  &&  this_oval_id.equals( other_oval_id ))) {
                return true;
            }

            return false;
        }

        @Override
        public String toString()
        {
            return "[type=" + getType() + ", id=" + getOvalID() + "]";
        }
    }
    //


    @Id
    private String  oval_id;

    private ElementType  type;
    private final Set<Ref>  references = new HashSet<Ref>();


    /**
     * Constructor.
     */
    public DefinitionsElementAssoc()
    {
    }


    /**
     */
    public DefinitionsElementAssoc(
                    final DefinitionType def
                    )
    {
        setOvalID( def.getOvalId() );
        setType( ElementType.DEFINITION );

        _build( references, def );
    }


    public DefinitionsElementAssoc(
                    final TestType tst
                    )
    {
        setOvalID( tst.getOvalId() );
        setType( ElementType.TEST );

        _build( references, tst );
    }



    /**
     * Sets the OVAL-ID.
     *
     * @param   oval_id
     *  the OVAL-ID.
     */
    public void setOvalID(
                    final String oval_id
                    )
    {
        this.oval_id = oval_id;
    }


    /**
     * Retuens the OVAL-ID.
     *
     * @return
     *  the OVAL-ID.
     */
    public String getOvalID()
    {
        return oval_id;
    }



    /**
     */
    public void setType(
                    final ElementType type
                    )
    {
        this.type = type;
    }


    public ElementType getType()
    {
        return type;
    }



    /**
     */
    public void setReferences(
                    final Collection<? extends Ref> refs
                    )
    {
        if (refs == null) {
            return;
        }

        if (references != refs) {
            references.clear();
            references.addAll( refs );
        }
    }


    public Set<Ref> getReferences()
    {
        return references;
    }


    public Iterator<Ref> iterateReferences()
    {
        return references.iterator();
    }


    public Set<Ref> getReferences(
                    final ElementType type
                    )
    {
        Set<Ref>  refs = new HashSet<Ref>();
        for (Ref  r : references) {
            if (type == r.getType()) {
                refs.add( r );
            }
        }

        return refs;
    }



    ////////////////////////////////////////////////////////////////
    //  test
    ////////////////////////////////////////////////////////////////

    /**
     * test
     */
    private void _build(
                    final Set<Ref> refs,
                    final TestType tst
                    )
    {
        _build( refs, tst.getObject() );

        Collection<StateRefType>  states = tst.getState();
        if (states != null) {
            for (StateRefType  s : states) {
                _build( refs, s );
            }
        }
    }


    /**
     * test/object
     */
    private void _build(
                    final Set<Ref> refs,
                    final SystemObjectRefType object
                    )
    {
        if (object != null) {
            String  oval_id = object.getObjectRef();
            if (oval_id != null) {
                refs.add( new Ref( ElementType.OBJECT, oval_id ) );
            }
        }
    }


    /**
     * test/state
     */
    private void _build(
                    final Set<Ref> refs,
                    final StateRefType state
                    )
    {
        if (state != null) {
            String  oval_id = state.getStateRef();
            if (oval_id != null) {
                refs.add( new Ref( ElementType.STATE, oval_id ) );
            }
        }
    }


    ////////////////////////////////////////////////////////////////
    //  definition
    ////////////////////////////////////////////////////////////////

    private void _build(
                    final Set<Ref> refs,
                    final DefinitionType def
                    )
    {
        CriteriaType  criteria = def.getCriteria();
        if (criteria != null) {
            _build( refs, criteria );
        }
    }


    private void _build(
                    final Set<Ref> refs,
                    final CriteriaType critera
                    )
    {
        for (CriteriaElement  e : critera.getElements()) {
            if (e instanceof CriterionType) {
                _build( refs, CriterionType.class.cast( e ) );
            } else if (e instanceof CriteriaType) {
                _build( refs, CriteriaType.class.cast( e ) );
            } else if (e instanceof ExtendDefinitionType) {
                _build( refs, ExtendDefinitionType.class.cast( e ) );
            }
        }
    }


    private void _build(
                    final Set<Ref> refs,
                    final CriterionType criterion
                    )
    {
        if (criterion == null) {
            throw new IllegalArgumentException( "null criterion" );
        }

        String  oval_id = criterion.getTestRef();
        if (oval_id == null) {
            throw new IllegalArgumentException( "null test_ref" );
        }

        refs.add( new Ref( ElementType.TEST, oval_id ) );
    }


    private void _build(
                    final Set<Ref> refs,
                    final ExtendDefinitionType criterion
                    )
    {
        if (criterion == null) {
            throw new IllegalArgumentException( "null criterion" );
        }

        String  oval_id = criterion.getDefinitionRef();
        if (oval_id == null) {
            throw new IllegalArgumentException( "null definition_ref" );
        }

        refs.add( new Ref( ElementType.DEFINITION, oval_id ) );
    }



//    ////////////////////////////////////////////////////////////////
//
//    private final Map<DefinitionsElement.Type, Set<String>>  _referencing_map =
//                    new EnumMap<DefinitionsElement.Type, Set<String>>( DefinitionsElement.Type.class );
//
//
//
//
//    public ElementReferencingMap(
//                    final String oval_id
//                    )
//    {
//        this( oval_id, DefinitionsElement.Type.fromOvalId( oval_id ) );
//    }
//
//
//    public ElementReferencingMap(
//                    final String oval_id,
//                    final DefinitionsElement.Type type
//                    )
//    {
//        setOvalID( oval_id );
//        setType( type );
//    }
//
//
//    /**
//     */
//    public void setReferencingElements(
//                    final DefinitionsElement.Type type,
//                    final Collection<? extends String> oval_ids
//                    )
//    {
//        Set<String>  ids = _referencing_map.get( type );
//        if (ids == null) {
//            ids = new HashSet<String>();
//            _referencing_map.put( type, ids );
//        } else {
//            ids.clear();
//        }
//
//        ids.addAll( oval_ids );
//    }
//
//
//    public void addReferencingElements(
//                    final DefinitionsElement.Type type,
//                    final ElementContainer<? extends Element> elements
//                    )
//    {
//        Set<String>  ids = _referencing_map.get( type );
//        if (ids == null) {
//            ids = new HashSet<String>();
//            _referencing_map.put( type, ids );
//        } else {
//            ids.clear();
//        }
//
//        Iterator<? extends Element>  i = elements.iterator();
//        while (i.hasNext()) {
//            Element  e = i.next();
//            ids.add( e.getOvalID() );
//        }
//    }
//
//
//    public void addReferencingElement(
//                    final DefinitionsElement.Type type,
//                    final Element element
//                    )
//    {
//        addReferencingId( type, element.getOvalID() );
//    }
//
//
//    public void addReferencingId(
//                    final DefinitionsElement.Type type,
//                    final String oval_id
//                    )
//    {
//        if (type == null) {
//            throw new IllegalArgumentException( "null element type" );
//        }
//
//        if (oval_id == null) {
//            throw new IllegalArgumentException( "null OVAL-ID" );
//        }
//
//        Set<String>  ids = _referencing_map.get( type );
//        if (ids == null) {
//            ids = new HashSet<String>();
//            _referencing_map.put( type, ids );
//        } else {
//            ids.clear();
//        }
//
//        ids.add( oval_id );
//    }
//
//
//    public void addReferencingId(
//                    final String oval_id
//                    )
//    {
//        addReferencingId( DefinitionsElement.Type.fromOvalId( oval_id ), oval_id );
//    }
//
//
//    public Set<String> getReferencingIds(
//                    final DefinitionsElement.Type type
//                    )
//    {
//        return _referencing_map.get( type );
//    }
//
//
//    public Map<DefinitionsElement.Type, Set<String>> getReferencingIds()
//    {
//        return _referencing_map;
//    }



    //**************************************************************
    //  Persistable
    //**************************************************************

    @Override
    public void setPersistentID(
                    final String pid
                    )
    {
        setOvalID( pid );
    }


    @Override
    public String getPersistentID()
    {
        return getOvalID();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

//    @Override
//    public int hashCode()
//    {
//        return super.hashCode();
//    }
//
//
//
//    @Override
//    public boolean equals(
//                    final Object obj
//                    )
//    {
//        if (!(obj instanceof ElementReferencingMap)) {
//            return false;
//        }
//
//        return super.equals( obj );
//    }



    @Override
    public String toString()
    {
        return "[oval_id=" + getOvalID()
                        + ", type=" + getType()
                        + ", references=" + getReferences()
                        + "]";
    }

}
//
