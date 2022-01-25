package com.database;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

//Singleton class for Mongo connection
public class MongoConnector {
	
	private static MongoConnector single_instance = null;
	
	public MongoClient mongoClient;
	
	private MongoConnector(){
		try {
		this.mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));}
		catch(Exception e) {}
	}
	
	
	public static MongoConnector getInstance(){
		if(single_instance == null) {
			single_instance = new MongoConnector();
		}
		return single_instance;
	}
	
	
	//testing of singleton properties
	private String s;
	public String getS(){
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}
}
