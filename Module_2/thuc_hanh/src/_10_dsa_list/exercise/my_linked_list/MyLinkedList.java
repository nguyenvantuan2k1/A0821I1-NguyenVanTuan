package _10_dsa_list.exercise.my_linked_list;


public class MyLinkedList {

    // khai báo  lớp node
    public static class Node {
        private int info;
        private Node next;

        public Node(int info) {
            this.info = info;
            this.next = null;
        }

        public Node(int info, Node next) {
            this.info = info;
            this.next = next;
        }

        public int getInfo() {
            return info;
        }

        public void setInfo(int info) {
            this.info = info;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


        public void printData() {
            System.out.println(this.info);
        }

    }

    //____________________________
    private Node head;

    public MyLinkedList() {
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int e) {
        Node newHead = new Node(e);
        newHead.next = head;
        head = newHead;
    }

    //them node vao cuoi danh sach
    public void addLast(int e) {
        Node t= new Node(e);
        if(head==null) head=t;
        else
        {
            Node p= head; while(p.next!=null) p=p.next;
            p.next=t;
        }

    }

    public void add(int value, int index) {
        if (index < 1) System.out.println("\n the possition is invalid");
        else if (index == 1) head = new Node(value, head);
        else {
            int vt = 1;
            Node p = head;
            while (p != null && vt < index - 1) {
                vt++;
                p = p.next;
            }
            if (p == null) System.out.println("\n invalid possition");
            else {
                Node t = new Node(value, p.next);
                p.next = t;
            }
        }
    }

    public int Size() {
        int size = 0;
        Node curentNode = head;
        while (curentNode != null) {
            curentNode = curentNode.next;
            size++;
        }
        return size;
    }

    public String toString() {
        String s = " ";
        Node q = head;
        while (q != null) {
            s += q.info;
            q = q.next;
        }
        return s;
    }

    public void printlist() {
        Node curentNode = head;
        while (curentNode!= null) {
            curentNode.printData();
            curentNode = curentNode.next;
        }
    }

    public void clear() {
        head = null;
    }

    // xóa Node nếu tìm thấy
    public void remove(Node node) {
        if (head == null) return;
        if (head.info == node.info) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.next.info == node.info) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public void removeFirst(){
        if(head == null) System.out.println("linkedList is empty !");
        else head=head.next;
    }
    public void removeLast(){
        if(head == null) System.out.println("linkedList is empty !");
        else {
            if(Size()==1){
                head=null;
            }else {
                Node current = head;
                while (current.next.next != null) {
                    current= current.next;
                }
                current.next=null;
            }
        }
    }
    // xóa nốt thứ k
    public void remove(int k){
        if(k<1||isEmpty()||k>Size()){
            System.out.println("don't remove it");
        }else{
            if(k==1) {
                head = head.next;
            }else if(k==Size()) {
                removeLast();
            }else {
                Node p= head;
                int vt=0;
                while (p != null && vt < k - 1) {
                    p=p.next;
                    if(p==null||p.next==null){
                        System.out.println("don't remove it ");
                    }else {
                        p.next=p.next.next;
                    }
                }


            }

        }
    }
    public int indexOf(Node x){
        int index = 1;
        Node current=head;
        while (current != null){
            if(current.info==x.info){
                return index;
            }else {
                index++;
                current=current.next;
            }
        }
        return -1;
    }

}
