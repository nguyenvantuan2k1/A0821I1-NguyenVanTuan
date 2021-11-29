package _12_java_collection_framework.exercise.use_arraylist_linkedlist.views;

import _12_java_collection_framework.exercise.use_arraylist_linkedlist.model.Produce;
import castudy.furamaResort.views.HomeView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Produce_View {
    static ArrayList<Produce> list = new ArrayList<Produce>();
    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        int choice = 0;
        while (true) {
        System.out.println("1\tAdd produces\n" +
                "2\tEdit produces\n" +
                "3\tRemove produces\n" +
                "4\tDisplay produces\n" +
                "5\tFind produces by name\n" +
                "6\tSort dsc name and asc by price\n ");
        do {
            System.out.println("Enter your choice :");
            choice= scanner.nextInt();
        } while (choice <= 0 || choice > 6);
            switch (choice) {
                case 1: {
                    add();
                    break;
                }
                case 2: {
                    edit();
                    break;
                }
                case 3: {
                    remove();
                    break;
                }
                case 4: {
                    display();
                    break;
                }
                case 5: {
                    find();
                    break;
                }
                case 6: {
                    sort();
                    break;
                }
            }
        }
    }

    private static void add() {
        Produce x = new Produce();
        x = Produce.newProduce();
        list.add(x);
    }

    private static void edit() {

        System.out.println("Enter id produce to edit :");
        ArrayList<Produce> tmp = new ArrayList<Produce>();
        int id = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                Produce x = new Produce();
                x = Produce.newProduce();
                tmp.add(x);
            } else {
                tmp.add(list.get(i));
            }
        }
        list = tmp;
    }

    private static void remove() {
        System.out.println("Enter id produce to remove :");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }
    }

    private static void display() {
        for (Produce x : list) {
            System.out.println(x.toString());
        }
    }

    private static void find() {
        System.out.println("Enter id produce to find :");
        int id = scanner.nextInt();
        for (Produce x : list) {
            if (x.getId() == id) {
                System.out.println(x.toString());
            }
        }
    }
    private static void sort() {
        Collections.sort(list, new Comparator<Produce>() {
            @Override
            public int compare(Produce o1, Produce o2) {
                int tmp= o1.getName().compareTo(o2.getName());
                return tmp==0 ? (int) (o1.getPrice() - o2.getPrice()) : tmp;
            }
        });
    }
}
