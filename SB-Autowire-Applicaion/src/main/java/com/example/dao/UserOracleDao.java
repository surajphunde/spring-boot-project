package com.example.dao;

import org.springframework.stereotype.Component;

@Component("oracle")
public class UserOracleDao implements UserDao{

	public UserOracleDao() {
		System.out.println("UserOracleDao :: UserOracleDao");
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

