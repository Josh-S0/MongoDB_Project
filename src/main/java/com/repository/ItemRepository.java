package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
	
	

}
