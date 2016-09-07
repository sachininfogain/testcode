package com.sachin.messagetester.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddUserDao {

	public AddUserDao() {
		// TODO Auto-generated constructor stub
	}

	public boolean addUser(String name,	String email, String password, String namespace, String topic, String mobile, String isdeleted,String type)
	{
		Connection conn =MyConnection.getConnection();
		try
		{
			String sql = "insert into user values('"+name+"','"+name+"','"+email+"','"+ password+"','"+namespace+"','"+topic+"','"+mobile+"','"+isdeleted+"','"+type+"')";
			System.out.println("Sql Query : "+ sql);
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			//st.executeQuery(sql);
			return true;
		
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		
	}
}
