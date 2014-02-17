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
 * The EntityItemFieldType defines an element with simple content
 * that represents a named field in a record that may contain any number of named fields.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityItemFieldType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemFieldType
    extends EntityAttributeGroup
{

    private String  content;
    //{simpleContent, base="xsd:anySimpleType"}

    private String  name;
    //{required, pattern value="[^A-Z]+"}



    /**
     * Constructor.
     */
    public EntityItemFieldType()
    {
    }


    public EntityItemFieldType(
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



    /**
     */
    public void setName(
                    final String name
                    )
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
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

        String  name = getName();
        result = prime * result + ((name == null) ? 0 : name.hashCode());

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

        if (!(obj instanceof EntityItemFieldType)) {
            return false;
        }

        if (super.equals( obj )) {
            EntityItemFieldType  other = (EntityItemFieldType)obj;
            String  other_name = other.getName();
            String   this_name =  this.getName();
            if (this_name == other_name
                            ||  (this_name != null  &&  this_name.equals( other_name ))) {
                String  other_content = other.getContent();
                String   this_content =  this.getContent();
                if (this_content == other_content
                                ||  (this_content != null  &&  this_content.equals( other_content ))) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "" + super.toString()
                        + ", name=" + getName()
                        + ", " + getContent()
                        ;
    }

}
//
