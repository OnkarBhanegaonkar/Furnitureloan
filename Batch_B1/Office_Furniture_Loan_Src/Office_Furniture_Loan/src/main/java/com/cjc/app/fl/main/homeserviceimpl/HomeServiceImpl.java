package com.cjc.app.fl.main.homeserviceimpl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.app.fl.main.homeservice.HomeService;
import com.cjc.app.fl.main.model.AllDocuments;
import com.cjc.app.fl.main.model.Cibil;
import com.cjc.app.fl.main.model.Customer1;
import com.cjc.app.fl.main.model.Email;
import com.cjc.app.fl.main.model.Enquiry;
import com.cjc.app.fl.main.repository.AllDocumentRepository;
import com.cjc.app.fl.main.repository.CibilRepository;
import com.cjc.app.fl.main.repository.Customerrepository;
import com.cjc.app.fl.main.repository.enquirydetailrepository;

@Service

public class HomeServiceImpl implements HomeService {

	@Autowired
	enquirydetailrepository edr;
	
	@Autowired
	Customerrepository cr;
	
	@Autowired
	AllDocumentRepository ar;

	@Autowired
	CibilRepository cfr;
	
	@Autowired
	JavaMailSender jms;
	
	@Override
	public Enquiry insertData(Enquiry e) {
		return edr.save(e);
	}

	@Override
	public Customer1 insertData1(Customer1 c) {
		return cr.save(c);
	}

	@Override
	public List<AllDocuments> savedata(AllDocuments d) 	{
		 System.out.println("service data:-"+d);
		    ar.save(d);
			List<AllDocuments> list=ar.findAll();
			return list;
		
	}
	
	
	@Override
	public Iterable<Cibil> getAllCibilData() {
		return cfr.findAll();
	}

	@Override
	public Cibil findDataById(int id) {
		return cfr.findById(id);
	}

	@Override
	public int cibilCheck(String pan) {

		System.out.println("Generating CIBIL for PAN : " + pan);
		Random r = new Random();
		int low = 700;
		int high = 900;
		int result = r.nextInt(high - low) + low;
		System.out.println("random number::" + result);
		if (result > 750) {
			return result;
		} else {
			return result;
		}
	}
	
	@Override
	public Cibil saveCibil(Cibil cibil) {
		return cfr.save(cibil);

	}

	@Override
	public void sendEMail(Email email) {
		
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setFrom(email.getFrom());
		sm.setTo(email.getTo());
		sm.setSubject(email.getSubject());
		sm.setText(email.getMsg());
		
		jms.send(sm);
		
	}

	@Override
	public Iterable<Enquiry> getAllData() {
		// TODO Auto-generated method stub
		return edr.findAll();
	}

	@Override
	public Enquiry updateCust(Enquiry e) {
		// TODO Auto-generated method stub
		return edr.save(e);

	}

	@Override
	public Enquiry getsingle(int eid) {
		// TODO Auto-generated method stub
		 return edr.getById(eid);
	}

	
	
}
