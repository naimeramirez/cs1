import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        int nextChoice;

        nextChoice = scnr.nextInt();

        switch (nextChoice) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

    }
}

//    Write a switch statement that checks nextChoice. If 0, print "Rock". If 1, print "Paper". If 2, print "Scissors". For any other value, print "Unknown". End with newline.