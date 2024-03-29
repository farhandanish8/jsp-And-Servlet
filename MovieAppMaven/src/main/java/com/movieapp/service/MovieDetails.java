package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	public List<String> showMovies(String language){
		List<String>movies = null;
		if(language.equals("English"));
		movies=Arrays.asList("Avengers","Avenger2","DieHard");
		if(language.equals("Kannada"));
		movies=Arrays.asList("KGF1","KGF2","SSDY");
		if(language.equals("Tamil"));
		movies=Arrays.asList("Master","Bigil","Sarkar");
		if(language.equals("Hindi"));
		movies=Arrays.asList("Don1","Don2","Tiger");
		return movies;
	}

}