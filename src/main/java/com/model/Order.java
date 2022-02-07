package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class Order {

	@Id
	private String orderId;
	private String orderDate;
	//Each order has an associated user object, allowing verification of user via zipcode/dob
	private String userId;
	private List<Item> itemList;
	private BigDecimal orderTotal;
	
	/**
	 * @param itemList
	 */
	protected Order() {
		this.itemList = new ArrayList<>();
	}

	public Order(String userId, List<Item> itemList, BigDecimal orderTotal) {
		super();
		this.userId = userId;
		this.itemList = itemList;
		this.orderTotal = orderTotal;
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

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	
	
}
