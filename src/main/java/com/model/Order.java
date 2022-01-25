package com.model;

import java.util.List;
import java.util.UUID;

public class Order {
	
	
	private String orderId;
	private enum OrderStatus{
		PREPARING, DISPATCHED, DELIVERED
	}
	private OrderStatus orderStatus;
	private String orderDate;
	//Each order has an associated user object, allowing verification of user via zipcode/dob
	private User user;
	private List<Integer> itemList;
	private double orderTotal;
	
	//test Constructor
	public Order(User user, List<Integer> itemList2) {
		super();
		//set a random orderID upon order creation (can be changed later for easier order navigation)
		this.orderId = UUID.randomUUID().toString();
		this.user = user;
		this.itemList = itemList2;
	}
	
	public Order(String orderDate, User user, List<Integer> itemList) {
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

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
