package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
     private Integer id;
     private String name;
     private String email;
     private Long phNo;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer id, String name, String email, Long phNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phNo = phNo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + "]";
	}
}
