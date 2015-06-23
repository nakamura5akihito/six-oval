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
package io.opensec.six.oval.model.common;

import io.opensec.six.oval.model.OvalObject;




/**
 * The DeprecatedInfoType complex type defines a structure 
 * that will be used to flag schema-defined constructs as deprecated. 
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DeprecatedInfoType
    implements OvalObject
{

    private Integer  version;
    //{1..1}
    
    private String  reason;
    //{1..1}
    
    private String  comment;
    //{0..1}
    


    /**
     * Constructor.
     */
    public DeprecatedInfoType()
    {
    }



    /**
     */
    public void setVersion(
                    final Integer version
                    )
    {
        this.version = version;
    }


    public Integer getVersion()
    {
        return version;
    }



    /**
     */
    public void setReason(
                    final String reason
                    )
    {
        this.reason = reason;
    }


    public String getReason()
    {
        return reason;
    }



    /**
     */
    public void setComment(
                    final String comment
                    )
    {
        this.comment = comment;
    }


    public String getComment()
    {
        return comment;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[version=" 	+ getVersion()
             + ", reason" 	+ getReason()
             + ", comment" 	+ getComment()
             + "]";
    }

}
//
