package jp.go.aist.six.oval.core.repository.morphia;

import jp.go.aist.six.oval.core.repository.morphia.definitions.DefinitionDAO;
import jp.go.aist.six.util.core.repository.morphia.MorphiaFactory;

import org.junit.Test;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.DB;
import com.mongodb.MongoClient;



/**
 * Tests: Basic authentication flow with Mongo Java Driver 2.10.0.
 *
 * @author  Akihito Nakamura, AIST
 */
public class MongoClientAuthTest
{

	@Test
    public void testAuth2()
    		throws Exception
    {
		MongoClient  client = new MongoClient( "localhost", 27017 );
		
		MorphiaFactory  factory = new MorphiaFactory(); 
		factory.setMongoClient( client );
		Datastore  ds = factory.createDatastore( "six", "six", "six" );
		
		DefinitionDAO  dao = new DefinitionDAO( ds );
		long  count = dao.count();
		System.out.println( "# OVAL Definitions: " + count );
    }


	
	@SuppressWarnings("deprecation")
	@Test
    public void testAuth()
    		throws Exception
    {
		//Singleton
		MongoClient  client = new MongoClient( "localhost", 27017 );
		DB  db = client.getDB( "six" );
		db.authenticate( "six", "six".toCharArray() );
		
		Morphia  morphia = new Morphia();
		Datastore  ds = morphia.createDatastore( client, "six" );
		
		DefinitionDAO  dao = new DefinitionDAO( ds );
		long  count = dao.count();
		System.out.println( "# OVAL Definitions: " + count );
    }

}
//
