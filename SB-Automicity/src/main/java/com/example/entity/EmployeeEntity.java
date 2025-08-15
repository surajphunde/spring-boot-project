package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="my_emp3")
public class EmployeeEntity {
	@Id
	private String empName;
	private String empAdd;
	private String bookId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empName=" + empName + ", empAdd=" + empAdd + ", bookId=" + bookId + "]";
	}
	public EmployeeEntity(String empName, String empAdd, String bookId) {
		super();
		this.empName = empName;
		this.empAdd = empAdd;
		this.bookId = bookId;
	}

}
