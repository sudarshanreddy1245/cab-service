package com.cabbooking.com.resgistration.repository;

import org.springframework.data.repository.CrudRepository;

import com.cabbooking.com.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>  {

}
