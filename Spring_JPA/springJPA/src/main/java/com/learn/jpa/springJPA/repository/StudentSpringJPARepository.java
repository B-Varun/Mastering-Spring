package com.learn.jpa.springJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.jpa.springJPA.model.Student;


public interface StudentSpringJPARepository extends JpaRepository<Student, Integer>{
	
}