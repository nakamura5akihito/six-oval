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
package jp.go.aist.six.oval.model.sc;




/**
 * The EntityItemBase is an abstract type that serves as the base type
 * for all item entities.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityItemSimpleBaseType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class EntityItemSimpleBaseType
    extends EntityAttributeGroup
{

    private String  content;
    //{simpleContent, base="xsd:anySimpleType"}



    /**
     * Constructor.
     */
    public EntityItemSimpleBaseType()
    {
    }


    public EntityItemSimpleBaseType(
                    final String content
                    )
    {
        setContent( content );
    }



    /**
     */
    public void setContent(
                    final String content
                    )
    {
        this.content = content;
    }


    public String getContent()
    {
        return content;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        String  content = getContent();
        result = prime * result + ((content == null) ? 0 : content.hashCode());

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityItemSimpleBaseType)) {
            return false;
        }

        if (super.equals( obj )) {
            EntityItemSimpleBaseType  other = (EntityItemSimpleBaseType)obj;
            String  other_content = other.getContent();
            String   this_content =  this.getContent();
            if (this_content == other_content
                            ||  (this_content != null  &&  this_content.equals( other_content ))) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "" + getContent()
                  + ", " + super.toString()
                  ;
    }

}
// EntityItemSimpleBaseType
