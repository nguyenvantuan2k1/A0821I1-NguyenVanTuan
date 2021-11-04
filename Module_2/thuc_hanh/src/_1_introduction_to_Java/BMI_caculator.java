package _1_introduction_to_Java;

import java.util.Scanner;

public class BMI_caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter your weight :");
        weight = scanner.nextDouble();
        System.out.println("Enter your height :");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.println(bmi + " Underweight");
        else if (bmi < 25)
            System.out.println(bmi + " Nomal");
        else if (bmi < 30)
            System.out.println(bmi + " Overweight");
        else
            System.out.println(bmi + " Overweight");
    }
}
