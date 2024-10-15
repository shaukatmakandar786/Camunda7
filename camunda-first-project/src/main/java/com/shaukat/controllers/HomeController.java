package com.shaukat.controllers;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/task")
	public String scriptTask01() {
		
		ProcessEngine processEngine= ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance= processEngine.getRuntimeService().createProcessInstanceByKey("Process_1s5vocv");
		instance.executeWithVariablesInReturn();
		
		return "BPMN script task executed...!";
	}
	
	@GetMapping("/seq/{processKey}")
	public String sequenceFlowExample(@PathVariable("processKey") String processKey) {
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		
		ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey(processKey);
		instance.executeWithVariablesInReturn();
		
		return "BPMN sequence flow executed...!";
	}
}
