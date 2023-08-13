package com.learn.hibernate.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.hibernate.jpa.model.Student;
import com.learn.hibernate.jpa.repository.StudentRepository;

@Component
public class StudentCommandLineRunner implements CommandLineRunner{

	@Autowired 
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		studentRepository.insertNewStudent(new Student(1, "Varun"));
		studentRepository.insertNewStudent(new Student(2, "Bailapudi"));
		studentRepository.insertNewStudent(new Student(3, "B.Varun"));
		studentRepository.insertNewStudent(new Student(4, "Varun B"));
		studentRepository.insertNewStudent(new Student(5, "Varun Bailapudi"));
		
		System.out.println("Retrieved student with id = 1 : "+studentRepository.getStudentById(1));
		
		studentRepository.removeStudentById(1);
		
		System.out.println("Retrieved student with id = 2 : "+studentRepository.getStudentById(2));
		System.out.println("Retrieved student with id = 1 : "+studentRepository.getStudentById(1));
	}

}
