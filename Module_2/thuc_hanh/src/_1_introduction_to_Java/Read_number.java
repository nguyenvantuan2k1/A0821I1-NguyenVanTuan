package _1_introduction_to_Java;

import java.util.Scanner;

public class Read_number {
    public static String readANumber(int x) {
        String rs = "";
        switch (x) {
            case 1: {
                rs = "one";
                break;
            }
            case 2: {
                rs = "two";
                break;
            }
            case 3: {
                rs = "three";
                break;
            }
            case 4: {
                rs = "four";
                break;
            }
            case 5: {
                rs = "five";
                break;
            }
            case 6: {
                rs = "six";
                break;
            }
            case 7: {
                rs = "serven";
                break;
            }
            case 8: {
                rs = "eight";
                break;
            }
            case 9: {
                rs = "nine";
                break;
            }
        }
        return rs;
    }

    public static String readTwoNumber(int x) {
        String rs = "";
        switch (x) {
            case 14: {
                rs = "fourteen";
                break;
            }
            case 15: {
                rs = "fiveteen";
                break;
            }
            case 16: {
                rs = "sixteen";
                break;
            }
            case 17: {
                rs = "serventeen";
                break;
            }
            case 18: {
                rs = "eightteen";
                break;
            }
            case 19: {
                rs = "nineteen";
                break;
            }
            default: {
                int d = x % 10;
                int t = x / 10;
                rs = readANumber(t) + " and " + readANumber(d);
            }
        }
        return rs;
    }

    public static int countNumber(int number) {
        int d = 0;
        while (number > 0) {
            number /= 10;
            d++;
        }
        return d;
    }

    public static String readThreeNumber(int x) {
        String rs = "";
        int dv = (int) x % 10;
        x /= 10;
        int c = x % 10;
        int t = x /= 10;
        rs = readANumber(t) + " hundred " + readANumber(c) + " and " + readANumber(dv);
        return rs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number  : ");
        int number = sc.nextInt();
        int tmp = countNumber(number);
        System.out.println("Read Number :");
        switch (tmp) {
            case 1: {
                System.out.println(readANumber(number));
                break;
            }
            case 2: {
                System.out.println(readTwoNumber(number));
                break;
            }
            case 3: {
                System.out.println(readThreeNumber(number));
                break;
            }
            default: {
                System.out.println("out of number read");
            }
        }
    }
}
