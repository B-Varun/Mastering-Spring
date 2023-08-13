package com.learn.spring.boot.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.learn.spring.boot.learnjpaandhibernate.college.College;

@Component
public class CollegeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String insertString = "insert into College values"
			+ "(?,?)";
	
	private static String deleteString = """
					delete from College where id=?
			""";
	
	public void insert(College college) {
		jdbcTemplate.update(insertString, college.getId(), college.getCollegeName());
	}
	
	public void delete(int id) {
		jdbcTemplate.update(deleteString, id);
	}
	
	
}