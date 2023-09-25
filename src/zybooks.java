import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        int shipWeightPounds;
        int shipCostCents = 0;
        final int FLAT_FEE_CENTS = 75;

        final int CENTS_PER_POUND = 25;

        shipWeightPounds = scnr.nextInt();
        shipCostCents = (shipWeightPounds * CENTS_PER_POUND) + FLAT_FEE_CENTS;

        System.out.println("Weight(lb): " + shipWeightPounds);
        System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
        System.out.println("Cents per pound: " + CENTS_PER_POUND);
        System.out.println("Shipping cost(cents): " + shipCostCents);

    }
}
