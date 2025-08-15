package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.dao.UserDao;

@Component
public class UserService {

	@Autowired
	private UserDao userDao;
	
	
	
	/*
	 * @Autowired public void setUserDao(UserDao userDao) {
	 * System.out.println("setter Injection::setUserDao"); this.userDao = userDao; }
	 */
	
	
    @Autowired
	public UserService(UserDao userDao) {
		System.out.println("UserService parameter cons::UserService");
		this.userDao = userDao;
		 
	}



	/*
	 * public UserService(){
	 * System.out.println("UserService obj 0 arg cons ::UserService"); }
	 */
	
	public void getUserName(Integer id) {
		String name=userDao.findNameById(id);//exception null
		System.out.println("name :: "+name);
	}
	
	
	
}
