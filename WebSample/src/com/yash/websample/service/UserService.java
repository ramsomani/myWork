package com.yash.websample.service;



import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.websample.domain.User;

@Path("/UserService")
public class UserService {
	
	 User user=new User(101,"aadya",20000);

	   @POST
	   @Path("/users")
	   @Produces(MediaType.APPLICATION_XML)
	   public User getUsers(){
	      return user;
	   }

	}


