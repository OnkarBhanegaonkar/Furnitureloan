package com.cjc.app.fl.main.homeservice;

import java.util.List;

import com.cjc.app.fl.main.model.AllDocuments;
import com.cjc.app.fl.main.model.Cibil;
import com.cjc.app.fl.main.model.Customer1;
import com.cjc.app.fl.main.model.Email;
import com.cjc.app.fl.main.model.Enquiry;

public interface HomeService {

	Enquiry insertData(Enquiry e);

	Customer1 insertData1(Customer1 c);

	List<AllDocuments> savedata(AllDocuments d);

public Cibil saveCibil(Cibil cibil);
	
	public Iterable<Cibil> getAllCibilData();

	public Cibil findDataById(int id);
	
	public int cibilCheck(String pan);
	
	public void sendEMail(Email email);

	Iterable<Enquiry> getAllData();

	Enquiry updateCust(Enquiry e);

	Enquiry getsingle(int eid);

}
