package com.akhildev.learning.controller;

import org.springframework.stereotype.Component;

@Component
public class MyWebController {
	
	public long returnValueFromBusinessService() {
		return 200;
	}
}

class BusinessService{
	
}

class DataService{
	
}
