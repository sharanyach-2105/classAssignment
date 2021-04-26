package com.ibm;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FirstJDBC {

	static final String DB_URL = "jdbc:mysql://localhost:3306/ibm2021";
	static String username="root";
	static String password="S#@ru2105";
	public static void main(String[] args) throws SQLException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Creating Connection...");
			Connection conn=DriverManager.getConnection(DB_URL,username,password);
			PreparedStatement pst=conn.prepareStatement("insert into student values(?,?,?)");
			pst.setInt(1,105);
			pst.setString(2,"Name");
			pst.setString(3,"Java");
			//pst.setInt(3, 100);
			
			pst.executeUpdate();
			System.out.println("Values inserted");
			conn.close();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
		