package com.orellanab.springboot.musicportfolio.service;

import java.util.List;

import com.orellanab.springboot.musicportfolio.entity.Request;

public interface RequestService {
	
	public List<Request> findAllRequests();
	
	public Request findById(int id);
	
	public void save(Request request);
	
	public void deleteById(int id);

}
