package com.yash.trainingmanagement.bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Cookie;

import com.yash.trainingmanagement.domain.ManagerMenu;
import com.yash.trainingmanagement.domain.TraineeMenu;
import com.yash.trainingmanagement.domain.TrainerMenu;
import com.yash.trainingmanagement.domain.User;
import com.yash.trainingmanagement.service.UserServiceLocal;

@ManagedBean
@SessionScoped
public class UserBean {
	private String name;
	private String contact;
	private String email_id;
	private int designation_id;
	private String username;
	private String password;
	private Boolean rememberMe;
	private int user_id;
	List<String> populateList = new ArrayList<String>();
	Cookie cookie;

	@EJB
	UserServiceLocal userServiceBeanLocal;

	@Inject
	User user;
	@Inject
	ManagerMenu managerMenu;
	@Inject
	TraineeMenu traineeMenu;
	@Inject
	TrainerMenu trainerMenu;
	

	public List<String> getPopulateList() {
		return populateList;
	}

	public void setPopulateList(List<String> populateList) {
		this.populateList = populateList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String register() {
		System.out.println(designation_id);
		user.setName(name);
		user.setContact(contact);
		user.setDesignation_id(designation_id);
		user.setEmail_id(email_id);
		user.setUsername(username);
		user.setPassword(password);
		userServiceBeanLocal.register(user);
		return "login.xhtml?faces-redirect=true&error=Registered Successfully";
	}

	public String authenticate() throws SQLException {
		String message = userServiceBeanLocal.authenticate(username, password);
		if (message.equalsIgnoreCase("success")) {
			User user = userServiceBeanLocal.getUserName(username, password);
			int d_id= user.getDesignation_id();
			System.out.println(d_id);
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			session.setAttribute("user", user.getUser_id());
			setName(user.getName());
			if (d_id == 1) {
				
				System.out.println("this is manager");
				return "facelet";
			}

			 if (d_id == 2) {
				
				System.out.println("this is trainer");
				
				return "trainerFacelet";
			}
			
			else return "traineeFacelet";
			
		} else {
			return "login.xhtml?faces-redirect=true&error=" + message;
		}

	}

	public String logout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
		return "login";
	}
	
	

}
