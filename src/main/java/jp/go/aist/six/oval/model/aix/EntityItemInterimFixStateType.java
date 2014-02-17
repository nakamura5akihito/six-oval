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

import jp.go.aist.six.oval.model.sc.EntityItemStringType;



/**
 * The EntityItemInterimFixStateType defines the different values
 * that are valid for the state entity of a interim_fix_state state.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityItemInterimFixStateType.java 3147 2013-05-13 07:35:20Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemInterimFixStateType
    extends EntityItemStringType
{

    /**
     * Constructor.
     */
    public EntityItemInterimFixStateType()
    {
    }


    public EntityItemInterimFixStateType(
                    final String content
                    )
    {
        super( content );
    }


    public EntityItemInterimFixStateType(
                    final InterimFixStateEnumeration content
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
            InterimFixStateEnumeration.fromValue( content );
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

        if (!(obj instanceof EntityItemInterimFixStateType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
