package com.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Items")
public class Item {

	@Id
	private String id;
	@Indexed(direction = IndexDirection.ASCENDING)
	private BigDecimal itemPrice;
	private String itemName;
	private String url;
	private int stock;
	
	
	/**
	 * @param id
	 * @param itemPrice
	 * @param itemName
	 * @param url
	 * @param stock
	 */
	public Item(String id, BigDecimal itemPrice, String itemName, String url, int stock) {
		super();
		this.id = id;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.url = url;
		this.stock = stock;
	}

	
	public int getStock() {
		return stock;
	}

	public String getItemId() {
		return id;
	}
	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	public String getItemName() {
		return itemName;
	}
	public String getUrl() {
		return url;
	}
	public void setItemId(String id) {
		this.id = id;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
}
