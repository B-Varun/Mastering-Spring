package com.learn.rest.courses.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.rest.courses.course.Course;

@RestController
public class CourseController {

	//http://localhost:8080/courses
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
		new Course(1, "Spring", "Pivotal"),
		new Course(2, "Java", "Oracle"),
		new Course(3, "C", "Dennis"),
		new Course(4, "C++", "Stroustrup")
		);
	}
}
