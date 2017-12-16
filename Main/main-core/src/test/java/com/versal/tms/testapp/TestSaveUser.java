package com.versal.tms.testapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.versal.tms.configuration.SpringRootConfig;
import com.versal.tms.dao.UserDAO;
import com.versal.tms.model.User;

public class TestSaveUser {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
	UserDAO userDAO= ctx.getBean(UserDAO.class);
	
	User user = new User();
	
	user.setName("rehan");
	user.setContact("77433776");
   user.setEmail("rehan@yahoo.com");
   user.setAddress("mumbai");
   user.setLoginname("rehan1212");
   
   user.setPassword("2222");
      
      userDAO.saveUser(user);
      ctx.close();
	 
}
	
	
}