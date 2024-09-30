package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier  {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        for (Book b : bookSet) {
            BookSignature bookSignature = new BookSignature(b.getSignature());
            com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book book = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(b.getAuthor(), b.getTitle(), b.getPublicationYear());
            books.put(bookSignature, book);
        }

        return medianPublicationYear(books);
    }
}

