package mynetflix;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mynetflixmodel.User;

public class UserDb {
	
	private Connection con;

	public UserDb(Connection con) {
		this.con = con;
	}
	public boolean saveUser(User user) {
		boolean set = false;
		try {
			String query="insert into user(name,email,password)values(?,?,?)";
			
			PreparedStatement pt = con.prepareStatement(query);
			
			pt.setString(1, user.getName());
			pt.setString(2, user.getEmail());
			pt.setString(3, user.getPassword());
			
			pt.executeUpdate();
			set=true;
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return set;
	}
	
}
