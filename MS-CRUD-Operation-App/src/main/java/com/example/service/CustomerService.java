package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CustomerEntity;
import com.example.repo.CrudRepo;

@Service
public class CustomerService {
	@Autowired
	CrudRepo crudRepo;

	public CustomerService(CrudRepo crudRepo) {
		super();
		this.crudRepo = crudRepo;
	}

	// for updation and insertion based on PK
	public String upsert(CustomerEntity customerEntity) {
		crudRepo.save(customerEntity);
		return "success";
	}

	// find by customer id
	public CustomerEntity getById(Integer id) {
		Optional<CustomerEntity> byId = crudRepo.findById(id);
		if (byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	// find all record
	public List<CustomerEntity> getAllCustomer() {
		return crudRepo.findAll();

	}

	public String deleteById(Integer id) {
	    if (crudRepo.existsById(id)) {
	        crudRepo.deleteById(id);
	        return "Deleted successfully";
	    } else {
	        return "Customer with ID " + id + " not found";
	    }
	}


}
