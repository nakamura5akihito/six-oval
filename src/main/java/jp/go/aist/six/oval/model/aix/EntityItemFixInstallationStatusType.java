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
package jp.go.aist.six.oval.model.aix;

import jp.go.aist.six.oval.model.sc.EntityItemStringType;



/**
 * The EntityStateFixInstallationStatusType defines the different values
 * that are valid for the installation_status entity of a fix_state item.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityItemFixInstallationStatusType.java 3148 2013-05-13 07:59:01Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemFixInstallationStatusType
    extends EntityItemStringType
{

    /**
     * Constructor.
     */
    public EntityItemFixInstallationStatusType()
    {
    }


    public EntityItemFixInstallationStatusType(
                    final String content
                    )
    {
        super( content );
    }


    public EntityItemFixInstallationStatusType(
                    final FixInstallationStatusEnumeration content
                    )
    {
        super( (content == null ? null : content.value()) );
    }



    //**************************************************************
    //  EntityItemBase
    //**************************************************************

    @Override
    public void setContent(
                    final String content
                    )
    {
        if (content != null) {
            //validation
            FixInstallationStatusEnumeration.fromValue( content );
        }

        super.setContent( content );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityItemFixInstallationStatusType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
