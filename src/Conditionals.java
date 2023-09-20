import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number 1:");
        int x1 = input.nextInt();

        System.out.println("Number 2:");
        int x2 = input.nextInt();

        if (x1 <= x2) {
            System.out.println(x1 + ", " + x2);
        } else {
            System.out.println(x2 + ", " + x1);
        }

    }
}
