package castudy.furamaResort.views;

import castudy.furamaResort.utils.CommonUtil;

public class Bookingview {
    public static void views() {
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        int choice = 0;
        do {
            System.out.println("Enter your choice :");
            choice = Integer.parseInt(CommonUtil.getScanner().nextLine());
        } while (choice <= 0 || choice > 4);
        switch (choice) {
            case 1: {
                display();
                break;
            }
            case 2: {
                create();
                break;
            }
            case 3: {
                edit();
                break;
            }
            case 4: {
                HomeView.display();
            }
        }
    }

    private static void display() {
    }

    private static void create() {

    }

    private static void edit() {

    }
}
