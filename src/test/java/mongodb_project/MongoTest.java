package mongodb_project;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.database.ItemAdapter;
import com.database.MongoConnector;
import com.database.OrderAdapter;
import com.database.UserAdapter;
import com.model.Item;
import com.model.Order;
import com.model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;


public class MongoTest {

	MongoConnector mongoConnector;
	MongoConnector mongoConnector1;
	@Before
	@Test
	public void createMongoClient() {
		mongoConnector = MongoConnector.getInstance();
		mongoConnector1 = MongoConnector.getInstance();
		mongoConnector.setS("Hello World");
		assertNotNull(mongoConnector);
	}
	
	//test to ensure only one instance of MongoClient is open at any time
	@Test
	public void testSingletonMongo() {
		
		mongoConnector1.setS("Same");
		System.out.println(mongoConnector.getS());
		assertEquals(mongoConnector.getS(),"Same");
	}
	@Test
	public void testDatabaseRetrieval() {
		
		assertEquals(mongoConnector.getDatabase(), mongoConnector1.getDatabase());
		
	}
	
	@Test
	public void testCollectionRetrieval(){
		assertNotNull(mongoConnector.getDatabase().getCollection("Users"));
		assertNotEquals(mongoConnector.getDatabase().getCollection("Orders"),mongoConnector.getDatabase().getCollection("Users"));
	}
	/*
	public void testCollectionInput() {
		
		User user = new User("Josh", "Suchit", "josh.suchit@gmail.com", "password", "Co169fx", "08012000");
		Item item1 = new Item(0, 9.99, 50, "Headphones", "For music");
		Item item2 = new Item(1,39.99,7,"Microphone","For recording");
		List<Integer> itemList = Arrays.asList(item1.getItemId(),item2.getItemId());
		Order order1 = new Order("26012022", user.getUserId(), itemList);
		order1.setOrderStatus(OrderStatus.DISPATCHED);
		order1.setOrderTotal(item1.getItemPrice()+item2.getItemPrice());
		MongoConnector.getInstance().getDatabase().getCollection("Users").insert(UserAdapter.toDBObject(user));
		MongoConnector.getInstance().getDatabase().getCollection("Items").insert(ItemAdapter.toDBObject(item1));
		MongoConnector.getInstance().getDatabase().getCollection("Items").insert(ItemAdapter.toDBObject(item2));
		MongoConnector.getInstance().getDatabase().getCollection("Orders").insert(OrderAdapter.toDBObject(order1));
		
	}
	*/
	
	@Test
	public void testItemRetrieval() {
		DBCollection itemColl = MongoConnector.getInstance().getDatabase().getCollection("Items");
		DBObject query = new BasicDBObject("_id", 0);
		DBCursor cursor = itemColl.find(query);
		DBObject itemObj = cursor.one();
		Item item1 = ItemAdapter.toObject(itemObj);
		assertEquals(item1.getItemName(), "Headphones");
		
	}
	@Test
	public void testOrderRetrieval(){
		DBCollection orderColl = MongoConnector.getInstance().getDatabase().getCollection("Orders");
		DBObject query = new BasicDBObject("_id", "3365965f-1c31-40e2-8146-1a55b7496459");
		DBCursor cursor = orderColl.find(query);
		DBObject orderObj = cursor.one();
		Order order1 = OrderAdapter.toObject(orderObj);
		List<Integer> itemList = order1.getItemList();
		assertTrue(itemList.get(1) == 1);
	}
	@Test
	public void testUserRetrieval(){
		DBCollection userColl = MongoConnector.getInstance().getDatabase().getCollection("Users");
		DBObject query = new BasicDBObject("_id", "a1d24b28-79b2-417e-8e3b-839d7b2febba");
		DBCursor cursor = userColl.find(query);
		DBObject userObj = cursor.one();
		User user1 = UserAdapter.toObject(userObj);
		assertEquals(user1.getFirstName(), "Josh");
		
		
	}
}
