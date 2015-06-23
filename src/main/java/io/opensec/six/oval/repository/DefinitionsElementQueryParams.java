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
package io.opensec.six.oval.repository;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementType;
import io.opensec.util.repository.CommonQueryParams;



/**
 * @author  Akihito Nakamura, AIST
 */
public class DefinitionsElementQueryParams
    extends CommonQueryParams
{

    public static class Key
    extends CommonQueryParams.Key
    {
        public static final String  ID              = "id";
        public static final String  VERSION         = "version";
        public static final String  DEPRECATED      = "deprecated";

        public static final String  TYPE            = "type";
        //DefinitionsElement.Type {definition, test, object, state, variable}

        public static final String  FAMILY          = "family";
        //Family {linux, unix, windows, ...}

        public static final String  COMPONENT       = "component";
        //Component {file, rpminfo, registry, ...}

        public static final String  REFERER         = "referer";

//        public static final String  COMMENT         = "comment"; // Use searchTerms instead!

        //TODO: Is this required???
        public static final String  SCHEMA          = "schema";
        public static final String  DOCUMENT        = "document";
    }
    // Key



//    /**
//     * The default sorting order.
//     */
//    public static final String  DEFAULT_ORDER = Key.ID;



    /**
     * Constructor.
     */
    public DefinitionsElementQueryParams()
    {
//        setOrder( DEFAULT_ORDER );

        //NOTE: Since the type of OVAL-IDs is String,
        //      this ordering specifies the lexicographical sorting,
        //      e.g. def:99 is bigger than def:111.
    }



    /**
     */
    public void setId(
                    final String id
    )
    {
        set( Key.ID, id );
    }


    public String getId()
    {
        return get( Key.ID );
    }



    /**
     */
    public void setVersion(
                    final String version
    )
    {
        set( Key.VERSION, version );
    }


    public String getVersion()
    {
        return get( Key.VERSION );
    }



    /**
     */
    public void setDeprecated(
                    final String deprecated
    )
    {
        set( Key.DEPRECATED, deprecated );
    }


    public String getDeprecated()
    {
        return get( Key.DEPRECATED );
    }



    /**
     */
    public void setType(
                    final String type
                    )
    {
        if (type != null) {
            ElementType.fromValue( type );
//            DefinitionsElement.Type.fromValue( type );
//            OvalEntityType.valueOf( type );
        }

        set( Key.TYPE, type );
    }


    public String getType()
    {
        return get( Key.TYPE );
    }



    /**
     */
    public void setFamily(
                    final String family
                    )
    {
        //NOTE: list value!!!
//        if (family != null) {
//            Family.fromValue( family );
//        }

        set( Key.FAMILY, family );
    }


    public String getFamily()
    {
        return get( Key.FAMILY );
    }



    /**
     */
    public void setComponent(
                    final String component
                    )
    {
//        if (component != null) {
//            Component.fromValue( component );
//        }

        set( Key.COMPONENT, component );
    }


    public void setComponent(
                    final ComponentType component
                    )
    {
//        if (component != null) {
//            Component.fromValue( component );
//        }

        if (component == null) {
            setComponent( (String)null );
        } else {
            setComponent( component.value() );
        }
    }


    public void setComponent(
                    final ComponentType[] component_list
                    )
    {

        if (component_list == null  ||  component_list.length == 0) {
            setComponent( (String)null );
        } else {
            StringBuffer  s = new StringBuffer();
            for (ComponentType  c : component_list) {
                if (c != null) {
                    if (s.length() > 0) {
                        s.append( LIST_DELIMITER );
                    }
                    s.append( c.value() );
                }
            }
            setComponent( s.toString() );
        }
    }


    public String getComponent()
    {
        return get( Key.COMPONENT );
    }



    /**
     */
    public void setReferer(
                    final String referer
    )
    {
        set( Key.REFERER, referer );
    }


    public String getReferer()
    {
        return get( Key.REFERER );
    }



    /**
     */
    public void setSchema(
                    final String schema
    )
    {
        set( Key.SCHEMA, schema );
    }


    public String getSchema()
    {
        return get( Key.SCHEMA );
    }



    /**
     */
    public void setDocument(
                    final String document
    )
    {
        set( Key.DOCUMENT, document );
    }


    public String getDocument()
    {
        return get( Key.DOCUMENT );
    }

}
//

