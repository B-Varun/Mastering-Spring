package com.learn.spring.boot.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learn.spring.boot.todo.task.ToDoService;

@Controller
public class ToDoController {
	
	private ToDoService toDoService;
	
	public ToDoController(ToDoService todoService) {
		toDoService = todoService;
	}

	@RequestMapping("list-todos")
	public String displayToDos(ModelMap model) {
		model.put("todos", toDoService.getToDos("Varun"));
		return "/WEB-INF/jsp/listToDos.jsp";
	}
	
}
