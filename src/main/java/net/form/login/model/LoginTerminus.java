package net.form.login.model;

import java.io.Serializable;

public class LoginTerminus implements Serializable{

private static final long serialVersionUID=1l;
	
	private String username;
	private String password;
	
	
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


