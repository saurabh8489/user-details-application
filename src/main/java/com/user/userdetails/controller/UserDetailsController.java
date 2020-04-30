package com.user.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.userdetails.service.UserDetailsService;

@RestController
@RequestMapping(path = "/userdetails")
public class UserDetailsController {
	@Autowired
	public UserDetailsService detailsService;

	@GetMapping
	public String getUserDetails(@RequestParam(name = "userName") String userName,
			@RequestParam(name = "userDob") String userDob) {
		return detailsService.getUser(userName,userDob);
	}
}
