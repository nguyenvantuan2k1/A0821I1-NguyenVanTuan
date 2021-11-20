package _11_dsa_stack_and_queue.exercise.reserverstack;

import java.util.Stack;

public class ReserverStack {
    public static Stack reserverstack(Stack stack1){
        Stack stack2 = new Stack();
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2;
    }
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack();
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");
        System.out.println("before");
        for (String s : stack1){
            System.out.println(s);
        }
        stack1 =reserverstack(stack1);
        System.out.println("after:");
        for (String s : stack1){
            System.out.println(s);
        }


    }
}
