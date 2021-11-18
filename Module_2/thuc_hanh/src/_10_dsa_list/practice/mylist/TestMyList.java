package _10_dsa_list.practice.mylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list= new MyList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(2);
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
//        System.out.println(list.get(6));
//        System.out.println(list.get(-1));
    }

}
