package com.cabbooking.com.resgistration.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cabbooking.com.entity.Driver;

public interface DriverRegistrationRepository extends CrudRepository<Driver, Long>  {

	List<Driver> findByCurrLocation(String currLocation);
	
	

}
