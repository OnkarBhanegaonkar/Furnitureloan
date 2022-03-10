package com.cjc.app.fl.main.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.main.homeservice.HomeService;
import com.cjc.app.fl.main.model.Cibil;
import com.cjc.app.fl.main.model.Email;

@CrossOrigin("*")
@RestController
public class CibilController {


//	@Autowired
//	HomeService hs;
//	
//	@Value("${spring.mail.username}")
//	private String fromEmail;
//	
////	@Value("${spring.mail.username}")
////	private String toEmail;
//	
//	@PostMapping("/saveCibil")
//	public String saveCibil(@RequestBody Cibil cf) {
//		hs.saveCibil(cf);
//		return "You have Successfully saved Cibil";
//	}
//	
//	@RequestMapping(value = "/checkCibil/{pan}", method = RequestMethod.GET)
//	public int cibilCheck(@PathVariable String pan) {
//		return hs.cibilCheck(pan);
//	}
//	
//	@RequestMapping(value = "/getallcibildata", method = RequestMethod.GET)
//	public Iterable getAllCibilData() {
//		return hs.getAllCibilData();
//	}
//
//	@RequestMapping(value = "/getcibilById/{id}", method = RequestMethod.GET)
//	public Cibil getbyid(@PathVariable int id) {
//		return hs.findDataById(id);
//	}
//	
//	@PostMapping(value ="sendMail")
//	public String sendMail(@RequestBody Email mail) {
//		String msg = "";
//		try {			
//			System.out.println("Sending mail...");
//			System.out.println( "from " + mail.getFrom());
//			System.out.println( "to " + mail.getFrom());
//			System.out.println( "msg " + mail.getMsg());
//			System.out.println( "subject " + mail.getSubject());
//
//			hs.sendEMail(mail);
//			msg = "Sent";
//		} catch (Exception e) {
//			msg = "Not Sent";
//			e.printStackTrace();
//		}
//		return msg;
//	}
//	
//	
//	@GetMapping("/getNumber")
//	public int getRandmNumber() {
//		Random r = new Random();
//		int low = 700;
//		int high = 900;
//		int result = r.nextInt(high - low) + low;
//		System.out.println("random number::" + result);
//		if (result > 750) {
//			return result;
//		} else {
//			return result;
//		}
//	}
}	
	

