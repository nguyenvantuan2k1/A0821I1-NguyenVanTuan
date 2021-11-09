package _6_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +"radius=" + super.getRadius() +
                ", color='" + super.getColor() +"',"+
                "height=" + height +
                "} ";
    }
}
