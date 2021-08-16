package com.example.microservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users=new ArrayList<User>();
	private static Integer userCount=3;
	
	static {
		users.add(new User(1,"Raja",new Date()));
		users.add(new User(2,"Yash",new Date()));
		users.add(new User(3,"Sanjay",new Date()));
		
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User Save(User user) {
		if(user.getId()== null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
		
	}
	
	
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
}
