package com.orellanab.springboot.musicportfolio.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orellanab.springboot.musicportfolio.entity.Artist;
import com.orellanab.springboot.musicportfolio.service.interfaces.ArtistService;

@RestController
@RequestMapping("/api")
public class ArtistRestController {
	
	private ArtistService _artistService;

	@Autowired
	public ArtistRestController(ArtistService artistService) {
		_artistService = artistService;
	}
	
	@CrossOrigin
	@GetMapping("/artists")
	public List<Artist> findAllArtists() {
		return _artistService.findAllArtists();
	}
	
	
	@CrossOrigin
	@GetMapping("/artists/search")
	@ResponseBody
	public List<Artist> findArtistsBySearch(@RequestParam String searchValue) {
		return _artistService.findArtistsBySearch(searchValue);
	}

}
