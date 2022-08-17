package com.ty.userpassword.dto;

public class User {
	private int Id;
	private String userName;
	private String userEmail;
	private String userPassword;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + "]";
	}

}
