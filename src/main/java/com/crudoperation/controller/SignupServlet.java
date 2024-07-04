package com.crudoperation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.crudoperation.service.SignupServiceImpl;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Send this data to the service layer
		SignupServiceImpl signupServiceImpl = new SignupServiceImpl();
		result = signupServiceImpl.signupService(name, email, phone, username, password);
		
		if(result.equals("VALID"))
		{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("SignupServletDao");
				requestDispatcher.forward(request, response);
		}
		else
		{
			response.sendRedirect("signup.jsp");
			session.setAttribute("msg", result);
		}
		
		

	}

}
