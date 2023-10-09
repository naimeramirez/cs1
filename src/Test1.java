import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter first number:");
        int x = scnr.nextInt();

        System.out.println("Enter second number: ");
        int y = scnr.nextInt();

        if ((x == 81) || (y == 81)) {
            System.out.println("True");
        } else if ((x + y) == 81) {
            System.out.println("True");
        } else if (Math.pow(x, y) == 81) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
