package com.controller;

import com.database.MongoConnector;
import com.mongodb.DBCollection;

public class OrderController {
	
	//database connection for orders
	
	DBCollection userCollection = MongoConnector.getInstance().getDatabase().getCollection("Users");
	DBCollection itemCollection = MongoConnector.getInstance().getDatabase().getCollection("Items");
	DBCollection orderCollection = MongoConnector.getInstance().getDatabase().getCollection("Orders");


	// - Action for logged in users to see their previous orders
    // Action to confirm an order (navigate to this action from the home controller)
	
	
	
	// Add to cart method - adds items to an itemList
	// Method calculateOrderTotal
	// Method updateOrderStatus
	// Method to create an order, - requires userID and list of items - includes 
	// Method to add order to user.orderslist
	// Method to retrieve orderslist from a user
	
}
