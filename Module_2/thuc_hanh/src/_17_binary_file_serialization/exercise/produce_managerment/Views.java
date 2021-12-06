package _17_binary_file_serialization.exercise.produce_managerment;

import java.util.List;
import java.util.Scanner;


public class Views {
    static ProductController controller = new ProductController();

    public void views() {
        boolean check = true;
        while (check) {
            System.out.println("""
                    1.\tDisplay list Produce
                    2.\tAdd new Produce
                    3.\tFind Produce
                    4. \tExit
                    """);
            int choice;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Enter your choice :");
                choice = Integer.parseInt(scanner.nextLine());
            } while (choice <= 0 || choice > 4);
            switch (choice) {
                case 1 -> display();
                case 2 -> addProduce();
                case 3 -> find();
                case 4 -> check = false;
            }
        }
    }

    private static void addProduce() {
        Produce produce = new Produce();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID Produce :");
        produce.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name Produce : ");
        produce.setName(scanner.nextLine());
        System.out.println("Enter manufacturer of Produce :");
        produce.setManufacturer(scanner.nextLine());
        System.out.println("Enter Price for Produce :");
        produce.setPrice(Double.parseDouble(scanner.nextLine()));

        controller.addProduce(produce);
    }

    private static void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name Produce to find :");
        String name = scanner.nextLine();
        List<Produce> tmp = controller.find(name);
        for (Produce producer : tmp) {
            System.out.println(producer);
        }
    }

    private static void display() {
        controller.display();
    }

    public static void main(String[] args) {
        Views views = new Views();
        views.views();
    }
}
