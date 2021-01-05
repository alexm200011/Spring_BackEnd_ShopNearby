package com.montalvo.backend.services.interfaces;

import java.util.List;

import com.montalvo.backend.models.entities.Shop;

public interface IShopServices {
	
	public void save(Shop e); //Acreate-update
    public Shop findById(Long id);//retrieve
    public void delete(Long id);//delete
    public List<Shop> findAll();//list
}
