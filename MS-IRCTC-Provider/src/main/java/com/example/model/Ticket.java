
package com.example.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	    @Id
	    private Integer tickerNbr;
	    private String name;
	    private int age;
	    private String email;
	    private String bookingStatus;
		public Integer getTickerNbr() {
			return tickerNbr;
		}
		public void setTickerNbr(Integer tickerNbr) {
			this.tickerNbr = tickerNbr;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getBookingStatus() {
			return bookingStatus;
		}
		public void setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
		}
	    
}