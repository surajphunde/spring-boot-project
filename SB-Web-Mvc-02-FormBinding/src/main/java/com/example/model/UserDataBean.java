package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class UserDataBean {
	@NotBlank(message = "Name is required")
	private String name;
	@NotBlank(message = "City is required")
	private String city;
	@NotBlank(message = "email is required")
	@Email(message = "Enter a valid email")
	private String email;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
