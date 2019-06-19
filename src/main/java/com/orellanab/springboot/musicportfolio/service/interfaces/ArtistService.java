package com.orellanab.springboot.musicportfolio.service.interfaces;

import java.util.List;

import com.orellanab.springboot.musicportfolio.entity.Artist;

public interface ArtistService {
	
	public List<Artist> findAllArtists();
	
	public List<Artist> findArtistsBySearch(String searchValue);
}
