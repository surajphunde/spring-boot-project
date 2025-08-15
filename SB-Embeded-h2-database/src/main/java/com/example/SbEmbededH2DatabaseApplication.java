package com.example;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.repo") 
public class SbEmbededH2DatabaseApplication {

    private final EmployeeRepo employeeRepo;

    SbEmbededH2DatabaseApplication(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbEmbededH2DatabaseApplication.class, args);
		EmployeeRepo repo = context.getBean(EmployeeRepo.class);
		Employee emp=new Employee();
		emp.setEmployeeName("suraj");
		emp.setEmployeeAdd("Talegaon");
		repo.save(emp);
		System.out.println("Employee added successfully.....");
	
	}

}
