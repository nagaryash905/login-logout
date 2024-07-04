package com.crudoperation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.crudoperation.service.SignupServiceImpl;
import com.mysql.cj.xdevapi.Result;

@WebServlet("/SignupServletDao")
public class SignupServletDao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


			HttpSession session = request.getSession();
		
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
		
			SignupServiceImpl signupServiceImpl = new SignupServiceImpl();
			result = signupServiceImpl.signupAdd(name, email, phone, username, password);
			System.out.println("The SignupServletDao result is : "+result);
			session.setAttribute("msg", result);
			response.sendRedirect("signup.jsp");
			
	}

}
