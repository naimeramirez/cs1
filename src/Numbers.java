import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        if (((num1 < 10) || (num1 > 50)) || ((num2 < 10) || (num2 > 50)) || ((num3 < 10) || (num3 > 50))) {
            System.out.println("invalid number");
        } else if ((num1 == num2) && (num2 == num3)) {
            System.out.println("Multiple values identical");
        } else {
            if ((num1 < num2) && (num1 < num3)) {
                if (num2 < num3) {
                    System.out.println("Smallest value: " + num1);
                    System.out.println("Largest value: " + num3);
                } else {
                    System.out.println("Smallest value: " + num1);
                    System.out.println("Largest value: " + num2);
                }
            } else if ((num2 < num1) && (num2 < num3)) {
                if (num1 < num3) {
                    System.out.println("Smallest value: " + num2);
                    System.out.println("Largest value: " + num3);
                } else {
                    System.out.println("Smallest value: " + num2);
                    System.out.println("Largest value: " + num1);
                }

            } else if ((num3 < num1) && (num3 < num2)) {
                if (num2 < num1) {
                    System.out.println("Smallest value: " + num3);
                    System.out.println("Largest value: " + num1);
                } else {
                    System.out.println("Smallest value: " + num3);
                    System.out.println("Largest value: " + num2);
                }
            }

            // Write a program that asks the computer to enter three values.
            //Each of these values must be integers between 10 and 30
            //The program shall find out the smallest and the largest of the three
            //Display them using System.out.println():. If the three values are the same,
            //the program shall display "Multiple values identical".

        }
    }
}
