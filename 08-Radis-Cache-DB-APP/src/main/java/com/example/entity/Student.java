package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("studenthash")
public class Student {

	private Integer id;
	private String Name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}
	public Student(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
