package mongodb_project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.database.MongoConnector;


public class mongoTest {

	MongoConnector mongoConnector;
	MongoConnector mongoConnector1;
	@Before
	@Test
	public void createMongoClient() {
		mongoConnector = MongoConnector.getInstance();
		mongoConnector.setS("Hello World");
		assertNotNull(mongoConnector);
	}
	
	//test to ensure only one instance of MongoClient is open at any time
	@Test
	public void testSingletonMongo() {
		
		mongoConnector1 = MongoConnector.getInstance();
		mongoConnector1.setS("Same");
		System.out.println(mongoConnector.getS());
		assertEquals(mongoConnector.getS(),"Same");
	}

}
