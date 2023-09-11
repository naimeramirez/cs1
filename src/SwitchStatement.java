import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        String question = "2+2";
        String answer = "I do not know";

        boolean continueProgram = true;
        Scanner input = new Scanner(System.in);


        while (continueProgram) {
            System.out.println("Write a question: ");
            question = input.nextLine();

            switch (question) {
                case "2+2":
                    answer = "4";
                    break;
                case "2+3":
                    answer = "5";
                    break;
                case "hello":
                    answer = "hello";
                    break;
                case "exit":
                    answer = "Stop the program";
                    continueProgram = false;
                    break;
                default:
                    answer = "I do not know";
            }

            System.out.println("Question: " + question);
            System.out.println("Answer: " + answer);
        }
    }
}
