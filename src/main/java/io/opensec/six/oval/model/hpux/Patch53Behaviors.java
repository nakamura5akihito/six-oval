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
package io.opensec.six.oval.model.hpux;

import io.opensec.six.oval.model.OvalObject;



/**
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Patch53Behaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_SUPERSEDENCE = Boolean.FALSE;

    private Boolean  supersedence;
    //{optional, default="false"}



    /**
     * Constructor.
     */
    public Patch53Behaviors()
    {
    }



    /**
     */
    public void setSupersedence(
                    final Boolean supersedence
                    )
    {
        this.supersedence = supersedence;
    }


    public Boolean getSupersedence()
    {
        return supersedence;
    }


    public static final Boolean supersedence(
                    final Patch53Behaviors obj
                    )
    {
        Boolean  supersedence = obj.getSupersedence();
        return (supersedence == null ? DEFAULT_SUPERSEDENCE : supersedence);
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + supersedence( this ).hashCode();

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

        if (!(obj instanceof Patch53Behaviors)) {
            return false;
        }

        Patch53Behaviors  other = (Patch53Behaviors)obj;
        if (supersedence( this ) == supersedence( other )) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[supersedence=" + getSupersedence()
                        + "]";
    }

}
//
