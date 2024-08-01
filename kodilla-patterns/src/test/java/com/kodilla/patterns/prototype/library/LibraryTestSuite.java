package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Book book1 = new Book("Podroz", "Verne", 2012, 12, 05);
        Book book2 = new Book("Hobbit", "Tolkien", 1989, 11, 23);
        Book book3 = new Book("Old sheterrhand", "May", 2015, 5, 6);
        Library library = new Library("Public");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        //when
        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Private");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("City");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //when
        library.removeBook(book1);
        System.out.println(library.getName() + ": " + library.getBooks());
        System.out.println(clonedLibrary.getName() + ": " + clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName() + ": " + deepClonedLibrary.getBooks());

        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
