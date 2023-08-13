package com.learn.hibernate.springJDBC.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.hibernate.springJDBC.model.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String createTable = """
	create table Student(
	id int not null primary key, 
	studentName varchar(40) not null
	)
			""";
	
	private String insertStudent = """
	insert into Student values(?,?);
			""";
	
	public void insertStudentIntoTable(Student student) {
		jdbcTemplate.update(insertStudent, student.getId(), student.getName());
	}
	
	public void createStudentTable() {
		jdbcTemplate.update(createTable);
	}
}