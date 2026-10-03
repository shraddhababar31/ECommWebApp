package com.ecommerce.model;

public class User {

	private int userId;
	private String fullName;
	private String email;
	private String password;
	private String mobileno;
	private String role;
	private String status;
	
	// To create new objects
	public User() {
		super();
	}

	// To access the values
	public User(int userId, String fullName, String email, String password, String mobileno, String role,
			String status) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.role = role;
		this.status = status;
	}
	
	// Just to check in console 
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", mobileno=" + mobileno + ", role=" + role + ", status=" + status + "]";
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	


}
