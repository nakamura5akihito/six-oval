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
package jp.go.aist.six.oval.model.independent;

import java.util.Collection;
import java.util.Collections;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The environmentvariable58_object is used by an environmentvariable_test
 * to define the specific environment variable(s) and process IDs to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EnvironmentVariableObject.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.8:
 *             Replaced by the environmentvariable58 object and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class EnvironmentVariableObject
    extends SystemObjectType
{
    // XSD model:
    // choice(
    //         set
    //         name
    // )

    private Set  set;
    //{1..1}


    private EntityObjectStringType  name;
    //{1..1}



    /**
     * Constructor.
     */
    public EnvironmentVariableObject()
    {
        this( null, 0 );
    }


    public EnvironmentVariableObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public EnvironmentVariableObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.environmentvariable;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.ENVIRONMENTVARIABLE;
    }



    /**
     */
    public void setSet(
                    final Set set
                    )
    {
        this.set = set;
    }


    public Set getSet()
    {
        return set;
    }



    /**
     */
    public void setName(
                    final EntityObjectStringType name
                    )
    {
        this.name = name;
    }


    public EntityObjectStringType getName()
    {
        return name;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        ElementRef  ref = getName();
        return Collections.singletonList( ref );
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
        if (!(obj instanceof EnvironmentVariableObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "environmentvariable_object[" + super.toString()
                        + ", set=" + getSet()
                        + ", name=" + getName()
                        + "]";
    }

}
// EnvironmentVariableObject
