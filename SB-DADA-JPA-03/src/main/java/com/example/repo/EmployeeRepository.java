package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

import jakarta.transaction.Transactional;
@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

	//findBy only select query query based on non primary key
	//select * from Employee_Table where empDept= :dept; 
	   List<Employee> findByEmpDept(String empDept);  // Case-sensitive match to entity field
	
	 //select * from Employee_Table where empDept= :dept;
	   List<Employee> findByEmpGender(String empGender);  
	   
	   //select * from Employee_Table where empDept= :dept and empGender= :gen;
	   List<Employee> findByEmpDeptAndEmpGender(String empDept , String empGender); 
	   
	   
	   //select * from Employee_Table where empSaklary > = :salary;
	   List<Employee> findByEmpSalaryGreaterThanEqual(Float empSalary);
	   
	   //custom query
	   @Query("from Employee")
	   List<Employee> getAllEmpRecords();
	   
	   //custom query 
	   @Query("from Employee where empId= :id")
	   List<Employee> getEmpId(Integer id);
	   
	   //delete 
	   @Transactional
	   @Modifying
	   @Query("delete from Employee where empId= :id")
	   public void deleteEmpl(Integer id);
	   
	   @Transactional
	   @Modifying
	   @Query("delete from Employee where empDept= :dept")
	   public int deleteEmpBasedOnDept(String dept);
	   
	   
}
