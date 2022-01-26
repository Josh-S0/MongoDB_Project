package com.database;

import java.util.List;

import com.model.Order;
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
		 				 .append("zipCode", user.getZipCode())
		 				 .append("dateOfBirth", user.getDateOfBirth());
	}
	public static final User toObject(DBObject dbObject) {
			
			String userId = (String) dbObject.get("_id");
			String firstName = (String) dbObject.get("firstName");
			String lastName = (String) dbObject.get("lastName");
			String email = (String) dbObject.get("email");
			String password = (String) dbObject.get("password");
			String zipCode = (String) dbObject.get("zipCode");
			String dateOfBirth = (String) dbObject.get("dateOfBirth");
			User user = new User(userId, firstName, lastName, email, password, zipCode, dateOfBirth);
	
			return user;
		}
}
		

