package com.montalvo.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.montalvo.backend.models.entities.Product;

public interface IProduct extends CrudRepository<Product,Long> {
	
}

