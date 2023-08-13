package com.learn.hibernate.springJDBC.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.hibernate.springJDBC.jdbc.StudentRepository;
import com.learn.hibernate.springJDBC.model.Student;

@Component
public class StudentCommandLineRunner implements CommandLineRunner{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		studentRepository.createStudentTable();
		studentRepository.insertStudentIntoTable(new Student(1, "Varun"));
	}

}
