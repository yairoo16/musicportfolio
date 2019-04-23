package com.orellanab.springboot.musicportfolio.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orellanab.springboot.musicportfolio.entity.Request;
import com.orellanab.springboot.musicportfolio.service.RequestService;

@RestController
@RequestMapping("/api")
public class RequestRestController {

	private RequestService _requestService;
	
	@Autowired
	public RequestRestController(RequestService requestService) {
		_requestService = requestService;
	}
	
	@GetMapping("/requests")
	public List<Request> findAllRequests() {
		return _requestService.findAllRequests();
	}
	
	@GetMapping("/requests/{requestId}")
	public Request getRequest(@PathVariable int requestId) {
		
		Request request = _requestService.findById(requestId);
		
		if (request == null) {
			throw new RuntimeException("Request id not found - " + requestId);
		}
		
		return request;
	}
	
	@CrossOrigin
	@PostMapping("/requests")
	public Request addRequest(@RequestBody Request request) {
		
		request.setId(0);
		
		_requestService.save(request);
		
		return request;
		
	}
	
	@CrossOrigin
	@PutMapping("/requests")
	public Request updateRequest(@RequestBody Request request) {
		
		_requestService.save(request);
		
		return request;
	}
	
	@DeleteMapping("/requests/{requestId}")
	public String deleteEmployee(@PathVariable int requestId) {
		
		Request request = _requestService.findById(requestId);
		
		if (request == null) {
			throw new RuntimeException("Request id not found - " + requestId);
		}
		
		_requestService.deleteById(requestId);
		
		return "Deleted request id - " + requestId;
		
	}
	
	
	
}
