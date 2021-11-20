package _11_dsa_stack_and_queue.practice.myqueue;

public class MyLinkedListQueue {
    private Node head,tail;

   public MyLinkedListQueue(){
       this.head = null;
       this.tail = null;
   }
   public void enqueue(int key){
       Node tmp = new Node(key);

       if(this.tail == null){
           this.head=this.tail=tmp;
           return;
       }
       this.tail.next = tmp;
       this.tail=tmp;
   }
   public Node dequeue() {
       if(this.head == null){
           return null;
       }
       Node tmp=this.head;
       this.head=this.head.next;
       if(this.head==null)
           this.tail=null;
       return tmp;
   }


}
