package com.water.service.waterService.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.service.waterService.entity.CustomerMasterEntity;
import com.water.service.waterService.repository.CustomerRepository;
import com.water.service.waterService.service.CustomerService;

import lombok.AllArgsConstructor;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerMasterEntity createCustomer(CustomerMasterEntity customerMasterEntity) {
		String mob=customerMasterEntity.getMobileNo().toString();
		if(mob.length() == 10){
		CustomerMasterEntity customerMasterEntity2=customerRepository.save(customerMasterEntity);
		return customerMasterEntity2;
		}
		return null;
	}

	@Override
	public CustomerMasterEntity getCustomerById(int id) {
		Optional<CustomerMasterEntity> customerMasterEntity = customerRepository.findById(id);
		return customerMasterEntity.orElse(null);
	}


}
