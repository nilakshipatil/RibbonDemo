package com.ribbondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/")
public class RibbonController {

		@Autowired
		RestTemplate rest;
		
		@GetMapping
		public String disp(){
			String url="http://myapp/";
			String str=rest.getForObject(url, String.class);
			return "server returned" +str;
		}
	
	
}
