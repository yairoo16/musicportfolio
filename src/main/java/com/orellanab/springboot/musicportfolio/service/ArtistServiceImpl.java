package com.orellanab.springboot.musicportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orellanab.springboot.musicportfolio.dao.interfaces.ArtistDAO;
import com.orellanab.springboot.musicportfolio.entity.Artist;
import com.orellanab.springboot.musicportfolio.service.interfaces.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {

	private ArtistDAO _artistDAO;
	
	@Autowired
	public ArtistServiceImpl(ArtistDAO artistDAO) {
		_artistDAO = artistDAO;
	}
	@Override
	public List<Artist> findAllArtists() {
		
		return _artistDAO.findAllArtists();
	}

	@Override
	public List<Artist> findArtistsBySearch(String searchValue) {
		
		return _artistDAO.findArtistsBySearch(searchValue);
	}

}
