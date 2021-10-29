package _2_loop_in_java.practice;

import java.util.Scanner;

public class Greate_common_factor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }else {
            for(int i = Math.min(a,b); i > 0; --i) {
                if (a % i == 0 && b % i ==0){
                    System.out.println("Greatest common factor: " + i);
                    break;
                }
            }
        }
    }
}
