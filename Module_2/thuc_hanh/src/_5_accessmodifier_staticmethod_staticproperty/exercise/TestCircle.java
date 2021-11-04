package _5_accessmodifier_staticmethod_staticproperty.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle c= new Circle(2.5);
        System.out.println("Area of circle : "+c.getArea());
        System.out.println("the radius of circle : "+c.getRadius());
    }
}
