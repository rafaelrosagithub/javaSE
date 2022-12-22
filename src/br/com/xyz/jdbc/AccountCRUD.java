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
			stm.setString(1, account.client);
			stm.setDouble(2, account.balance);
			stm.setInt(3, account.num);
			stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void transfer(Connection con, Account source, Account destiny, double value) throws SQLException {
		if (source.balance >= value) {
			try {
				con.setAutoCommit(false);

				// Withdraw
				source.balance -= value;
				update(con, source);

				// Simulating error
				int x = 1 / 0;

				// Deposit
				destiny.balance += value;
				update(con, destiny);

				con.commit();
			} catch (Exception e) {
				con.rollback();
				e.printStackTrace();
			}

		}
	}

	public void delete(Connection con, Account account) {
		String sql = "delete from account where num = ?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, account.num);
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

//			crud.create(con, account1);
//			crud.create(con, account2);
//			crud.create(con, account3);
//			account3.balance = 7000.10;
//			crud.update(con, account3);
//			crud.delete(con, account1);

			List<Account> account = crud.read(con);
			account.stream().forEach(n -> System.out.println(n));

			Account source = account.get(0);
			Account destiny = account.get(1);
			crud.transfer(con, source, destiny, 1000);

			List<Account> account4 = crud.read(con);
			account4.stream().forEach(n -> System.out.println(n));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
