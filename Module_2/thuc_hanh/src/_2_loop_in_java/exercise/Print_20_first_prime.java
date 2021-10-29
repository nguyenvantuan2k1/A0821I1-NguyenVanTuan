package _2_loop_in_java.exercise;

import java.util.Scanner;

public class Print_20_first_prime {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int tmp = 2;
        System.out.println("20 Number first is prime :");
        while (count < number) {

            boolean check = true;
            if (tmp < 2) {
                check = false;
            }
            for (int i = 2; i <= Math.sqrt(tmp); i++) {
                if (tmp % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.printf(tmp + ", ");
                count++;
            }
            tmp++;
        }
    }
}
