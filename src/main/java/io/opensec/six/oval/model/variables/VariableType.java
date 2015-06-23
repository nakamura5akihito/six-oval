/**
 * SIX OVAL - https://nakamura5akihito.github.io/
 * Copyright (C) 2010 Akihito Nakamura
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
package io.opensec.six.oval.model.variables;

import io.opensec.six.oval.model.OvalObject;
import io.opensec.six.oval.model.common.DatatypeEnumeration;
import io.opensec.util.persist.Persistable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PrePersist;



/**
 * Each Variable object contains the associated datatype and value
 * which will be substituted into the OVAL Definition
 * that is referencing this specific variable.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.var.variable" )
public class VariableType
    implements OvalObject, Persistable<String>
{

    private String  oval_id;
    //{required, oval:VariableIDPattern}


    private DatatypeEnumeration  datatype;
    //{required}


    private String  comment;
    //{required}


    private final Collection<String>  value = new ArrayList<String>();
    //{1..*}


    // MongoDB
    @Id
    private String  _id;



    /**
     * Constructor.
     */
    public VariableType()
    {
    }


    public VariableType(
                    final String id,
                    final DatatypeEnumeration datatype,
                    final String comment,
                    final Collection<String> value_list
                    )
    {
        setOvalId( id );
        setDatatype( datatype );
        setComment( comment );
        setValue( value_list );
    }


    public VariableType(
                    final String id,
                    final DatatypeEnumeration datatype,
                    final String comment,
                    final String[] value_list
                    )
    {
        setOvalId( id );
        setDatatype( datatype );
        setComment( comment );
        setValue( value_list );
    }



    /**
     */
    public void setOvalId(
                    final String id
                    )
    {
        oval_id = id;
    }


    public String getOvalId()
    {
        return oval_id;
    }



    /**
     */
    public void setDatatype(
                    final DatatypeEnumeration datatype
                    )
    {
        this.datatype = datatype;
    }


    public DatatypeEnumeration getDatatype()
    {
        return datatype;
    }



    /**
     */
    public void setComment(
                    final String comment
                    )
    {
        this.comment = comment;
    }


    public String getComment()
    {
        return comment;
    }



    /**
     */
    public void setValue(
                    final Collection<String> value_list
                    )
    {
        if (value_list != value) {
            value.clear();
            if (value_list != null  &&  value_list.size() > 0) {
                value.addAll( value_list );
            }
        }
    }


    public void setValue(
                    final String[] value_list
                    )
    {
        setValue( Arrays.asList( value_list ) );
    }


    public Collection<String> getValue()
    {
        return value;
    }


    public Iterator<String> iterateValue()
    {
        return value.iterator();
    }



    //**************************************************************
    //  MongoDB/Morphia Lifecycle
    //**************************************************************

    @PrePersist
    private void _assignPersistentID()
    {
        String  pid = getPersistentID();
        if (pid == null) {
            pid = getOvalId();
//            pid = globalRefOf( this );
            setPersistentID( pid );
        }
    }



    //**************************************************************
    //  Persistable
    //**************************************************************

    @Override
    public void setPersistentID(
                    final String pid
                    )
    {
        _id = pid;
    }


    @Override
    public String getPersistentID()
    {
        return _id;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[id=" + getOvalId()
                        + ", datatype=" + getDatatype()
                        + ", comment=" + getComment()
                        + ", valeu=" + getValue()
                        ;
    }

}
//
