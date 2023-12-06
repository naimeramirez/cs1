import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MoneyProcessor {
    public static void main(String[]args) throws IOException {
        Scanner fileScanner = new Scanner(new File("/Users/ramirez/IdeaProjects/cs1/src/money.txt"));

        Dollar[] wallet = new Dollar[500];
        int index = 0;

        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] lineArray = line.split(",");
            Dollar dollar = new Dollar(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], Integer.parseInt(lineArray[3]));

//            dollar.showBill();

            if (index < wallet.length) {
                wallet[index] = dollar;
                ++index;
            } else {
                break;
            }

        }

//        System.out.println("Wallet 0: " + wallet[0].getDenomination());
//        System.out.println("Wallet 0: " + wallet[1].getDenomination());

        printBills(wallet);
        printOnlyDenominations(wallet);
        System.out.println("Total Amount in Wallet: $" + getTotalAmountInWallet(wallet));

    }

    public static void printBills(Dollar[] bills) {
        for (Dollar bill : bills) {
            if (bill != null) {
                bill.showBill();
            }
        }
    }

    public static void printOnlyDenominations(Dollar[] bills) {
        for (Dollar bill : bills) {
            if (bill != null) {
                System.out.println("Denomination: " + bill.getDenomination());
            }
        }
    }

    public static int getTotalAmountInWallet(Dollar[] bills) {
        int totalAmount = 0;
        for (Dollar bill : bills) {
            if (bill != null) {
                totalAmount += bill.getDenomination();
            }
        }
        return totalAmount;
    }

}
