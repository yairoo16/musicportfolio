package com.orellanab.springboot.musicportfolio.service.interfaces;

import java.util.List;

import com.orellanab.springboot.musicportfolio.entity.Track;

public interface TrackService {

	public List<Track> findAllTracks();
	
	public Track findTrackById(int id);
	
	public void save(Track track);
	
	public void deleteById(int id);
}
