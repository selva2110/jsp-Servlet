package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	
	private static	String url = "jdbc:mysql://localhost:3306/user";
	private static	String userName = "root";
	private static  String Pass = "selva#123";
	
	static Connection con ;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection(url, userName, Pass);
		}
		catch (SQLException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return con;
	}

}
