package com.yash.shoppingcart.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.yash.shoppingcart.domain.Customer;
import com.yash.shoppingcart.service.CustomerServiceImpl;
import com.yash.shoppingcart.service.CustomerServiceIntf;

@ManagedBean
@SessionScoped
public class CustomerBean {
	Customer customer=new Customer();
	CustomerServiceIntf customerServiceIntf=new CustomerServiceImpl();
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String check()
	{	
		//HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		//session.setAttribute("username",customer.getUsername());
		int j=customerServiceIntf.authenticateCustomer(customer.getUsername(),customer.getPassword());
		if(j==1){
		return "shopping";
		}
		else{
		return "login.xhtml?error=Login failed! Invalid username or password faces-redirect=true";
		//return "failure";
		}
	}
	public String save()
	{
		customerServiceIntf.addCustomer(customer);
		return "login";
	}
	public String logout()
	{
		HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
		return "login";
	}
	
	
}
