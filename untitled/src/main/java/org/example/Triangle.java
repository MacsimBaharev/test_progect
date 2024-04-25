package org.example;

public class Triangle implements Shape, Comparable<Triangle> {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea(){
        double halfOfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a) * (halfOfPerimeter - b) * (halfOfPerimeter - c));
    }

    @Override
    public int compareTo(Triangle a) {
        return (int) (a.getArea() - getArea());
    }

    @Override
    public String toString(){
        return "Triangle " + a + ", " + b + ", " + c + " area = " + getArea();
    }
}
