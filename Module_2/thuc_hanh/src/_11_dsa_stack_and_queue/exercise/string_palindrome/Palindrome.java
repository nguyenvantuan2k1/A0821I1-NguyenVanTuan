package _11_dsa_stack_and_queue.exercise.string_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome{
    public static boolean ispalindrome(String s){
        Stack<Character> stack = new Stack();
        Queue<Character> queue = new LinkedList<Character>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
            queue.add(s.charAt(i));
        }
        for(int i=0;i<queue.size();i++){
            if(queue.poll().equals(stack.pop())==false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("nhập vào một chuỗi để kiểm tra :");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if(ispalindrome(line))
            System.out.println("chuỗi là một palindrome");
        else
            System.out.println("không phải là palindrome");
    }
}
