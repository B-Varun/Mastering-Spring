package com.learn.hibernate.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.hibernate.jpa.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
//	@PersistenceContext
	private EntityManager entity;
	
	public void insertNewStudent(Student student) {
		entity.merge(student);
	}
	
	public Student getStudentById(int id) {
		return entity.find(Student.class,id);
    }
	
	public void removeStudentById(int id) {
		Student student = getStudentById(id);
		entity.remove(student);
	}
	
}
