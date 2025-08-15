package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String>{

}
