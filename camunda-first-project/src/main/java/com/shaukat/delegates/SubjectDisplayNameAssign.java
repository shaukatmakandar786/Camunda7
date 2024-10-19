package com.shaukat.delegates;

import java.util.HashMap;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SubjectDisplayNameAssign implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		@SuppressWarnings("unchecked")
		HashMap<String, String> subMap =(HashMap<String, String>) execution.getVariable("subjectObj");
		
		String displayName=null;
		
		switch(subMap.get("name")) {
		
			case "Java":
				displayName="Ja";
				break;
			
			case "Python":
				displayName="Py";
				break;
				
			case ".Net":
				displayName=".Ne";
				break;	
		}
		
		subMap.put("displayName", displayName);
	}

}
