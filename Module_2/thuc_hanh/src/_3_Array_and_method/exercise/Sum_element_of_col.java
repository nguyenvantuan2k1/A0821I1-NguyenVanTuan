package _3_Array_and_method.exercise;

import java.util.Scanner;

public class Sum_element_of_col {
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
        //in mảng sau khi nhập
        System.out.println("Array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        //tìm tổng của cột muốn cộng tổng
        int sum=0;
        System.out.println("choose a col to caculator sum :");
        int choose = scanner.nextInt();
        if(choose<0||choose>array.length-1){
            System.out.println("can't find colum to caculator");
        }else{
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(choose==j){
                        sum+=array[i][j];
                    }
                }
            }
            System.out.println("sum of colum : "+sum);
        }
    }
}
