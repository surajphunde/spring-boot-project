package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	//save one
	public  void SaveEmployee() {
		Employee e=new Employee();
		e.setId(101);
		e.setName("suraj");
		e.setGender("male");
		e.setDept("IT");
		e.setSalary(1000.0);

		 employeeRepository.save(e);  // Save employee to the database
	        System.out.println("Employee record saved successfully!");
	}
	
	//save all
	public  void SaveEmployees() {
		ArrayList a=new ArrayList<>();
		Employee e=new Employee();
		e.setId(108);
		e.setName("suraj");
		e.setGender("male");
		e.setDept("IT");
		e.setSalary(1000.0);
        
		Employee e1=new Employee();
		e1.setId(104);
		e1.setName("rohit");
		e1.setGender("male");
		e1.setDept("IT-HR");
		e1.setSalary(10000.0);
		employeeRepository.saveAll(Arrays.asList(e,e1)); //Save employees to the database
	     System.out.println("Employee record saved successfully!");
	}
	
	//find by id	
	public void findById1() {
		Optional<Employee> byId = employeeRepository.findById(101);
		if (byId.isPresent()) {
			System.out.println("Employee Found: " + byId.get());
		} else {
			System.out.println("Employee Not Found");
		}
	}
	//find all by id
	public void findAllByID() {
	   List<Integer> list = Arrays.asList(103, 105); // List of Employee IDs

	      Iterable<Employee> allById = employeeRepository.findAllById(list);
	      allById.forEach(System.out::println);
	}
	//find all
	public void findAll() {
	  //  List<Integer> list = Arrays.asList(103, 105); // List of Employee IDs

	    Iterable<Employee> iterable = employeeRepository.findAll();
	    iterable.forEach(System.out::println);
	}
	//delete by id
		public void deleteById() {
		  //  List<Integer> list = Arrays.asList(103, 105); // List of Employee IDs

		     employeeRepository.deleteById(103);
		}
		
		// delete by id multi
		public void deleteByIdAll() {
		List<Integer> list = Arrays.asList(103, 105); // List of Employee IDs

			employeeRepository.deleteAllById(list);
		}
	
	
}
