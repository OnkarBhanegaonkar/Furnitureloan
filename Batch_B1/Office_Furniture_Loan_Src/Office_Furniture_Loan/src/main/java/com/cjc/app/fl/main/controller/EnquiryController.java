package com.cjc.app.fl.main.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.main.homeservice.HomeService;
import com.cjc.app.fl.main.model.Enquiry;

@CrossOrigin("*")
	@RestController
	public class EnquiryController {

		
		@Autowired
		HomeService hs;
		
		@Autowired
		  public JavaMailSender js;
		
		@PostMapping(value = "/regData")
		
		public ResponseEntity<Enquiry> regData(@RequestBody Enquiry e)
		{
			System.out.println(e);
			Enquiry er=hs.insertData(e);
			
			
			if(er!=null) {
				return new ResponseEntity<Enquiry>(er, HttpStatus.CREATED);//201
			}
			else {
				return new ResponseEntity<Enquiry>( HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			
			
			
			
		}
		
		
		
		
		@GetMapping(value = "/getAllData")
		public Iterable<Enquiry> getAllData()
		{
			return hs.getAllData();
		}
		
		@GetMapping(value="/cibilGenerate")
		public int cibilData()
		{
			 int  min=660;
			 int  max=900;
			   Random random = new Random();
		    return random.nextInt(max - min) + min;
		}
		
		@PutMapping(value="/updateData/{eid}")
		public Enquiry updateData(@RequestBody Enquiry e, @PathVariable ("eid") int eid)
		{
			Enquiry ed=hs.updateCust(e);
			return ed;
		}
		
		@PostMapping("/mail")
		public String send(@RequestBody Enquiry c)
		{
			int eid=c.getEnquiryId();
			
			SimpleMailMessage sm=new SimpleMailMessage();
			Enquiry enq=hs.getsingle(eid );
			sm.setTo(enq.getEmail());
			sm.setSubject("Cibil Status");
			if(c.getStatus().equals("Approved")) {
				sm.setText("Hello,Sir/Ma'am Your loan is approved, Your enquiry id is "+enq.getEnquiryId()+"Your cibil score is"+c.getCibil()+". Please visit bank for Registration.");
				js.send(sm);
				System.out.println(sm);
			}
			else {
				sm.setText("Hello,/n Your Loan request has been rejected due to less cibil score. Your cibil score is "+c.getCibil());
				js.send(sm);
				System.out.println(sm);
			}
			return "Send";
		}

		
		
		
	}


