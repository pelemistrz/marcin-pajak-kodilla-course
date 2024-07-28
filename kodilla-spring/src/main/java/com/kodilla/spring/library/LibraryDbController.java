package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;


public class LibraryDbController {
    public void saveData() {
        System.out.println("saving data to database");
    }

    public void loadData() {
        System.out.println("loading data from database");
    }
}
