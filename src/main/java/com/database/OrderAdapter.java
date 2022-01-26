package com.database;

import java.util.List;

import com.model.Item;
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

	public static final Order toObject(DBObject dbObject) {
			
			String orderId = (String) dbObject.get("_id");
			String orderStatus = (String) dbObject.get("status");
			String orderDate = (String) dbObject.get("orderDate");
			double orderTotal = Double.valueOf(dbObject.get("orderTotal").toString());
			List<Integer> itemList = (List<Integer>) dbObject.get("itemList");
			String userId = (String) dbObject.get("userId");
			Order order = new Order(orderId, orderDate,orderStatus, userId, itemList);
	
			return order;
		}
}
