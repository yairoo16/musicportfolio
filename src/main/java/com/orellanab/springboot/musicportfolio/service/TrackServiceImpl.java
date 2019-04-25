package com.orellanab.springboot.musicportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orellanab.springboot.musicportfolio.dao.interfaces.TrackDAO;
import com.orellanab.springboot.musicportfolio.entity.Track;
import com.orellanab.springboot.musicportfolio.service.interfaces.TrackService;

@Service
public class TrackServiceImpl implements TrackService {

	private TrackDAO _trackDAO;
	
	@Autowired
	public TrackServiceImpl(TrackDAO trackDAO) {
		_trackDAO = trackDAO;
	}
	@Override
	public List<Track> findAllTracks() {
		
		return _trackDAO.findAllTracks();
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
