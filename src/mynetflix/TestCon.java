package mynetflix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Db{
	protected String DRIVER = "com.mysql.cj.jdbc.Driver";
	protected String url = "jdbc:mysql://localhost/universita";
	protected String db = "root";
	protected String psw = "REDwin2020";
	private String errore ;
	public Db() {
		
	}
	public void connection() {
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(url,db, psw);
			System.out.println("connessione al database!");
			try {
				Statement st = conn.createStatement();
				String sq="select * from user";
				ps=conn.prepareStatement(sq);
				ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					System.out.println("user: "+ rs.getString("id")+" "+ rs.getString("name"));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			errore=e.getMessage();
			System.out.println("Errore "+ errore);
			System.out.println("Non sono connesso al database");
		}
	}
	
	
}

public class TestCon {
   
	public static void main(String[] args) {
        Db db = new Db();
        db.connection();
	}

}
