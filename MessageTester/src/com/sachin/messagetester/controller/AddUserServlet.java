package com.sachin.messagetester.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.messagetester.dto.User;
import com.sachin.messagetester.service.AddUserService;
import com.sachin.messagetester.service.LoginService;

public class AddUserServlet extends HttpServlet {

	public AddUserServlet() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub				
		doPost(req, resp);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		AddUserService service =new AddUserService();
		LoginService serviceLogin = new LoginService();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String namespace = req.getParameter("namespace");
		String topic = req.getParameter("topic");
		String mobile = req.getParameter("mobile");
		String isdeleted = req.getParameter("isdeleted");
		service.addUser(name, email, password, namespace, topic, mobile, isdeleted,"N");		
		List<User> usersList = serviceLogin.fetchAllUsers();
		req.setAttribute("usersList", usersList);
		req.getRequestDispatcher("/adminUser.jsp").forward(req, resp);
	}

}
