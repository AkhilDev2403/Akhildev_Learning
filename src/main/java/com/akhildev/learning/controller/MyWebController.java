package com.akhildev.learning.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
	
	@Autowired
	BusinessService service;
	
	public long returnValueFromBusinessService() {
		return service.calculateSum();
	}
}

@Component
class BusinessService{
	
	@Autowired
	DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		Integer sum = data.stream().reduce(Integer::sum).get();
		return sum;
	}
}

@Component
class DataService{
	
	public List<Integer> getData(){
		return Arrays.asList(100,200,500);
	}
}
