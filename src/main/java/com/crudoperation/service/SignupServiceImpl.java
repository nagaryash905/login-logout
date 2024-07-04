package com.crudoperation.service;

import com.crudoperation.dao.SignupDaoImpl;
import com.crudoperation.validation.SignupValidationImpl;

public class SignupServiceImpl implements SignupService {

	private String result;
	@Override
	public String signupService(String name, String email, String phone, String username, String password) {
		
		//Now send the data to the Validation Layer to validate the data
		try 
		{
			SignupValidationImpl signupValidationImpl = new SignupValidationImpl();
			result= signupValidationImpl.signupValidation(name, email, phone, username, password);
			System.out.println("The result on Servie Class : "+result);
			
		}
		catch (Exception e)
		{
			result="SERVICE ERROR";
			e.printStackTrace();
		}
		return result;
	}
	
	
	@Override
	public String signupAdd(String name, String email, String phone, String username, String password) {
		
		try 
		{
			SignupDaoImpl signupDaoImpl = new SignupDaoImpl();
			result = signupDaoImpl.saveSignup(name, email, phone, username, password);
			System.out.println("The service layer result : "+result);
		}
		catch (Exception e)
		{
			result="SERVICE ERROR";
			e.printStackTrace();
		}
		
		return result;
	}
}


