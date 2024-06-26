package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @Test
    public void testGetListUsingFor(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> bookList = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : bookList){
            if(book.getYearOfPublication() > 2007){
                numberOfBooksPublicatedAfter2007++;
            }
        }
        assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> bookList = bookDirectory.getList();
        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0,bookList.size())
                .filter(n->bookList.get(n).getYearOfPublication() > 2007)
                .count();
        assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
