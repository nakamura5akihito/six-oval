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
package jp.go.aist.six.oval.model.windows;



/**
 * The RegkeyEffectiveRightsBehaviors defines a number of behaviors
 * that allow a more detailed definition of the registrykeyeffectiverights object
 * being specified.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegkeyEffectiveRightsBehaviors.java 3058 2013-02-25 01:33:26Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.3:
 *             Replaced by the RegkeyEffectiveRightsBehaviors53 and
 *             will be removed in version 6.0 of the language.
 */
@Deprecated
public class RegkeyEffectiveRightsBehaviors
    extends AbstractRegistryAuthBehaviors
//    extends RegistryBehaviors
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
    public RegkeyEffectiveRightsBehaviors()
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
//                    final RegkeyEffectiveRightsBehaviors obj
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
//                    final RegkeyEffectiveRightsBehaviors obj
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

        if (!(obj instanceof RegkeyEffectiveRightsBehaviors)) {
            return false;
        }

//        if (super.equals( obj )) {
//            RegkeyEffectiveRightsBehaviors  other = (RegkeyEffectiveRightsBehaviors)obj;
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
//RegkeyEffectiveRightsBehaviors
