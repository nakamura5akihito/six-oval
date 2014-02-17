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

import jp.go.aist.six.oval.model.OvalObject;




/**
 * The Directives presents a set of flags
 * that describe what information has been included in the results document.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: DirectivesType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DirectivesType
    implements OvalObject
{

    private DirectiveType  definition_true;
    //{1..1}

    private DirectiveType  definition_false;
    //{1..1}

    private DirectiveType  definition_unknown;
    //{1..1}

    private DirectiveType  definition_error;
    //{1..1}

    private DirectiveType  definition_not_evaluated;
    //{1..1}

    private DirectiveType  definition_not_applicable;
    //{1..1}


//    protected static enum ResultType
//    {
//        TRUE,
//        FALSE,
//        UNKNOWN,
//        ERROR,
//        NOT_EVALUATED,
//        NOT_APPLICABLE;
//    }
//
//    private final Map<ResultType, DirectiveType>  _directives =
//        new EnumMap<ResultType, DirectiveType>( ResultType.class );
//    //{1..1}



    /**
     * Constructor.
     */
    public DirectivesType()
    {
        this(
                        new DirectiveType(),
                        new DirectiveType(),
                        new DirectiveType(),
                        new DirectiveType(),
                        new DirectiveType(),
                        new DirectiveType()
                        );
    }


    public DirectivesType(
                    final DirectiveType definitionTrue,
                    final DirectiveType definitionFalse,
                    final DirectiveType definitionUnknown,
                    final DirectiveType definitionError,
                    final DirectiveType definitionNotEvaluated,
                    final DirectiveType definitionNotApplicable
                    )
    {
        setDefinitionTrue(          definitionTrue );
        setDefinitionFalse(         definitionFalse );
        setDefinitionUnknown(       definitionUnknown );
        setDefinitionError(         definitionError );
        setDefinitionNotEvaluated(  definitionNotEvaluated );
        setDefinitionNotApplicable( definitionNotApplicable );
    }



    /**
     */
    public void setDefinitionTrue(
                    final DirectiveType definition_true
                    )
    {
        this.definition_true = definition_true;
//        _directives.put( ResultType.TRUE, directive );
    }


    public DirectiveType getDefinitionTrue()
    {
        return definition_true;
//        return _directives.get( ResultType.TRUE );
    }



    /**
     */
    public void setDefinitionFalse(
                    final DirectiveType definition_false
                    )
    {
        this.definition_false = definition_false;
//        _directives.put( ResultType.FALSE, directive );
    }


    public DirectiveType getDefinitionFalse()
    {
        return definition_false;
//        return _directives.get( ResultType.FALSE );
    }



    /**
     */
    public void setDefinitionUnknown(
                    final DirectiveType definition_unknown
                    )
    {
        this.definition_unknown = definition_unknown;
//        _directives.put( ResultType.UNKNOWN, directive );
    }


    public DirectiveType getDefinitionUnknown()
    {
        return definition_unknown;
//        return _directives.get( ResultType.UNKNOWN );
    }



    /**
     */
    public void setDefinitionError(
                    final DirectiveType definition_error
                    )
    {
        this.definition_error = definition_error;
//        _directives.put( ResultType.ERROR, directive );
    }


    public DirectiveType getDefinitionError()
    {
        return definition_error;
//        return _directives.get( ResultType.ERROR );
    }



    /**
     */
    public void setDefinitionNotEvaluated(
                    final DirectiveType definition_not_evaluated
                    )
    {
        this.definition_not_evaluated = definition_not_evaluated;
//        _directives.put( ResultType.NOT_EVALUATED, directive );
    }


    public DirectiveType getDefinitionNotEvaluated()
    {
        return definition_not_evaluated;
//        return _directives.get( ResultType.NOT_EVALUATED );
    }



    /**
     */
    public void setDefinitionNotApplicable(
                    final DirectiveType definition_not_applicable
                    )
    {
        this.definition_not_applicable = definition_not_applicable;
//        _directives.put( ResultType.NOT_APPLICABLE, directive );
    }


    public DirectiveType getDefinitionNotApplicable()
    {
        return definition_not_applicable;
//        return _directives.get( ResultType.NOT_APPLICABLE );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        DirectiveType  defTrue = getDefinitionTrue();
        result = prime * result + ((defTrue == null) ? 0 : defTrue.hashCode());

        DirectiveType  defFalse= getDefinitionFalse();
        result = prime * result + ((defFalse == null) ? 0 : defFalse.hashCode());

        DirectiveType  defUnknown = getDefinitionUnknown();
        result = prime * result + ((defUnknown == null) ? 0 : defUnknown.hashCode());

        DirectiveType  defError = getDefinitionError();
        result = prime * result + ((defError == null) ? 0 : defError.hashCode());

        DirectiveType  defNotEvaluated = getDefinitionNotEvaluated();
        result = prime * result + ((defNotEvaluated == null) ? 0 : defNotEvaluated.hashCode());

        DirectiveType  defNotApplicable = getDefinitionNotApplicable();
        result = prime * result + ((defNotApplicable == null) ? 0 : defNotApplicable.hashCode());

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

        if (!(obj instanceof DirectivesType)) {
            return false;
        }

        DirectivesType  other = (DirectivesType)obj;
        DirectiveType  other_false = other.getDefinitionFalse();
        DirectiveType   this_false =  this.getDefinitionFalse();
        if (this_false == other_false
                        ||  (this_false != null  &&  this_false.equals( other_false ))) {
            DirectiveType  other_unknown = other.getDefinitionUnknown();
            DirectiveType   this_unknown =  this.getDefinitionUnknown();
            if (this_unknown == other_unknown
                            ||  (this_unknown != null  &&  this_unknown.equals( other_unknown ))) {
                DirectiveType  other_error = other.getDefinitionError();
                DirectiveType   this_error =  this.getDefinitionError();
                if (this_error == other_error
                                ||  (this_error != null  &&  this_error.equals( other_error ))) {
                    DirectiveType  other_not_eval = other.getDefinitionNotEvaluated();
                    DirectiveType   this_not_eval =  this.getDefinitionNotEvaluated();
                    if (this_not_eval == other_not_eval
                                    ||  (this_not_eval != null  &&  this_not_eval.equals( other_not_eval ))) {
                        DirectiveType  other_not_app = other.getDefinitionNotApplicable();
                        DirectiveType   this_not_app =  this.getDefinitionNotApplicable();
                        if (this_not_app == other_not_app
                                        ||  (this_not_app != null  &&  this_not_app.equals( other_not_app ))) {
                            DirectiveType  other_true = other.getDefinitionTrue();
                            DirectiveType   this_true =  this.getDefinitionTrue();
                            if (this_true == other_true
                                            ||  (this_true != null  &&  this_true.equals( other_true ))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return   "definition_true="           + getDefinitionTrue()
             + ", definition_false="          + getDefinitionFalse()
             + ", definition_unknown="        + getDefinitionUnknown()
             + ", definition_error="          + getDefinitionError()
             + ", definition_not_evaluated="  + getDefinitionNotEvaluated()
             + ", definition_not_applicable=" + getDefinitionNotApplicable();
    }

}
// DirectivesType
