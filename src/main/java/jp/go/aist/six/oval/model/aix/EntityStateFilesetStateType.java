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
package jp.go.aist.six.oval.model.aix;

import jp.go.aist.six.oval.model.definitions.EntityStateStringType;



/**
 * The EntityStateFilesetStateType defines the different values
 * that are valid for the state entity of a fileset state.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityStateFilesetStateType.java 3142 2013-05-13 02:20:30Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityStateFilesetStateType
    extends EntityStateStringType
{

    /**
     * Constructor.
     */
    public EntityStateFilesetStateType()
    {
    }



    //**************************************************************
    //  EntitySimpleBaseType
    //**************************************************************

    @Override
    public void setContent(
                    final String content
                    )
    {
        if (content != null) {
            FilesetStateEnumeration.fromValue( content );
        }

        super.setContent( content );
    }



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
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityStateFilesetStateType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
