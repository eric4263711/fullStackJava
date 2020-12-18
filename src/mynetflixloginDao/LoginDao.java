package mynetflixloginDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginDao {
	
	protected static String DRIVER ="com.mysql.cj.jdbc.Driver";
	protected static String url ="jdbc:mysql://localhost/universita";
	protected static String usr = "root";
	protected static String pwd = "REDwin2020";
	private static Connection con;
	
	public LoginDao() {
	}
    
	public static Connection getLoginDao() throws ClassNotFoundException {
		
	    Class.forName(DRIVER);
	    
	    try {
			con=DriverManager.getConnection(url,usr,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
