package com.database;

import com.model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class UserAdapter {
	
	public static final DBObject toDBObject(User user) {
		return new BasicDBObject("_id", user.getUserId())
						 .append("firstName", user.getFirstName())
		 				 .append("lastName", user.getLastName())
		 				 .append("email", user.getEmail())
		 				 .append("password", user.getPassword())
		 				 .append("zipcode", user.getZipCode())
		 				 .append("dateOfBirth", user.getDateOfBirth());
	}
	

}
