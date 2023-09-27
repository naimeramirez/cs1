import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        double x;
        double y;
        double z;

        int kidsInClass1;
        int kidsInClass2;
        int numClasses;

        kidsInClass1 = 7;
        kidsInClass2 = 6;
        numClasses = 2;

        System.out.println((double)(kidsInClass1 + kidsInClass2) / (double)(numClasses));

        System.out.println((kidsInClass1 + kidsInClass2) / (numClasses));

    }
}
