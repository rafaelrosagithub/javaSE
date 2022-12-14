package br.com.xyz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncludeData {

	public static void main(String[] args) {
		System.out.println("IncludeData");
		String url = "jdbc:postgresql://localhost:5432/teste";
		String sql = "insert into person values(4, 'Loko', 'M', 'loko@teste.com')";
		try (Connection con = DriverManager.getConnection(url, "postgres", "test");
				PreparedStatement stm = con.prepareStatement(sql)) {
			stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
