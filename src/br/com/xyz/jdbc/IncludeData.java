package br.com.xyz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncludeData {

	public static void main(String[] args) {
		System.out.println("IncludeData");

		String url = "jdbc:postgresql://localhost:5432/teste";
		String sql = "insert into person values(?, ?, ?, ?)";
		String[] people = { "Person 1", "Person 2", "Person 3", "Person 4", "Person 5" };
		try (Connection con = DriverManager.getConnection(url, "postgres", "test")) {
			try (PreparedStatement stm = con.prepareStatement(sql)) {

				for (int i = 0; i < people.length; i++) {
					stm.setInt(1, i + 4);
					stm.setString(2, people[i]);
					stm.setString(3, "M");
					stm.setString(4, people[i].toLowerCase() + "@teste.com");
					stm.addBatch();
				}
				stm.executeBatch();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			sql = "select name, email from person";
			try (PreparedStatement stm2 = con.prepareStatement(sql); ResultSet rs = stm2.executeQuery()) {
				while (rs.next()) {
					System.out.println(rs.getString("name") + " : " + rs.getString("email"));
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
