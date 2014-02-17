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
package jp.go.aist.six.oval.model.results;



/**
 * An abstract base class for the criteria-related leaf types.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: CriteriaResultLeafElement.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class CriteriaResultLeafElement
    extends CriteriaResultElement
{

    private int  version;
    //{xsd:nonNegativeInteger, required}


    public static final Integer DEFAULT_VARIABLE_INSTANCE = 1;

    private Integer  variable_instance;
    //{xsd:nonNegativeInteger, optional, default="1"}



    /**
     * Constructor.
     */
    public CriteriaResultLeafElement()
    {
    }


    public CriteriaResultLeafElement(
                    final String id,
                    final int version
                    )
    {
        _setEntityRef( id );
        setVersion( version );
    }


    public CriteriaResultLeafElement(
                    final String id,
                    final int version,
                    final ResultEnumeration result
                    )
    {
        this( id, version );
        setResult( result );
    }



    /**
     */
    protected abstract void _setEntityRef( String entityID );
    protected abstract String _getEntityRef();

//    protected void _setEntityRef(
//                    final String entityID
//                    )
//    {
//        _entityRef = entityID;
//    }
//
//
//    protected String _getEntityRef()
//    {
//        return _entityRef;
//    }



    /**
     */
    public void setVersion(
                    final int version
                    )
    {
        if (version < 0) {
            throw new IllegalArgumentException(
                            "negative version: " + version );
        }

        this.version = version;
    }


    public int getVersion()
    {
        return version;
    }



    /**
     */
    public void setVariableInstance(
                    final Integer variable_instance
                    )
    {
        if (variable_instance != null) {
            if (variable_instance < 0) {
                throw new IllegalArgumentException(
                                "negative variable instance: " + variable_instance );
            }
        }

        this.variable_instance = variable_instance;
    }


    public Integer getVariableInstance()
    {
        return variable_instance;
    }


    public static final Integer variableInstance(
                    final CriteriaResultLeafElement obj
                    )
    {
        Integer  variable_instance = obj.getVariableInstance();
        return (variable_instance == null ? DEFAULT_VARIABLE_INSTANCE : variable_instance);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "version=" + getVersion()
                        + ", variable_instance=" + getVariableInstance()
                        + ", " + super.toString();
    }

}
// CriterionResultLeafElement
