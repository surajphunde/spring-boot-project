package com.example.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; //restController convert object to json format & json to object

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Customer;

@RestController
public class CustomerRestController {
	
	@DeleteMapping("/customer/{id}")  //rest api method
	public String  deleteCustomer(@PathVariable Integer id) {	
		return "deleted cust...";
	}
	
	@PutMapping("/customer") //rest api method
	public String  updateCustomer(@RequestBody Customer c) {
		System.out.println(c);
		return "Customer updated...";
	}
	//json to obj  conversion automatic used @RequestBody 
	//for post response code should be 201 created
	@PostMapping(value="/customer",produces = "text/plain",consumes ="application/json" )
	public ResponseEntity<String>  addCustomer(@RequestBody Customer c) {
		System.out.println(c);
		String body= "Customer Added...";
		return new ResponseEntity<String>(body, HttpStatus.CREATED);
		
	}
	//object to json conversion automatic
	@GetMapping(value="/getdata",produces = "application/json") //rest api method
	public Customer getCustomer() {
		Customer c=new Customer(101, "suraj","suraj@gmail.com");		
		return c;	
	}
	@GetMapping(value="/getcustlist",produces ="application/json")
	public  List<Customer> getListOfCust(){ //rest api method
		Customer c=new Customer(101, "suraj","suraj@gmail.com");		
		Customer c1=new Customer(102, "om","om@gmail.com");		
		Customer c2=new Customer(103, "pranav","pranav@gmail.com");		
		Customer c3=new Customer(104, "ankush","ankush@gmail.com");	
		List<Customer> al=Arrays.asList(c,c1,c2,c3);
		return al;
		
	}

}
