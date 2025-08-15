package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Table")
public class Employee {
	
		@Id
	    public int empId;
	    public String empName;
	    public String empGender;
	    public String empDept;
	    public Float empSalary;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int empId, String empName, String empGender, String empDept, Float empSalary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empGender = empGender;
			this.empDept = empDept;
			this.empSalary = empSalary;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpGender() {
			return empGender;
		}
		public void setEmpGender(String empGender) {
			this.empGender = empGender;
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}
		public Float getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(Float empSalary) {
			this.empSalary = empSalary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empGender=" + empGender + ", empDept="
					+ empDept + ", empSalary=" + empSalary + "]";
		}
		
	    
	    
}