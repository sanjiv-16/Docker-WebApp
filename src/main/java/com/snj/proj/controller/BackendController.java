package com.snj.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snj.proj.dao.User;
import com.snj.proj.service.UserService;

@RestController
public class BackendController {

	@Autowired
	UserService service;

	@GetMapping
	public String home() {
		return "hello from backend...";
	}

	@GetMapping(value = "getAllUsers")
	public List<User> getAll() {
		return service.getAllUsers();
	}
	
	@PostMapping(value = "addUser")
	public User addUser(@RequestBody User user) {
	    return service.addUser(user);
	}
}
