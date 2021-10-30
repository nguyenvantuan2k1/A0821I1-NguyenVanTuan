package _3_Array_and_method.exercise;

import java.util.Scanner;

public class Insert_element {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();

        //nhap phan tu
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        //chen phan tu
        System.out.println("Enter Number insert :");
        int number = scanner.nextInt();
        System.out.println("Enter index insert :");
        int index = scanner.nextInt();

        if (index < 0 || index > array.length) {
            System.out.println("can't insert into array");
        } else {
            int arr2[] = new int[size + 1];
            //copy mang cu qua
            for (int i = 0; i < size; i++) {
                arr2[i]=array[i];
            }
            for(int i=arr2.length-1;i>index;i--){
                arr2[i]=arr2[i-1];
            }
            arr2[index] = number;
            //in phan tu sau khi chen
            for (int i = 0; i < arr2.length; i++){
                System.out.printf(arr2[i]+" ");
            }
        }
    }
}
