package com.montalvo.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montalvo.backend.models.entities.City;
import com.montalvo.backend.services.interfaces.ICityServices;

@RestController
@RequestMapping("/api/city")
public class CityController {
	@Autowired
	private ICityServices service;
	
	@GetMapping("/{id}")
	public City retrieve(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<City> list(){ 
		return service.findAll();
	}
	
}
