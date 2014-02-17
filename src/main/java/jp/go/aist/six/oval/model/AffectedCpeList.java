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
package jp.go.aist.six.oval.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;



/**
 * A list of CPE names.
 * This list appears in the metadata extension part of Definitions
 * from Mitre and Red Hat.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: AffectedCpeList.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AffectedCpeList
    extends Container<Cpe> //{0..* ?}
{

    private final Collection<Cpe>  cpe = new HashSet<Cpe>();


    /**
     * Constructor.
     */
    public AffectedCpeList()
    {
    }


    public AffectedCpeList(
                    final Collection<? extends Cpe> cpe_list
                    )
    {
//        super( cpes );

//        cpe.addAll( cpe_list );
        _copy( cpe, cpe_list );
    }


    public AffectedCpeList(
                    final Cpe[] cpe_list
                    )
    {
//        super( cpes );

        this( Arrays.asList( cpe_list ) );
    }



    /**
     */
    public void setCpe(
                    final Collection<? extends Cpe> cpe_list
                    )
    {
        reset( cpe_list );
//        _setElement( cpe_list );
    }


    public Collection<Cpe> getCpe()
    {
        return _getCollection();
    }


//    public boolean addCpe(
//                    final Cpe cpe
//                    )
//    {
//        return add( cpe );
//    }
//
//
//    public Iterator<Cpe> iterateCpe()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<Cpe> _getCollection()
    {
        return cpe;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
//
