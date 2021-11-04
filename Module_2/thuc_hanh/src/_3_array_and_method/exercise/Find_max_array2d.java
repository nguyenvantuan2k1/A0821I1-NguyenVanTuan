package _3_array_and_method.exercise;

import java.util.Scanner;

public class Find_max_array2d {
    public static void main(String[] args) {
        int row, col;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows of array: ");
        row = scanner.nextInt();
        System.out.println("Enter cols of array: ");
        col = scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int maxElements = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > maxElements) {
                    maxElements = array[i][j];
                }
            }
        }

        System.out.println("max element in array2d :" + maxElements);
    }
}
