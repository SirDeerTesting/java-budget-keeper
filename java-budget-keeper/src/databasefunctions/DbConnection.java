package databasefunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection connect() {
		Connection conn = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:./lib/database/jbk.db");
			System.out.println("Connected!");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println(e+"");
		}
		
		return conn;
	}

}
