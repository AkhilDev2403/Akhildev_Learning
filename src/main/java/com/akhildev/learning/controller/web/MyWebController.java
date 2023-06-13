package com.akhildev.learning.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akhildev.learning.controller.business.BusinessService;

@Component
public class MyWebController {
	
	@Autowired
	BusinessService service;
	
	public long returnValueFromBusinessService() {
		return service.calculateSum();
	}
}
