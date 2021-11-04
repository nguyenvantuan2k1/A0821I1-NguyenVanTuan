package _1_introduction_to_Java;

import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount USD you want to exchange : ");
        int USD = sc.nextInt();
        int VND = USD * rate;
        System.out.println("VND :" + VND);
    }
}
