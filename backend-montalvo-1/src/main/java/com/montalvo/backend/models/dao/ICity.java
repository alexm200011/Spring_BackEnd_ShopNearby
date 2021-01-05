package com.montalvo.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.montalvo.backend.models.entities.City;

public interface ICity extends CrudRepository<City,Long> {
	
}
