package com.example.repo;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Contact;
import com.example.entity.ContactPK;

public interface ContactRepo extends JpaRepository<Contact,ContactPK>{

}
