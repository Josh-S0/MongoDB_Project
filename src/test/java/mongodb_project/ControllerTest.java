package mongodb_project;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.controller.HomeController;
import com.model.Item;

public class ControllerTest {
	

	@Test
	public void loadItemsTest() {
		HomeController homeCon = new HomeController();
		List<Item> itemList = homeCon.getAllItems();
		Iterator<Item> it = itemList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getItemName());
		}
		
	}
	


}
