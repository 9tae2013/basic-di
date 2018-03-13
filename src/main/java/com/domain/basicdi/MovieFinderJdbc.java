package com.domain.basicdi;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository("movieFinderJdbc")
public class MovieFinderJdbc implements MovieFinder {
    @Override
    public List<Movie> findMovie() {
        return Collections.singletonList(new Movie("m1", "Dec 3 4, 2011", 7));
    }

}
