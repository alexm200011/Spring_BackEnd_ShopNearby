package com.montalvo.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montalvo.backend.models.dao.IOwner;
import com.montalvo.backend.models.entities.Owner;
import com.montalvo.backend.services.interfaces.IOwnerServices;

@Service
public class OwnerService implements IOwnerServices{

	@Autowired
	private IOwner dao;
	
	@Override
	@Transactional
	public void save(Owner e) {
		// TODO Auto-generated method stub
		dao.save(e);
	}

	@Override
	@Transactional(readOnly=true)
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Owner e = this.findById(id);
		dao.delete(e);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Owner> findAll() {
		// TODO Auto-generated method stub
		return (List<Owner>) dao.findAll();
	}

}
