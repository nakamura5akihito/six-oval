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
package jp.go.aist.six.oval.model.sc;

import jp.go.aist.six.oval.model.common.AbstractDocument;
import jp.go.aist.six.oval.model.common.GeneratorType;
import org.mongodb.morphia.annotations.Entity;



/**
 * An OVAL System Characteristics Document.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalSystemCharacteristics.java 3055 2013-02-22 10:26:33Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.sc.oval_system_characteristics" )
public class OvalSystemCharacteristics
    extends AbstractDocument
{

//    private GeneratorType  generator;
//    //{1..1}


    private SystemInfoType  system_info;
    //{1..1}


    private CollectedSystemObjectsType  collected_objects;
    //{0..1}


    private SystemDataType  system_data;
    //{0..1}



    /**
     * Constructor.
     */
    public OvalSystemCharacteristics()
    {
    }


    public OvalSystemCharacteristics(
                    final GeneratorType generator
                    )
    {
        super( generator );
    }


//    public OvalSystemCharacteristics(
//                    final Generator generator,
//                    final SystemInfo system
//                    )
//    {
//        setGenerator( generator );
//        setSystemInfo( system );
//    }
//
//
//    public OvalSystemCharacteristics(
//                    final Generator generator,
//                    final SystemInfo system,
//                    final CollectedSystemObjects collectedObjects,
//                    final SystemData systemData
//                    )
//    {
//        this( generator, system );
//        setCollectedObjects( collectedObjects );
//        setSystemData( systemData );
//    }
//
//
//    public OvalSystemCharacteristics(
//                    final Generator generator,
//                    final SystemInfo system,
//                    final Collection<CollectedSystemObject> collectedObjects,
//                    final Collection<Item> systemData
//                    )
//    {
//        this( generator, system );
//        setCollectedObjects( new CollectedSystemObjects( collectedObjects ) );
//        setSystemData( new SystemData( systemData ) );
//    }
//
//
//    public OvalSystemCharacteristics(
//                    final Generator generator,
//                    final SystemInfo system,
//                    final CollectedSystemObject[] collectedObjects,
//                    final Item[] systemData
//                    )
//    {
//        this( generator, system );
//        setCollectedObjects( new CollectedSystemObjects( collectedObjects ) );
//        setSystemData( new SystemData( systemData ) );
//    }



//    public void setCollectedObjectsDigest( final String digest )
//    {
//        _objectsDigest = digest;
//    }
//
//
//    public String getCollectedObjectsDigest()
//    {
//        if (_objectsDigest == null) {
//            try {
//                _objectsDigest = OvalDigest.digestIDs( getCollectedObjects() );
//            } catch (Exception ex) {
//                // the digest is undefined.
//            }
//        }
//        return _objectsDigest;
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
    public void setSystemInfo(
                    final SystemInfoType system_info
                    )
    {
        this.system_info = system_info;
    }


    public SystemInfoType getSystemInfo()
    {
        return system_info;
    }



    /**
     */
    public void setCollectedObjects(
                    final CollectedSystemObjectsType collected_objects
                    )
    {
        this.collected_objects = collected_objects;
    }


    public CollectedSystemObjectsType getCollectedObjects()
    {
        return collected_objects;
    }



    /**
     */
    public void setSystemData(
                    final SystemDataType system_data
                    )
    {
        this.system_data = system_data;
    }


    public SystemDataType getSystemData()
    {
        return system_data;
    }



    //**************************************************************
    //  OvalDocument
    //**************************************************************

//    @Override
//    public String getSchemaLocation()
//    {
//        return SC_SCHEMA_LOCATION;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        CollectedSystemObjectsType  collected_objects = getCollectedObjects();
        SystemDataType  system_data = getSystemData();

        return "oval_system_characteristics[generator=" + getGenerator()
                        + ", system_info=" + getSystemInfo()
//                        + ", collected_objects=" + collected_objects
                        + ", #collected_objects=" + (collected_objects == null ? 0 : collected_objects.size())
//                        + ", system_data=" + system_data
                        + ", #system_data=" + (system_data == null ? 0 : system_data.size())
                        + "]";
    }

}
//OvalSystemCharacteristics
