package com.lakhan.ksrtc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakhan.ksrtc.model.RegisterModel;
import com.lakhan.ksrtc.repository.RegisterRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RegisterController {
	
	@Autowired
	RegisterRepository registerRepository;
	
	@PostMapping(value = "/ksrtc/register")
	public RegisterModel postRegister(@RequestBody RegisterModel register)
	{
		RegisterModel registerd = registerRepository.save(new RegisterModel(register.getuName(),register.getMobile(), register.getEmail(),register.getPass()));
		return registerd;
	}
	
	@GetMapping(value = "/ksrtc/getReg")
	public List<RegisterModel> getAll(){ 
		List<RegisterModel> reg = new ArrayList<>();
		registerRepository.findAll().forEach(reg::add);
		
		return reg;
		
	}
	
	@DeleteMapping("/ksrtc/delReg/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
		System.out.println("Delete Customer with ID = " + id + "...");

		registerRepository.deleteById(id);

		return new ResponseEntity<>("Deleted Succesfully!", HttpStatus.OK);
	}
	
//	@PutMapping("/customers/{id}")
//	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
//		System.out.println("Update Customer with ID = " + id + "...");
//
//		Optional<Customer> customerData = repository.findById(id);
//
//		if (customerData.isPresent()) {
//			Customer _customer = customerData.get();
//			_customer.setName(customer.getName());
//			_customer.setAge(customer.getAge());
//			_customer.setActive(customer.isActive());
//			return new ResponseEntity<>(repository.save(_customer), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
}
