package mynetflix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	protected static String DRIVER = "com.mysql.cj.jdbc.Driver";
	protected static String url = "jdbc:mysql://localhost/universita";
	protected static String user = "root";
	protected static String psw = "REDwin2020";
	private static Connection con;
	
	
	public ConnectionDb() {
		
	}
	public static Connection getConnection() throws ClassNotFoundException {
		try {
			Class.forName(DRIVER);
			con= DriverManager.getConnection(url,user,psw);
			//System.out.println("connessione al database!");
		} catch (SQLException e) {
			e.printStackTrace();
			//System.out.println("Non sono connesso al database");
		}
		return con;
		
	}
	
}
