package com.orellanab.springboot.musicportfolio.dao.interfaces;

import java.util.List;

import com.orellanab.springboot.musicportfolio.entity.Request;

public interface RequestDAO {
	
	public List<Request> findAllRequests();
	
	public Request findById(int id);
	
	public void save(Request request);
	
	public void deleteById(int id);
}
