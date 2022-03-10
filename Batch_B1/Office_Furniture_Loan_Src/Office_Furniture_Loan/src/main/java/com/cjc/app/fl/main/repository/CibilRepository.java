package com.cjc.app.fl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.main.model.Cibil;

@Repository
public interface CibilRepository extends JpaRepository<Cibil, Integer> {
	
	
	public Cibil findById(int id);

}
