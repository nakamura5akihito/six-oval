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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import jp.go.aist.six.oval.model.ElementContainer;
import org.mongodb.morphia.annotations.Reference;



/**
 * A container for one or more Test instances.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: TestsType.java 3055 2013-02-22 10:26:33Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TestsType
    extends ElementContainer<TestType>  //{1..*}
{

    @Reference
    private final Set<TestType>  test = new HashSet<TestType>();



    /**
     * Constructor.
     */
    public TestsType()
    {
    }


    public TestsType(
                    final Collection<? extends TestType> test_list
                    )
    {
//        super( tests );

//        test.addAll( test_list );
        _copy( test, test_list );
    }


    public TestsType(
                    final TestType[] test_list
                    )
    {
//        super( tests );

        this( Arrays.asList( test_list ) );
    }



    /**
     */
    public void setTest(
                    final Collection<? extends TestType> test_list
                    )
    {
        reset( test_list );
//        _setElement( test_list );
    }


    public void setTest(
                    final TestType[] test_list
                    )
    {
        reset( test_list );
    }


    public Collection<TestType> getTest()
    {
        return _getCollection();
    }


//    public boolean addTest(
//                    final TestType test
//                    )
//    {
//        return add( test );
//    }
//
//
//    public Iterator<TestType> iterateTest()
//    {
//        return iterator();
//    }


    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<TestType> _getCollection()
    {
        return test;
    }

}
//
