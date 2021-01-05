package com.montalvo.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.montalvo.backend.models.dao.IProduct;
import com.montalvo.backend.models.entities.Product;
import com.montalvo.backend.services.interfaces.IProductServices;

@Service
public class ProductService implements IProductServices {

	
	@Autowired
	private IProduct dao;
	
	@Override
	@Transactional
	public void save(Product e) {
		// TODO Auto-generated method stub
		dao.save(e);
	}

	@Override
	@Transactional(readOnly=true)
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Product e = this.findById(id);
		dao.delete(e);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) dao.findAll();
	}
	
}
