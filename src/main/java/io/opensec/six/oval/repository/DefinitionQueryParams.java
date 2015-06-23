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

import io.opensec.six.oval.model.common.ClassEnumeration;



/**
 * @author  Akihito Nakamura, AIST
 */
public class DefinitionQueryParams
    extends DefinitionsElementQueryParams
{

    public static class Key
    extends DefinitionsElementQueryParams.Key
    {
        public static final String  DEFINITION_CLASS    = "class";
//        public static final String  TITLE               = "title"; // Use "searchTerms" instead!!!
//        public static final String  FAMILY              = "family";   //override
        public static final String  PLATFORM            = "platform";
        public static final String  PRODUCT             = "product";
        public static final String  REF_SOURCE          = "refSource";
        public static final String  REF_ID              = "refId";
        public static final String  CVE                 = "cve";
    }
    // Key



    /**
     * Constructor.
     */
    public DefinitionQueryParams()
    {
    }



    /**
     */
    public void setDefinitionClass(
                    final String definition_class
                    )
    {
        set( Key.DEFINITION_CLASS, definition_class );
    }


    public void setDefinitionClass(
                    final String[] definition_classes
                    )
    {
        set( Key.DEFINITION_CLASS, definition_classes );
    }


    public void setDefinitionClass(
                    final ClassEnumeration definition_class
                    )
    {
        set( Key.DEFINITION_CLASS, definition_class.value() );
    }


    public void setDefinitionClass(
                    final ClassEnumeration[] definition_classes
                    )
    {
        set( Key.DEFINITION_CLASS, definition_classes );
    }


    public String getDefinitionClass()
    {
        return get( Key.DEFINITION_CLASS );
    }



//    /**
//     */
//    public void setTitle(
//                    final String title
//    )
//    {
//        set( Key.TITLE, title );
//    }
//
//
//    public String getTitle()
//    {
//        return get( Key.TITLE );
//    }



//    /**
//     */
//    public void setFamily(
//                    final String family
//    )
//    {
//        set( Key.FAMILY, family );
//    }
//
//
//    public String getFamily()
//    {
//        return get( Key.FAMILY );
//    }



    /**
     */
    public void setPlatform(
                    final String platform
    )
    {
        set( Key.PLATFORM, platform );
    }


    public String getPlatform()
    {
        return get( Key.PLATFORM );
    }



    /**
     */
    public void setProduct(
                    final String product
    )
    {
        set( Key.PRODUCT, product );
    }


    public String getProduct()
    {
        return get( Key.PRODUCT );
    }



    /**
     */
    public void setRefSource(
                    final String ref_source
    )
    {
        set( Key.REF_SOURCE, ref_source );
    }


    public String getRefSource()
    {
        return get( Key.REF_SOURCE );
    }



    /**
     */
    public void setRefId(
                    final String ref_id
    )
    {
        set( Key.REF_ID, ref_id );
    }


    public String getRefId()
    {
        return get( Key.REF_ID );
    }



    /**
     */
    public void setCve(
                    final String cve
    )
    {
        set( Key.CVE, cve );
    }


    public String getCve()
    {
        return get( Key.CVE );
    }

}
//

