package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_survey")
public class Student {
	//identifying id as primary key in the database
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private long zip;
	
	@Column(name="phonenumber")
	private long phonenumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="date")
	private String date;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name="reason1")
	private String reason1;
	
	@Column(name="reason2")
	private String reason2;
	
	@Column(name="reason3")
	private String reason3;
	
	@Column(name="reason4")
	private String reason4;
	
	@Column(name="recommenduni")
	private String recommenduni;
	
	@Column(name="comment")
	private String comment;
	
	
	public Student()
	{
		
	}
	public Student(String username, String address, String city, String state, long zip, long phonenumber,
			String email, String date, String fav, String loc, String campus, String atm, String dorm, String sport,String reason,
			String reason1, String reason2, String reason3, String reason4, String recommenduni, String comment) {
		super();
		this.username = username;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phonenumber = phonenumber;
		this.email = email;
		this.date = date;
		this.reason = reason;
		this.reason1 = reason1;
		this.reason2 = reason2;
		this.reason3 = reason3;
		this.reason4 = reason4;
		this.recommenduni = recommenduni;
		this.comment = comment;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getReason1() {
		return reason1;
	}
	public void setReason1(String reason1) {
		this.reason1 = reason1;
	}
	public String getReason2() {
		return reason2;
	}
	public void setReason2(String reason2) {
		this.reason2 = reason2;
	}
	public String getReason3() {
		return reason3;
	}
	public void setReason3(String reason3) {
		this.reason3 = reason3;
	}
	public String getReason4() {
		return reason4;
	}
	public void setReason4(String reason4) {
		this.reason4 = reason4;
	}
	public String getRecommenduni() {
		return recommenduni;
	}
	public void setRecommenduni(String recommenduni) {
		this.recommenduni = recommenduni;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
