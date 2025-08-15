package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;
@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

}
