package com.domain.basicdi;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class Caller {
    private MovieLister movieLister;

    public Caller(MovieLister movieLister) {
        this.movieLister = movieLister;
    }

    @PostConstruct
    public void listMovie() {
        movieLister.listMovie();
    }

}
