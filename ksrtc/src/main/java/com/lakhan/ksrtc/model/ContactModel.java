package com.lakhan.ksrtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class ContactModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name; 
	
	@Column(name = "mobile")
	private long mobile;
	
	@Column(name = "emailId")
	private String emailId; 
	
	@Column(name = "message")
	private String msg;

	public ContactModel() {
	}

	public ContactModel(String name, long mobile, String emailId, String msg) {
		this.name = name;
		this.mobile = mobile;
		this.emailId = emailId;
		this.msg = msg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ContactModel [id=" + id + ", name=" + name + ", mobile=" + mobile + ", emailId=" + emailId + ", msg="
				+ msg + "]";
	} 
	
	
}
