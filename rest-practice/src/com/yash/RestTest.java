package com.yash;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="call")
public class RestTest {

	@GET
	@Path("msg")
	@Produces(value=MediaType.TEXT_PLAIN)
	public String getMessage(){	
		return "Hello World";
	}
}
