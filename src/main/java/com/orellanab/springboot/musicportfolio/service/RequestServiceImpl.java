package com.orellanab.springboot.musicportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orellanab.springboot.musicportfolio.dao.interfaces.RequestDAO;
import com.orellanab.springboot.musicportfolio.entity.Request;
import com.orellanab.springboot.musicportfolio.service.interfaces.RequestService;

@Service
public class RequestServiceImpl implements RequestService {

	private RequestDAO _requestDAO;
	
	@Autowired
	public RequestServiceImpl(RequestDAO requestDAO) {
		_requestDAO = requestDAO;
	}

	@Override
	@Transactional
	public List<Request> findAllRequests() {
		
		return _requestDAO.findAllRequests();
	}

	@Override
	@Transactional
	public Request findById(int id) {

		return _requestDAO.findById(id);
	}

	@Override
	@Transactional
	public void save(Request request) {

		_requestDAO.save(request);

	}

	@Override
	@Transactional
	public void deleteById(int id) {

		_requestDAO.deleteById(id);

	}

}
