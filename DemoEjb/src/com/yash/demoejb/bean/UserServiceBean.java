package com.yash.demoejb.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class UserServiceBean implements UserServiceBeanLocal {

  
    public UserServiceBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int convert(int amount) {
	
		return amount*65;
		
	}

}
