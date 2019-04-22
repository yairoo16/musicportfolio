package com.orellanab.springboot.musicportfolio.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orellanab.springboot.musicportfolio.dao.RequestDAO;
import com.orellanab.springboot.musicportfolio.entity.Request;

@RestController
@RequestMapping("/api")
public class RequestRestController {

	private RequestDAO _requestDAO;
	
	@Autowired
	public RequestRestController(RequestDAO requestDAO) {
		_requestDAO = requestDAO;
	}
	
	@GetMapping("/requests")
	public List<Request> findAllRequests() {
		return _requestDAO.findAllRequests();
	}
}
