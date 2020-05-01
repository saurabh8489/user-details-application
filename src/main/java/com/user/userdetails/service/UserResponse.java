package com.user.userdetails.service;

public class UserResponse {

	public String userInfo;
	public String moduleName;

	public UserResponse(String userInfo, String moduleName) {
		this.userInfo = userInfo;
		this.moduleName = moduleName;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Override
	public String toString() {
		return "UserResponse [userInfo=" + userInfo + ", moduleName=" + moduleName + "]";
	}

}
