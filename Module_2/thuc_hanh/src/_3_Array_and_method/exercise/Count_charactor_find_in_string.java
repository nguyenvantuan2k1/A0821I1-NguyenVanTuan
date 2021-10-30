package _3_Array_and_method.exercise;

import java.util.Scanner;

public class Count_charactor_find_in_string {
    public static void main(String[] args) {
        String chuoi;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any String : ");
        chuoi = scanner.nextLine();
        System.out.println("Enter charactor count :");
        String kyTu = scanner.nextLine();
        char kt = kyTu.charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kt) {
                count++;
            }
        }

        System.out.println("sum of  " + kyTu + " you can find in " + chuoi + " is : " + count);
    }
}
