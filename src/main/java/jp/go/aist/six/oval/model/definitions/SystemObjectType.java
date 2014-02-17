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
package jp.go.aist.six.oval.model.definitions;

import java.util.Collection;
import java.util.Collections;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.ElementType;
import org.mongodb.morphia.annotations.Entity;



/**
 * An OVAL Object describes a set of items to look for on a system.
 * The name "object" in the OVAL Schema is renamed
 * because the name has the special meaning in Java.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: SystemObjectType.java 3055 2013-02-22 10:26:33Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.def.object" )
public class SystemObjectType
    extends DefinitionsComponent
{

    private NotesType  notes;
    //{0..1}



    /**
     * Constructor.
     */
    public SystemObjectType()
    {
        this( null, 0 );
    }


    public SystemObjectType(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SystemObjectType(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_entity_type = OvalEntityType.object;
//        _definitions_element_type = DefinitionsElement.Type.object;
    }



    /**
     */
    public void setNotes(
                    final NotesType notes
                    )
    {
        this.notes = notes;
    }


    public NotesType getNotes()
    {
        return notes;
    }



//    private static List<EntityAttributeGroup>  _EMPTY_LIST_ =
//        Collections.emptyList();
//

//    /**
//     */
//    public Iterator<EntityAttributeGroup> iterateProperties()
//    {
//        return _EMPTY_LIST_.iterator();
//    }



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public final ElementType ovalGetType()
    {
        return ElementType.OBJECT;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

//    @Override
//    public final Type ovalGetElementType()
//    {
//        return DefinitionsElement.Type.OBJECT;
//    }



    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        return Collections.emptyList();
//        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
//        return ref_list;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
// SystemObjectType
