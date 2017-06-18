package com.sna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sna.snaBackEnd.dao.ClientDao;
import com.sna.snaBackEnd.model.Client;

@RestController
public class UserController {
	
	@Autowired
	ClientDao clientDao;
	
	@PostMapping("/addClient")
	public ResponseEntity<Client> addNewClinet(@RequestBody Client client)
	{
		clientDao.addClient(client);
		return new ResponseEntity<Client>(client,HttpStatus.OK);
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Client> login(@RequestBody Client client)
	{
		Client c=clientDao.getClientWithUserName(client.getUserName());
		return new ResponseEntity<Client>(c,HttpStatus.OK);
	}

}
