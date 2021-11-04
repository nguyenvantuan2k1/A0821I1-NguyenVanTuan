package _3_array_and_method.exercise;

import java.util.Scanner;

public class Sum_diagonal_array2d {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the order of the matrix: ");
            n = scanner.nextInt();
        } while (n < 0);

        int[][] A = new int[n][n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        //tìm tổng của đường chéo chính muốn cộng tổng
        int sum=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==j){
                        sum+=A[i][j];
                    }
                }
            }
            System.out.println("sum of colum : "+sum);
    }
}
