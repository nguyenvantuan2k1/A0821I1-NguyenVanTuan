package _11_dsa_stack_and_queue.exercise.checkbracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static boolean checkbracket(String s){
        Stack<Character> check =new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                check.push(s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(!check.isEmpty())
                check.pop();
                else
                    return false;
            }
        }
        return check.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("nhập vào một biểu thức để kiểm tra :");
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        if(checkbracket(s))
            System.out.println("Well");
        else System.out.println("Bad");
    }
}
