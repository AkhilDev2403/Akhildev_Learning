
package com.akhildev.learning.controller.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akhildev.learning.controller.data.DataService;

@Component
public class BusinessService{
	
	@Autowired
	DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		Integer sum = data.stream().reduce(Integer::sum).get();
		return sum;
	}
}

