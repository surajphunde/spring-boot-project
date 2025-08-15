package com.example.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
    private Integer contactNum;
	private String contactName;
	@CreationTimestamp
	@Column(name="cont_datecreated" ,updatable = false)
	private LocalDateTime createdDate;
	@UpdateTimestamp
	@Column(name="cont_dateupdated", insertable  = false)
	private LocalDateTime updatedDate;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Integer contactNum, String contactName, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super();
		this.contactNum = contactNum;
		this.contactName = contactName;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public Integer getContactNum() {
		return contactNum;
	}
	public void setContactNum(Integer contactNum) {
		this.contactNum = contactNum;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Contact [contactNum=" + contactNum + ", contactName=" + contactName + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	
	
    
}
