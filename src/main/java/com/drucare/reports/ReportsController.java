package com.drucare.reports;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportsController {
	
	 @GetMapping("/reports")
	    public String welcome() {
	        return "Welcome to reports!";
	 }

}
