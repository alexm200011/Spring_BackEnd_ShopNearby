package com.montalvo.backend.services.interfaces;

import java.util.List;
import com.montalvo.backend.models.entities.City;

public interface ICityServices {
	

    public City findById(Long id);//retrieve
    public List<City> findAll();//list

}
