import java.util.Scanner;

public class LoopInteraction {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scnr.nextLine();
        System.out.print("Number: ");
        int n = scnr.nextInt();

        System.out.println("n: " + n);
        System.out.println("Name: " + name);

        System.out.print("for: " + name);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + name);
        }

        System.out.println();
        int j = 1;
        System.out.print("while: " + name);
        while (j < n) {
            System.out.print(", " + name);
            j++;
        }

        System.out.println();
        int k = 1;
        System.out.print("do while: " + name);
        do {
            System.out.print(", " + name);
            k++;
        } while (k < n);

    }
}
