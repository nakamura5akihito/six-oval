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
 * The RpmVerifyFileBehaviors defines a set of behaviors
 * that for controlling how the individual files in installed rpms are verified.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: RpmVerifyFileBehaviors.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmVerifyFileBehaviors
    implements OvalObject
{

    public static final Boolean  DEFAULT_NOLINKTO = Boolean.FALSE;
    private Boolean  nolinkto;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOMD5 = Boolean.FALSE;
    private Boolean  nomd5;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOSIZE = Boolean.FALSE;
    private Boolean  nosize;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOUSER = Boolean.FALSE;
    private Boolean  nouser;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOGROUP = Boolean.FALSE;
    private Boolean  nogroup;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOMTIME = Boolean.FALSE;
    private Boolean  nomtime;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOMODE = Boolean.FALSE;
    private Boolean  nomode;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NORDEV = Boolean.FALSE;
    private Boolean  nordev;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOCONFIGFILES = Boolean.FALSE;
    private Boolean  noconfigfiles;
    //{optional, default="false"}

    public static final Boolean  DEFAULT_NOGHOSTFILES = Boolean.FALSE;
    private Boolean  noghostfiles;
    //{optional, default="false"}



    /**
     * Constructor.
     */
    public RpmVerifyFileBehaviors()
    {
    }



    /**
     */
    public void setNoLinkto(
                    final Boolean nolinkto
                    )
    {
        this.nolinkto = nolinkto;
    }


    public Boolean getNoLinkto()
    {
        return nolinkto;
    }


    public static final Boolean noLinkto(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nolinkto = obj.getNoLinkto();

        return (nolinkto == null ? DEFAULT_NOLINKTO : nolinkto);
    }



    /**
     */
    public void setNoMd5(
                    final Boolean nomd5
                    )
    {
        this.nomd5 = nomd5;
    }


    public Boolean getNoMd5()
    {
        return nomd5;
    }


    public static final Boolean noMd5(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nomd5 = obj.getNoMd5();
        return (nomd5 == null ? DEFAULT_NOMD5 : nomd5);
    }



    /**
     */
    public void setNoSize(
                    final Boolean nosize
                    )
    {
        this.nosize = nosize;
    }


    public Boolean getNoSize()
    {
        return nosize;
    }


    public static final Boolean noSize(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nosize = obj.getNoSize();
        return (nosize == null ? DEFAULT_NOSIZE : nosize);
    }



    /**
     */
    public void setNoUser(
                    final Boolean nouser
                    )
    {
        this.nouser = nouser;
    }


    public Boolean getNoUser()
    {
        return nouser;
    }


    public static final Boolean noUser(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nouser = obj.getNoUser();
        return (nouser == null ? DEFAULT_NOUSER : nouser);
    }



    /**
     */
    public void setNoGroup(
                    final Boolean nogroup
                    )
    {
        this.nogroup = nogroup;
    }


    public Boolean getNoGroup()
    {
        return nogroup;
    }


    public static final Boolean noGroup(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nogroup = obj.getNoGroup();
        return (nogroup == null ? DEFAULT_NOGROUP : nogroup);
    }



    /**
     */
    public void setNoMtime(
                    final Boolean nomtime
                    )
    {
        this.nomtime = nomtime;
    }


    public Boolean getNoMtime()
    {
        return nomtime;
    }


    public static final Boolean noMtime(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nomtime = obj.getNoMtime();
        return (nomtime == null ? DEFAULT_NOMTIME : nomtime);
    }



    /**
     */
    public void setNoMode(
                    final Boolean nomode
                    )
    {
        this.nomode = nomode;
    }


    public Boolean getNoMode()
    {
        return nomode;
    }


    public static final Boolean noMode(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nomode = obj.getNoMode();
        return (nomode == null ? DEFAULT_NOMODE : nomode);
    }



    /**
     */
    public void setNoRdev(
                    final Boolean nordev
                    )
    {
        this.nordev = nordev;
    }


    public Boolean getNoRdev()
    {
        return nordev;
    }


    public static final Boolean noRdev(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  nordev = obj.getNoRdev();
        return (nordev == null ? DEFAULT_NORDEV : nordev);
    }



    /**
     */
    public void setNoConfigFiles(
                    final Boolean noconfigfiles
                    )
    {
        this.noconfigfiles = noconfigfiles;
    }


    public Boolean getNoConfigFiles()
    {
        return noconfigfiles;
    }


    public static final Boolean noConfigFiles(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  noconfigfiles = obj.getNoConfigFiles();
        return (noconfigfiles == null ? DEFAULT_NOCONFIGFILES : noconfigfiles);
    }



    /**
     */
    public void setNoGhostFiles(
                    final Boolean noghostfiles
                    )
    {
        this.noghostfiles = noghostfiles;
    }


    public Boolean getNoGhostFiles()
    {
        return noghostfiles;
    }


    public static final Boolean noGhostFiles(
                    final RpmVerifyFileBehaviors obj
                    )
    {
        Boolean  noghostfiles = obj.getNoGhostFiles();
        return (noghostfiles == null ? DEFAULT_NOGHOSTFILES : noghostfiles);
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + noLinkto( this ).hashCode();
        result = prime * result + noMd5( this ).hashCode();
        result = prime * result + noSize( this ).hashCode();
        result = prime * result + noUser( this ).hashCode();
        result = prime * result + noGroup( this ).hashCode();
        result = prime * result + noMtime( this ).hashCode();
        result = prime * result + noMode( this ).hashCode();
        result = prime * result + noRdev( this ).hashCode();
        result = prime * result + noConfigFiles( this ).hashCode();
        result = prime * result + noGhostFiles( this ).hashCode();

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

        if (!(obj instanceof RpmVerifyFileBehaviors)) {
            return false;
        }

        RpmVerifyFileBehaviors  other = (RpmVerifyFileBehaviors)obj;
        if (noLinkto( this ) == noLinkto( other )
                        &&  (noMd5( this ) == noMd5( other ))
                        &&  (noSize( this ) == noSize( other ))
                        &&  (noUser( this ) == noUser( other ))
                        &&  (noGroup( this ) == noGroup( other ))
                        &&  (noMtime( this ) == noMtime( other ))
                        &&  (noMode( this ) == noMode( other ))
                        &&  (noRdev( this ) == noRdev( other ))
                        &&  (noConfigFiles( this ) == noConfigFiles( other ))
                        &&  (noGhostFiles( this ) == noGhostFiles( other ))
                        ) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[nolinkto=" + getNoLinkto()
                        + ", nomd5="            + getNoMd5()
                        + ", nosize="           + getNoSize()
                        + ", nouser="           + getNoUser()
                        + ", nogroup="          + getNoGroup()
                        + ", nomtime="          + getNoMtime()
                        + ", nomode="           + getNoMode()
                        + ", nordev="           + getNoRdev()
                        + ", noconfigfiles="    + getNoConfigFiles()
                        + ", noghostfiles="     + getNoGhostFiles()
                        + "]";
    }

}
//
