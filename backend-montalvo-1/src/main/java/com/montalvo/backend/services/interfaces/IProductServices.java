package com.montalvo.backend.services.interfaces;

import java.util.List;

import com.montalvo.backend.models.entities.Product;

public interface IProductServices {
	
	public void save(Product e); //Acreate-update
    public Product findById(Long id);//retrieve
    public void delete(Long id);//delete
    public List<Product> findAll();//list

}
