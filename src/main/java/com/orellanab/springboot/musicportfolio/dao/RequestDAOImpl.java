package com.orellanab.springboot.musicportfolio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orellanab.springboot.musicportfolio.entity.Request;

@Repository
public class RequestDAOImpl implements RequestDAO {

	private EntityManager _entityManager;
	
	@Autowired
	public RequestDAOImpl(EntityManager entityManager) {
		_entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Request> findAllRequests() {
		
		Session currentSession = _entityManager.unwrap(Session.class);
		
		Query<Request> query = currentSession.createQuery("from Request", Request.class);
		
		List<Request> requests = query.getResultList();
		
		return requests;
	}

}
