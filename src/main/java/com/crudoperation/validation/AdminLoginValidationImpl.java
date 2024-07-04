package com.crudoperation.validation;

public class AdminLoginValidationImpl implements AdminLoginValidation {

	private String result;
	@Override
	public String adminLoginValidation(String username, String password) {
	
		try 
		{
			int name_len =username.length();
			int password_len = password.length();
			
			if(name_len <4 || name_len >12)
			{
				result="INVALID NAME";
			}
			else if(password_len <8 || password_len > 16)
			{
				result="INVALID PASSWORD";
			}
			else
			{
				result="VALID";
			}
		}
		catch (Exception e)
		{
			result="SOMETHING WENT WRONG";
			e.printStackTrace();
		}
		
		return result;
	}

}
