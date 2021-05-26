package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserResponse;
import com.example.demo.feignclient.EmployeeClient;
import com.example.demo.feignclient.UserClient;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignApplication {
	@Autowired
	private EmployeeClient employeeClient;

	@Autowired
	private UserClient userClient;

	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUser() {
		return userClient.getUsers();
	}

	@GetMapping("/findAllEmployee")
	public String getAllEmployee() {

		return employeeClient.displayEmployee();
	}

	public static void main(final String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}

}
