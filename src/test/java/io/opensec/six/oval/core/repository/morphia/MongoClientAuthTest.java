package io.opensec.six.oval.core.repository.morphia;

import io.opensec.util.core.repository.morphia.MorphiaFactory;
import java.util.Arrays;
import org.junit.Test;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;



/**
 * Tests: Basic authentication flow with Mongo Java Driver 2.10.0.
 *
 * @author  Akihito Nakamura, AIST
 */
public class MongoClientAuthTest
{

    private static final String  _DATABASE_ = "six";
    private static final String  _USER_     = "six";
    private static final String  _PASSWORD_ = "six";
    private static final String  _HOST_     = "localhost";
    private static final int     _PORT_     = 27017;



	@Test
    public void testAuth2()
    		throws Exception
    {
        MongoClient client = new MongoClient( _HOST_, _PORT_ );

		MorphiaFactory  factory = new MorphiaFactory();
		factory.setMongoClient( client );
        Datastore ds = factory.createDatastore( _DATABASE_, _USER_, _PASSWORD_ );
        ds.toString();

        // DefinitionDAO dao = new DefinitionDAO( ds );
        // long count = dao.count();
        // System.out.println( "# OVAL Definitions: " + count );
    }



//	@SuppressWarnings("deprecation")
	@Test
    public void testAuth()
    		throws Exception
    {
	    //MongoDB 3.0//
        MongoCredential credential = MongoCredential.createScramSha1Credential( _DATABASE_, _USER_, _PASSWORD_.toCharArray() );
        MongoClient client = new MongoClient( new ServerAddress( _HOST_, _PORT_ ), Arrays.asList( credential ) );
        MongoDatabase db = client.getDatabase( _DATABASE_ );

        //MongoDB 2.6//
//      DB db = client.getDB( "opensec" );
//		db.authenticate( "opensec", "opensec".toCharArray() );

        db.getName();

		Morphia  morphia = new Morphia();
        Datastore ds = morphia.createDatastore( client, _DATABASE_ );
        ds.toString();

        // DefinitionDAO dao = new DefinitionDAO( ds );
        // long count = dao.count();
        // System.out.println( "# OVAL Definitions: " + count );
    }

}
//
