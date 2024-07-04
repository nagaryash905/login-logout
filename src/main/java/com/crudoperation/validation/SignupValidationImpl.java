package com.crudoperation.validation;

public class SignupValidationImpl implements SignupValidation {

	private String result;
	@Override
	public String signupValidation(String name, String email, String phone, String username, String password) {
		
		try 
		{
			int name_len = name.length();
			int email_len = email.length();
			int phone_len = phone.length();
			int user_len = username.length();
			int pass_len = password.length();
			
			if(name_len<5 || name_len>15)
			{
				result="INVALID NAME";
			}
			else if(email_len<5 || email_len>22 || !email.contains("@"))
			{
				result="INVALID EMAIL";
			}
			else if(phone_len<10 || phone_len>12)
			{
				result="INVALID PHONE-NUMBER";
			}
			else if(user_len<3 || user_len>8)
			{
				result="INVALID USERNAME";
			}
			else if(pass_len<6 || pass_len>10)
			{
				result="INVALID PASSWORD";
			}	
			else
			{
				result="VALID";
			}
			System.out.println("The result of the Validation Layer is : "+result);
		} 
		catch (Exception e)
		{
			result="SOMETHIG WENT WRONG";
			e.printStackTrace();
		}
		return result;
	}
}
