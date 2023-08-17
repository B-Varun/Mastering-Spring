package com.learn.spring.boot.todo.task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	private static List<ToDo> todos;
	
	static {
		todos = new ArrayList<>();
		todos.add(new ToDo(1, "Learn Spring Boot", "Varun@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(2, "Learn AWS", "Varun@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(3, "Learn Coding", "Bailapudi@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(4, "Algorithms", "Bailapudi@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(5, "Data Structures", "Bailapudi@gmail.com", LocalDate.now().plusYears(1), false));
	}
	
	public List<ToDo> getToDos(String userName){
		return todos;
	}
}
