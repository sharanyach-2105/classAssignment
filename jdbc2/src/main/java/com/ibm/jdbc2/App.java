package com.ibm.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	String driver = "com.mysql.cj.jdbc.Driver";
    	String url = "jdbc:mysql://localhost:3306/ibm2021";
    	String username ="root";
    	String password = "S#@ru2105";
    	
    	Connection con = DriverManager.getConnection(url,username,password);
    	
    	//insert values
    	
    	PreparedStatement pst = con.prepareStatement("insert into emp(id, name)values(?,?)");
    	   pst.setInt(1, 102);
    	   pst.setString(2,"JHONY");
    	   
    	   int i = pst.executeUpdate();
    	   System.out.println(i+ "record inserted");
    	   
    	   //delete
    	   
    	   pst= con.prepareStatement("delete from emp where id=?" );
    	   
    	   pst.setInt(i, 101);
    	   int x= pst.executeUpdate();
    	   System.out.println(x + "record is deleted");
    	
        
    }
}
