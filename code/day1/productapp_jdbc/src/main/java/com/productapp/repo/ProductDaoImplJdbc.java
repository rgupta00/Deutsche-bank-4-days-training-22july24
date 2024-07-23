package com.productapp.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.productapp.repo.connectionfactory.ConnectionFactory;

public class ProductDaoImplJdbc implements ProductDao {

	private Connection connection;

	public ProductDaoImplJdbc() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Product> getAll() {
		List<Product> products = new ArrayList<>();
		Product product = null;
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from product");

			while (rs.next()) {
				product = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public void addProduct(Product product) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Product findById(int id) {
		return null;
	}

}
