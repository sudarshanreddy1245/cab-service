package com.cabbooking.com.resgistration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbooking.com.entity.Customer;
import com.cabbooking.com.entity.Driver;
import com.cabbooking.com.resgistration.repository.CustomerRepository;
import com.cabbooking.com.resgistration.repository.DriverRegistrationRepository;

@Service
public class CabBookingService {
	
	@Autowired  
	DriverRegistrationRepository driverRegistrationRepository;
	
	@Autowired
	CustomerRepository customerRepository;

	@Transactional
	public Driver createDriver(Driver driver) {
		return driverRegistrationRepository.save(driver);
	}

	@Transactional
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Driver> serachCabDeatils(String currLocation) {
		return driverRegistrationRepository.findByCurrLocation(currLocation);
	}
	
	

}
