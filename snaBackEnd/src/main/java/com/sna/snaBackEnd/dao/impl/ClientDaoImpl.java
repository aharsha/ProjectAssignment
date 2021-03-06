package com.sna.snaBackEnd.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sna.snaBackEnd.dao.ClientDao;
import com.sna.snaBackEnd.model.Client;

@Repository("clientDao")
@Transactional
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

	@Override
	public Client getClientWithUserName(String userName) {
		// TODO Auto-generated method stub
		try {
		return	sessionFacory.getCurrentSession().createQuery("From Client where username=:username",Client.class).setParameter("username", userName).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}

}
