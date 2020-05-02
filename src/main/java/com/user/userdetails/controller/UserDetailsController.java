package com.user.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.userdetails.service.UserDetailsService;
import com.user.userdetails.service.UserResponse;

@RestController
@RequestMapping(path = "/user")
public class UserDetailsController {
	public static String MODULE_NAME = "User-Details-Application";
	@Autowired
	public UserDetailsService detailsService;

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public ResponseEntity<UserResponse> getUserDetails(@RequestParam(name = "userName") String userName,
			@RequestParam(name = "userDob") String userDob) {
		String userInfo = detailsService.getUser(userName, userDob);
		return ResponseEntity.ok(new UserResponse(userInfo, MODULE_NAME));
	}
}
