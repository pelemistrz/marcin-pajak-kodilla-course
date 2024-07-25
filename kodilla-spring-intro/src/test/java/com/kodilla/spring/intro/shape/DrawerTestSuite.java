package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();

        Drawer drawer = new Drawer(circle);

        //When
        String result = drawer.doDrawing();

        //Then
        assertEquals("This is a circle", result);
    }

    @Test
    void testDoDrawingWithTriangle(){
        //given
        Triangle triangle = new Triangle();
        //when
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //then
        assertEquals("This is a triangle", result);
    }
}