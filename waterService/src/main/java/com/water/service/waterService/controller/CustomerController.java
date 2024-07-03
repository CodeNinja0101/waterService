package com.water.service.waterService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.water.service.waterService.entity.CustomerMasterEntity;
import com.water.service.waterService.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping(value="/create")
	public CustomerMasterEntity createCustomer(@RequestBody CustomerMasterEntity customerMasterEntity ) {
	return customerService.createCustomer(customerMasterEntity);	
	}
	
	 @GetMapping(value = "customer/{id}")
	public CustomerMasterEntity getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}

}
