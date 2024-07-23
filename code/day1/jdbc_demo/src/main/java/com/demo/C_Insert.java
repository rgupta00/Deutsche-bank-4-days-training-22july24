package com.demo;

import java.sql.*;

import com.factory.ConnectionFactory;

public class C_Insert {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			
			connection = ConnectionFactory.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
			pstmt.setString(1, "flower pot");
			pstmt.setDouble(2, 300);
			
			int no=pstmt.executeUpdate();
			System.out.println(no);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	

	}
}
