package com.montalvo.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montalvo.backend.models.entities.City;
import com.montalvo.backend.services.interfaces.ICityServices;
import com.montalvo.backend.models.dao.ICity;

@Service
public class CityService implements ICityServices {

	@Autowired
	 private ICity dao;
	


	@Override
	@Transactional(readOnly=true)
	public City findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}


	@Override
	@Transactional(readOnly=true)
	public List<City> findAll() {
		// TODO Auto-generated method stub
		return (List<City>) dao.findAll();
	}

		
}
