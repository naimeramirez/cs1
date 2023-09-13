import java.util.Scanner;

public class UserInteractionWithScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String question1 = "What is your name?";
        System.out.println(question1);
        String answer1 = input.nextLine();

        String question2 = "What is your favorite food?";
        System.out.println(question2);
        String answer2 = input.nextLine();

        String question3 = "What is your age?";
        System.out.println(question3);
        int answer3 = Integer.parseInt(input.nextLine());

        System.out.println("Nice to meet you " + answer1 + ".");
        System.out.println("I also like " + answer2 + "!!");
        System.out.println("Funny, I am also " + answer3 + " years old!.");

        int yearBorn = 2023 - answer3;
        System.out.println("Nice to meet you " + answer1 + ".");
        System.out.println("I also like " + answer2 + "!!");
        System.out.println("I bet you were born on " + yearBorn + ", eh?");



    }

}
