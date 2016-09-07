package com.sachin.messagetester.service;

import com.sachin.messagetester.dao.AddUserDao;
import com.sachin.messagetester.dao.LoginDao;

public class AddUserService {

	AddUserDao lDao= new AddUserDao();
	public AddUserService() {
		// TODO Auto-generated constructor stub
	}

	public boolean addUser(String name,	String email, String password, String namespace, String topic, String mobile, String isdeleted,String type)
	{
		if(lDao.addUser( name, email,  password,  namespace,  topic,  mobile,  isdeleted,type))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
