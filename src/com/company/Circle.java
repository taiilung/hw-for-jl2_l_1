package com.company;

public class Circle extends Figure implements Drawable {
    private double radius;
    private final double PI = 3.14;

    public Circle(String name,double radius) {
        super(name);
        this.radius = radius;

    }

    @Override
    public double calculatePerimeter() {
        return 4 * PI * radius;
    }

    @Override
    public String draw() {
        return "\u26AB";
    }
}
