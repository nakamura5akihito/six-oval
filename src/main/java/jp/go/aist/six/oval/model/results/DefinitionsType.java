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
package jp.go.aist.six.oval.model.results;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import jp.go.aist.six.oval.model.Container;



/**
 * The DefinitionsType is a container for one or more Definition instances.
 *
 * <p>Constraints:
 * The combination of definition id, version, and variable instance of each definition
 * is unique in this container.
 * </p>
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: DefinitionsType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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
