package _3_Array_and_method.exercise;

import java.util.Scanner;

public class Delete_element {
    public static void delete(int[]array, int index){
        for (int i = index; i < array.length-1; i++){
            array[i]=array[i+1];
        }
    }
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
        System.out.println("Enter Number delete :");
        int x = scanner.nextInt();
        for (int i = 0; i <size; i++) {
            if(x==array[i]){
                delete(array,i);
                size--;
                i--;
            }
        }

        System.out.print("\nSau khi xoa : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
