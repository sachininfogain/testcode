package com.sachin.messagetester.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

public static Connection conn=null;
	public MyConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sivalabs?autoReconnect=true&useSSL=false", "root", "root");
			
	    }
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace(); 
			
		}
		return conn;
	}
}
