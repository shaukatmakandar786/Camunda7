package com.shaukat.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import jakarta.inject.Named;

@Component
public class UserRoleDeligate implements JavaDelegate{
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println("Comming from UserRoleDeligate...!");
		
		execution.setVariable("userRole", "Software Engineer");
		
	}
}
