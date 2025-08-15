package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Book;

import jakarta.transaction.Transactional;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
	
	 @Transactional
	 @Modifying
	 @Query(value = "INSERT INTO my_Book2 (book_id, book_name, book_author) VALUES (:bookId, :bookName, :bookAuthor)", nativeQuery = true)
	 public void insertBook(@Param("bookId") Integer bookId,
	                    @Param("bookName") String bookName,
	                    @Param("bookAuthor") String bookAuthor);

}
