package com.learn.spring.boot.learnjpaandhibernate.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.spring.boot.learnjpaandhibernate.college.College;
import com.learn.spring.boot.learnjpaandhibernate.jdbc.CollegeRepository;

@Component
public class CollegeCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CollegeRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new College(1, "Scaramento State University"));
		repository.insert(new College(2, "San Jose State University"));
		repository.insert(new College(3, "San Diego State University"));
		
		
		System.out.println("Deleting the entry from College");
		
		repository.delete(2);
		
	}
	
	

}
