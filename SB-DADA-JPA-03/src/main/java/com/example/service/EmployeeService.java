package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	EmployeeRepository  employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void findByDept(String dept) {
		List<Employee> employees = (List<Employee>) employeeRepository.findByEmpDept(dept);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public void findByEmpGen(String gen) {
		List<Employee> employees = (List<Employee>) employeeRepository.findByEmpGender(gen);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	public void findByEmpDeptAndDept(String dept, String gen) {
		List<Employee> employees = (List<Employee>) employeeRepository.findByEmpDeptAndEmpGender(dept,gen);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	public void findByEmpSalary(Float salary) {
		List<Employee> employees = (List<Employee>) employeeRepository.findByEmpSalaryGreaterThanEqual(salary);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	public void getAllRecord() {
		List<Employee> employees = (List<Employee>) employeeRepository.getAllEmpRecords();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	public void getEmployeeId(Integer id) {
		List<Employee> employees = (List<Employee>) employeeRepository.getEmpId(id);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	public void deleteEmpl(Integer id) {
		employeeRepository.deleteEmpl(id);
		
	}
	
	public void deleteEmpDept(String dept) {
		int count = employeeRepository.deleteEmpBasedOnDept(dept);
		if (count > 0) {
			System.out.println("Employee Deleted successfully....");
		} else {
			System.out.println("Employee not deleted....");
		}
	}
	
	

}
