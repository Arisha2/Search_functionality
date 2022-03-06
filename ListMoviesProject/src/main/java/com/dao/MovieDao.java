package com.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ShowMovie;

@Service
public interface MovieDao {
	public List <ShowMovie> getShowMovie();
	//public ShowMovie getShowMovie(String name);
	//public ShowMovie getMovies();
	public List <ShowMovie> getMovies(int id);
}
