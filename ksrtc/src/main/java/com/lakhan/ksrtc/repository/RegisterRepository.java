package com.lakhan.ksrtc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lakhan.ksrtc.model.RegisterModel;


public interface RegisterRepository extends CrudRepository<RegisterModel, Long> {
	
	List<RegisterModel> findById(long id);
}
