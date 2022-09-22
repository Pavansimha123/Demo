package com.Userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Userservice.Service.userserviceimpl;
import com.Userservice.VO.ResponseTemplateVO;
import com.Userservice.entity.User;

@RestController
@RequestMapping("/Users")
public class UserController {

	@Autowired
	private userserviceimpl userservices;
	
	@PostMapping("/saveuser")
	public User saveuser(@RequestBody User user)
	{
		return userservices.saveuser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getuserwithdepartment(@PathVariable("id") Long userid)
	{
		
			return userservices.getuserwithdepartment(userid);
	
	}
}
