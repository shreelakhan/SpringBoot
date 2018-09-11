package com.lakhan.ksrtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apply")
public class ApplyModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "firstName")
	private String fName;
	
	@Column(name = "lastName")
	private String lName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "contactNumber")
	private long mobile;

	@Column(name = "email")
	private String email;
	
	@Column(name = "placeFrom")
	private String placeFrom;
	
	@Column(name = "placeTo")
	private String placeTo;
	
	@Column(name = "placeChangeOver")
	private String placeChangeOver;
	
	@Column(name = "validFrom")
	private String validFrom;
	
	@Column(name = "validTo")
	private String validTo;
	
	@Column(name = "address")
	private String address;
	
	public ApplyModel() {
		
	}

	public ApplyModel(String fName, String lName, int age, String dob, String gender, long mobile, String email,
			String placeFrom, String placeTo, String placeChangeOver, String validFrom, String validTo,
			String address) {
		
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.placeFrom = placeFrom;
		this.placeTo = placeTo;
		this.placeChangeOver = placeChangeOver;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlaceFrom() {
		return placeFrom;
	}

	public void setPlaceFrom(String placeFrom) {
		this.placeFrom = placeFrom;
	}

	public String getPlaceTo() {
		return placeTo;
	}

	public void setPlaceTo(String placeTo) {
		this.placeTo = placeTo;
	}

	public String getPlaceChangeOver() {
		return placeChangeOver;
	}

	public void setPlaceChangeOver(String placeChangeOver) {
		this.placeChangeOver = placeChangeOver;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ApplyModel [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", dob=" + dob
				+ ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + ", placeFrom=" + placeFrom
				+ ", placeTo=" + placeTo + ", placeChangeOver=" + placeChangeOver + ", validFrom=" + validFrom
				+ ", validTo=" + validTo + ", address=" + address + "]";
	}

	}
