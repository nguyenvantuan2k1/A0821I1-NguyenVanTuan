package _11_dsa_stack_and_queue.exercise.decimaltobinary;

import java.util.Scanner;
import java.util.Stack;

public class DecToBin {
    public static  String changeToBinary(int number){
        String s="";
        Stack<Integer> stack = new Stack();
        while(number!=0){
            stack.push(number%2);
            number/=2;
        }
        while(!stack.isEmpty()){
            s+=stack.pop();
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println("nhập vào một số nguyên muốn chuyển sang nhị phân :");
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println(changeToBinary(num));
    }
}
