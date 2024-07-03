package com.water.service.waterService.service;

import java.util.Optional;

import com.water.service.waterService.entity.CustomerMasterEntity;

public interface CustomerService {

	CustomerMasterEntity createCustomer(CustomerMasterEntity customerMasterEntity);
	
	CustomerMasterEntity getCustomerById(int id);
}
