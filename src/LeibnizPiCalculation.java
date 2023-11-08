import java.util.Scanner;

public class LeibnizPiCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;
        double den;

        int n = input.nextInt();
        System.out.println("N \t\t Pi");
        System.out.println("---------------------");
        for (int i = 0; i < n; i += 100) {
            System.out.println(i + "\t\t" + getLeibniz(i));
        }

    }

    public static double getNumerator(int k) {
        double num = Math.pow(-1, k);
        return num;
    }

    public static double getDenominator(int k) {
        double den = 2 * k + 1;
        return den;
    }

    public static double getLeibniz(int k) {

        return k;
    }

}
