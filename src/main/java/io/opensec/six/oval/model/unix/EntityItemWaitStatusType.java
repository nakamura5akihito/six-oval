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
package io.opensec.six.oval.model.unix;

import io.opensec.six.oval.model.sc.EntityItemStringType;



/**
 * The EntityItemWaitStatusType restricts a string value to two values,
 * either wait or nowait, that specify whether the server that is invoked by inetd
 * will take over the listening socket associated with the service,
 * and whether once launched, inetd will wait for that server to exit, if ever,
 * before it resumes listening for new service requests.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemWaitStatusType
    extends EntityItemStringType
{

    /**
     * Constructor.
     */
    public EntityItemWaitStatusType()
    {
    }


    public EntityItemWaitStatusType(
                    final String content
                    )
    {
        super( content );
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
            // validation
            WaitStatusEnumeration.fromValue( content );
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

        if (!(obj instanceof EntityItemWaitStatusType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//EntityItemWaitStatusType
