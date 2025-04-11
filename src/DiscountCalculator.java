import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer type (A, B, C, or D):");
        char customerType = scanner.next().toUpperCase().charAt(0);

        System.out.println("Enter purchase amount (in €):");
        double purchaseAmount = scanner.nextDouble();

        double discountPercentage = calculateDiscount(customerType, purchaseAmount);

        double discountAmount = purchaseAmount * discountPercentage / 100;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Customer Type: " + customerType);
        System.out.println("Purchase Amount: €" + purchaseAmount);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: €" + discountAmount);
        System.out.println("Final Amount to Pay: €" + finalAmount);

        scanner.close();
    }

    public static double calculateDiscount(char customerType, double purchaseAmount) {
        double discount;

        switch (customerType) {
            case 'A':
                if (purchaseAmount > 250) {
                    discount = 40;
                } else if (purchaseAmount > 100) {
                    discount = 25;
                } else {
                    discount = 15;
                }
                break;

            case 'B':
                if (purchaseAmount > 250) {
                    discount = 30;
                } else if (purchaseAmount > 100) {
                    discount = 15;
                } else {
                    discount = 10;
                }
                break;

            case 'C':
                if (purchaseAmount > 250) {
                    discount = 20;
                } else if (purchaseAmount > 100) {
                    discount = 10;
                } else {
                    discount = 5;
                }
                break;

            case 'D':
                if (purchaseAmount > 250) {
                    discount = 10;
                } else if (purchaseAmount > 100) {
                    discount = 5;
                } else {
                    discount = 0;
                }
                break;

            default:
                discount = 0;
                System.out.println("Invalid customer type. No discount applied.");
        }

        return discount;

        // Claude helped me
    }
}