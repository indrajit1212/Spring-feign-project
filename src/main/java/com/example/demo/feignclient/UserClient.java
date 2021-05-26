package com.example.demo.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.UserResponse;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "USER-Client")
public interface UserClient {

	@GetMapping("/users")
	List<UserResponse> getUsers();
}
