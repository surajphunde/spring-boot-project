package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.CustomerEntity;

public interface CrudRepo extends JpaRepository<CustomerEntity, Integer>{
	
	

}
