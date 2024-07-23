package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H_HelloJdbc {

	public static void main(String[] args) {
		//1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create connection object
		
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/busycoder_db","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			while(rs.next()){
				System.out.print(rs.getInt("id")+" ");
				System.out.print(rs.getString("name")+" ");
				System.out.println(rs.getDouble("price"));
				
		        }
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		
	}
}
