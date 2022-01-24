package com.model;

import java.util.ArrayList;

public class Order {
	
	
	private Long orderId;
	private enum OrderStatus{
		PREPARING, DISPATCHED, DELIVERED
	}
	private OrderStatus orderStatus;
	private String orderDate;
	private User user;
	private ArrayList<Item> itemList;
	private double orderTotal;
	
	public Order(String orderDate, User user, ArrayList<Item> itemList) {
		super();
		this.orderDate = orderDate;
		this.user = user;
		this.itemList = itemList;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
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

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
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
