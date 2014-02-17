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
package jp.go.aist.six.oval.model;

import org.mongodb.morphia.annotations.Transient;



/**
 * An OVAL element.
 * Every element has an OVAL ID and version attributes.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: Element.java 3055 2013-02-22 10:26:33Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class Element
    implements OvalObject, Comparable<Element>
{

//    private String  oval_id;
//    //{required, oval:XxxIDPattern}

    private Integer  oval_version;
    //{required, xsd:nonNegativeInteger}



    /**
     * Constructs an element.
     */
    public Element()
    {
    }


    /**
     * Constructs an element.
     *
     * @param   id
     *  the OVAL-ID of the entity.
     * @param   version
     *  the version of the entity.
     */
    public Element(
                    final String id,
                    final int version
                    )
    {
        setOvalId( id );
        setOvalVersion( version );
    }



    /**
     * Sets the OVAL-ID.
     *
     * @param   id
     *  the OVAL-ID.
     */
    public abstract void setOvalId( String id );
//    public void setOvalID(
//                    final String id
//                    )
//    {
//        oval_id = id;
//    }


    /**
     * Retuens the OVAL-ID.
     *
     * @return
     *  the OVAL-ID.
     */
    public abstract String getOvalId();
//    public String getOvalID()
//    {
//        return oval_id;
//    }



    /**
     * Sets the version.
     *
     * @param   version
     *  the version.
     */
    public void setOvalVersion(
                    final Integer version
                    )
    {
        if (version != null  &&  version < 0) {
            throw new IllegalArgumentException(
                            "negative version: " + version );
        }
        oval_version = version;
    }


    /**
     * Returns the version.
     *
     * @return
     *  the version.
     */
    public Integer getOvalVersion()
    {
        return oval_version;
    }



    //*********************************************************************
    //  SIX
    //*********************************************************************

    /**
     */
    public static final String globalRefOf(
                    final Element e
                    )
    {
        if (e == null) {
            throw new IllegalArgumentException( "null element" );
        }

        return globalRefOf( e.getOvalId(), e.getOvalVersion() );
    }


    public static final String globalRefOf(
                    final String id,
                    final Integer version
                    )
    {
        if (id == null || id.length() == 0) {
            throw new IllegalArgumentException( "null or empty OVAL ID" );
        }

        if (version == null) {
            throw new IllegalArgumentException( "null version" );
        }

        return id + ":" + version;
    }



    /**
     * ovalID + ":" + ovalVersion
     */
    @Transient
    private transient String  _ovalGlobalRef;



    /**
     */
    public final void ovalSetGlobalRef(
                    final String gid
                    )
    {
        _ovalGlobalRef = gid;
    }


    public final String ovalGetGlobalRef()
    {
        if (_ovalGlobalRef == null) {
            _ovalGlobalRef = globalRefOf( this );
        }

        return _ovalGlobalRef;
    }



    /**
     * Returns the type of this element.
     *
     * @return
     *  the type.
     */
    public abstract ElementType ovalGetType();



    //*********************************************************************
    //  java.lang.Comparable
    //*********************************************************************

    public int compareTo(
                    final Element o
                    )
    {
        String   this_id =   getOvalId();
        String  other_id = o.getOvalId();
        int  order = this_id.compareTo( other_id );
        if (order != 0) {
            return order;
        }

        int   this_version =   getOvalVersion();
        int  other_version = o.getOvalVersion();
        return (this_version - other_version);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        String  id = getOvalId();
        result = prime * result + ((id == null) ? 0 : id.hashCode());

        Integer  version = getOvalVersion();
        result = prime * result + ((version == null) ? 0 : version.intValue());

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

        if (!(obj instanceof Element)) {
            return false;
        }

        Element  other = (Element)obj;
        String  other_id = other.getOvalId();
        String   this_id =  this.getOvalId();
        if (this_id == other_id
                        ||  (this_id != null  &&  this_id.equals( other_id ))) {
            Integer   this_version =  this.getOvalVersion();
            Integer  other_version = other.getOvalVersion();
            if (this_version == other_version
                            ||  (this_version != null  &&  this_version.equals( other_version ))) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "id=" + getOvalId()
                + ", version=" + getOvalVersion();
    }



//    /**
//     */
//    public static class ElementComparator
//    implements Comparator<Element>
//    {
//        public static final ElementComparator  INSTANCE = new ElementComparator();
//
//
//        public ElementComparator()
//        {
//        }
//
//
//
//        @Override
//        public int compare(
//                        final Element e1,
//                        final Element e2
//                        )
//        {
//            String  id1 = e1.getOvalID();
//            String  id2 = e2.getOvalID();
//            int  order = id1.compareTo( id2 );
//            if (order != 0) {
//                return order;
//            }
//
//            int  version1 = e1.getOvalVersion();
//            int  version2 = e2.getOvalVersion();
//            return (version1 - version2);
//        }
//
//
//
//        @Override
//        public boolean equals(
//                        final Object obj
//                        )
//        {
//            return (obj instanceof ElementComparator);
//        }
//    }

}
//Element
