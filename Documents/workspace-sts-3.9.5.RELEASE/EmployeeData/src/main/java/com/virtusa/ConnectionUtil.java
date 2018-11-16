package com.virtusa;

import java.sql.DriverManager;

public class ConnectionUtil {

	public static java.sql.Connection conn;
	static {
		conn = connect();
	}

	private static java.sql.Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "easwaran");
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
}