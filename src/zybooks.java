import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        int highwayNumber;
        int primaryNumber;

        System.out.println("Highway number: ");
        highwayNumber = scnr.nextInt();

        if (((highwayNumber % 100) > 0) && (highwayNumber < 1000)) {
            primaryNumber = highwayNumber % 100;

            if ((highwayNumber % 2) == 0) {
                if (highwayNumber < 100) {
                    System.out.println("I-" + highwayNumber + " is primary, going east/west.");
                } else {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
                }
            } else {
                if (highwayNumber < 100) {
                    System.out.println("I-" + highwayNumber + " is primary, going north/south.");
                } else {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
                }
            }

        } else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }

    }
}

//     and service the primary highway indicated by the rightmost two digits. Thus, I-405 services I-5, and I-290 services I-90.

//        Given a highway number, indicate whether it is a primary or auxiliary highway. If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.
