package com.yash.bean;

import java.io.IOException;
import java.io.InputStream;


import javax.faces.bean.ManagedBean;
import javax.servlet.http.Part;

@ManagedBean
public class FileBean {

	private Part  file;

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}
	
	public void upload(){
		
		try {
			file.write("d:\\test.jpg");
			byte[] arryOfFile= new byte[9999999];
			InputStream inputStream= file.getInputStream();
			inputStream.read(arryOfFile);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
