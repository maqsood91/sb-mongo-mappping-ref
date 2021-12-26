package com.maqcoding.sbmongomapppingref.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.maqcoding.sbmongomapppingref.model.Products;

public interface ProductRepo extends MongoRepository<Products,String>{

}
