package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name;
    int lengthA;
    int lengthB;
    int lengthC;

    public Triangle(String name, int lengthA, int lengthB, int lengthC) {
        this.name = name;
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public int getLengthB() {
        return lengthB;
    }

    public void setLengthB(int lengthB) {
        this.lengthB = lengthB;
    }

    public int getLengthC() {
        return lengthC;
    }

    public void setLengthC(int lengthC) {
        this.lengthC = lengthC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;
        return lengthA == triangle.lengthA && lengthB == triangle.lengthB && lengthC == triangle.lengthC && name.equals(triangle.name);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", lengthA=" + lengthA +
                ", lengthB=" + lengthB +
                ", lengthC=" + lengthC +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lengthA;
        result = 31 * result + lengthB;
        result = 31 * result + lengthC;
        return result;
    }

    public String getShapeName(){
        return this.name;
   }
    public int getField(){
        double p = (this.lengthA * this.lengthB * this.lengthC) / 2;
        double y = p*(p-this.lengthA)*(p-this.lengthB)*(p-this.lengthC);
        int field = (int) Math.sqrt(y);

        return 1;
    }
}
