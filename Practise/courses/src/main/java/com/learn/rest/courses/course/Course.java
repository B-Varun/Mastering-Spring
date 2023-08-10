package com.learn.rest.courses.course;

public class Course {

	private String courseName, authorName;
	private int id;
	
	public Course(int id, String course, String author) {
//		super();
		this.id = id;
		this.courseName = course;
		this.authorName = author;
	}
	
	public String toString() {
		return "Course = [id = "+id+" , CourseName = "+courseName+" , AuthorName = "+authorName+"]";
	}

	public String getCourseName() {
		return courseName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getId() {
		return id;
	}
	
	
}
