package com.cjc.app.fl.main.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cjc.app.fl.main.model.AllDocuments;

@Transactional
@Repository
public interface AllDocumentRepository extends JpaRepository< AllDocuments, Integer>
{
	
}
