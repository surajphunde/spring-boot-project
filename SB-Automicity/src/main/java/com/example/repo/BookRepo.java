package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, String> {
   
}
