import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        if ((num1 <= num2) && (num1 <= num3)) {
            System.out.println(num1);
        } else if ((num2 <= num1) && (num2 <= num3)) {
            System.out.println(num2);
        } else if ((num3 <= num1) && (num3 <= num2)) {
            System.out.println(num3);
        }

    }
}
