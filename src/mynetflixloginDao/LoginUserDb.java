package mynetflixloginDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mynetflixloginmodel.Login;

public class LoginUserDb {
     
	Connection con;

	public LoginUserDb(Connection con) {
		this.con = con;
	}
	
	public boolean validaLog(Login lg) {
		boolean concesso=false;
		try {
			String sq="select *from user where username=? and password=?";
			PreparedStatement ps= con.prepareStatement(sq);
			ps.setString(1, lg.getUsername());
			ps.setString(2, lg.getPassword());
			System.out.println(ps);
			ResultSet rs =ps.executeQuery();
			concesso=rs.next();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return concesso;	
	}
}
