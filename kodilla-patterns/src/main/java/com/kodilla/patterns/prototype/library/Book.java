package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {
    final String title;
    final String author;
    final LocalDate publishDate;

    public Book(final String title, final String author, int year, int month, int day) {
        this.title = title;
        this.author = author;
        this.publishDate = LocalDate.of(year, month, day);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
