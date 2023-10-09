import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Month: ");
        String month = scnr.nextLine();

        System.out.println("Day: ");
        int day = scnr.nextInt();

        System.out.println("Year: ");
        int year = scnr.nextInt();

        if ((month.equals("February")) && (day == 22) & (year == 2022)) {
            System.out.println("This is a palindrome day");
        } else {
            System.out.println("This is not a palindrome day");
        }

    }
}
