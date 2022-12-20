package br.com.xyz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountCRUD {

	public void create(Connection con, Account account) {
		String sql = "insert into account values(?, ?, ?)";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, account.num);
			stm.setString(2, account.client);
			stm.setDouble(3, account.balance);
			stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Account> read(Connection con) {
		List<Account> list = new ArrayList<>();
		String sql = "select num, client, balance from account";
		try (PreparedStatement stm = con.prepareStatement(sql); ResultSet rs = stm.executeQuery()) {
			while (rs.next()) {
				list.add(new Account(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void update(Connection con, Account account) {
		String sql = "update account set client = ?, balance = ? where num = ?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, account.num);
			stm.setString(2, account.client);
			stm.setDouble(3, account.balance);
			stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("JDBC CRUD, Create, Read, Update and Delete");

		String url = "jdbc:postgresql://localhost:5432/teste";
		try (Connection con = DriverManager.getConnection(url, "postgres", "tcc2")) {
			AccountCRUD crud = new AccountCRUD();

			Account account1 = new Account(1, "Jhon", 1000.70);
			Account account2 = new Account(2, "Maria", 3000.30);
			Account account3 = new Account(3, "Paul", 5000.90);

			crud.create(con, account1);
			crud.create(con, account2);
			crud.create(con, account3);

			List<Account> account = crud.read(con);
			account.stream().forEach(n -> System.out.println(n));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
