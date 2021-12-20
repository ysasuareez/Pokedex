package models;

public class Usuario {
	
	/**
	 * ATRIBUTOS
	 */
	private String username;
	private String password;
	
	/**
	 * CONSTRUCTOR
	 * @param username
	 * @param password
	 */
	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	/**
	 * G & S
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
