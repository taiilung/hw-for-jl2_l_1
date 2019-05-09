package com.company;

public class Rectangle extends Figure implements Drawable {
    private double sideA, sideB;

    public Rectangle(String name,double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public String getName() {
        return name;
    }
    public double calculatePerimeter(){
        return (sideA+sideB)*2;
    }

    @Override
    public String draw() {
        char c = '\u2B1B';
        return new String().valueOf(c) + new String().valueOf(c);
    }
}
