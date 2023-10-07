package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.AXIS_Entity;
import com.producer.AXISProducer;
import com.repository.AXISRepository;
import com.request.AXISRequest;

@RestController
public class AXISNew_Account_Controller {
	
	@Autowired
	private AXISRepository axisRepository;
		
	@PostMapping("/addNewToAxis")
	public ResponseEntity<String>  addNewAccout(@RequestBody AXIS_Entity entity){
		AXIS_Entity save = axisRepository.save(entity);
		System.out.println(save);
		return new ResponseEntity<>("Account Open succesfully",HttpStatus.OK);
	}
	
	

}
