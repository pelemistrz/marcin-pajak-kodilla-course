package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTestSuite {

    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        //given
        FileReader fileReader = new FileReader();
        String fileName = "nieMaTakiegoPliku.txt";
        //when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }
    @Test
    void testReadFileWithName(){
        //given
        FileReader fileReader = new FileReader();
        //when & then
        assertAll(
                () -> assertThrows(FileReaderException.class,()->fileReader.readFile("niema.txt")),
                () -> assertThrows(FileReaderException.class,() -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(()->fileReader.readFile("names.txt"))
        );
    }

}
