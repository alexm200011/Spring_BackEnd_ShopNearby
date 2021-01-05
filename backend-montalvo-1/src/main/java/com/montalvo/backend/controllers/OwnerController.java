package com.montalvo.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.montalvo.backend.models.entities.Owner;
import com.montalvo.backend.services.interfaces.IOwnerServices;


@RestController
@RequestMapping("/api/owner")
public class OwnerController {
	
	@Autowired
	private IOwnerServices service;
	
	@GetMapping ("/{id}")
	public Owner retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping ("")
	public List<Owner> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Owner create(@RequestBody Owner owner) {
		service.save(owner);
		return owner;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Owner update(@RequestBody Owner owner, @PathVariable Long id) {
		service.save(owner);
		return owner;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
