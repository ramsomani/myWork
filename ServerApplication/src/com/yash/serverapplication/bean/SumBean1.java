package com.yash.serverapplication.bean;




import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;




@ManagedBean
@SessionScoped
@Path("DoSum")
public class SumBean1 {

	@GET
	@Path("/{fname}/{sname}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String sum(@PathParam("fname")int fname,@PathParam("sname")int sname) {
		return fname+sname+"";		
	}

}
