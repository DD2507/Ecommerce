package com.mtd.EcomApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtd.EcomApp.entity.Product;

@Repository
public interface Productrepository extends MongoRepository<Product ,String >{
	
}
