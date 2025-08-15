package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Contact;

public interface ConractRepo extends JpaRepository<Contact, Integer>{

}
