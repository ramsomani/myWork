package com.yash.clientapplication.bean;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;


@ManagedBean
@SessionScoped
@Path("GetSum")
public class SumBean {
	@GET
	@Path("/{fname}/{sname}")
	@Produces(MediaType.APPLICATION_JSON)
	public void sum(@PathParam("fname")int fname,@PathParam("sname")int sname) {
		try {
			
			URL url = new URL("http://localhost:8080/ServerApplication/rest/DoSum/"+fname+"/"+sname);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
					
					String output;
					System.out.println("Output from Server .... \n");
					while ((output = br.readLine()) != null) {
					System.out.println(output);
					Gson gson = new Gson();
					String sum = gson.fromJson(output,String.class);
					System.out.println(sum);
					}
			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
		
	}

}
