import java.util.Scanner;

public class CreatePassword {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String firstName = scnr.next();

        String lastName = scnr.next();

        String fourDigits = scnr.next();

        String first6LettersOfFirstName;

        if (firstName.length() >= 6) {
            first6LettersOfFirstName = firstName.substring(0, 5);
        } else {
            first6LettersOfFirstName = firstName;
        }

        String firstLetterOfLastName = String.valueOf(lastName.charAt(0)).toUpperCase();
        String lastDigit = String.valueOf(fourDigits.charAt(fourDigits.length() - 1));

        String password = first6LettersOfFirstName + firstLetterOfLastName + "_" + lastDigit;

        System.out.println(password);

//        Output the login name, which is made up of the first six letters of the first name, followed by the first letter of the last name, an underscore (_), and then the last digit of the number (use the % operator). If the first name has less than six letters, then use all letters of the first name.

    }
}
