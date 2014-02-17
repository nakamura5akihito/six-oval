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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.OvalObject;



/**
 * All the metadata available to an OVAL Definition.
 * Additional metadata is also allowed although it is not
 * part of the official OVAL Schema.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: MetadataType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 */
public class MetadataType
    implements OvalObject
{

    private String  title;
    //{1..1}


    private final Collection<AffectedType>  affected = new ArrayList<AffectedType>();
    //{0..*}
//    private AffectedType  affected;
    //NOTE: So far, we found NO definition with multiple 'affected' elements.


    private final Collection<ReferenceType>  reference =
        new ArrayList<ReferenceType>();
    //{0..*}


    private String  description;
    //{1..1}


    private final Collection<OvalObject>  additionalMetadata =
        new ArrayList<OvalObject>();
//    private final Collection<MetadataItem>  additionalMetadata =
//        new ArrayList<MetadataItem>();
    //{xsd:any, 0..*}



    /**
     * Constructor.
     */
    public MetadataType()
    {
    }


    public MetadataType(
                    final String title,
                    final String description
                    )
    {
        setTitle( title );
        setDescription( description );
    }



    /**
     */
    public void setTitle(
                    final String title
                    )
    {
        this.title = title;
    }


    public String getTitle()
    {
        return title;
    }


    public MetadataType title(
                    final String title
                    )
    {
        setTitle( title );
        return this;
    }



    /**
     */
    public void setAffected(
                    final Collection<? extends AffectedType> affectedSequence
                    )
    {
        if (affectedSequence != affected) {
            affected.clear();
            if (affectedSequence != null  &&  affectedSequence.size() > 0) {
                affected.addAll( affectedSequence );
            }
        }
    }


    public Collection<AffectedType> getAffected()
    {
        return affected;
    }


    public boolean addAffected(
                    final AffectedType affected
                    )
    {
        return this.affected.add( affected );
    }


    public Iterator<AffectedType> iterateAffected()
    {
        return affected.iterator();
    }


    public MetadataType affected(
                    final AffectedType reference
                    )
    {
        affected.add( reference );
        return this;
    }

//    /**
//     */
//    public void setAffected(
//                    final AffectedType affected
//                    )
//    {
//        this.affected = affected;
//    }
//
//
//    public AffectedType getAffected()
//    {
//        return this.affected;
//    }
//
//
//    public MetadataType affected(
//                    final AffectedType affected
//                    )
//    {
//        setAffected( affected );
//        return this;
//    }



    /**
     */
    public void setReference(
                    final Collection<? extends ReferenceType> references
                    )
    {
        if (references != reference) {
            reference.clear();
            if (references != null  &&  references.size() > 0) {
                reference.addAll( references );
            }
        }
    }


    public Collection<ReferenceType> getReference()
    {
        return reference;
    }


    public Iterator<ReferenceType> iterateReference()
    {
        return reference.iterator();
    }


    public boolean addReference(
                    final ReferenceType reference
                    )
    {
        return this.reference.add( reference );
    }


    public MetadataType reference(
                    final ReferenceType reference
                    )
    {
        this.reference.add( reference );
        return this;
    }



    /**
     */
    public void setDescription(
                    final String description
                    )
    {
        this.description= description;
    }


    public String getDescription()
    {
        return description;
    }


    public MetadataType description(
                    final String description
                    )
    {
        setDescription( description );
        return this;
    }



    /**
     */
    public void setAdditionalMetadata(
                    final Collection<? extends OvalObject> items
                    )
    {
        if (items != additionalMetadata) {
            additionalMetadata.clear();
            if (items != null  &&  items.size() > 0) {
                additionalMetadata.addAll( items );
            }
        }
    }


    public Collection<OvalObject> getAdditionalMetadata()
    {
        return additionalMetadata;
    }


    public Iterator<OvalObject> iterateAdditionalMetadata()
    {
        return additionalMetadata.iterator();
    }


    public boolean addAdditionalMetadata(
                    final OvalObject item
                    )
    {
        return additionalMetadata.add( item );
    }



//    /**
//     */
//    public void setAdditionalMetadata(
//                    final Collection<? extends MetadataItem> items
//                    )
//    {
//        if (items != this.additionalMetadata) {
//            this.additionalMetadata.clear();
//            if (items != null  &&  items.size() > 0) {
//                this.additionalMetadata.addAll( items );
//            }
//        }
//    }
//
//
//    public Collection<MetadataItem> getAdditionalMetadata()
//    {
//        return this.additionalMetadata;
//    }
//
//
//    public Iterator<MetadataItem> iterateAdditionalMetadata()
//    {
//        return this.additionalMetadata.iterator();
//    }
//
//
//    public boolean addAdditionalMetadata(
//                    final MetadataItem item
//                    )
//    {
//        return this.additionalMetadata.add( item );
//    }
//
//
//    public MetadataType additionalMetadata(
//                    final MetadataItem item
//                    )
//    {
//        this.additionalMetadata.add( item );
//        return this;
//    }


    //==============================================================
    //  SIX: extended properties
    //==============================================================

//    /**
//     * TODO: move these methods to store package,
//     * maybe StoreWorker, JdoCallbackHandler and OvalModelUtil classes.
//     */
//
//    /**
//     * Returns the last modified date of this definition.
//     * For a definition in Mitre OVAL repository, it is retrieved
//     * from the latest "oval_repository/dates/" element.
//     * For a Red Hat definition, it is retrieved
//     * from the "advisory/updated" element.
//     */
//    public String getLastModifiedDate()
//    {
//        String  lastModifiedDate = null;
//
//        Collection<MetadataItem>  items = getAdditionalMetadata();
//        if (items != null  &&  items.size() > 0) {
//            for (MetadataItem  item : items) {
//                String  itemDate = _getLastModifiedDate( item );
//                if (lastModifiedDate == null
//                                    ||  lastModifiedDate.compareTo( itemDate ) < 0) {
//                    lastModifiedDate = itemDate;
//                }
//            }
//        }
//
//        return lastModifiedDate;
//    }
//
//
//    private String _getLastModifiedDate(
//                    final MetadataItem item
//                    )
//    {
//        String  lastModifiedDate = null;
//
//        if (item instanceof OvalRepository) {
//            // Mitre OVAL repository
//            OvalRepository  or = OvalRepository.class.cast( item );
//            for (Event  event : or.getEvent()) {
//                if (lastModifiedDate == null  &&  (event instanceof Submitted)) {
//                    lastModifiedDate = event.getDate();
//                } else if (event instanceof Modified) {
//                    String  eventDate = event.getDate();
//                    if (lastModifiedDate == null
//                                    ||  lastModifiedDate.compareTo( eventDate ) < 0) {
//                        lastModifiedDate = eventDate;
//                    }
//                }
//
//            }
//            if (lastModifiedDate != null) {
//                lastModifiedDate = lastModifiedDate.substring( 0, 10 );
//            }
//        } else if (item instanceof LinuxSecurityAdvisory) {
//            // Red Hat definition
//            LinuxSecurityAdvisory  adv = LinuxSecurityAdvisory.class.cast( item );
//            lastModifiedDate = adv.getUpdated();
//        }
//
//        return lastModifiedDate;
//    }



//    /**
//     */
//    public Collection<Cve> getRelatedCve()
//    {
//        Set<Cve>  cves = new HashSet<Cve>();
//        final String  cveSource = "CVE";
//
//        // Mitre OVAL repository
//        Collection<ReferenceType>  references = getReference();
//        if (references != null  &&  references.size() > 0) {
//            for (ReferenceType  ref : references) {
//                if (cveSource.equals( ref.getSource() )) {
//                    Cve  cve = new Cve( ref.getRefID() );
//                    cves.add( cve );
//                }
//            }
//        }
//
//        // Red Hat definition
//        Collection<MetadataItem>  items = getAdditionalMetadata();
//        if (items != null  &&  items.size() > 0) {
//            for (MetadataItem  item : items) {
//                if (item instanceof LinuxSecurityAdvisory) {
//                    LinuxSecurityAdvisory  advisory = (LinuxSecurityAdvisory)item;
//                    for (CveReference  ref : advisory.getCve()) {
//                        Cve  cve = new Cve( ref.getRefID() );
//                        cves.add( cve );
//                    }
//                }
//            }
//        }
//
//        return cves;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[title=" + getTitle()
                        + ", affected=" + getAffected()
                        + ", description=(omitted)" //+ getDescription()
                        + ", reference=" + getReference()
                        + ", additionalMetadata=" + getAdditionalMetadata()
                        + "]";
    }

}
// MetadataType
