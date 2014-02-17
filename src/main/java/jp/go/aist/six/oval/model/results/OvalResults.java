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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.common.AbstractDocument;
import jp.go.aist.six.oval.model.common.GeneratorType;
import jp.go.aist.six.oval.model.definitions.OvalDefinitions;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;



/**
 * The OvalResults represents an OVAL Results Document.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalResults.java 3055 2013-02-22 10:26:33Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.res.oval_results" )
public class OvalResults
    extends AbstractDocument
{

//    private GeneratorType  generator = new GeneratorType();
//    //{1..1}


    private DefaultDirectivesType  directives = new DefaultDirectivesType();
    //{1..1}


    private final Collection<ClassDirectivesType>  class_directives = new ArrayList<ClassDirectivesType>();
    //{0..5}


    @Reference
    private OvalDefinitions  oval_definitions;
    //{0..1}


    private ResultsType  results;
    //{1..1}



    /**
     * Constructor.
     */
    public OvalResults()
    {
    }


    public OvalResults(
                    final GeneratorType generator
                    )
    {
        super( generator );
    }


//    public OvalResults(
//                    final Generator generator,
//                    final DefaultDirectives directives,
//                    final SystemResults results
//                    )
//    {
//        setGenerator( generator );
//        setDirectives( directives );
//        setResults( results );
//    }
//
//
//    public OvalResults(
//                    final Generator generator,
//                    final DefaultDirectives directives,
//                    final SystemResult[] results
//                    )
//    {
//        setGenerator( generator );
//        setDirectives( directives );
//        setResults( new SystemResults( results ) );
//    }




//    /**
//     */
//    public void setGenerator(
//                    final GeneratorType generator
//                    )
//    {
//        this.generator = generator;
//    }
//
//
//    public GeneratorType getGenerator()
//    {
//        return this.generator;
//    }



    /**
     */
    public void setDirectives(
                    final DefaultDirectivesType directives
                    )
    {
        this.directives = directives;
    }


    public DefaultDirectivesType getDirectives()
    {
        return directives;
    }



    /**
     */
    public void setClassDirectives(
                    final Collection<? extends ClassDirectivesType> classDirectives
                    )
    {
        if (classDirectives != class_directives) {
            class_directives.clear();
            if (classDirectives != null  &&  classDirectives.size() > 0) {
                class_directives.addAll( classDirectives );
            }
        }
    }


    public boolean addClassDirectives(
                    final ClassDirectivesType classDirectives
                    )
    {
        return class_directives.add( classDirectives );
    }


    public Collection<ClassDirectivesType> getClassDirectives()
    {
        return class_directives;
    }


    public Iterator<ClassDirectivesType> iterateClassDirectives()
    {
        return class_directives.iterator();
    }



    /**
     */
    public void setOvalDefinitions(
                    final OvalDefinitions definitions
                    )
    {
        oval_definitions = definitions;
    }


    public OvalDefinitions getOvalDefinitions()
    {
        return oval_definitions;
    }


    public OvalResults ovalDefinitions(
                    final OvalDefinitions definitions
                    )
    {
        setOvalDefinitions( definitions );
        return this;
    }



    /**
     */
    public void setResults(
                    final ResultsType results
                    )
    {
        this.results = results;
    }


    public ResultsType getResults()
    {
        return results;
    }


    public OvalResults result(
                    final SystemType system
                    )
    {
        ResultsType  results = getResults();
        if (results == null) {
            results = new ResultsType();
            setResults( results );
        }
        results.add( system );

        return this;
    }



    //**************************************************************
    //  OvalDocument
    //**************************************************************

//    @Override
//    public String getSchemaLocation()
//    {
//        return RESULTS_SCHEMA_LOCATION;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "oval_results[generator=" + getGenerator()
                        + ", directives=" + getDirectives()
                        + ", class_directives=" + getClassDirectives()
                        + ", oval_definitions=" + getOvalDefinitions()
                        + ", results=" + getResults()
                        + "]";
    }

}
//OvalResults
