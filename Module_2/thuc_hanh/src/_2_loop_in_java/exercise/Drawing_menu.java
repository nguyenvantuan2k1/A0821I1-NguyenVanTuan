package _2_loop_in_java.exercise;

import java.util.Scanner;

public class Drawing_menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter height :");
                    int h=scanner.nextInt();
                    for(int i=h;i>0;i--){
                        for(int j=i; j>0; j--){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter length :");
                    int length= scanner.nextInt();
                    System.out.println("Enter width :");
                    int width= scanner.nextInt();
                    for (int i=0; i<width;i++) {
                        for(int j=0;j<length;j++) {
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
