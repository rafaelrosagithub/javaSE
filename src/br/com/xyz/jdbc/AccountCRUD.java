package br.com.xyz.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountCRUD {

	public void create(Connection con, Account account) {
		String sql = "insert into account values(?, ?, ?)";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, account.num);
			stm.setString(2, account.client);
			stm.setDouble(3, account.balance);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("JDBC CRUD, Create, Read, Update and Delete");

	}

}
