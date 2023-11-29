import java.util.Scanner;

public class ArgsProcessor {
    public static void main(String[] a) {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.next();
        int count = 0;

        if (scnr.hasNext()) {
            count++;
            int i = 0;


        }
//            count++;
//            a[count] = scnr.next();
//        }

        System.out.println("Total size: " + a.length);

        if (a.length <= 0) {
            System.out.println("Nothing to process");
        } else {
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            int z = x + y;
            System.out.println("The sum is: " + z);
        }

//        String[] a;
//        int sum = 0;

//        int count = 0;

//        if (scnr.hasNext()) {
//            count++;
//            a[count] = scnr.next();
//        }

//        for (int i = 0; i < a.length; ++i) {
//
//        }

//        for (int i = 0; i < a.length; ++i) {
//            System.out.println(a[i]);
//        }


    }
}
