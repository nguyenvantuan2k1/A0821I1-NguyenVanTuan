package _11_dsa_stack_and_queue.practice.myqueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println("Dequeue item is: ");
        for(int i = 0; i <2;i++){
            System.out.println(queue.dequeue().key);
        }
    }
}
