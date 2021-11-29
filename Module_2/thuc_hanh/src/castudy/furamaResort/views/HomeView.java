package castudy.furamaResort.views;

import castudy.furamaResort.utils.CommonUtil;

public class HomeView {
    public static void display() {
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n");
        int choice = 0;
        do {
            System.out.println("Enter your choice :");
            choice = Integer.parseInt(CommonUtil.getScanner().nextLine());
        } while (choice <= 0 || choice > 6);
        switch (choice) {
            case 1: {
                EmployeeView.views();
                break;
            }
            case 2: {
                CustomerView.views();
                break;
            }
            case 3: {
                FancilityView.views();
                break;
            }
            case 4: {
                Bookingview.views();
                break;
            }
            case 5: {
                PromotionView.promotionManager();
                break;
            }
            case 6: {
                break;
            }
        }
    }

    public static void main(String[] args) {
        HomeView.display();
    }
}
