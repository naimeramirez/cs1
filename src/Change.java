import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int totalChange = scnr.nextInt();

        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        if (totalChange <= 0) {
            System.out.println("No change");
        } else {
            dollars = totalChange / 100;
            quarters = (totalChange % 100) / 25;
            dimes = ((totalChange % 100) % 25) / 10;
            nickels = (((totalChange % 100) % 25) % 10) / 5;
            pennies = ((((totalChange % 100) % 25) % 10) % 5);

            if (dollars == 1) {
                System.out.println(dollars + " Dollar");
            } else if (dollars > 1) {
                System.out.println(dollars + " Dollars");
            }

            if (quarters == 1) {
                System.out.println(quarters + " Quarter");
            } else if (quarters > 1) {
                System.out.println(quarters + " Quarters");
            }

            if (dimes == 1) {
                System.out.println(dimes + " Dime");
            } else if (dimes > 1) {
                System.out.println(dimes + " Dimes");
            }

            if (nickels == 1) {
                System.out.println(nickels + " Nickel");
            } else if (nickels > 1) {
                System.out.println(nickels + " Nickels");
            }

            if (pennies == 1) {
                System.out.println(pennies + " Penny");
            } else if (pennies > 1) {
                System.out.println(pennies + " Pennies");
            }
        }

    }
}
