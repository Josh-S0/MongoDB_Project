package com.database;

import com.model.Order;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class OrderAdapter {
	
	public static final DBObject toDBObject(Order order) {
		return new BasicDBObject("_id", order.getOrderId())
						 .append("status", order.getOrderStatus())
		 				 .append("orderDate", order.getOrderDate())
		 				 .append("orderTotal", order.getOrderTotal())
		 				 .append("itemList", order.getItemList())
		 				 .append("userId", order.getUserId());
	}

}
