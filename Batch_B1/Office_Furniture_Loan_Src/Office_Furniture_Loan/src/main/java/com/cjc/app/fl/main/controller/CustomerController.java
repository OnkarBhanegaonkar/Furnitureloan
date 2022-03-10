package com.cjc.app.fl.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.main.homeservice.HomeService;
import com.cjc.app.fl.main.model.Customer1;
import com.cjc.app.fl.main.model.Enquiry;

@CrossOrigin("*")
@RestController
public class CustomerController {

	@Autowired
	HomeService sl;
	
	@PostMapping(value="/custregdata")
	public ResponseEntity<Customer1> regData(@RequestBody Customer1 c)
	{
		Customer1 cr=sl.insertData1(c);
	
		

		if(cr!=null) {
			return new ResponseEntity<Customer1>(cr, HttpStatus.CREATED);//201
		}
		else {
			return new ResponseEntity<Customer1>( HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
}
