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


        String str1 = "a";
        String str2 = "b";

        System.out.println(str1.compareTo(str2)); //-1

        if (str1.compareTo(str2) < 0) {
            System.out.println(str1);
            System.out.println(str2);
        } else {
            System.out.println(str2);
            System.out.println(str1);
        }

        if (str1.equals(str2)) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are different");
        }

    }
}
