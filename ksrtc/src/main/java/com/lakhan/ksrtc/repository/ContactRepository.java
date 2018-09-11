package com.lakhan.ksrtc.repository;

import org.springframework.data.repository.CrudRepository;

import com.lakhan.ksrtc.model.ContactModel;

public interface ContactRepository extends CrudRepository<ContactModel, Long> {

}
