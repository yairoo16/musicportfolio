package com.orellanab.springboot.musicportfolio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="track")
public class Track implements Serializable {

	private static final long serialVersionUID = 8560727584875379526L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="title")
	private String title;
	
	@Column(name="genre_id")
	private int genreId;
	
	@Column(name="release_date")
	private String releaseDate;
	
	@Column(name="image")
	private String image;
	
	@Column(name="music")
	private String music;
	
	@Column(name="is_featured")
	private Boolean isFeatured;
	
	@ManyToMany
    @JoinTable(
        name = "track_artist", 
        joinColumns = { @JoinColumn(name = "track_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "artist_id") }
    )
	private List<Artist> artists = new ArrayList<Artist>();

	public Track() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}
	
	public Boolean isFeatured() {
		return isFeatured;
	}

	public void setFeatured(Boolean isFeatured) {
		this.isFeatured = isFeatured;
	}
	
	public List<Artist> getArtists() {
		return this.artists;
	}
	
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	@Override
	public String toString() {
		return "Track [id=" + id + ", title=" + title + ", genreId=" + genreId + ", releaseDate=" + releaseDate
				+ ", image=" + image + ", music=" + music + "]";
	}
	
	
}
