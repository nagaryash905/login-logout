package com.crudoperation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.crudoperation.service.AdminLoginServiceImpl;


@WebServlet("/AdminLoginServletDao")
public class AdminLoginServletDao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Send the Data to the Service Layer
		AdminLoginServiceImpl adminLoginServiceImpl = new AdminLoginServiceImpl();
		result=adminLoginServiceImpl.adminLoginServiceDao(username, password);
		
		if(result.equals("EXIST"))
		{
			session.setAttribute("adminlogin", username);
			response.sendRedirect("DetailPanel.jsp");
		}
		else
		{
			session.setAttribute("msg", "NOTEXIST");
			response.sendRedirect("adminlogin.jsp");
		}
	}

}
