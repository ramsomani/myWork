package com.yash.sample.managedbean;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import com.yash.sample.bean.UserServiceBeanLocalLocal;
import com.yash.sample.domain.User;

@ManagedBean
@RequestScoped
public class UserBean {
	@EJB
	UserServiceBeanLocalLocal userCheck;
	
	User user=new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String authenticate()
	{
		System.out.println("hii from authenticate");
		int i=userCheck.checkUser(user);
		System.out.println(i);
		if(i==1)
			return "welcome";
		return "fail";
	}
	
}
