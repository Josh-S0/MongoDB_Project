package com.model;

import java.util.List;
import java.util.UUID;

public class Order {
	
	public static enum OrderStatus{
		PREPARING, DISPATCHED, DELIVERED
	}
	private String orderId;
	private OrderStatus orderStatus;
	private String orderDate;
	//Each order has an associated user object, allowing verification of user via zipcode/dob
	private String userId;
	private List<Integer> itemList;
	private double orderTotal;
	
	//test Constructor
	public Order(String userId, List<Integer> itemList) {
		super();
		//set a random orderID upon order creation (can be changed later for easier order navigation)
		this.orderId = UUID.randomUUID().toString();
		this.userId = userId;
		this.itemList = itemList;
	}
	
	//creation constructor
	public Order(String orderDate, String userId, List<Integer> itemList) {
		super();
		//set a random orderID upon order creation (can be changed later for easier order navigation)
		this.orderId = UUID.randomUUID().toString();
		this.orderStatus = OrderStatus.PREPARING;
		this.orderDate = orderDate;
		this.userId = userId;
		this.itemList = itemList;
	}
	//retrieval constructor
	public Order(String orderId, String orderDate, String orderStatus, String userId, List<Integer> itemList) {
		super();
		this.orderId = orderId;
		setOrderStatus(orderStatus);
		this.orderDate = orderDate;
		this.userId = userId;
		this.itemList = itemList;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getUserId() {
		return userId;
	}

	public List<Integer> getItemList() {
		return itemList;
	}

	public void setItemList(List<Integer> itemList) {
		this.itemList = itemList;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getOrderStatus() {
		String orderStatus = "";
		switch(this.orderStatus) {
		case PREPARING:
			orderStatus = "PREPARING";
			break;
		case DISPATCHED:
			orderStatus = "DISPATCHED";
			break;
		case DELIVERED:
			orderStatus = "DELIVERED";
			break;
		}
		
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		
		if(orderStatus.equalsIgnoreCase("preparing")) {
			this.orderStatus = OrderStatus.PREPARING;
		}
		if(orderStatus.equalsIgnoreCase("dispatched")) {
			this.orderStatus = OrderStatus.DISPATCHED;
		}
		if(orderStatus.equalsIgnoreCase("delivered")) {
			this.orderStatus = OrderStatus.DELIVERED;
		}
		
	}
	
	
	
}
