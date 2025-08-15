package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.OrderDetailsEntity;
import com.example.generator.OrderIdGenerator;

public interface CustomeRepo extends JpaRepository<OrderDetailsEntity,String>{

}
