package _1_Introduction_to_Java;

import java.util.Scanner;

public class Hello_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println("Enter your name : ");
        System.out.println("Hello " + x);
    }
}
