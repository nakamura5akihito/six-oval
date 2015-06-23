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

import io.opensec.six.oval.model.OvalObject;



/**
 * A reference to a Bugzilla entry.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Bugzilla
    implements OvalObject
{

    private String  id;
    private String  href;
    private String  title;



    /**
     * Constructor.
     */
    public Bugzilla()
    {
    }


    public Bugzilla(
                    final String id,
                    final String href,
                    final String title
                    )
    {
        setId( id );
        setHref( href );
        setTitle( title );
    }



    /**
     */
    public void setId(
                    final String id
                    )
    {
        this.id = id;
    }


    public String getId()
    {
        return id;
    }



    /**
     */
    public void setHref(
                    final String href
                    )
    {
        this.href = href;
    }


    public String getHref()
    {
        return href;
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



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "bugzilla[id=" + getId()
                        + ", href=" + getHref()
                        + ", title=" + getTitle()
                        + "]";
    }

}
//Bugzilla
