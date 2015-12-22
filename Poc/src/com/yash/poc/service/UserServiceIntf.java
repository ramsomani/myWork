package com.yash.poc.service;




import java.util.List;

import com.yash.poc.domain.User;

public interface UserServiceIntf {
	public void CreateUser(User user);
	public void DeleteUser(int id);
	public void UpdateUser(User user);
	public List ShowUser();
}
