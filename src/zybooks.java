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