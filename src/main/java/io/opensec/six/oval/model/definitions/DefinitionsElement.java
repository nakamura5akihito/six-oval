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
package io.opensec.six.oval.model.definitions;

import io.opensec.six.oval.model.DocumentGenerator;
import io.opensec.six.oval.model.Element;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.util.persist.Persistable;
import java.util.Collection;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PrePersist;




/**
 * An OVAL definitions element.
 * The kinds are definition, test, state, object, and variable.
 * Every definitions element is identified by a pair of its identifier and version.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class DefinitionsElement
    extends Element
    implements Persistable<String>
{

    private String  oval_id;
    //{required, oval:XxxIDPattern}


    public static final Boolean  DEFAULT_DEPRECATED = Boolean.FALSE;

    private Boolean  deprecated;
    //{optional, default="false"}


    // SIX extension
    protected DocumentGenerator      _oval_generator;
//    protected OvalEntityType     _oval_entity_type;
//    protected OvalPlatformType   _oval_platform_type;
//    protected OvalComponentType  _oval_component_type;

//    @Transient
//    protected Type  _definitions_element_type;



    // MongoDB
    @Id
    private String  _id;



    /**
     * Constructor.
     */
    public DefinitionsElement()
    {
    }


    /**
     * Constructor.
     */
    public DefinitionsElement(
                    final String id,
                    final int version
                    )
    {
        super( id, version );
    }



    /**
     */
    public void setDeprecated(
                    final Boolean deprecated
                    )
    {
        this.deprecated = deprecated;
    }


    public Boolean getDeprecated()
    {
        return deprecated;
    }


    public static Boolean deprecated(
                    final DefinitionsElement e
                    )
    {
        Boolean  deprecated = e.getDeprecated();
        return (deprecated == null ? DEFAULT_DEPRECATED : deprecated);
    }



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public void setOvalId(
                    final String id
                    )
    {
        oval_id = id;
    }


    @Override
    public String getOvalId()
    {
        return oval_id;
    }



    //*********************************************************************
    //  SIX
    //*********************************************************************

    public void ovalSetGenerator(
                    final DocumentGenerator generator
                    )
    {
        _oval_generator = generator;
    }



//    public abstract Type ovalGetElementType();



    /**
     * Returns the element references.
     * The result collection may contain null.
     *
     * If this element is a Definition, this method returns
     * the Test and Definition references contained in the "criteria" part.
     *
     * @return
     *  a collection of the references.
     */
    public abstract Collection<ElementRef> ovalGetElementRef();



    //**************************************************************
    //  MongoDB/Morphia Lifecycle
    //**************************************************************

//    @SuppressWarnings( "unused" )
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

//    @Override
//    public String getPersistentID()
//    {
//        return ovalGetGlobalID();
//
////        String  pid = super.getPersistentID();
////        if (pid == null) {
////            pid = getOvalGlobalID();
////            super.setPersistentID( pid );
////        }
////
////        return pid;
//    }



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
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof DefinitionsElement)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
