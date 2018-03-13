package com.domain.basicdi;

public class MovieLister {
    public void listMovie() {
        MovieFinder finder = new MovieFinderImpl();
        for (Movie movie : finder.findMovie()) {
            System.out.printf("Movie name:%s\n\tRelease date:%s\n\tRate:%s/10\n", movie.getName(), movie.getReleaseDate(), movie.getRate());
        }
    }
}
