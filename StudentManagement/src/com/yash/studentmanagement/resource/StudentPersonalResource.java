package com.yash.studentmanagement.resource;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.studentmanagement.domain.StudentPersonalInformation;
import com.yash.studentmanagement.service.StudentPersonalService;

@Path("/personals")
public class StudentPersonalResource {
	
	StudentPersonalService studentPersonalService =new StudentPersonalService();
	
	@GET
	@Path("/id/{studentId}")
	@Produces(MediaType.APPLICATION_XML)
	public StudentPersonalInformation getId(@PathParam("studentId") int StudentId){
		return studentPersonalService.getById(StudentId);
	}
	
	@GET
	@Path("/city/{studentCity}")
	@Produces(MediaType.APPLICATION_XML)
	public List<StudentPersonalInformation> getCity(@PathParam("studentCity") String StudentCity){
		return studentPersonalService.getByCity(StudentCity);
	}
	
}
