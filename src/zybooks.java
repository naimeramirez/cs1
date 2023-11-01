import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        boolean cont = true;

        while (cont == true) {
            String str = scnr.next();
            int num = scnr.nextInt();

            if (str.equals("quit") || (num == 0)) {
                cont = false;
            } else {
                System.out.println("Eating " + num + " " + str + " a day keeps you happy and healthy.");
            }
        }
    }
}