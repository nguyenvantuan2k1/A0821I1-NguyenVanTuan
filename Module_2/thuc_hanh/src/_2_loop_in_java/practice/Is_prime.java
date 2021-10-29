package _2_loop_in_java.practice;

import java.util.Scanner;

public class Is_prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number :");
        int number=sc.nextInt();
        boolean prime=true;
        if(number<2){
            prime=false;
        }else{
            for(int i=2;i<=Math.sqrt(number);i++) {
                if(number%i==0) {
                    prime = false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println(number+" is a prime");
        }else{
            System.out.println(number+" is not a prime");
        }

    }
}
