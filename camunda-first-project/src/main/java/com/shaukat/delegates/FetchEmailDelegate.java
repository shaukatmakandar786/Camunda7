package com.shaukat.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class FetchEmailDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Comming from FetchEmailDelegate....!");
		System.out.println("UserIdInput in FetchEmailDelegate: "+ execution.getVariable("userIdInput"));
		execution.setVariable("EmailId", "abc@gmail.com");
	}

}
