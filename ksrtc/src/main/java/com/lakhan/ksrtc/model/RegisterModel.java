package com.lakhan.ksrtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registeration")
public class RegisterModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "uName")
	private String uName;
	
	@Column(name = "mobile")
	private long mobile;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pass")
	private String pass;

	public RegisterModel() {
	}

	public RegisterModel(String uName, long mobile, String email, String pass) {
		super();
		this.uName = uName;
		this.mobile = mobile;
		this.email = email;
		this.pass = pass;
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "RegisterModel [id=" + id + ", uName=" + uName + ", mobile=" + mobile + ", email=" + email + ", pass="
				+ pass + "]";
	}
	
	
	
}
