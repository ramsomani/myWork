package com.yash;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


	@Path("/UserService")
	public class UserService {
		

			@Path("/User")
			@GET
			@Produces(MediaType.TEXT_PLAIN)
			public String GetMessage()
			{
				 return "Hello";
			}
		
	}

