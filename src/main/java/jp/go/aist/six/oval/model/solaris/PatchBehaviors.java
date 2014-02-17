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
package jp.go.aist.six.oval.model.solaris;

import jp.go.aist.six.oval.model.OvalObject;



/**
 * The PatchBehaviors complex type defines a number of behaviors that allow
 * a more detailed definition of the patch_object being specified.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: PatchBehaviors.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PatchBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_SUPERSEDENCE = Boolean.FALSE;

    private Boolean  supersedence;
    //{optional, default="false"}



    /**
     * Constructor.
     */
    public PatchBehaviors()
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
                    final PatchBehaviors obj
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

        if (!(obj instanceof PatchBehaviors)) {
            return false;
        }

        PatchBehaviors  other = (PatchBehaviors)obj;
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
