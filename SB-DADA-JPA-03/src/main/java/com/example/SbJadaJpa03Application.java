package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.EmployeeService;

@SpringBootApplication
public class SbJadaJpa03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJadaJpa03Application.class, args);
		EmployeeService bean = context.getBean(EmployeeService.class);
		
		//bean.findByDept("sales");
		//bean.findByEmpGen("male");
	    // bean.findByEmpDeptAndDept("it", "female");
	    // bean.findByEmpSalary(20000.0f);
		//bean.getAllRecord();
		//bean.getEmployeeId(101);
		//bean.deleteEmpl(101);
		bean.deleteEmpDept("java");
	}

}
