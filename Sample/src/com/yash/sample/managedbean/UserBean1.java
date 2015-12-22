package com.yash.sample.managedbean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.yash.sample.bean.UserServiceBean1LocalLocal;
import com.yash.sample.domain.User;

@RequestScoped
@ManagedBean
public class UserBean1 {
	@EJB
	UserServiceBean1LocalLocal userCheck;
	User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String authenticate1() {
		System.out.println("hii from authenticate1");
		user = userCheck.checkUser(user);
		System.out.println(user.getName());
		if (user == null)
			return "fail";
		return "welcome";
	}

	public void logout() {
		userCheck.logout();

	}

}
