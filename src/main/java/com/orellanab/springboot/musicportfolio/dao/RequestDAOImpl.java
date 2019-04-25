package com.orellanab.springboot.musicportfolio.dao;


import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orellanab.springboot.musicportfolio.dao.interfaces.RequestDAO;
import com.orellanab.springboot.musicportfolio.entity.Request;

@Repository
public class RequestDAOImpl implements RequestDAO {

	private EntityManager _entityManager;
	
	@Autowired
	public RequestDAOImpl(EntityManager entityManager) {
		_entityManager = entityManager;
	}
	
	@Override
	public List<Request> findAllRequests() {
		
		Session currentSession = _entityManager.unwrap(Session.class);
		
		Query<Request> query = currentSession.createQuery("from Request", Request.class);
		
		List<Request> requests = query.getResultList();
		
		return requests;
	}

	@Override
	public Request findById(int id) {
		
		Session currentSession = _entityManager.unwrap(Session.class);
		
		Request employee = currentSession.get(Request.class, id);
		
		return employee;
	}

	@Override
	public void save(Request request) {
		
		Session currentSession = _entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(request);
		
	}

	@Override
	public void deleteById(int id) {

		Session currentSession = _entityManager.unwrap(Session.class);
		
		Query query = currentSession.createQuery("delete from Request where id=:requestId");
		query.setParameter("requestId", id);
		
		query.executeUpdate();
		
	}

}
