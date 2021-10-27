package _1_Introduction_to_Java;

import java.util.Scanner;

public class Leap_year {
    public static boolean isLeapYear(int y) {
        if (y % 400 == 0)
            return true;
        if (y % 4 == 0 && y % 100 != 0)
            return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year) == true) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }


}
