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
		String url = "jdbc:postgresql://localhost/teste";
		try (Connection con = DriverManager.getConnection(url, "postgres", "tcc2");
				PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()) {
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
