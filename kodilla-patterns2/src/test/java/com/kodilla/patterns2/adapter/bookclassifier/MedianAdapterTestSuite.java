package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {
    @Test
    void testMedian() {
        //Given
        Book book1 = new Book("Wa","Ws",1980,"cd");
        Book book2 = new Book("Ya","Ys",2000,"cde");
        Book book3 = new Book("Za","Zs",2005,"cdef");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //when
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(books);
        assertEquals(2000,median);
    }

}