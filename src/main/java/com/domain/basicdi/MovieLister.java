package com.domain.basicdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieLister {

    private MovieFinder finder;

    public MovieLister(MovieFinder finder) {
        this.finder = finder;
    }

    public void listMovie() {
        for (Movie movie : finder.findMovie()) {
            System.out.printf("Movie name:%s\n\tRelease date:%s\n\tRate:%s/10\n", movie.getName(), movie.getReleaseDate(), movie.getRate());
        }
    }
}
