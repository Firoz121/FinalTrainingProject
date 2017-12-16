package com.versal.tms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.versal.tms.dao.UserDAO;
import com.versal.tms.daoImpl.UserDAOImpl;
import com.versal.tms.model.User;
import com.versal.tms.service.Userservice;

public class UserServiceImpl implements Userservice {

	@Autowired
	UserDAOImpl userDAOImpl;
	public void registerUser(User user) {
		
		User user1= new User();
		
		user1.setName(user.getName());
		user1.setContact(user.getContact());
		user1.setEmail(user.getEmail());
		user1.setAddress(user.getAddress());
		user1.setLoginname(user.getLoginname());
		user1.setPassword(user.getPassword());
		
		userDAOImpl.saveUser(user);
		
	}

	
	
}
