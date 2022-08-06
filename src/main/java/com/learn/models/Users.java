package com.learn.models;

public class Users {
	private String uname;
	private String pword;
	private String email;
	
	
	public Users(String uname, String pword, String email) {
		super();
		this.uname = uname;
		this.pword = pword;
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
