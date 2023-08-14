package com.learn.jpa.springJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.jpa.springJPA.model.Student;
import com.learn.jpa.springJPA.repository.StudentSpringJPARepository;

@Component
public class StudentCommandLineRunner implements CommandLineRunner{

	@Autowired
	private StudentSpringJPARepository repository;
		
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Student(1,"Varun"));
		repository.save(new Student(2, "Bailapudi"));
		
		System.out.println("All students are : "+repository.findAll());
		repository.delete(new Student(1, "Varun"));
	}

}
