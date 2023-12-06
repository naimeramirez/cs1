import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MoneyProcessor {
    public static void main(String[]args) throws IOException {
        Scanner fileScanner = new Scanner(new File("/Users/ramirez/IdeaProjects/cs1/src/money.txt"));

        Dollar[] wallet = new Dollar[2];
        int index = 0;

        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] lineArray = line.split(",");
            Dollar dollar = new Dollar(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], Integer.parseInt(lineArray[3]));

            dollar.showBill();

            if (index < wallet.length) {
                wallet[index] = dollar;
                ++index;
            } else {
                break;
            }

        }

        System.out.println("Wallet 0: " + wallet[0].getDenomination());
        System.out.println("Wallet 0: " + wallet[1].getDenomination());

    }
}
