package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {
    @Autowired
    private Library library;

    @Test
    void testLoadFromDb(){
        //given


        //when
        library.loadFromDb();
        //then

    }

    @Test
    void testSaveToDb(){
        //given

        //when
        library.saveToDb();
        //then
    }

    @Test
    void testContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        //when & then
        System.out.println("Bean list ==================");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("Bean list ===================");
    }
}
