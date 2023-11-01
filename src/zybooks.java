import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        String str = scnr.next();
//        int num = scnr.nextInt();

        Scanner scnr = new Scanner(System.in);
        String userString;
        // Add more variables as needed

        userString = scnr.next();
        /* Type your code here. */

//        Character.isDigit()
        boolean isInteger = true;

        for (int i = 0; i < userString.length(); i++) {
            if (!Character.isDigit(userString.charAt(i))) {
                isInteger = false;
                break;
            }
        }

        if (isInteger) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}