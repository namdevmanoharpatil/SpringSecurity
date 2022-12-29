package com.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.SpringSecurity.UserRepo.UserRepository;
import com.SpringSecurity.models.User;

@SpringBootApplication
public class SprineSecurityInLearningPhaseApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SprineSecurityInLearningPhaseApplication.class, args);
		System.out.println("Application Server is Started now..");
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setEmail("namu@gmail.com");
		user.setUsername("namdev");
		user.setPassword(this.bCryptPasswordEncoder.encode("patil"));
		user.setRole("ROLE_NORMAL");

		this.userRepository.save(user);

		User user1 = new User();
		user1.setEmail("rohini@gmail.com");
		user1.setUsername("rohini");
		user1.setPassword(this.bCryptPasswordEncoder.encode("patil"));
		user1.setRole("ROLE_ADMIN");

		this.userRepository.save(user1);
	}

}
