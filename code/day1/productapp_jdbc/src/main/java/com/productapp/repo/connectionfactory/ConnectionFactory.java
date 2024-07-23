package com.productapp.repo.connectionfactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static Connection connection;

	public static Connection getConnection() {
		// somehow i need to read the prop file and find k-> v pair
		Properties prop = new Properties();
		InputStream is;
		try {
			is = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");

			prop.load(is);// this will get key and values

		} catch (IOException e1) {

			e1.printStackTrace();
		}

		String driverName = prop.getProperty("jdbc.driver");
		String url = prop.getProperty("jdbc.url");
		String username = prop.getProperty("jdbc.username");
		String password = prop.getProperty("jdbc.password");

		try {
			Class.forName(driverName);
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
