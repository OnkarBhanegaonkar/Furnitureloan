package com.cjc.app.fl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.main.model.Customer1;



@Repository
public interface Customerrepository extends JpaRepository<Customer1, Integer>{

}
