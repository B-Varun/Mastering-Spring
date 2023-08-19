package com.learn.spring.boot.todo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learn.spring.boot.todo.task.ToDo;
import com.learn.spring.boot.todo.task.ToDoService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("email")
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
	
	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String addToDo(ModelMap model) {
		String mail = (String)model.get("email");
		ToDo todo = new ToDo(1,
				"default Description",mail,
				LocalDate.now().plusYears(1), false
				);
		model.put("todo", todo);
		return "/WEB-INF/jsp/createNewToDo.jsp";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String postToDo(ModelMap model, @Valid ToDo todo) {
		String mail = (String)model.get("email");
		System.out.println("\n\n\n\n\n\n----------------To Do Object : "+todo+"----------\n\n\n\n\n\n");
		toDoService.addToDo(todo.getDescription(), mail);		
		return displayToDos(model);
	}
	
}
