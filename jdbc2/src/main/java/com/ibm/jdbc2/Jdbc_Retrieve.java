package com.ibm.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_Retrieve {
	public static void main(String [] args )throws SQLException

{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/ibm2021";
	String username ="root";
	String password = "S#@ru2105";
	
	Connection con = DriverManager.getConnection(url,username,password);
	
	PreparedStatement pst = con.prepareStatement("select * from emp");
	
	ResultSet rs = pst.executeQuery();
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	con.close();
	
	}

	
}
	


