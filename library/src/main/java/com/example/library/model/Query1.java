package com.example.library.model;

public class Query1 {
	
	private String genre;
	private Long countGenre;

	public Query1(){

	}

	public Query1(String genre, Long countGenre) {
		this.genre = genre;
		this.countGenre = countGenre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Long getCountGenre() {
		return countGenre;
	}

	public void setCountGenre(Long countGenre) {
		this.countGenre = countGenre;
	}

	
}
