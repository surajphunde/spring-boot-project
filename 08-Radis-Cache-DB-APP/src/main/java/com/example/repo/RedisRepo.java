package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Student;

public interface RedisRepo extends CrudRepository<Student, Integer>{

}
