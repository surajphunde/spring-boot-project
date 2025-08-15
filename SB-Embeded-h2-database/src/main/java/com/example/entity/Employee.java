package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="my_Employee1")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_gen")
	@SequenceGenerator(name = "emp_seq_gen", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
	private Integer employeeId;
	private String employeeName;
	private String employeeAdd;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAdd() {
		return employeeAdd;
	}
	public void setEmployeeAdd(String employeeAdd) {
		this.employeeAdd = employeeAdd;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAdd=" + employeeAdd
				+ "]";
	}
	public Employee(Integer employeeId, String employeeName, String employeeAdd) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAdd = employeeAdd;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
