package com.yash.studentmanagement.resource;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.studentmanagement.domain.StudentEducationalInformation;
import com.yash.studentmanagement.service.StudentEducationalService;


@Path("/educationals")
public class StudentEducationalResource {
	StudentEducationalService studentEducationalService=new StudentEducationalService();
	
	@GET
	@Path("/10marks/{studentClass}")
	@Produces(MediaType.APPLICATION_XML)
	public List<StudentEducationalInformation> getClass10(@PathParam("studentClass") int StudentClass){
		return studentEducationalService.getByClass10(StudentClass);
	}
	
	@GET
	@Path("/12marks/{studentClass}")
	@Produces(MediaType.APPLICATION_XML)
	public List<StudentEducationalInformation> getClass12(@PathParam("studentClass") int StudentClass){
		return studentEducationalService.getByClass12(StudentClass);
	}
	
	
}
