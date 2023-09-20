import java.util.Scanner;

public class CheckForTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the temperature?");
        double temperature = Double.parseDouble(input.nextLine());

        if (temperature > 80) {
            System.out.println("It is hot");
        } else {
            System.out.println("it is cold");
        }

    }
}
