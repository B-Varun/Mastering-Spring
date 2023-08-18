package com.learn.spring.boot.todo.task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class ToDoService {

	private static int count=0;
	private static List<ToDo> todos;
	
	static {
		todos = new ArrayList<>();
		todos.add(new ToDo(++count, "Learn Spring Boot", "Varun@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(++count, "Learn AWS", "Varun@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(++count, "Learn Coding", "Bailapudi@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(++count, "Algorithms", "Bailapudi@gmail.com", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(++count, "Data Structures", "Bailapudi@gmail.com", LocalDate.now().plusYears(1), false));
	}
	
	public List<ToDo> getToDos(String userName){
		return todos;
	}
	
	public void addToDo(String description, String email) {
		ToDo todo = new ToDo(
				++count,description,email,LocalDate.now().plusYears(1),false
				);
		todos.add(todo);
	}
}
