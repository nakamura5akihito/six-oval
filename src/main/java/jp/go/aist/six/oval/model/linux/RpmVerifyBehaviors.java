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
 * The RpmVerifyBehaviors defines a set of behaviors
 * that for controlling how installed rpms are verified.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RpmVerifyBehaviors.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.10:
 *             Replaced by the RpmVerifyFileBehaviors and the RpmVerifyPackageBehaviors
 *             and will be removed in version 6.0 of the language.
 */
@Deprecated
public class RpmVerifyBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_NODEPS         = Boolean.FALSE;
    public static final Boolean  DEFAULT_NODIGEST       = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOFILES        = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOSCRIPTS      = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOSIGNATURE    = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOLINKTO       = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOMD5          = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOSIZE         = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOUSER         = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOGROUP        = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOMTIME        = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOMODE         = Boolean.FALSE;
    public static final Boolean  DEFAULT_NORDEV         = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOCONFIGFILES  = Boolean.FALSE;
    public static final Boolean  DEFAULT_NOGHOSTFILES   = Boolean.FALSE;

    //{optional, default='false'}
    private Boolean  nodeps;
    private Boolean  nodigest;
    private Boolean  nofiles;
    private Boolean  noscripts;
    private Boolean  nosignature;
    private Boolean  nolinkto;
    private Boolean  nomd5;
    private Boolean  nosize;
    private Boolean  nouser;
    private Boolean  nogroup;
    private Boolean  nomtime;
    private Boolean  nomode;
    private Boolean  nordev;
    private Boolean  noconfigfiles;
    private Boolean  noghostfiles;




    /**
     * Constructor.
     */
    public RpmVerifyBehaviors()
    {
    }



    /**
     */
    public void setNodeps(
                    final Boolean nodeps
                    )
    {
        this.nodeps = nodeps;
    }


    public Boolean getNodeps()
    {
        return nodeps;
    }


    public static final Boolean nodeps(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nodeps = behaviors.getNodeps();

        return (nodeps == null ? DEFAULT_NODEPS : nodeps);
    }



    /**
     */
    public void setNodigest(
                    final Boolean nodigest
                    )
    {
        this.nodigest = nodigest;
    }


    public Boolean getNodigest()
    {
        return nodigest;
    }


    public static final Boolean nodigest(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nodigest = behaviors.getNodigest();

        return (nodigest == null ? DEFAULT_NODIGEST : nodigest);
    }



    /**
     */
    public void setNofiles(
                    final Boolean nofiles
                    )
    {
        this.nofiles = nofiles;
    }


    public Boolean getNofiles()
    {
        return nofiles;
    }


    public static final Boolean nofiles(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nofiles = behaviors.getNofiles();

        return (nofiles == null ? DEFAULT_NOFILES : nofiles);
    }



    /**
     */
    public void setNoscripts(
                    final Boolean noscripts
                    )
    {
        this.noscripts = noscripts;
    }


    public Boolean getNoscripts()
    {
        return noscripts;
    }


    public static final Boolean noscripts(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  noscripts = behaviors.getNoscripts();

        return (noscripts == null ? DEFAULT_NOSCRIPTS : noscripts);
    }



    /**
     */
    public void setNosignature(
                    final Boolean nosignature
                    )
    {
        this.nosignature = nosignature;
    }


    public Boolean getNosignature()
    {
        return nosignature;
    }


    public static final Boolean nosignature(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nosignature = behaviors.getNosignature();

        return (nosignature == null ? DEFAULT_NOSIGNATURE : nosignature);
    }



    /**
     */
    public void setNolinkto(
                    final Boolean nolinkto
                    )
    {
        this.nolinkto = nolinkto;
    }


    public Boolean getNolinkto()
    {
        return nolinkto;
    }


    public static final Boolean nolinkto(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nolinkto = behaviors.getNolinkto();

        return (nolinkto == null ? DEFAULT_NOLINKTO : nolinkto);
    }



    /**
     */
    public void setNomd5(
                    final Boolean nomd5
                    )
    {
        this.nomd5 = nomd5;
    }


    public Boolean getNomd5()
    {
        return nomd5;
    }


    public static final Boolean nomd5(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nomd5 = behaviors.getNomd5();

        return (nomd5 == null ? DEFAULT_NOMD5 : nomd5);
    }



    /**
     */
    public void setNosize(
                    final Boolean nosize
                    )
    {
        this.nosize = nosize;
    }


    public Boolean getNosize()
    {
        return nosize;
    }


    public static final Boolean nosize(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nosize = behaviors.getNosize();

        return (nosize == null ? DEFAULT_NOSIZE : nosize);
    }



    /**
     */
    public void setNouser(
                    final Boolean nouser
                    )
    {
        this.nouser = nouser;
    }


    public Boolean getNouser()
    {
        return nouser;
    }


    public static final Boolean nouser(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nouser = behaviors.getNouser();
        return (nouser == null ? DEFAULT_NOUSER : nouser);
    }



    /**
     */
    public void setNogroup(
                    final Boolean nogroup
                    )
    {
        this.nogroup = nogroup;
    }


    public Boolean getNogroup()
    {
        return nogroup;
    }


    public static final Boolean nogroup(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nogroup = behaviors.getNogroup();
        return (nogroup == null ? DEFAULT_NOGROUP : nogroup);
    }



    /**
     */
    public void setNomtime(
                    final Boolean nomtime
                    )
    {
        this.nomtime = nomtime;
    }


    public Boolean getNomtime()
    {
        return nomtime;
    }


    public static final Boolean nomtime(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nomtime = behaviors.getNomtime();
        return (nomtime == null ? DEFAULT_NOMTIME : nomtime);
    }



    /**
     */
    public void setNomode(
                    final Boolean nomode
                    )
    {
        this.nomode = nomode;
    }


    public Boolean getNomode()
    {
        return nomode;
    }


    public static final Boolean nomode(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nomode = behaviors.getNomtime();
        return (nomode == null ? DEFAULT_NOMODE : nomode);
    }



    /**
     */
    public void setNordev(
                    final Boolean nordev
                    )
    {
        this.nordev = nordev;
    }


    public Boolean getNordev()
    {
        return nordev;
    }


    public static final Boolean nordev(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  nordev = behaviors.getNordev();
        return (nordev == null ? DEFAULT_NORDEV : nordev);
    }



    /**
     */
    public void setNoconfigfiles(
                    final Boolean noconfigfiles
                    )
    {
        this.noconfigfiles = noconfigfiles;
    }


    public Boolean getNoconfigfiles()
    {
        return noconfigfiles;
    }


    public static final Boolean noconfigfiles(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  noconfigfiles = behaviors.getNordev();
        return (noconfigfiles == null ? DEFAULT_NOCONFIGFILES : noconfigfiles);
    }



    /**
     */
    public void setNoghostfiles(
                    final Boolean noghostfiles
                    )
    {
        this.noghostfiles = noghostfiles;
    }


    public Boolean getNoghostfiles()
    {
        return noghostfiles;
    }


    public static final Boolean noghostfiles(
                    final RpmVerifyBehaviors behaviors
                    )
    {
        Boolean  noghostfiles = behaviors.getNordev();
        return (noghostfiles == null ? DEFAULT_NOGHOSTFILES : noghostfiles);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + nodeps( this ).hashCode();
        result = prime * result + nodigest( this ).hashCode();
        result = prime * result + nofiles( this ).hashCode();
        result = prime * result + noscripts( this ).hashCode();
        result = prime * result + nosignature( this ).hashCode();
        result = prime * result + nolinkto( this ).hashCode();
        result = prime * result + nomd5( this ).hashCode();
        result = prime * result + nosize( this ).hashCode();
        result = prime * result + nouser( this ).hashCode();
        result = prime * result + nogroup( this ).hashCode();
        result = prime * result + nomtime( this ).hashCode();
        result = prime * result + nomode( this ).hashCode();
        result = prime * result + nordev( this ).hashCode();
        result = prime * result + noconfigfiles( this ).hashCode();
        result = prime * result + noghostfiles( this ).hashCode();

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

        if (!(obj instanceof RpmVerifyBehaviors)) {
            return false;
        }

        if (super.equals( obj )) {
            RpmVerifyBehaviors  other = (RpmVerifyBehaviors)obj;
            if (nodeps( this ) == nodeps( other )
                            && nodigest( this ) == nodigest( other )
                            && nofiles( this ) == nofiles( other )
                            && noscripts( this ) == noscripts( other )
                            && nosignature( this ) == nosignature( other )
                            && nolinkto( this ) == nolinkto( other )
                            && nomd5( this ) == nomd5( other )
                            && nosize( this ) == nosize( other )
                            && nouser( this ) == nouser( other )
                            && nogroup( this ) == nogroup( other )
                            && nomtime( this ) == nomtime( other )
                            && nomode( this ) == nomode( other )
                            && nordev( this ) == nordev( other )
                            && noconfigfiles( this ) == noconfigfiles( other )
                            && noghostfiles( this ) == noghostfiles( other )
                            ) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", nodeps="           + getNodeps()
                        + ", nodigest="         + getNodigest()
                        + ", nofiles="          + getNofiles()
                        + ", noscripts="        + getNoscripts()
                        + ", nosignature="      + getNosignature()
                        + ", nolinkto="         + getNolinkto()
                        + ", nomd5="            + getNomd5()
                        + ", nosize="           + getNosize()
                        + ", nouser="           + getNouser()
                        + ", nogroup="          + getNogroup()
                        + ", nomtime="          + getNomtime()
                        + ", nomode="           + getNomode()
                        + ", nordev="           + getNordev()
                        + ", noconfigfiles="    + getNoconfigfiles()
                        + ", noghostfiles="     + getNoghostfiles()
                        ;
    }

}
//RpmVerifyBehaviors
