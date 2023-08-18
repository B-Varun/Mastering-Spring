package com.learn.spring.boot.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learn.spring.boot.todo.task.ToDoService;

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
	public String addToDo() {
		return "/WEB-INF/jsp/createNewToDo.jsp";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String postToDo(@RequestParam String desc, ModelMap model) {
		toDoService.addToDo(desc, model.get("email").toString());		
		return displayToDos(model);
	}
	
}
