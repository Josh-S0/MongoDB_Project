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
	

}
