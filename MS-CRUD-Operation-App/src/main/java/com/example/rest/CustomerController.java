package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CustomerEntity;
import com.example.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/create")
	public ResponseEntity<String> createCustomer(@RequestBody CustomerEntity customerEntity) {
		String status = customerService.upsert(customerEntity);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);

	}

	@PutMapping("/updatecust")
	public ResponseEntity<String> updateCust(@RequestBody CustomerEntity customerEntity) {
		String status = customerService.upsert(customerEntity);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);

	}

	@GetMapping("/cust/{id}")
	public ResponseEntity<CustomerEntity> getByCustId(@PathVariable Integer id) {
		CustomerEntity byId = customerService.getById(id);
		return new ResponseEntity<CustomerEntity>(byId, HttpStatus.OK);

	}
	@DeleteMapping("/custdele/{id}")
	public ResponseEntity<String> deleteByCustId(@PathVariable Integer id) {
	    String status = customerService.deleteById(id);

	    if (status.equals("Deleted successfully")) {
	        return new ResponseEntity<>(status, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(status, HttpStatus.NOT_FOUND);
	    }
	}

	// get All Customer
	@GetMapping("/customer")
	public ResponseEntity<List<CustomerEntity>> getAllCust() {
		List<CustomerEntity> allCustomer = customerService.getAllCustomer();
		return new ResponseEntity<List<CustomerEntity>>(allCustomer, HttpStatus.OK);

	}

}
