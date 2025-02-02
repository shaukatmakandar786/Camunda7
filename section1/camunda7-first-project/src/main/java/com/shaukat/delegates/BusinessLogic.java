package com.shaukat.delegates;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogic implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		
		 try {
	            System.out.println("Executing Business Logic...");
	            int result = 1 / 0; // This will cause an ArithmeticException

	        } catch (Exception e) {
	            System.out.println("Error occurred: " + e.getMessage());
	            throw new BpmnError("BUSINESS_ERROR", "Business logic failed due to division by zero.");
	        }
		
	}

}
