package com.sachin.messagetester.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sachin.messagetester.dto.User;

public class LoginDao {

	public LoginDao() {
		// TODO Auto-generated constructor stub
	}

	public String authenticateCredentials(String userName, String password)
	{
		Connection conn =MyConnection.getConnection();
		try
		{
			String sql = "select type from user where name='" + userName + "' and password = '"+password+"'";
			System.out.println("Sql Query : "+ sql);
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			if(rs.next()) {
              return rs.getString("type");   
             }
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<User> fetchAllUsers()
	{
		Connection conn =MyConnection.getConnection();
		List<User> listOfUsers = new ArrayList<User>();
		try
		{
			String sql = "select * from user";
			System.out.println("Sql Query : "+ sql);
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while(rs!=null && rs.next()) {
                 User user = new User();
                 user.setName(rs.getString("name"));
                 user.setUserName(rs.getString("username"));
                 user.setEmail(rs.getString("emailid"));
                 user.setPassword(rs.getString("password"));
                 user.setNamespace(rs.getString("namespace"));
                 user.setContact(rs.getString("contact"));
                 user.setIsdeleted(rs.getString("isdeleted"));
                 user.setType(rs.getString("type"));
                 listOfUsers.add(user);
             }
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
		return listOfUsers;
	}
}
