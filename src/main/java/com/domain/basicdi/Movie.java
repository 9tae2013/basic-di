package com.domain.basicdi;

public class Movie {
    private String name;
    private String releaseDate;
    private float rate;

    public Movie(String name, String releaseDate, float rate) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

}
