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
package jp.go.aist.six.oval.model.linux;

import jp.go.aist.six.oval.model.OvalObject;



/**
 * The RpmInfoBehaviors defines a set of behaviors for controlling what data,
 * for installed rpms, is collected.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RpmInfoBehaviors.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmInfoBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_FILEPATHS = Boolean.FALSE;

    private Boolean  filepaths;
    //{optional, default='false'}



    /**
     * Constructor.
     */
    public RpmInfoBehaviors()
    {
    }



    /**
     */
    public void setFilepaths(
                    final Boolean filepaths
                    )
    {
        this.filepaths = filepaths;
    }


    public Boolean getFilepaths()
    {
        return filepaths;
    }


    public static final Boolean filepaths(
                    final RpmInfoBehaviors obj
                    )
    {
        Boolean  filepaths = obj.getFilepaths();
        return (filepaths == null ? DEFAULT_FILEPATHS : filepaths);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + filepaths( this ).hashCode();

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

        if (!(obj instanceof RpmInfoBehaviors)) {
            return false;
        }

        if (super.equals( obj )) {
            RpmInfoBehaviors  other = (RpmInfoBehaviors)obj;
            if (filepaths( this ) == filepaths( other )) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", filepaths="    + getFilepaths()
                        ;
    }

}
//RpmInfoBehaviors
