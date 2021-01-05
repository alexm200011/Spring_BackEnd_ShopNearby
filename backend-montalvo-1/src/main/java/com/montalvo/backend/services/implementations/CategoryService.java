package com.montalvo.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montalvo.backend.models.dao.ICategory;
import com.montalvo.backend.models.entities.Category;
import com.montalvo.backend.services.interfaces.ICategoryServices;

@Service
public class CategoryService implements ICategoryServices{

	@Autowired
	private ICategory dao;
	
	@Override
	@Transactional
	public void save(Category e) {
		// TODO Auto-generated method stub
		dao.save(e);
	}

	@Override
	@Transactional(readOnly=true)
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Category e = this.findById(id);
		dao.delete(e);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>) dao.findAll();
	}
}
