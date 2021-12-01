package _13_algorithmic_search.exercise.binary_search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BinarySearchSetting {
    static ArrayList<Integer> list = new ArrayList<>();

    static int binarySearch(ArrayList<Integer> list, int key) {
        int low = 0;
        int high = list.size() - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list.get(mid))
                high = mid - 1;
            else if (key == list.get(mid))
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void input() {
        System.out.println("Enter number of array :");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Enter element " + i + " : ");
            list.add(scanner.nextInt());
        }
    }

    private static void sort() {
        list.sort(Comparator.comparingInt(o -> o));
    }

    public static void main(String[] args) {
        input();
        sort();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number search :");
        int x = scanner.nextInt();
        System.out.println("possition of number is :" + binarySearch(list, x));
    }

}

