package com.montalvo.backend.models.dao;


import org.springframework.data.repository.CrudRepository;


import com.montalvo.backend.models.entities.Shop;

public interface IShop extends CrudRepository<Shop,Long> {
	
}
