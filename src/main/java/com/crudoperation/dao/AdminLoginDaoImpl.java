package com.crudoperation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDaoImpl implements AdminLoginDao {

	private String result;
	private Connection connection;
	@Override
	public String checkLoginData(String username, String password) {
		
		try {
			connection= ConnectionFactory.getConnection();
			String sql="select * from user where username=? and password=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			ResultSet rs = prepareStatement.executeQuery();
			
			if(rs.next())
			{
				result="EXIST";
			}
			else
			{
				result="NOT EXIST";
			}
			
			}
		catch (Exception e)
		{
			result="NOT EXIST";
			e.printStackTrace();
		}
		
		return result;
	}

}
