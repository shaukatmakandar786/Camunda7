package com.shaukat.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class FetchEmailDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		String a = execution.getVariable("userId").toString();
		System.out.println("User Id :: "+a);
		
		execution.setVariable("userEmailId", "shaukat@gmail.com");
		System.out.println("Coming from FetchEmail Delegate...!");
	}

}
