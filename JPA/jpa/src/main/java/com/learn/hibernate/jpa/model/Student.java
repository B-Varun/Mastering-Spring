package com.learn.hibernate.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	
	private String studentName;

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public Student() {}
	
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}
	
	

}
