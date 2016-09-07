package com.sachin.messagetester.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.messagetester.dto.User;
import com.sachin.messagetester.service.LoginService;

public class LoginServlet extends HttpServlet {

	public LoginServlet() {
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
		LoginService service =new LoginService();
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String result = service.authenticate(userName, password);
		if(result.equalsIgnoreCase("a"))
		{
			List<User> usersList = service.fetchAllUsers();
			req.setAttribute("usersList", usersList);
			req.getRequestDispatcher("/adminUser.jsp").forward(req, resp);
		}
		else if(result.equalsIgnoreCase("n"))
		{
			req.getRequestDispatcher("/normalUser.jsp").forward(req, resp);
			
		}
		else
		{
			req.setAttribute("status", "failure");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
		
		
		
	}

}
