package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	@Query (value = "{email:?0}")
	User findByEmail(String email);
	
}
