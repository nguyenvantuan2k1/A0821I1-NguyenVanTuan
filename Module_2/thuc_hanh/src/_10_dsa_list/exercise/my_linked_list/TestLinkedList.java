package _10_dsa_list.exercise.my_linked_list;



public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList l= new MyLinkedList();
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);
        l.addLast(6);
        System.out.println("before");
        l.printlist();
//        l.removeFirst();
//        l.removeLast();
//        l.remove(2);
//        MyLinkedList.Node x= new MyLinkedList.Node(3);
//        System.out.println("vi tri cua node tim thay trong list la :"+l.indexOf(x));
        System.out.println("after");
       l.printlist();
    }
}
