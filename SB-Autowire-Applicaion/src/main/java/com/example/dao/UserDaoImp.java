package com.example.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UserDaoImp implements UserDao{

	public UserDaoImp() {
		System.out.println("UserDaoImp :: UserDaoImp");
	}
	
	
	@Override
	public String findNameById(Integer id) {
	if(id==200) {
		return "raju";
	}
	else if(id==100) {
		return "rama";
	}
		return null;
	}

}
