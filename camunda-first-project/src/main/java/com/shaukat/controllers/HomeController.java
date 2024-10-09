package com.shaukat.controllers;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "today is a good day...!";
	}
	
	@GetMapping("/execute")
	public String execute() {
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instanceByKey = processEngine.getRuntimeService().createProcessInstanceByKey("Process_0u1x5jd");
		
		String item="computer";
		instanceByKey.setVariable("itemName", item);
		instanceByKey.businessKey("execute-endpoint");
		
		instanceByKey.executeWithVariablesInReturn();
		
		return "BPMN has executed...!";
	}
}
