package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="my_contact2")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_gen")
	@SequenceGenerator(name = "emp_seq_gen", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
	private Integer contNum;
	private String contName;
	private String contAdd;
	public Integer getContNum() {
		return contNum;
	}
	public void setContNum(Integer contNum) {
		this.contNum = contNum;
	}
	public String getContName() {
		return contName;
	}
	public void setContName(String contName) {
		this.contName = contName;
	}
	public String getContAdd() {
		return contAdd;
	}
	public void setContAdd(String contAdd) {
		this.contAdd = contAdd;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Integer contNum, String contName, String contAdd) {
		super();
		this.contNum = contNum;
		this.contName = contName;
		this.contAdd = contAdd;
	}
	@Override
	public String toString() {
		return "Contact [contNum=" + contNum + ", contName=" + contName + ", contAdd=" + contAdd + "]";
	}
}
