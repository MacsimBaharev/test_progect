package org.example;

public class Circle implements Shape, Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Circle a) {
        return (int) (a.getArea() - getArea());
    }

    @Override
    public String toString(){
        return "Circle " + radius + " area = " + getArea();
    }
}
