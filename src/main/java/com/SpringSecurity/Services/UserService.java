package com.SpringSecurity.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringSecurity.models.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();

	public UserService() {

		list.add(new User("abc", "abc", "ABC@gmail.com"));
		list.add(new User("xyz", "abcxyz", "XYZ@GMAIL.COM"));

	}

	// get all users
	public List<User> getAllUsers() {
		return this.list;
	}

	// get single user
	public User getUser(String username) {
		return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
	}

	//add new users
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
