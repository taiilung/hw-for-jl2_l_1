package com.company;

public class Triangle extends Figure implements Drawable {
    private double sideA, sideB,sideC;

    public Triangle(String name, double sideA, double sideB,double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA+sideB+sideC)+48;
    }

    @Override
    public String draw() {
        return "\ud83d\udd3a";
    }
}
