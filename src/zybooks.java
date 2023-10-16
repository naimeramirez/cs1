import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        char charInput;
        int sumChars;

        sumChars = 0;
        charInput = scnr.next().charAt(0);

        while (charInput != 'e') {
            sumChars++;
            charInput = scnr.next().charAt(0);
        }

        System.out.println(sumChars);

    }
}

//    Character charInput is read from input. Write a while loop that reads characters from input until character 'e' is read. Then, count the total number of characters read. Character 'e' should not be included in the count.