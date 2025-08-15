package com.example.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class ContactPK {
	private Integer contId;
	private Integer contNum;
	public Integer getContId() {
		return contId;
	}
	public void setContId(Integer contId) {
		this.contId = contId;
	}
	public Integer getContNum() {
		return contNum;
	}
	public void setContNum(Integer contNum) {
		this.contNum = contNum;
	}
	@Override
	public String toString() {
		return "Contact [contId=" + contId + ", contNum=" + contNum + "]";
	}
	public ContactPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactPK(Integer contId, Integer contNum) {
		super();
		this.contId = contId;
		this.contNum = contNum;
	}
	
}
