package com.learn.spring.boot.learnjpaandhibernate.college;

public class College {
	
	public int id;
	public String collegeName;
	
	public College(int id, String name) {
		this.id = id;
		this.collegeName = name;
	}

	public int getId() {
		return id;
	}

	public String getCollegeName() {
		return collegeName;
	}
	
//	public String toString() {
//		return "id : "+getId()+", College Name : "+getCollegeName();
//	}

}
