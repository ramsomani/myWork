package com.yash.demorest.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.demorest.domain.User;

@Path("/Usersrest")
public class Userest {

	@Path("/getuser")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(){
		//String str="hii";
		User user=new User("ram", 1);
		return user;
	}
	
	@Path("/setuser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public int setUser(User str){
		return str.getId();
	}
}


