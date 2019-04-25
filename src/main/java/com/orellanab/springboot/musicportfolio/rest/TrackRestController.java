package com.orellanab.springboot.musicportfolio.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orellanab.springboot.musicportfolio.entity.Track;
import com.orellanab.springboot.musicportfolio.service.interfaces.TrackService;

@RestController
@RequestMapping("/api")
public class TrackRestController {

	private TrackService _trackService;

	@Autowired
	public TrackRestController(TrackService trackService) {
		_trackService = trackService;
	}
	
	@CrossOrigin
	@GetMapping("/tracks")
	public List<Track> findAllTracks() {
		return _trackService.findAllTracks();
	}
	
	
}
