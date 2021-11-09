package _6_inheritance.exercise.circle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c= new Cylinder(2.5,"green",5);
        System.out.println("the tich :"+c.getVolume());
        System.out.println(c.toString());
    }
}
