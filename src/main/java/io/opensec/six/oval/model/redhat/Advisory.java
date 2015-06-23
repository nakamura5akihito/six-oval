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
package io.opensec.six.oval.model.redhat;

import io.opensec.six.oval.model.AffectedCpeList;
import io.opensec.six.oval.model.definitions.MetadataItem;
import java.util.ArrayList;
import java.util.Collection;



/**
 * A Red Hat security advisory.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Advisory
    extends MetadataItem
{

    private String  from;
    private SeverityEnumeration  severity;
    private String  rights;

    private Issued  issued;
    private Updated  updated;

    private final Collection<Cve>  cve = new ArrayList<Cve>();
    private final Collection<Bugzilla>  bugzilla = new ArrayList<Bugzilla>();
    private AffectedCpeList  affected_cpe_list;




    /**
     * Constructor.
     */
    public Advisory()
    {
    }



    /**
     */
    public void setFrom(
                    final String from
                    )
    {
        this.from = from;
    }


    public String getFrom()
    {
        return from;
    }



    /**
     */
    public void setSeverity(
                    final SeverityEnumeration severity
                    )
    {
        this.severity = severity;
    }


    public SeverityEnumeration getSeverity()
    {
        return severity;
    }



    /**
     */
    public void setRights(
                    final String rights
                    )
    {
        this.rights = rights;
    }


    public String getRights()
    {
        return rights;
    }



    /**
     */
    public void setIssued(
                    final Issued issued
                    )
    {
        this.issued = issued;
    }


    public Issued getIssued()
    {
        return issued;
    }



    /**
     */
    public void setUpdated(
                    final Updated updated
                    )
    {
        this.updated = updated;
    }


    public Updated getUpdated()
    {
        return updated;
    }



    /**
     */
    public void setCve(
                    final Collection<? extends Cve> cveList
                    )
    {
        if (cveList != cve) {
            cve.clear();
            if (cveList != null  &&  cveList.size() > 0) {
                cve.addAll( cveList );
            }
        }
    }


    public boolean addCve(
                    final Cve cve
                    )
    {
        return this.cve.add( cve );
    }


    public Collection<Cve> getCve()
    {
        return cve;
    }



    /**
     */
    public void setBugzilla(
                    final Collection<? extends Bugzilla> bugzillaList
                    )
    {
        if (bugzillaList != bugzilla) {
            bugzilla.clear();
            if (bugzillaList != null  &&  bugzillaList.size() > 0) {
                bugzilla.addAll( bugzillaList );
            }
        }
    }


    public boolean addBugzilla(
                    final Bugzilla bugzilla
                    )
    {
        return this.bugzilla.add( bugzilla );
    }


    public Collection<Bugzilla> getBugzilla()
    {
        return bugzilla;
    }



    /**
     */
    public void setAffectedCpeList(
                    final AffectedCpeList affected_cpe_list
                    )
    {
        this.affected_cpe_list = affected_cpe_list;
    }


    public AffectedCpeList getAffectedCpeList()
    {
        return affected_cpe_list;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "advisory[from=" + getFrom()
                        + ", severity=" + getSeverity()
                        + ", rights=" + getRights()
                        + ", " + getIssued()
                        + ", " + getUpdated()
                        + ", " + getCve()
                        + ", " + getBugzilla()
                        + ", " + getAffectedCpeList()
                        + "]";
    }

}
//Advisory
