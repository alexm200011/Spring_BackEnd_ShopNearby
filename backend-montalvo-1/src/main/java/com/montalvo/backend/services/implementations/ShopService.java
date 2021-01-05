package com.montalvo.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montalvo.backend.models.entities.Shop;
import com.montalvo.backend.services.interfaces.IShopServices;
import com.montalvo.backend.models.dao.IShop;

@Service
public class ShopService implements IShopServices {

	@Autowired
	private IShop dao;
	
	
	@Override
	@Transactional
	public void save(Shop e) {
		// TODO Auto-generated method stub
		dao.save(e);
	}

	@Override
	@Transactional(readOnly=true)
	public Shop findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Shop e = this.findById(id);
		dao.delete(e);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Shop> findAll() {
		// TODO Auto-generated method stub
		return (List<Shop>) dao.findAll();
	}
	
}
