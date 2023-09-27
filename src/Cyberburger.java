import java.util.Scanner;

public class Cyberburger {
    public static void main(String[] args) {
        Scanner intScnr = new Scanner(System.in);
        Scanner stringScnr = new Scanner(System.in);

        System.out.println("============== CyberBurger ==============");
        System.out.println("(1) Cyberburger");
        System.out.println("(2) Double Meat Cyberburger");
        System.out.println("(3) Triple Meat Cyberburger");
        System.out.println("(4) Jalapeno and Cheese");
        System.out.println("(5) Bacon and Cheese");
        System.out.println("(6) Salad");
        System.out.println("============== CyberBurger ==============");
        System.out.println("Enter the menu item that you want: ");
        int menu = intScnr.nextInt();

        double total;

        switch (menu) {
            case 1, 2, 3:
                System.out.println("Would you like cheese with that? yes/no ");
                String cheese = stringScnr.nextLine();

                if (cheese.equals("yes")) {
                    switch (menu) {
                        case 1:
                            total =
                            System.out.println("Your order is Cyberburger with cheese. Your total is $" + total);
                        case 2:
                            System.out.println("Your order is Double Meat Cyberburger with cheese. Your total is $" + total);
                        case 3:
                            System.out.println("Your order is Triple Meat Cyberburger with cheese. Your total is $" + total);
                        default:
                            System.out.println("error");
                    }

                } else if (cheese.equals("no")) {
                    switch (menu) {
                        case 1:
                            System.out.println("Your order is Cyberburger without cheese. Your total is $" + total);
                        case 2:
                            System.out.println("Your order is Double Meat Cyberburger without cheese. Your total is $" + total);
                        case 3:
                            System.out.println("Your order is Triple Meat Cyberburger without cheese. Your total is $" + total);
                        default:
                            System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
                break;

            case 4:
                System.out.println("Your order is Jalapeno and Cheese. Your total is $" + total);

            case 5:
                System.out.println("Your order is Bacon and Cheese. Your total is $" + total);

            case 6:
                System.out.println("Your order is Salad. Your total is $" + total);

            default:
                System.out.println("Combo does not exist");
        }


    }
}
