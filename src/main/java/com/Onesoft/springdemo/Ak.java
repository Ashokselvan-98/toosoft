package com.Onesoft.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ak {
	@GetMapping("tk")
	public String ak() {
		return "saturday leave podalamnu iruken enna solringa";
	}

}
