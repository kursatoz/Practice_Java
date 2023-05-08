package com.company.day18;

public class Movie {
    private String movieName;
    private String movieType;
    private double movieLength;

    public Movie(String movieName, String movieType, double movieLength) {
        this.movieName = movieName;
        this.movieType = movieType;
        this.movieLength = movieLength;
    }
    public Movie(){}

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public double getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(double movieLength) {
        this.movieLength = movieLength;
    }

    @Override
    public String toString() {
        return "Movie:" +
                "\nmovieName= " + movieName +
                ",\nmovieType= " + movieType +
                ",\nmovieLength= " + movieLength;
    }
}
