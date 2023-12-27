package com.user;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
		String name = req.getParameter("name");
	    String username  = req.getParameter("username");
		String password= req.getParameter("password");
		long mobile = Long.parseLong(req.getParameter("mobile"));
		String gender = req.getParameter("gender");
		
		
		User user = new User();
		
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		user.setMobile(mobile);
		user.setGender(gender);
		
		
			int status = UserDAO.post(user);
			
			if(status == 1) {
				res.sendRedirect("ok.html");
			}else {
				res.sendRedirect("error.html");
			}
		
	}
}

