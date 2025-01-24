package com.shaukat.service;

import org.springframework.stereotype.Component;

@Component
public class UserDepartmentService {

	public String getUserDepartment() {
		
		System.out.println("Comming from getUserDepartment method of UserDepartmentService");
		
		return "Accounts";
	}
}
