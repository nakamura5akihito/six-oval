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
import jp.go.aist.six.oval.model.sc.OvalSystemCharacteristics;



/**
 * The SystemResult holds the evaluation results of the definitions and tests,
 * as well as a copy of the OVAL System Characteristics
 * used to perform the evaluation.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: SystemType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SystemType
    implements OvalObject
//    implements Dependent<OvalResults>
{

    private DefinitionsType  definitions;
    //{0..1}


    private TestsType  tests;
    //{0..1}


//    @Reference
    private OvalSystemCharacteristics  oval_system_characteristics;
    //{1..1}


    //TODO:
    // Since the xsd:key "definitionInstanceKey" is composed of
    // @definition_id, @version, and @variable_instance,
    // DefinitionResults may contain multiple elements
    // whose @definition_id is the same.
    // So, digest must be computed from @definition_id set.
    private String  _definitionsDigest;



    /**
     * constructor.
     */
    public SystemType()
    {
    }


//    public SystemType(
//                    final OvalSystemCharacteristics sc
//                    )
//    {
//        setOvalSystemCharacteristics( sc );
//    }
//
//
//    public SystemType(
//                    final OvalSystemCharacteristics sc,
//                    final DefinitionResults definitions,
//                    final TestResults tests
//                    )
//    {
//        setOvalSystemCharacteristics( sc );
//        setDefinitions( definitions );
//        setTests( tests );
//    }
//
//
//    public SystemType(
//                    final OvalSystemCharacteristics sc,
//                    final DefinitionResult[] definitions,
//                    final TestResult[] tests
//                    )
//    {
//        setOvalSystemCharacteristics( sc );
//        setDefinitions( new DefinitionResults( definitions ) );
//        setTests( new TestResults( tests ) );
//    }



    /**
     */
    public void setDefinitions(
                    final DefinitionsType definitions
                    )
    {
        this.definitions = definitions;
    }


    public DefinitionsType getDefinitions()
    {
        return definitions;
    }


    public SystemType definition(
                    final DefinitionType definition
                    )
    {
        DefinitionsType  defs = getDefinitions();
        if (defs == null) {
            defs = new DefinitionsType();
            setDefinitions( defs );
        }
        defs.add( definition );

        return this;
    }



    /**
     */
    public void setTests(
                    final TestsType tests
                    )
    {
        this.tests = tests;
    }


    public TestsType getTests()
    {
        return tests;
    }


    public SystemType test(
                    final TestType test
                    )
    {
        TestsType  tests = getTests();
        if (tests == null) {
            tests = new TestsType();
            setTests( tests );
        }
        tests.add( test );

        return this;
    }



    /**
     */
    public void setOvalSystemCharacteristics(
                    final OvalSystemCharacteristics sc
                    )
    {
        oval_system_characteristics = sc;
    }


    public OvalSystemCharacteristics getOvalSystemCharacteristics()
    {
        return oval_system_characteristics;
    }



    /**
     */
    public void setDefinitionsDigest(
                    final String digest
                    )
    {
        _definitionsDigest = digest;
    }


    public String getDefinitionsDigest()
    {
//        if (_definitionsDigest == null) {
//            DefinitionResults  definitions = getDefinitions();
//            _definitionsDigest = (definitions == null ? null : definitions.getDigest());
//        }

        return _definitionsDigest;
    }



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private OvalResults  _master;
//
//
//    @Override
//    public void setMasterObject(
//                    final OvalResults master
//                    )
//    {
//        _master = master;
//    }
//
//
//    @Override
//    public OvalResults getMasterObject()
//    {
//        return _master;
//    }



//    //**************************************************************
//    //  Persistable
//    //**************************************************************
//
//    @Override
//    public synchronized String getPersistentID()
//    {
//        String  pid = super.getPersistentID();
//        if (pid == null) {
//            pid = UUID.randomUUID().toString();
//            setPersistentID( pid );
//        }
//
//        return pid;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        DefinitionsType  defs = getDefinitions();
        TestsType  tests = getTests();

        return "[#definitions=" + (defs == null ? 0 : defs.size())
                        + ", #definitions=" + (defs == null ? 0 : defs.size())
                        + ", #tests=" + (tests == null ? 0 : tests.size())
                        + ", oval_system_characteristics=" + getOvalSystemCharacteristics()
                        + "]";
//                        + ", tests=" + tests
//                        + "]";
    }

}
// SystemType
