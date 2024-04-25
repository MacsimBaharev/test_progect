package org.example;

public class Rectangle implements Shape, Comparable<Rectangle> {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea(){
        return a * b;
    }

    @Override
    public int compareTo(Rectangle a) {
        return (int) (a.getArea() - getArea());
    }

    @Override
    public String toString(){
        return "Rectangle " + a + ", " + b + " area = " + getArea();
    }
}
