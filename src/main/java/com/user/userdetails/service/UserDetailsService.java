package com.user.userdetails.service;

import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

	public String getUser(String userName, String userDob) {
		return "User name is "+userName+" and user date of birth is " + userDob;
	}

}
