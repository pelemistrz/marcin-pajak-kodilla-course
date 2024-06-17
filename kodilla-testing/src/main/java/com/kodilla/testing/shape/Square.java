package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    int length;

    public Square(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;
        return length == square.length && name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + length;
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }

    public String getShapeName(){
            return this.name;
    }
    public int getField(){
        return length*length;
    }
}
