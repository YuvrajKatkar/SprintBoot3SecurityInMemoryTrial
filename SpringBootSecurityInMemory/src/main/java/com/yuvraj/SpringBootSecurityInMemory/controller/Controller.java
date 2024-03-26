package com.yuvraj.SpringBootSecurityInMemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/openForAll")
	public String getMethodName() {
		return "OPEN For ALL";
	}
	@GetMapping("/user/userAPI")
	public String getMethodName1() {
		return "USER API";
	}
	@GetMapping("/admin/adminAPI")
	public String getMethodName2() {
		return "ADMIN API";
	}
	
}
