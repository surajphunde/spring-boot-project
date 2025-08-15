package com.example.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repo.RedisRepo;

@RestController
public class RedisRestController {
   
	@Autowired
	RedisRepo  redisRepo;
    @PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
    	redisRepo.save(student);
		return "student saved";	
	}
	
    @GetMapping("/getStudents")
	public Iterable<Student> getAllStudent() {
    	return redisRepo.findAll();
	}
	
	
}
