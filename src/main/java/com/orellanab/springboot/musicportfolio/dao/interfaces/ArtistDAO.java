package com.orellanab.springboot.musicportfolio.dao.interfaces;

import java.util.List;

import com.orellanab.springboot.musicportfolio.entity.Artist;

public interface ArtistDAO {

	public List<Artist> findAllArtists();
	
	public List<Artist> findArtistsBySearch(String searchValue);
}
