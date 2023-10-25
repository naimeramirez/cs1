import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        String item;
        int quantity;
        int discount;

        StringWriter itemCharStream = new StringWriter();
        PrintWriter itemOSS = new PrintWriter(itemCharStream);

        item = "Book";
        quantity = 10;
        discount = 35;

        itemOSS.println(item + " x" + quantity);
        itemOSS.print(discount + "% off");

        System.out.print(itemCharStream.toString());

    }
}