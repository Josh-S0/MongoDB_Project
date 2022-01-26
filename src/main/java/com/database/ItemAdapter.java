package com.database;

import com.model.Item;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public final class ItemAdapter {
	
	public static final DBObject toDBObject(Item item) {
		return new BasicDBObject("_id", item.getItemId())
						 .append("itemName", item.getItemName())
		 				 .append("itemDesc", item.getItemDescription())
		 				 .append("itemPrice", item.getItemPrice())
		 				 .append("stockCount", item.getStock());
	}
	
	public static final Item toObject(DBObject dbObject) {
		
		Integer itemId = (Integer) dbObject.get("_id");
		String itemName = (String) dbObject.get("itemName");
		String itemDesc = (String) dbObject.get("itemDesc");
		double itemPrice = Double.valueOf(dbObject.get("itemPrice").toString());
		int stock = (Integer) dbObject.get("stockCount");
		Item item = new Item(itemId, itemPrice, stock, itemName, itemDesc);

		return item;
	}
	

}
