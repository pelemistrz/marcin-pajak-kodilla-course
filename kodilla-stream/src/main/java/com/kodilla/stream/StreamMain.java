package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.person.People;
import java.util.*;

import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(b->b.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(theResultStringOfBooks);


    }
}