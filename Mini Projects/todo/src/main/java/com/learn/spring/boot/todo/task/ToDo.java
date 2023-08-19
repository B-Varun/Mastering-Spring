package com.learn.spring.boot.todo.task;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class ToDo {
	
	private int id;
	@Size(min = 10, message = "Minimum size is 10")
	private String description;
	private String userEmail;
	private LocalDate date;
	private boolean isCompleted;
	
	public ToDo(int id, String description, String userEmail, LocalDate date, boolean isCompleted) {
		super();
		this.id = id;
		this.description = description;
		this.userEmail = userEmail;
		this.date = date;
		this.isCompleted = isCompleted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean getIsCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", description=" + description + ", userEmail=" + userEmail + ", date=" + date
				+ ", isCompleted=" + isCompleted + "]";
	}
}