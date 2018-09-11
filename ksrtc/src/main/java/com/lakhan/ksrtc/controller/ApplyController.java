package com.lakhan.ksrtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakhan.ksrtc.model.ApplyModel;
import com.lakhan.ksrtc.repository.ApplyRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ApplyController {

	@Autowired
	ApplyRepository applyRepository;
	
	@PostMapping(value = "/ksrtc/apply")
	public ApplyModel postApply(@RequestBody ApplyModel apply)
	{
		ApplyModel applied = applyRepository.save(new ApplyModel(apply.getfName(),apply.getlName(),apply.getAge(), apply.getDob(),apply.getGender()
				,apply.getMobile(), apply.getEmail(), apply.getPlaceFrom(), apply.getPlaceTo(), apply.getPlaceChangeOver(),apply.getValidFrom()
				,apply.getValidTo(), apply.getAddress()));
		return applied;
	}
}
