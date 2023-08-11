package com.learn.spring.example.office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.spring.example.docs.Documents;

@Component
public class LeasingOffice {
	
	@Autowired
	public Documents documents;
	
	public boolean docsReceived() {
		return documents.areDocumentsReceived;
	}

}
