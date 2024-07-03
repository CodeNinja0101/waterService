package com.water.service.waterService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.water.service.waterService.entity.CustomerMasterEntity;

public interface CustomerRepository extends JpaRepository<CustomerMasterEntity, Integer> {

}
