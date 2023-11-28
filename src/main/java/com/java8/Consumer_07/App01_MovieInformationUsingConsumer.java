package com.java8.Consumer_07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
Consumer:
---------
>>> Consumer is a functional interface that accepts arguments and produce data without returning result
>>> Consumer is an functional interface which contains one abstract method which is accept
>>> interface Consumer<T>{
        void accept(T t);
    }
*/

class Movie {
    String movieName;
    double IMBDRating;

    Movie(String movieName, double IMBDRating) {
        this.movieName = movieName;
        this.IMBDRating = IMBDRating;
    }

    public String toString() {
        return"Movie Name = "+movieName + ", Rating = " + IMBDRating;
    }
}

public class App01_MovieInformationUsingConsumer {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("Avengers", 9.2), new Movie("DDLJ", 10),
                new Movie("K3G", 10));

        Consumer<Movie> c = (movie) -> {
            System.out.println(movie);

        };

        for(Movie m : movies){
            c.accept(m);
        }

    }
}
