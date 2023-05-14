package com.company.day18;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieShop {

    public static void main(String[] args) {
        Movie mov1 = new Movie("Rocky", "Family", 1.6);
        Movie mov2 = new Movie("Matrix", "Action", 2.6);
        Movie mov3 = new Movie("Cars", "Animation", 1.1);
        //System.out.println(mov1.toString());
        List<Movie> moviesObj = new ArrayList(Arrays.asList(mov1, mov2, mov3));
        // maxLength(moviesObj);
        System.out.println(findAMovie(moviesObj, "Family"));

    }

    public static void maxLength(List<Movie> m) {
        double maxLength = m.get(0).getMovieLength();
        for (Movie each : m) {
            if (each.getMovieLength() > maxLength) {
                maxLength = each.getMovieLength();
                System.out.println("the max length movie is " + each.getMovieName());
            }
        }

//a method find a movie regarding a kind of type;
// method(family); ->  Rocky, Family, 1.6         

    }

    public static Movie findAMovie(List<Movie> m, String type) {
        Movie result = new Movie();
        for (Movie each : m) {
            if (each.getMovieType().equalsIgnoreCase(type)) {
                result = each;
            }
        }
        return result;
    }




}
