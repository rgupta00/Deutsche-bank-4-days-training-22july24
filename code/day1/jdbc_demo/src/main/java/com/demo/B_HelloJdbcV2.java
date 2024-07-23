package com.demo;

import java.sql.*;

import com.factory.ConnectionFactory;

public class B_HelloJdbcV2 {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			
			connection = ConnectionFactory.getConnection();
			System.out.println("conn is done");

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from product");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ": " + rs.getString(2) + " : " + rs.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	

	}
}
