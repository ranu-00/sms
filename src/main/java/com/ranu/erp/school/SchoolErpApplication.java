package com.ranu.erp.school;

import com.ranu.erp.school.entities.Role;
import com.ranu.erp.school.entities.User;
import com.ranu.erp.school.repositories.RoleRepository;
import com.ranu.erp.school.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SchoolErpApplication implements CommandLineRunner {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	public static void main(String[] args) {
		SpringApplication.run(SchoolErpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Set<Role> rol =  new HashSet<>();
		rol.add(new Role("ROLE_TEACHER"));
		userRepository.save(new User("sunil@gmail.com", bCryptPasswordEncoder.encode("password"),"sunil","rana","801050426",1,rol));
		//roleRepository.save(new Role("ROLE_TEACHER"));
	}
}
