package _15_exception_and_debug.exercise.triagle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1 :");
        double a= scanner.nextDouble();
        System.out.println("Enter side 2 :");
        double b= scanner.nextDouble();
        System.out.println("Enter side 3 :");
        double c= scanner.nextDouble();

        Triagle x= new Triagle(a,b,c);
        x.perimeter();
    }
}
