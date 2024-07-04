package com.crudoperation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SignupDaoImpl implements SignupDao {

	private String result;
	private Connection connection;
	@Override
	public String saveSignup(String name, String email, String phone, String username, String password) {
		
		try 
		{
			 connection= ConnectionFactory.getConnection();
			 String sql="insert into user(name,email,phone,username,password) values(?,?,?,?,?)";
			 PreparedStatement prepareStatement = connection.prepareStatement(sql);
			 System.out.println("The SQL result is "+sql);
			 prepareStatement.setString(1, name);
			 prepareStatement.setString(2, email);
			 prepareStatement.setString(3, phone);
			 prepareStatement.setString(4, username);
			 prepareStatement.setString(5, password);
			 
			 int executeUpdate = prepareStatement.executeUpdate();
			 System.out.println("The execute Update is "+executeUpdate);
			 if(executeUpdate==1)
			 {
				 result="DATA ADDED SUCCESSFULLY";
			 }
			 else
			 {
				 result="SOMETHING WENT WRONG";
			 }
			 System.out.println("The result on the Dao Layer + :"+result);
		} 
		catch (Exception e)
		{
			result="SOMETHING WENT WRONG";
			e.printStackTrace();
		}
		
		return result;
	}

}
