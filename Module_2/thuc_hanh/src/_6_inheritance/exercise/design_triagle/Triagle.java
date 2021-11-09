package _6_inheritance.exercise.design_triagle;

import _6_inheritance.practice.geometry.src.Shape;

public class Triagle extends Shape {
    private double side1,side2,side3;

    public Triagle() {
    }

    public Triagle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double p=(this.side1+this.side2+this.getSide1())/3;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }
    public  double getPerimeter() {
        return this.side1+this.side2+this.side3;
    }

    @Override
    public String toString() {
        return "Triagle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "} ";
    }
}
