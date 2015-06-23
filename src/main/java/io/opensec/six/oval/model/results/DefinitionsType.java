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
package io.opensec.six.oval.model.results;

import io.opensec.six.oval.model.Container;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;



/**
 * The DefinitionsType is a container for one or more Definition instances.
 *
 * <p>Constraints:
 * The combination of definition id, version, and variable instance of each definition
 * is unique in this container.
 * </p>
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DefinitionsType
    extends Container<DefinitionType>  //{1..*}
//extends OvalElementContainer<DefinitionResult>  //{1..*}
{

    private final Collection<DefinitionType>  definition = new HashSet<DefinitionType>();



    /**
     * Constructor.
     */
    public DefinitionsType()
    {
    }


    public DefinitionsType(
                    final Collection<? extends DefinitionType> definition_list
                    )
    {
//        super( definitions );

//        definition.addAll( definition_list );
        _copy( definition, definition_list );
    }


    public DefinitionsType(
                    final DefinitionType[] definition_list
                    )
    {
//        super( definitions );

        this( Arrays.asList( definition_list ) );
    }



    /**
     */
    public void setDefinition(
                    final Collection<? extends DefinitionType> definition_list
                    )
    {
        reset( definition_list );
//        _setElement( definition_list );
    }


    public void setDefinition(
                    final DefinitionType[] definition_list
                    )
    {
        reset( definition_list );
//        _setElement( definition_list );
    }


    public Collection<DefinitionType> getDefinition()
    {
        return _getCollection();
    }


//    public boolean addDefinition(
//                    final DefinitionType definition
//                    )
//    {
//        return add( definition );
//    }
//
//
//    public Iterator<DefinitionType> iterateDefinition()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<DefinitionType> _getCollection()
    {
        return definition;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
//
