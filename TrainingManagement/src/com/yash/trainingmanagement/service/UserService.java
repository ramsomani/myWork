package com.yash.trainingmanagement.service;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;


import com.yash.trainingmanagement.domain.User;
import com.yash.trainingmanagement.util.ConnectionProvider;


@Stateless
@LocalBean
public class UserService implements UserServiceLocal {
    public UserService() {
       
    }
    @Inject
    User user;
	
    @Override
	public void register(User user) {
	
    	String query ="INSERT INTO USER(NAME,CONTACT,EMAIL_ID,DESIGNATION_ID,STATUS_ID,ROLE_ID,USERNAME,PASSWORD) "
    			+ "VALUES('"+user.getName()+"','"+user.getContact()+"','"+user.getEmail_id()+"','"+user.getDesignation_id()+"',1,2,'"+user.getUsername()+"','"+user.getPassword()+"')";
    	
		System.out.println(query);
		ConnectionProvider.update(query);
	}
    

	@Override
	public String authenticate(String username, String password) throws SQLException {
		String query="select username,password from user where username='"+username+"'and password='"+password+"'";
		System.out.println(query);
		ResultSet resultSet= ConnectionProvider.select(query);
		if(resultSet.next()){
			user.setUsername(username);
            user.setPassword(password);
            return "success";
        }
		else{
            String checkusername = "SELECT USERNAME FROM USER WHERE USERNAME='"+username+"'";
            String checkpassword = "SELECT PASSWORD FROM USER WHERE PASSWORD='"+password+"'";
            ResultSet userSet = ConnectionProvider.select(checkusername);
            ResultSet passwordSet = ConnectionProvider.select(checkpassword);
            if (userSet.next()) {
                return "Invalid Password";
            }
            if (passwordSet.next()) {
                return "Invalid Username";
            } else {
                return "Invalid UserName and Password";
            }            
		}
	}
	
	
	@Override
	public User getUserName(String username, String password) {
		 String query = "SELECT * FROM USER WHERE USERNAME = '"+username+"' AND PASSWORD ='"+password+"'";
	        ResultSet resultSet = ConnectionProvider.select(query);
	        try {
				while(resultSet.next()){
					user.setUser_id(resultSet.getInt(1));
					System.out.println(resultSet.getInt(1));
					System.out.println("----------------++-----"+user.getUser_id()+"---------");
				    user.setName( resultSet.getString("name")); 
				    user.setDesignation_id(Integer.parseInt(resultSet.getString("designation_id")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        
	        return user;
		
	}
}


	
	

