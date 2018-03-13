package com.domain.basicdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private MovieFinder movieFinder;

    public MovieController(@Qualifier("movieFinderRest")  MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @GetMapping("/movie/list")
    public List<Movie> listMovie() {
        return movieFinder.findMovie();
    }
}
