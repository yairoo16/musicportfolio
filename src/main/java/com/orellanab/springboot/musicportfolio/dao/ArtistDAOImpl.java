package com.orellanab.springboot.musicportfolio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orellanab.springboot.musicportfolio.dao.interfaces.ArtistDAO;
import com.orellanab.springboot.musicportfolio.entity.Artist;

@Repository
public class ArtistDAOImpl implements ArtistDAO {

	private EntityManager _entityManager;
	
	@Autowired
	public ArtistDAOImpl(EntityManager entityManager) {
		_entityManager = entityManager;
	}
	
	@Override
	public List<Artist> findAllArtists() {
		
		Session currentSession = _entityManager.unwrap(Session.class);
		
		Query<Artist> query = currentSession.createQuery("from Track", Artist.class);
		
		List<Artist> artists = query.getResultList();
		
		return artists;
	}

	@Override
	public List<Artist> findArtistsBySearch(String searchValue) {

		Session currentSession = _entityManager.unwrap(Session.class);
		
		Query<Artist> query = currentSession.createQuery("from Artist where name = :searchValue", Artist.class);
		query.setParameter("searchValue", searchValue);
		
		List<Artist> artists = query.getResultList();
		
		return artists;
	}

}
