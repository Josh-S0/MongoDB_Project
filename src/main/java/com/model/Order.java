package com.model;

import java.util.List;
import java.util.UUID;

public class Order {
	
	static public enum OrderStatus{
		PREPARING, DISPATCHED, DELIVERED
	}
	private String orderId;
	private OrderStatus orderStatus;
	private String orderDate;
	//Each order has an associated user object, allowing verification of user via zipcode/dob
	private User user;
	private List<Item> itemList;
	private double orderTotal;
	
	//test Constructor
	public Order(User user, List<Item> itemList2) {
		super();
		//set a random orderID upon order creation (can be changed later for easier order navigation)
		this.orderId = UUID.randomUUID().toString();
		this.user = user;
		this.itemList = itemList2;
	}
	
	public Order(String orderDate, User user, List<Item> itemList) {
		super();
		//set a random orderID upon order creation (can be changed later for easier order navigation)
		this.orderId = UUID.randomUUID().toString();
		this.orderDate = orderDate;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
