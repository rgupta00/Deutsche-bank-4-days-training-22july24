package com.demo;

import java.sql.*;


public class A_HelloJdbc {

	public static void main(String[] args) {
		//1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//hard coding of conn ? good / bad
		Connection connection=null;
		try{
			//2. connection object (tcp/ip) to db
			 connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/busycoder_db", "root", "root");
			 System.out.println("conn is done");
			 
			//3. get all the records and print them
			 //Statement, PrepareStatement
			 Statement statement=connection.createStatement();
			 ResultSet rs=statement.executeQuery("select * from product");
			//ResultSet point to the tuples
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+": "+ rs.getString(2)+" : "+ rs.getDouble(3));
			 }
			
			 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
				
		
		
		
		
		
		//4. close the connection
		
				
		
	}
}
