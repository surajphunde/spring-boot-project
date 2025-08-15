package com.example.entity;

import java.util.Date;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="generate_table")
public class OrderDetailsEntity {
    @Id
	@GeneratedValue(generator = "custom-id-generator")
	@GenericGenerator(
	    name = "custom-id-generator",
	    strategy = "com.example.generator.OrderIdGenerator"  // Fully qualified class name
	)

	private String orderId;
	private String orderBy;
    @Temporal(TemporalType.DATE)
	private Date orderPlaceDate;
	
	
	public OrderDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetailsEntity(String orderId, String orderBy, Date orderPlaceDate) {
		super();
		this.orderId = orderId;
		this.orderBy = orderBy;
		this.orderPlaceDate = orderPlaceDate;
	}
	@Override
	public String toString() {
		return "OrderDetailsEntity [orderId=" + orderId + ", orderBy=" + orderBy + ", orderPlaceDate=" + orderPlaceDate
				+ "]";
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Date getOrderPlaceDate() {
		return orderPlaceDate;
	}
	public void setOrderPlaceDate(Date orderPlaceDate) {
		this.orderPlaceDate = orderPlaceDate;
	}
	
	
	
}
