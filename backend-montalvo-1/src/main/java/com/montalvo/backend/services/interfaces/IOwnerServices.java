package com.montalvo.backend.services.interfaces;

import java.util.List;

import com.montalvo.backend.models.entities.Owner;


public interface IOwnerServices {
	public void save(Owner e); //Acreate-update
    public Owner findById(Long id);//retrieve
    public void delete(Long id);//delete
    public List<Owner> findAll();//list
}
