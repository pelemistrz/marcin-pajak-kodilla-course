package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Testing Shape Collecor")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Testing: add figure")
    class AddFigure {
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle theTriangle = new Triangle("triangle", 3, 3, 3);

            //When
            shapeCollector.addFigure(theTriangle);

            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(theTriangle, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Testing: remove figure")
    class RemoveFigure {
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle theTriangle = new Triangle("triangle", 3, 3, 3);

            //When
            boolean result = shapeCollector.removeFigure(theTriangle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigureExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle theTriangle = new Triangle("triangle", 3, 3, 3);
            shapeCollector.addFigure(theTriangle);

            //When
            boolean result = shapeCollector.removeFigure(theTriangle);

            //Then
            Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Testing:  get Figure from collection with given position")
    class GetFigure{
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle theTriangle = new Triangle("triangle", 3, 3, 3);
            shapeCollector.addFigure(theTriangle);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(theTriangle, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Testing: show all figures in Collection")
    class ShowFigures{
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle theTriangle = new Triangle("triangle", 3, 3, 3);
            shapeCollector.addFigure(theTriangle);
            //When
            String figure = theTriangle.toString();

            //Then
            Assertions.assertEquals(figure, shapeCollector.showFigures());
        }
    }
}
