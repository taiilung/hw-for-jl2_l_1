package com.company;

public class Square extends Figure implements Drawable {
    private double sideA;

    public Square(String name,double sideA){
        super(name);
        this.sideA = sideA;
    }
    public String getName(){
        return name;
    }

    public double calculatePerimeter(){
        return (sideA)*3;
    }


    @Override
    public String draw() {
        return "\u2B1B";
    }
}
