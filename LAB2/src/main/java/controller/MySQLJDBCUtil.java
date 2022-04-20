package controller;

import java.sql.*; 

class MySQLJDBCUtil {
//	private static final String URL = "jdbc:mysql://localhost:3306/db1?";
//	private static final String USERNAME = "root";
//	private static final String PASSWORD = "208256";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static Connection connection = null;

	public static Connection openConnection() {
		if (connection != null)
			return connection;
		else {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?" + "user=root&password=208256");
			}catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}
