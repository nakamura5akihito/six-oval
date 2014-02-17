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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import jp.go.aist.six.oval.model.Container;



/**
 * The SystemResult is a container for one or more SystemResult instances.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ResultsType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ResultsType
    extends Container<SystemType> //{1..*}
{

//    @Reference
    private final Collection<SystemType>  system = new ArrayList<SystemType>();



    /**
     * Constructor.
     */
    public ResultsType()
    {
    }


    public ResultsType(
                    final Collection<? extends SystemType> system_list
                    )
    {
//        super( systems );

//        system.addAll( system_list );
        _copy( system, system_list );
    }


    public ResultsType(
                    final SystemType[] system_list
                    )
    {
//        super( systems );

        this( Arrays.asList( system_list ) );
    }



    /**
     */
    public void setSystem(
                    final Collection<? extends SystemType> system_list
                    )
    {
        reset( system_list );
//        _setElement( system_list );
    }


    public void setSystem(
                    final SystemType[] system_list
                    )
    {
        reset( system_list );
//        _setElement( system_list );
    }


    public Collection<SystemType> getSystem()
    {
        return _getCollection();
    }


//    public boolean addSystem(
//                    final SystemType system
//                    )
//    {
//        return add( system );
//    }
//
//
//    public Iterator<SystemType> iterateSystem()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<SystemType> _getCollection()
    {
        return system;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
//
