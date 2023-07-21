package com.project.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class ToDoListApplication {

	public ToDoListApplication() throws ParseException {
	}

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

}
