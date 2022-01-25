package mongodb_project;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import com.model.Item;
import com.model.Order;
import com.model.User;

public class ModelTest {
	
	//2 test users with random userID
	User user1 = new User("Josh", "Suchit");
	User user2 = new User("John", "Doe");
	
	Item item1 = new Item(0, "Chocolate");
	Item item2 = new Item(1, "Butter");
	Item item3 = new Item(2, "Sugar");
	
	List<Integer> itemList = Arrays.asList(item1.getItemId(),item2.getItemId(),item3.getItemId());
	List<Integer> itemList2 = Arrays.asList(item1.getItemId(),item3.getItemId());
	
	@Test
	public void orderCreation(){
		
		Order order1 = new Order(user1, itemList2);
		assertNotNull(order1);
		assertEquals(order1.getUser().getUserId(), user1.getUserId());
		
		
	}
}
