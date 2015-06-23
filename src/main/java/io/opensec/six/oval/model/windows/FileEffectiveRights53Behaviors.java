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
package io.opensec.six.oval.model.windows;



/**
 * The FileEffectiveRights53Behaviors defines a number of behaviors
 * that allow a more detailed definition of the fileeffectiverights53_object being specified.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileEffectiveRights53Behaviors
extends AbstractFileAuthBehaviors
//    extends FileBehaviors
{

//    public static final Boolean  DEFAULT_INCLUDE_GROUP = Boolean.TRUE;
//
//    private Boolean  include_group;
//    //{optional, default='true'}
//
//
//    public static final Boolean  DEFAULT_RESOLVE_GROUP = Boolean.FALSE;
//
//    private Boolean  resolve_group;
//    //{optional, default='false'}



    /**
     * Constructor.
     */
    public FileEffectiveRights53Behaviors()
    {
    }



//    /**
//     */
//    public void setIncludeGroup(
//                    final Boolean include_group
//                    )
//    {
//        this.include_group = include_group;
//    }
//
//
//    public Boolean getIncludeGroup()
//    {
//        return include_group;
//    }
//
//
//    public static final Boolean includeGroup(
//                    final FileEffectiveRights53Behaviors obj
//                    )
//    {
//        Boolean  include_group = obj.getIncludeGroup();
//        return (include_group == null ? DEFAULT_INCLUDE_GROUP : include_group);
//    }
//
//
//
//    /**
//     */
//    public void setResolveGroup(
//                    final Boolean resolve_group
//                    )
//    {
//        this.resolve_group = resolve_group;
//    }
//
//
//    public Boolean getResolveGroup()
//    {
//        return resolve_group;
//    }
//
//
//    public static final Boolean resolveGroup(
//                    final FileEffectiveRights53Behaviors obj
//                    )
//    {
//        Boolean  resolve_group = obj.getResolveGroup();
//        return (resolve_group == null ? DEFAULT_RESOLVE_GROUP : resolve_group);
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
//        final int  prime = 37;
//        int  result = 17;
//
//        result = prime * result + includeGroup( this ).hashCode();
//        result = prime * result + resolveGroup( this ).hashCode();
//
//        return result;

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

        if (!(obj instanceof FileEffectiveRights53Behaviors)) {
            return false;
        }

//        if (super.equals( obj )) {
//            FileEffectiveRights53Behaviors  other = (FileEffectiveRights53Behaviors)obj;
//            if (includeGroup( this ) == includeGroup( other )) {
//                if (resolveGroup( this ) == resolveGroup( other )) {
//                	return true;
//                }
//            }
//        }
//
//        return false;

        return super.equals( obj );
    }



//    @Override
//    public String toString()
//    {
//        return super.toString()
//                        + ", include_group=" + getIncludeGroup()
//                        + ", resolve_group=" + getResolveGroup()
//                        ;
//    }

}
//FileEffectiveRights53Behaviors
