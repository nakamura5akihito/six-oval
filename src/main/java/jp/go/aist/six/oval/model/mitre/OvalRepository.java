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
package jp.go.aist.six.oval.model.mitre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.AffectedCpeList;
import jp.go.aist.six.oval.model.definitions.MetadataItem;



/**
 * A history of the OVAL Definition in the Mitre's OVAL repository.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalRepository.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class OvalRepository
    extends MetadataItem
{

    private final Collection<Event>  dates = new ArrayList<Event>();

    private DefinitionStatusEnumeration  status;


//    @Transient
    private AffectedCpeList  affected_cpe_list;



    /**
     * Constructor.
     */
    public OvalRepository()
    {
    }



    /**
     */
    public void setDates(
                    final Collection<? extends Event> events
                    )
    {
        if (events != dates) {
            dates.clear();
            if (events != null  &&  events.size() > 0) {
                dates.addAll( events );
            }
        }
    }


    public Collection<Event> getDates()
    {
        return dates;
    }


    public Iterator<Event> iterateDates()
    {
        return dates.iterator();
    }


    public OvalRepository date(
                    final Event event
                    )
    {
        dates.add( event );
        return this;
    }



    /**
     */
    public void setStatus(
                    final DefinitionStatusEnumeration status
                    )
    {
        this.status = status;
    }


    public DefinitionStatusEnumeration getStatus()
    {
        return status;
    }


    public OvalRepository status(
                    final DefinitionStatusEnumeration status
                    )
    {
        setStatus( status );
        return this;
    }



    /**
     */
    public void setAffectedCpeList(
                    final AffectedCpeList affectedCpeList
                    )
    {
        affected_cpe_list = affectedCpeList;
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
        return "oval_repository[status=" + getStatus()
                        + ", dates=" + getDates()
                        + ", affected_cpe_list=" + getAffectedCpeList()
                        + "]";
    }

}
//OvalRepository
