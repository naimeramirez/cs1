import java.util.Random;
public class OrderingAndStringComparison {
    public static void main(String[] args) {
        Random random = new Random();

        int x1 = random.nextInt(101);
        int x2 = random.nextInt(101);

        if (x1 <= x2) {
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println(x2);
            System.out.println(x1);
        }

    }
}
