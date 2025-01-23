package com.shaukat.controller;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		
		return "Today is a good day!";
	}
	
	@GetMapping("/execute")
	public String execute() {
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey("Process_1c1tx0h");
		instance.executeWithVariablesInReturn();
		return "BPMN has executed!";
	}
	
	@GetMapping("/execute01")
	public String execute01() {
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey("Process_1erl25l");
		String itemName="computer";
		instance.setVariable("itemName", itemName);
		
		instance.executeWithVariablesInReturn();
		return "BPMN has executed!";
	}
	
	//We can start a process instance by many end-points, so to uniquely identify the process instance started by a particular
	//API we can set BusinessKey before starting the instance.
	@GetMapping("/execute02")
	public String execute02() {
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey("Process_0kwbzed");
		String itemName="computer";
		instance.setVariable("itemName", itemName);
		instance.businessKey("execute02");
		
		instance.executeWithVariablesInReturn();
		return "BPMN has executed!";
	}
}
