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
package io.opensec.six.oval.model.common;

import io.opensec.six.oval.model.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



/**
 * A container for one or more OVAL IDs.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class OvalIdContainer
    extends Container<OvalId>
{

    private final Collection<OvalId>  id = new ArrayList<OvalId>();



    /**
     * Constructor.
     */
    public OvalIdContainer()
    {
    }


    public OvalIdContainer(
                    final Collection<OvalId> id_list
                    )
    {
//        super( id_list );

//        id.addAll( id_list );
        _copy( id, id_list );
    }


    public OvalIdContainer(
                    final OvalId[] id_list
                    )
    {
//        super( id_list );

        this( Arrays.asList( id_list ) );
    }



    /**
     */
    public void setId(
                    final Collection<OvalId> id_list
                    )
    {
        reset( id_list );
//        _setElement( id_list );
    }


    public void setId(
                    final OvalId[] id_list
                    )
    {
        reset( id_list );
//      _setElement( id_list );
    }


    public Collection<OvalId> getId()
    {
        return _getCollection();
    }


//    public boolean addId(
//                    final OvalId id
//                    )
//    {
//        return add( id );
//    }
//
//
//    public Iterator<OvalId> iterateIds()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<OvalId> _getCollection()
    {
        return id;
    }



    //**************************************************************
    //  java.lang.String
    //**************************************************************

}
//
