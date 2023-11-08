import java.util.Scanner;

public class LeibnizPiCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println("N \t\t Pi");
        System.out.println("---------------------");
        for (int i = 0; i < n; i += 100) {
            System.out.println(i + "\t\t" + getLeibniz(i));
        }

    }

    public static double getNumerator(int k) {
        return Math.pow(-1, k);
    }

    public static double getDenominator(int k) {
        return 2 * k + 1;
    }

    public static double getLeibniz(int k) {
        double pi = 0;

        for (int i = 0; i < k; ++i) {
            double leibniz = (4 * getNumerator(i)) / getDenominator(i);
            pi += leibniz;
        }
        return pi;
    }

}
