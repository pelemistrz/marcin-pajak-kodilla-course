package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name;
    int radius;

    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
        return radius == circle.radius && name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

    public String getShapeName(){
        return this.name;
    }
    public int getField(){
        double field = Math.PI * Math.pow(radius, 2);
        return (int) field;
    }

}
