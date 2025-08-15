package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.BookEntity;
import com.example.entity.EmployeeEntity;
import com.example.repo.BookRepo;
import com.example.repo.EmployeeRepo;

import jakarta.transaction.Transactional;
@Service
public class BookService {

	
	private final BookRepo bookRepo;
    private final EmployeeRepo employeeRepo;
	
	public BookService(BookRepo bookRepo, EmployeeRepo employeeRepo) {
		super();
		this.bookRepo = bookRepo;
		this.employeeRepo = employeeRepo;
	}

	@Transactional   //automicity rollback transaction if fail or all success
	public void saveBook() {
		BookEntity be=new BookEntity();
		be.setBookId("3");
		be.setBookName("karna");
		bookRepo.save(be);
		
		int rolln=10/0;//arithmatic exception
		
		EmployeeEntity e=new EmployeeEntity();
		e.setBookId("5");
		e.setEmpAdd("hyd");
		e.setEmpName("sham");
		employeeRepo.save(e);
		System.out.println("Book Saved...");
	}
	
	
}
