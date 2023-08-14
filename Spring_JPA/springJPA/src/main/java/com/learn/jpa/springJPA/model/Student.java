package com.learn.jpa.springJPA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;

	public Student() {}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Student [id = "+getId()+", name = "+getName()+" ]";
	}
	
}