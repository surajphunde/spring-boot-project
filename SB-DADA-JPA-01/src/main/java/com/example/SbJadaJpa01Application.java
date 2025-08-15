package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.EmployeeService;

@SpringBootApplication
public class SbJadaJpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJadaJpa01Application.class, args);
		EmployeeService empl=context.getBean(EmployeeService.class);
		
		   
		//empl.SaveEmployee();  //save one employee
		//empl.SaveEmployees();// save all employees
		//empl.findById1(); // find by id one emp
		//empl.findAll();  // find all emp
		//empl.findAllByID(); // find all based on id
        //  empl.deleteById();
		empl.deleteByIdAll();
        System.out.println("Employee saved successfully from main method!");
		
		 
	
	}

}
