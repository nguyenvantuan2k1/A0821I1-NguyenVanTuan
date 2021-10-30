package _3_Array_and_method.exercise;

import java.util.Scanner;

public class Add_two_array {
    public static void main(String[] args) {
        //nhap mang thu 1
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array 1:");
        size1 = scanner.nextInt();

        //nhap phan tu
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
        }
        //nhap mang thu 2
        int size2;
        int[] array2;
        System.out.print("Enter a size of array 2:");
        size2 = scanner.nextInt();

        //nhap phan tu
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[size1+size2];
        for (int i = 0; i <array1.length;i++){
            array3[i]=array1[i];
        }
        int d=0;
        for (int i = size1; i <array3.length;i++){
            array3[i]=array2[d++];
        }
        for (int i = 0; i <array3.length; i++){
            System.out.printf(array3[i]+" ");
        }
    }
}
