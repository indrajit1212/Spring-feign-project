package com.example.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "EMPLOYEE-CLIENT", url = "http://localhost:8081/employee")
public interface EmployeeClient {
	@GetMapping
	String displayEmployee();

}
