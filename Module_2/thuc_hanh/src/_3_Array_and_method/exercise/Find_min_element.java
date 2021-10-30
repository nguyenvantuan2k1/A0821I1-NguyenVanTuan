package _3_Array_and_method.exercise;

import java.util.Scanner;

public class Find_min_element {
    public static void main(String[] args) {
        int size1;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sizes of array :");
        size1 = scanner.nextInt();

        //nhap phan tu
        array = new int[size1];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        //tim vi tri nho nhat
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        System.out.println("element min of array is :"+array[index]);
    }
}
