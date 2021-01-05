package com.montalvo.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.montalvo.backend.models.entities.Category;

public interface ICategory extends CrudRepository<Category,Long> {
	
}

