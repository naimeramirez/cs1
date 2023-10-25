import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        int result;
        int stop;
        int a;
        int b;

        stop = scnr.nextInt();
        result = 0;

        for (a = 0; a < 3; ++a) {
            System.out.print(a + ": ");
            for (b = 0; b < 2; ++b) {
                result += a + b;
                if (result > stop) {
                    System.out.print("_ ");
                    continue;
                }
                System.out.print(result + ",");
            }
            System.out.println();
        }

    }
}