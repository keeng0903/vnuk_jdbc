package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			
			return DriverManager.getConnection(
				"jdbc:mysql://localhost/vnuk_personnel",
				"root",
				"09031999Phu"
			);
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
