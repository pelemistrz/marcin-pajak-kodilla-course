package com.kodilla.stream.person;                       // [1]

import java.util.ArrayList;                              // [2]
import java.util.List;                                   // [3]

public final class People {                              // [4]

    public static List<String> getList() {                // [5]
        final List<String> theList = new ArrayList<>();    // [6]

        theList.add("John Smith");                         // [7]
        theList.add("Dorothy Newman");                     // [8]
        theList.add("John Wolkowitz");                     // [9]
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");

        return new ArrayList<>(theList);
    }
}
