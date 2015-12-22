package com.yash.demo.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {

	@Path("/User")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> GetMessage() {
		List<User> users = new ArrayList<>();
		User user = new User(1, "Dinesh", 25000);
		User user1 = new User(2, "Ram Somani", 5000);
		User user2 = new User(3, "Aadya", 23000);
		User user3 = new User(4, "Parth", 24000);
		User user4 = new User(5, "Sameer", 2000);
		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);

		return users;
	}

	@Path("/demo")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public List demoApi(List users) {
		System.out.println("inside Demo...");
		System.out.println(users);
		return users;
	}

}
