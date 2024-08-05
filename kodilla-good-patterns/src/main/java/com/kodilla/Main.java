package com.kodilla;

import com.kodilla.good.patterns.chalanges.MovieStore;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String movies = movieStore.getMovies().entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .flatMap(m -> m.stream())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
        int result = movieStore.silnia(5);
        System.out.print(result);

    }
}