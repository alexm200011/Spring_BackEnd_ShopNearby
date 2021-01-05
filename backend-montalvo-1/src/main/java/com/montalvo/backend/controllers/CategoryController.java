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

import com.montalvo.backend.models.entities.Category;
import com.montalvo.backend.services.interfaces.ICategoryServices;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private ICategoryServices service;
	
	@GetMapping("/{id}")
	public Category retrieve(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping ("")
	public List<Category> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Category create(@RequestBody Category category) {
		service.save(category);
		return category;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Category update(@RequestBody Category category, @PathVariable Long id) {
		service.save(category);
		return category;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
}
