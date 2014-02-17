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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import jp.go.aist.six.oval.model.Container;



/**
 * The Notes is a container for one or more note child elements.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: NotesType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class NotesType
    extends Container<Note> //{1..*}
{

    private static Collection<Note> _convert(
                    final Collection<String> note_string_list
                    )
    {
        Collection<Note>  note_list = new ArrayList<Note>();
        for (String  s : note_string_list) {
            note_list.add( new Note( s ) );
        }

        return note_list;
    }



    public NotesType newInstance(
                    final Collection<String> note_string_list
                    )
    {
        return new NotesType( _convert( note_string_list ) );
    }


    public NotesType newInstance(
                    final String[] note_string_list
                    )
    {
        return newInstance( Arrays.asList( note_string_list ) );
    }



    private final Set<Note>  note = new HashSet<Note>();



    /**
     * Constructor.
     */
    public NotesType()
    {
    }


    public NotesType(
                    final Collection<? extends Note> note_list
                    )
    {
        reset( note_list );
    }


    public NotesType(
                    final Note[] note_list
                    )
    {
        this( Arrays.asList( note_list ) );
    }



    /**
     */
    public void setNote(
                    final Collection<? extends Note> note_list
                    )
    {
        reset( note_list );
    }


    public Collection<Note> getNote()
    {
        return _getCollection();
    }


//    public boolean addNote(
//                    final Note note
//                    )
//    {
//        return add( note );
//    }
//
//
//    public Iterator<Note> iterateNote()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<Note> _getCollection()
    {
        return note;
    }

}
//
