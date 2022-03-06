package com.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dao.MovieDao;
import com.model.ShowMovie;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
@Transactional
@Repository
@EnableWebMvc
@RequestMapping(value = "/movie", method = RequestMethod.GET)
public class MovieController {

	@Autowired
	private MovieDao movieDaoImpl;
	

	@RequestMapping(value = "/list")
	public String listMovies(Model m) {
		System.out.println(" inside Movie Controller inside List method");
		List<ShowMovie> movies = movieDaoImpl.getShowMovie();
		for(ShowMovie m1:movies) {
			System.out.println(m1.toString());
		}
		m.addAttribute("movieslist", movies);
		
		return "index";
	}
	
	@RequestMapping(value = "/book")
	public String BookMovies(Model m, int id) {
		System.out.println(" inside Movie Controller inside book method");
		List<ShowMovie> movies = movieDaoImpl.getMovies(id);
		//m.addAttribute("book", movies);
		return "bookshowseating";
		
	}
}
