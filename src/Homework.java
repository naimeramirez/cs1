import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {



        int F0 =
                72
                ;

        int F1 = 1;

        int F2 = F0+F1;

        int F3 = F1+F2;

        int F4 = F2+F3;

        int F5 = F3+F4;

        int F6 = F4+F5;

        int F7 = F5+F6;



        System.out.println(F7);


        // In order to extract information we need to create a Scanner

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = input.nextLine();

        System.out.println("What is your favorite food?");

        String food = input.nextLine();

        System.out.println("What is your age?");

        int age = input.nextInt();

        int year = 2023 - age;

        String response = name+food+year;

        System.out.println(response);

    }


}
