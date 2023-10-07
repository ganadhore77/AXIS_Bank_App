package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.AXIS_Entity;

@Repository
public interface AXISRepository extends MongoRepository<AXIS_Entity, String> {

	@Query("{'account_number': ?0}")
	AXIS_Entity findByAccountNumber(String accountNumber);
}
