package com.crudoperation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.crudoperation.service.AdminLoginServiceImpl;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Send the Data to the Service Layer
		AdminLoginServiceImpl adminLoginServiceImpl = new AdminLoginServiceImpl();
		result = adminLoginServiceImpl.adminLoginService(username, password);
		
		if(result.equals("VALID"))
		{
			//forward
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminLoginServletDao");
			requestDispatcher.forward(request, response);
		}
		else
		{
			response.sendRedirect("adminlogin.jsp");
			session.setAttribute("msg", result);
			
		}
	}

}
