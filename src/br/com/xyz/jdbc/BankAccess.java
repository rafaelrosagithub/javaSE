package br.com.xyz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccess {

	public static void main(String[] args) {
		System.out.println("Bank Access with JDBC");

		String sql = "select code, name, sex, email from person";
		String url = "jdbc:postgresql://localhost:5432/teste";
		try (Connection con = DriverManager.getConnection(url, "postgres", "test");
				PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()) {
			System.out.println("**************************");
			while (rs.next()) {
				System.out.println("Name: " + rs.getString("name") + "\n" + "Code: " + rs.getString(1) + "\n" + "Sex: "
						+ rs.getString("sex") + "\nEmail: " + rs.getString(4) + "\n**************************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
