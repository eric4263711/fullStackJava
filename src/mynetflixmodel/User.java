package mynetflixmodel;

public class User {
	
	private int id;
	private String name;
	private String cognome;
	private String email;
	private String username;
	private String password;
	public User() {
		
	}
	public User(int id, String name,String cognome,String email,String username, String password) {
		this.id = id;
		this.name = name;
		this.cognome=cognome;
		this.email = email;
		this.username=username;
		this.password = password;
	}
	public User(String name,String cognome, String email,String username, String password) {
		this.name = name;
		this.cognome=cognome;
		this.email = email;
		this.username=username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
