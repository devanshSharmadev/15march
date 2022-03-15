package com.bookapp.repository;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DBManager {
	
	static MongoClient mongoInstance;
	
	public static void openConnection(){
		
	}
	
	public static void closeConnection(){
		mongoInstance.close();
	}
	
	public MongoDatabase getDatabase() {
		MongoDatabase database=mongoInstance.getDatabase("klouddb");
		return database;
	}
	
	
	public MongoCollection<Document> getCollection(){
		MongoDatabse database=getDatabase();
		MongoCollection<Document> coll
	}
	
	
	
}
