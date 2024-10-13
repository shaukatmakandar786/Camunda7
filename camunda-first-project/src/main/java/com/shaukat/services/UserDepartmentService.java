package com.shaukat.services;

import org.springframework.stereotype.Component;

@Component
public class UserDepartmentService {

	public String getUserDepartment() {
		
		System.out.println("Comming from getUserDepartment() of UserDepartmentService class");
		return "Accounts";
	}
}
