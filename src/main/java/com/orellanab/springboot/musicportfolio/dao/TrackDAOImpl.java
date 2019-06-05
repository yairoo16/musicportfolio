package com.orellanab.springboot.musicportfolio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orellanab.springboot.musicportfolio.dao.interfaces.TrackDAO;
import com.orellanab.springboot.musicportfolio.entity.Track;

@Repository
public class TrackDAOImpl implements TrackDAO {

	private EntityManager _entityManager;
	
	@Autowired
	public TrackDAOImpl(EntityManager entityManager) {
		_entityManager = entityManager;
	}
	
	@Override
	public List<Track> findAllTracks() {

		Session currentSession = _entityManager.unwrap(Session.class);
		
		Query<Track> query = currentSession.createQuery("from Track", Track.class);
		
		List<Track> tracks = query.getResultList();
		
		return tracks;
	}

	@Override
	public Track findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Track track) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
