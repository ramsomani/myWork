package com.yash.trainingmanagement.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.yash.trainingmanagement.domain.SubHeading;
import com.yash.trainingmanagement.util.ConnectionProvider;


@Stateless
@LocalBean
public class SubHeadingService implements SubHeadingServiceLocal {

    public SubHeadingService() {
        
    }

	@Override
	public List<String> getCourseList() {
		List<String> list=new ArrayList<>();
		String query="Select heading_text from heading";
		ResultSet resultSet=ConnectionProvider.select(query);
		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getString("heading_text"));
				list.add(resultSet.getString("heading_text"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void addSubHeading(SubHeading subHeading) {
		String heading=subHeading.getHeading_id();
		int headingId=getHeadingId(heading);
		System.out.println(headingId);
		String query="insert into subheading(subheading_text,heading_id,status) values('"+subHeading.getSubheading_text()+"',"+headingId+",'"+subHeading.getStatus()+"')";
		System.out.println(query);
		ConnectionProvider.update(query);
	}
	
	
	public int getHeadingId(String heading)
	{
		int id=0;
		String query="select heading_id from heading where heading_text = '"+heading+"'";
		ResultSet resultSet=ConnectionProvider.select(query);
			try {
				while(resultSet.next())
				{
					id=resultSet.getInt("heading_id");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		return id;
	}



	@Override
	public void updateStatus(String status, int subheading_id) {
		String query="update subheading set status='"+status+"' where subheading_id="+subheading_id;
		System.out.println("query from update"+query);
		ConnectionProvider.update(query);
	}
	
	
}
