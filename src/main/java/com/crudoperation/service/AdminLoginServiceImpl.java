package com.crudoperation.service;

import com.crudoperation.dao.AdminLoginDaoImpl;
import com.crudoperation.validation.AdminLoginValidationImpl;

public class AdminLoginServiceImpl implements AdminLoginService {

	private String result;
	@Override
	public String adminLoginService(String username, String password) {
		
		try
		{
			//Send the Data on the Validation Layer to Validate the Data
			AdminLoginValidationImpl adminLoginValidationImpl = new AdminLoginValidationImpl();
			result = adminLoginValidationImpl.adminLoginValidation(username, password);
			
		} 
		catch (Exception e)
		{
			result="SERVICE ERROR";
			e.printStackTrace();
		}
		return result;
	}
	
	
	@Override
	public String adminLoginServiceDao(String username, String password) {
		
		try
		{
			AdminLoginDaoImpl adminLoginDaoImpl = new AdminLoginDaoImpl();
			result=adminLoginDaoImpl.checkLoginData(username, password);
			
		}
		catch (Exception e)
		{
			result="SERVICE ERROR"; 
			e.printStackTrace(); 
		}
		
		return result;
	}

}
