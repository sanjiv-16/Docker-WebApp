package com.snj.proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snj.proj.dao.User;
import com.snj.proj.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;

	public List<User> getAllUsers() {
		return repo.findAll();
	}

	public User addUser(User user) {
		return repo.save(user);
	}

}
