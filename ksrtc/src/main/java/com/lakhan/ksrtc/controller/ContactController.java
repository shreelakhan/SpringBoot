package com.lakhan.ksrtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakhan.ksrtc.model.ContactModel;
import com.lakhan.ksrtc.repository.ContactRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ContactController {

	@Autowired
	ContactRepository contactRepository;
	
	@PostMapping(value = "/ksrtc/contact")
	public ContactModel postContact(@RequestBody ContactModel contact)
	{
		ContactModel con = contactRepository.save(new ContactModel(contact.getName(),contact.getMobile(),contact.getEmailId(),contact.getMsg()));
		return con;
	}
}
