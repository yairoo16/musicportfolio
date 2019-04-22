package com.orellanab.springboot.musicportfolio.dao;

import java.util.List;

import com.orellanab.springboot.musicportfolio.entity.Request;

public interface RequestDAO {
	
	public List<Request> findAllRequests();
}
