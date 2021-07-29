package com.cabbooking.com.resgistration;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabbooking.com.entity.Customer;
import com.cabbooking.com.entity.Driver;
import com.cabbooking.com.resgistration.service.CabBookingService;

@RestController(value = "/cab-service")
public class CabServiceController {
	
	@Autowired
	private CabBookingService service;
	
	@PostMapping(name = "/registration/driver")
	public void registration(@RequestBody Driver driver) {
		Driver driver2 = service.createDriver(driver);
		System.out.println(driver2);
	}
	
	@PostMapping(name = "/registration/customer")
	public void registration(@RequestBody Customer customer) {
		Customer customer2 = service.createCustomer(customer);
		System.out.println(customer2);
	}
	
	@GetMapping(name = "/search")
	public List<Driver> getCabDetails(@PathParam(value = "location") String location) {
		
		return service.serachCabDeatils(location);
		
	}
	

}
