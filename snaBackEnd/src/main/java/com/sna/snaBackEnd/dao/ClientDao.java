package com.sna.snaBackEnd.dao;

import com.sna.snaBackEnd.model.Client;

public interface ClientDao {
	
	boolean addClient(Client cllient);
	boolean updateClient(Client client);
	Client getClient(Integer id);
	Client getClientWithUserName(String userName);

}
