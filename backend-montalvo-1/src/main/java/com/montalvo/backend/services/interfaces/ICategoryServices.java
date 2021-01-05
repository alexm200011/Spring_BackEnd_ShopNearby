package com.montalvo.backend.services.interfaces;

import java.util.List;

import com.montalvo.backend.models.entities.Category;

public interface ICategoryServices {
	
	public void save(Category e); //Acreate-update
    public Category findById(Long id);//retrieve
    public void delete(Long id);//delete
    public List<Category> findAll();//list

}
