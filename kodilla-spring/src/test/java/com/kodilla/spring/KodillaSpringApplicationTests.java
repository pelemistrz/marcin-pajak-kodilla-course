package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class  KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("circle");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("Circle",name);
    }
    @Test
    void testTriangleLoadedeIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape =(Shape) context.getBean("triangle");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("Triangle",name);
    }
    @Test
    void testSquareLoadedIntoContainer(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape =(Shape) context.getBean("createSquare");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("Square",name);
    }

    @Test
    void testShapeLoadedIntoContainer(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("chosenShape");
        //when
        String name = shape.getShapeName();
        //then
        System.out.println("Chosen Shape: "+name);
    }

}
