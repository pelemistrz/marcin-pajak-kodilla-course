package com.kodilla.stream.beutifier;

public class PoemBeutifier {
    public void beutify(String text, PoemDecorator poemDecorator){
        String beutifyText  = poemDecorator.decorator(text);
        System.out.println("Beutify text: " + beutifyText);
    }
}
package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String nameOfMovies = movieStore.getMovies().entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .flatMap(movies -> movies.stream())
                .forEach(System.out::println);


    }
}