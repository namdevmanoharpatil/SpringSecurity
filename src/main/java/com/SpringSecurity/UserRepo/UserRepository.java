package com.SpringSecurity.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecurity.models.User;

public interface UserRepository extends JpaRepository<User, String> {

	public User findByUsername(String username);
}
