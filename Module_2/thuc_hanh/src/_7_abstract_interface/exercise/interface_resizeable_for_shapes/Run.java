package _7_abstract_interface.exercise.interface_resizeable_for_shapes;

public class Run {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        System.out.println("before :");
        Shape.printShape(shapes);
        System.out.println();
        for (Shape a : shapes) {
            if (a instanceof Colorable) {
                System.out.println("the square have method how to color : "+a.toString());
                ((Colorable) a).howToColor();
            }
        }
        System.out.println("\n");
    }
}