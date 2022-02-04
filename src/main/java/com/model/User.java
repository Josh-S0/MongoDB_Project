package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {

	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String zipCode;
	private String dateOfBirth;
	private List<String> ordersList;
	
	protected User()
	{
		this.ordersList = new ArrayList<>();
	}
	

	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param password
	 * @param zipCode
	 * @param dateOfBirth
	 * @param ordersList
	 */
	public User(String userId, String firstName, String lastName, String email, String password, String zipCode,
			String dateOfBirth, List<String> ordersList) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.zipCode = zipCode;
		this.dateOfBirth = dateOfBirth;
		this.ordersList = ordersList;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String userName) {
		this.email = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<String> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<String> ordersList) {
		this.ordersList = ordersList;
	}


	
}
