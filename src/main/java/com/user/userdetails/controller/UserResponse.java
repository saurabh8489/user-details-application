package com.user.userdetails.controller;

public class UserResponse {
	public String name;
	public String dob;

	public UserResponse(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UserResponse [name=" + name + ", dob=" + dob + "]";
	}

}
