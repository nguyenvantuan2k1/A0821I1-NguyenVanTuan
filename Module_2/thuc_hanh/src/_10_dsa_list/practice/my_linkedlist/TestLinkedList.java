package _10_dsa_list.practice.my_linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedlist = new MyLinkedList(10);
        linkedlist.addFirst(3);
        linkedlist.addFirst(4);
        linkedlist.addFirst(5);

        linkedlist.add(4,1);

        linkedlist.printList();
    }
}
