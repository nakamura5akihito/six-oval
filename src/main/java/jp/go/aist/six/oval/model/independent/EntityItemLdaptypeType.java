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
package jp.go.aist.six.oval.model.independent;

import jp.go.aist.six.oval.model.sc.EntityItemStringType;



/**
 * The EntityItemLdaptypeType restricts a string value
 * to a specific set of values that specify the different types
 * of information that an ldap attribute can represent.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityItemLdaptypeType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemLdaptypeType
    extends EntityItemStringType
{

    /**
     * Constructor.
     */
    public EntityItemLdaptypeType()
    {
    }


    public EntityItemLdaptypeType(
                    final String content
                    )
    {
        super( content );
    }



    public EntityItemLdaptypeType(
                    final HashTypeEnumeration content
                    )
    {
        super( (content == null ? null : content.value()) );
    }



    //**************************************************************
    //  EntityItemBase
    //**************************************************************

    @Override
    public void setContent(
                    final String content
                    )
    {
        if (content != null) {
            //validation
            HashTypeEnumeration.fromValue( content );
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

        if (!(obj instanceof EntityItemLdaptypeType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//EntityItemLdaptypeType
