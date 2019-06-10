package com.orellanab.springboot.musicportfolio.dao.interfaces;

import java.util.List;

import com.orellanab.springboot.musicportfolio.entity.Track;

public interface TrackDAO {

	public List<Track> findAllTracks();
	
	public Track findTrackById(int id);
	
	public void save(Track track);
	
	public void deleteById(int id);
}
