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
package io.opensec.six.oval.model.linux;

import io.opensec.six.oval.model.OvalObject;



/**
 * The RpmVerifyPackageBehaviors complex type defines a set of behaviors
 * that for controlling how installed rpms are verified.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmVerifyPackageBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_NODEPS = Boolean.FALSE;
    private Boolean  nodeps;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NODIGEST = Boolean.FALSE;
    private Boolean  nodigest;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOSCRIPTS = Boolean.FALSE;
    private Boolean  noscripts;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOSIGNATURE = Boolean.FALSE;
    private Boolean  nosignature;
    //{optional, default="false"}



    /**
     * Constructor.
     */
    public RpmVerifyPackageBehaviors()
    {
    }



    /**
     */
    public void setNoDeps(
                    final Boolean nodeps
                    )
    {
        this.nodeps = nodeps;
    }


    public Boolean getNoDeps()
    {
        return nodeps;
    }


    public static final Boolean noDeps(
                    final RpmVerifyPackageBehaviors obj
                    )
    {
        final Boolean  nodeps = obj.getNoDeps();
        return (nodeps == null ? DEFAULT_NODEPS : nodeps);
    }



    /**
     */
    public void setNoDigest(
                    final Boolean nodigest
                    )
    {
        this.nodigest = nodigest;
    }


    public Boolean getNoDigest()
    {
        return nodigest;
    }


    public static final Boolean noDigest(
                    final RpmVerifyPackageBehaviors obj
                    )
    {
        final Boolean  nodigest = obj.getNoDigest();
        return (nodigest == null ? DEFAULT_NODIGEST : nodigest);
    }



    /**
     */
    public void setNoScripts(
                    final Boolean noscripts
                    )
    {
        this.noscripts = noscripts;
    }


    public Boolean getNoScripts()
    {
        return noscripts;
    }


    public static final Boolean noScripts(
                    final RpmVerifyPackageBehaviors obj
                    )
    {
        final Boolean  noscripts = obj.getNoScripts();
        return (noscripts == null ? DEFAULT_NOSCRIPTS : noscripts);
    }



    /**
     */
    public void setNoSignature(
                    final Boolean nosignature
                    )
    {
        this.nosignature = nosignature;
    }


    public Boolean getNoSignature()
    {
        return nosignature;
    }


    public static final Boolean noSignature(
                    final RpmVerifyPackageBehaviors obj
                    )
    {
        final Boolean  nosignature = obj.getNoSignature();
        return (nosignature == null ? DEFAULT_NOSIGNATURE : nosignature);
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + noDeps( this ).hashCode();
        result = prime * result + noDigest( this ).hashCode();
        result = prime * result + noScripts( this ).hashCode();
        result = prime * result + noSignature( this ).hashCode();

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

        if (!(obj instanceof RpmVerifyPackageBehaviors)) {
            return false;
        }

        RpmVerifyPackageBehaviors  other = (RpmVerifyPackageBehaviors)obj;
        if (noDeps( this ) == noDeps( other )
                        &&  (noDigest( this ) == noDigest( other ))
                        &&  (noScripts( this ) == noScripts( other ))
                        &&  (noSignature( this ) == noSignature( other ))
                        ) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[nodeps=" + getNoDeps()
                        + ", nodigest="     + getNoDigest()
                        + ", noscript="     + getNoScripts()
                        + ", nosignature="  + getNoSignature()
                        + "]";
    }

}
//
