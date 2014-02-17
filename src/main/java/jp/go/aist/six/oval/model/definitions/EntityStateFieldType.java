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

import jp.go.aist.six.oval.model.common.CheckEnumeration;
import jp.go.aist.six.oval.model.common.DatatypeEnumeration;
import jp.go.aist.six.oval.model.common.OperationEnumeration;




/**
 * The EntityStateFieldType defines an element with simple content
 * that represents a named field in a record that may contain
 * any number of named fields.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityStateFieldType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityStateFieldType
    extends EntityAttributeGroup
{

    private String  name;
    //{required, pattern="[^A-Z]+"}


    public static final CheckEnumeration  DEFAULT_ENTITY_CHECK =
        CheckEnumeration.ALL;

    private CheckEnumeration  entity_check;
    //{optional, default="all"}



    private String  content;
    //{simpleContent, base="xsd:anySimpleType"}



    /**
     * Constructor.
     */
    public EntityStateFieldType()
    {
    }


    public EntityStateFieldType(
                    final String content
                    )
    {
        setContent( content );
    }


    public EntityStateFieldType(
                    final String name,
                    final DatatypeEnumeration datatype,
                    final OperationEnumeration operation,
                    final Boolean mask,
                    final String var_ref,
                    final CheckEnumeration var_check,
                    final String content
                    )
    {
        super( datatype, operation, mask, var_ref, var_check );
        setName( name );
        setContent( content );
    }


    public EntityStateFieldType(
                    final String name,
                    final String datatype,
                    final String operation,
                    final Boolean mask,
                    final String var_ref,
                    final String var_check,
                    final String content
                    )
    {
        super( datatype, operation, mask, var_ref, var_check );
        setName( name );
        setContent( content );
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



    /**
     */
    public void setEntityCheck(
                    final CheckEnumeration entity_check
                    )
    {
        this.entity_check = entity_check;
    }


    public CheckEnumeration getEntityCheck()
    {
        return entity_check;
    }


    public static CheckEnumeration entityCheck(
                    final EntityStateFieldType obj
                    )
    {
        if (obj == null) {
            throw new IllegalArgumentException( "null EntityStateFieldType" );
        }

        CheckEnumeration  entity_check = obj.getEntityCheck();
        return (entity_check == null ? DEFAULT_ENTITY_CHECK : entity_check);
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

        String  name = getName();
        result = prime * result + ((name == null) ? 0 : name.hashCode());

        result = prime * result + entityCheck( this ).hashCode();

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

        if (!(obj instanceof EntityStateFieldType)) {
            return false;
        }

        EntityStateFieldType  other = (EntityStateFieldType)obj;
        if (super.equals( obj )) {
            final String  other_name = other.getName();
            final String   this_name =  this.getName();
            if (this_name == other_name
                            ||  (this_name != null
                                        &&  this_name.equals( other_name ))) {
                if (entityCheck( this ) == entityCheck( other )) {
                    final String  other_content = other.getContent();
                    final String   this_content =  this.getContent();
                    if (this_content == other_content
                                    ||  (this_content != null
                                    &&  this_content.equals( other_content ))) {
                        return true;
                    }
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "" + getContent()
                        + ", name=" + getName()
                        + ", entity_check=" + getEntityCheck()
                        + ", " + super.toString()
                        ;
    }

}
//EntityStateFieldType
