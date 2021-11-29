package castudy.furamaResort.views;

import castudy.furamaResort.utils.CommonUtil;

public class PromotionView {
    public static void promotionManager() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        int choice = 0;
        do {
            System.out.println("Enter your choice :");
            choice = Integer.parseInt(CommonUtil.getScanner().nextLine());
        } while (choice <= 0 || choice > 4);
        switch (choice) {
            case 1: {
//                display();
                break;
            }
            case 2: {
//                create();
                break;
            }
            case 3: {
                HomeView.display();
                break;
            }
        }
    }
}
