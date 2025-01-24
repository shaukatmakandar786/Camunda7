package com.shaukat.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("FetchUserRoleDelegate")
public class FetchUserRoleDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Coming from FetchUserRoleDelegate");
		execution.setVariable("userRole", "Software Engineer");
	}

}
