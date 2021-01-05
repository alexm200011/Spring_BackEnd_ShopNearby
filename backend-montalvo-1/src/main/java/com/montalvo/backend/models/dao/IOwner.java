package com.montalvo.backend.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.montalvo.backend.models.entities.Owner;

public interface IOwner extends CrudRepository<Owner,Long>{
	
}
