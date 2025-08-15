package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="my_book3")
public class BookEntity {
	@Id
      private String bookId;
      private String bookName;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public BookEntity(String bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
      
}
