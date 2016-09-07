package com.sachin.messagetester.service;

import java.util.List;

import com.sachin.messagetester.dao.LoginDao;
import com.sachin.messagetester.dto.User;

public class LoginService {

	LoginDao lDao= new LoginDao();
	public LoginService() {
		// TODO Auto-generated constructor stub
	}

	public String authenticate(String userName, String password)
	{
		String result=lDao.authenticateCredentials(userName, password);
		if(result!=null)
			return result;
		else
			return "failure";
	}
	public List<User> fetchAllUsers()
	{
		return lDao.fetchAllUsers();
		
	}
}
