package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.BookRepo;
@Service
public class BookService {
	
	@Autowired
	BookRepo  bookRepo;

	public BookService(BookRepo bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}
	
	public void insertBookReordCustomQuery() {
		bookRepo.insertBook(102, "Be Alone", "");
		System.out.println("Inserted Book Successfully...");
	}
	
	
	
	  

}
