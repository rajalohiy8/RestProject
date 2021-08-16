package com.example.microservice.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping(path="/users")
	public List<User> reteriveAll(){
		return userDaoService.findAll();
	}
	@GetMapping(path="/user/{id}")
	public User reteriveUser(@PathVariable int id) {
		User user=userDaoService.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("Id"+id);
		}
		return user;
	}
	@PostMapping(path="/user")
	public User CreateUser(@RequestBody User user) {
		return userDaoService.Save(user);
	}
	
	@DeleteMapping(path="/user/{id}")
	public User deleteUser(@PathVariable int id) {
		User user=userDaoService.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("Id"+id);
		}
		return user;
	}
}
