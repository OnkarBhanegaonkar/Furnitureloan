package com.cjc.app.fl.main.controller;



import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.app.fl.main.homeservice.HomeService;
import com.cjc.app.fl.main.model.AllDocuments;
import com.cjc.app.fl.main.model.Customer1;
import com.google.gson.Gson;

@RestController
public class AllDocumentController {

	@Autowired
	HomeService sl;
	
	@PostMapping(value="/addDoc", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<List<AllDocuments>>  list(@RequestPart(required=true, value="addressproof") MultipartFile files1,
			@RequestPart(required=true, value="pancard") MultipartFile files2,
			@RequestPart(required=true, value="itr") MultipartFile files3,
			@RequestPart(required=true, value="adharCard") MultipartFile files4,
			
			@RequestPart(required=true, value="passphoto") MultipartFile files5,
			@RequestPart(required=true, value="signature") MultipartFile files6,
			@RequestPart(required=true, value="thumbimprssion") MultipartFile files7,
			
			@RequestPart(required=true, value="bankCheque") MultipartFile files8,
			@RequestPart(required=true, value="bankStatement") MultipartFile files9,
		
			
			
		@RequestPart("doc") String doc) throws IOException
	
	{
		AllDocuments d=new AllDocuments();
		
		d.setAddressproof(files1.getBytes());
		
		d.setPancard(files2.getBytes());
		
		d.setItr(files3.getBytes());
		
		d.setAdharCard(files4.getBytes());
		
		d.setPassphoto(files5.getBytes());
		
		d.setSignature(files6.getBytes());
		
		d.setThumbimprssion(files7.getBytes());
		
		d.setBankCheque(files8.getBytes());
		
		d.setBankStatement(files9.getBytes());
		
		
		
		
		
		Gson gson=new Gson();
		
		AllDocuments d1=gson.fromJson(doc, AllDocuments.class);
		
		d.setStatus(d1.getStatus());
		d.setCid(d1.getCid());
		List<AllDocuments> list1=sl.savedata(d);

		if(!list1.isEmpty())
{
			return new ResponseEntity<List<AllDocuments>>(list1, HttpStatus.CREATED);//201
		}
		else {
			return new ResponseEntity<List<AllDocuments>>( HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
