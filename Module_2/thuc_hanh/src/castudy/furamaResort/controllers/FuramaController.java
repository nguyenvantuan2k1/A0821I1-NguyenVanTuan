package castudy.furamaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void menu(){
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n");
    }
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            menu();
            System.out.println("Enter choice :");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("case 1");
                    break;
                }
                case 2:{
                    System.out.println("case 2");
                    break;
                }
                case 3:{
                    System.out.println("case 3");
                    break;
                }
                case 4:{
                    System.out.println("case 4");
                    break;
                }
                case 5:{
                    System.out.println("case 5");
                    break;
                }
                case 6:{
                    return;
                }
                default:{
                    System.out.println("don't have function please enter choice again ");
                    break;
                }
            }
        }while (true);
    }

    public static void main(String[] args) {
        FuramaController x= new FuramaController();
        x.displayMainMenu();

    }
}
