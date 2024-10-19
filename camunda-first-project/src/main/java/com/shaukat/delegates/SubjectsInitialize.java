package com.shaukat.delegates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SubjectsInitialize implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		ArrayList<Map<String, String>> subjectList = new ArrayList<Map<String, String>>();
		
		for(Integer i=1; i<5; i++) {
			HashMap<String, String> subject = new HashMap<String, String>();
			subject.put("id", i.toString());
			subjectList.add(subject);
		}
		execution.setVariable("subjectList", subjectList);
	}

}
