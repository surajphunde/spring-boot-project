package com.example.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="my_table1")
public class Contact {
       
	private String contName;
	private String contAddr;
	
	@EmbeddedId
	ContactPK contactPk;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getContName() {
		return contName;
	}

	public void setContName(String contName) {
		this.contName = contName;
	}

	public String getContAddr() {
		return contAddr;
	}

	public void setContAddr(String contAddr) {
		this.contAddr = contAddr;
	}

	public ContactPK getContactPk() {
		return contactPk;
	}

	public void setContactPk(ContactPK contactPk) {
		this.contactPk = contactPk;
	}

	@Override
	public String toString() {
		return "Contact [contName=" + contName + ", contAddr=" + contAddr + ", contactPk=" + contactPk + "]";
	}

	public Contact(String contName, String contAddr, ContactPK contactPk) {
		super();
		this.contName = contName;
		this.contAddr = contAddr;
		this.contactPk = contactPk;
	}
	
	
	
}
