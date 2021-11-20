package _11_dsa_stack_and_queue.practice.mystack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if(stack.size() == 0)
            return true;
        return false;
    }
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }

    public static void main(String[] args) {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
    }
}
