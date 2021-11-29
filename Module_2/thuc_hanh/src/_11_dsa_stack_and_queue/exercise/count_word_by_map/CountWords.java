package _11_dsa_stack_and_queue.exercise.count_word_by_map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String :");
        String input=scanner.nextLine();
        String []tmp=input.split("");
        int size=tmp.length;
        for(int i=0;i<size;i++) {
            int count =1;
            if(map.containsKey(tmp[i].charAt(0)))
                count++;
            map.put(tmp[i].charAt(0),count);
        }
        System.out.println(map);
    }
}
