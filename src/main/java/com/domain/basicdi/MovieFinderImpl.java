package com.domain.basicdi;

import java.util.ArrayList;
import java.util.List;

public class MovieFinderImpl implements MovieFinder {
    private List<Movie> movies;

    public MovieFinderImpl() {
        movies = new ArrayList<Movie>();
        movies.add(new Movie("Iron Man 3", "May 3, 2013", 7.7f));
        movies.add(new Movie("The Iceman", "May 3, 2013", 7.2f));
        movies.add(new Movie("What Maisie Knew", "May 3, 2013", 6.7f));
        movies.add(new Movie("The Great Gatsby", "May 10, 2013", 7.5f));
        movies.add(new Movie("Star Trek Into Darkness", "May 16, 2013", 8.3f));
        movies.add(new Movie("Frances Ha", "May 17, 2013", 7.6f));
    }

    @Override
    public List<Movie> findMovie() {
        return movies;
    }

}
