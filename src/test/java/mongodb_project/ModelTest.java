package mongodb_project;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.model.Item;
import com.model.Order;
import com.model.Order.OrderStatus;
import com.model.User;

public class ModelTest {
	
	OrderStatus status;
	//2 test users with random userID
	User user1 = new User("Josh", "Suchit");
	User user2 = new User("John", "Doe");
	
	Item item1 = new Item(0, "Chocolate");
	Item item2 = new Item(1, "Butter");
	Item item3 = new Item(2, "Sugar");
	
	List<Integer> itemList = Arrays.asList(item1.getItemId(),item2.getItemId(),item3.getItemId());
	List<Integer> itemList2 = Arrays.asList(item1.getItemId(),item3.getItemId());
	
	Order order1;
	List<Order> orderList = Arrays.asList(order1);
	
	@Test
	@Before
	public void orderCreation(){
		order1 = new Order(user1.getUserId(), itemList2);
		assertNotNull(order1);
		assertEquals(order1.getUserId(), user1.getUserId());
		order1.setOrderStatus("delivered");
	}
	
	@Test
	public void orderRetrieval() {
		
		assertEquals(order1.getOrderStatus(), "DELIVERED");
		assertEquals(order1.getItemList().get(1).intValue(), 2);
	}
	
	//testing adding an order to a user for previous order function
	@Test
	public void addOrderToUser() {
		
		user1.getOrdersList().add(order1.getOrderId());
		assertEquals(user1.getOrdersList().get(0), order1.getOrderId());
	
	}
}
