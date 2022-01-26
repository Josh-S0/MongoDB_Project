package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.database.ItemAdapter;
import com.database.MongoConnector;
import com.model.Item;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class HomeController {
	
	//database connection for items
	DBCollection itemCollection = MongoConnector.getInstance().getDatabase().getCollection("Items");

	//Action to load list of item users can order
	public List<Item> getAllItems() {
		
		List<Item> itemList = new ArrayList<Item>();
		DBCursor itemCursor = itemCollection.find();
		while(itemCursor.hasNext()) {
			DBObject itemObj = itemCursor.next();
			Item item = ItemAdapter.toObject(itemObj);
			itemList.add(item);
		}
		return itemList;
		
	}
	//
	
	
}
