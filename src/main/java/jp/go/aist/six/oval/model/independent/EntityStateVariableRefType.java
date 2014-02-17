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

import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.ElementType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;



/**
 * The EntityStateVariableRefType defines a string state entity
 * that has a valid OVAL variable id as the value.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityStateVariableRefType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityStateVariableRefType
    extends EntityStateStringType
    implements ElementRef
{

    /**
     * Constructor.
     */
    public EntityStateVariableRefType()
    {
    }



    //**************************************************************
    //  EntitySimpleBaseType
    //**************************************************************

//    @Override
//    public void setContent(
//                    final String content
//                    )
//    {
//        //TODO: some validation code.
//
//        super.setContent( content );
//    }



    //*********************************************************************
    //  ElementRef
    //*********************************************************************

    @Override
    public String ovalGetRefId()
    {
        String  var_id = getContent();
        if (var_id != null  &&  var_id.length() > 0) {
            return var_id;
        }

        return null;
    }



    @Override
    public ElementType ovalGetRefType()
    {
        return ElementType.VARIABLE;
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

        if (!(obj instanceof EntityStateVariableRefType)) {
            return false;
        }

        return super.equals( obj );
    }

}
// EntityStateVariableRefType
