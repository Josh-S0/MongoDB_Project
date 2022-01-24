package com.model;

public class Item {

	private Long itemId;
	private double itemPrice;
	private int stock;
	private String itemName;
	private String itemDescription;
	
	public Item(double itemPrice, int stock, String itemName, String itemDescription) {
		super();
		this.itemPrice = itemPrice;
		this.stock = stock;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	
	
	
}
