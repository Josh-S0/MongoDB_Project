package com.model;

public class Item {

	private Integer itemId;
	private double itemPrice;
	private int stock;
	private String itemName;
	private String itemDescription;
	
	//test constructor
	public Item(Integer itemId,String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public Item(double itemPrice, int stock, String itemName, String itemDescription) {
		super();
		this.itemPrice = itemPrice;
		this.stock = stock;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}
	
	public Item(Integer itemId, double itemPrice, int stock, String itemName, String itemDescription) {
		super();
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.stock = stock;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
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
