package com.cjc.app.fl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.main.model.Enquiry;



@Repository
public interface enquirydetailrepository extends JpaRepository<Enquiry, Integer>{

	
}
