package com.sna.snaBackEnd.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sna.snaBackEnd.dao.ClientDao;
import com.sna.snaBackEnd.model.Client;

@Repository
public class ClientDaoImpl implements ClientDao{
	
	
	@Autowired
	SessionFactory sessionFacory;

	@Override
	public boolean addClient(Client cllient) {
		// TODO Auto-generated method stub
		try {
			sessionFacory.getCurrentSession().save(cllient);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean updateClient(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Client getClient(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
