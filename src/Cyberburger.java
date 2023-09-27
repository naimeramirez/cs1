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

        double cheesePrice = 0.50;
        double tax = 0.0825;

        String cheese;
        double price;

        switch (menu) {
            case 1:
                price = 8.00;
                System.out.println("Would you like cheese with that? yes/no ");
                cheese = stringScnr.nextLine();

                if (cheese.equals("yes")) {
                    total = price + cheesePrice + ((price + cheesePrice) * tax);
                    System.out.print("Your order is Cyberburger with cheese. Your total is $");
                    System.out.printf("%.2f", total);
                } else {
                    total = price + (price * tax);
                    System.out.print("Your order is Cyberburger without cheese. Your total is $");
                    System.out.printf("%.2f", total);
                }
                break;
            case 2:
                price = 9.00;
                System.out.println("Would you like cheese with that? yes/no ");
                cheese = stringScnr.nextLine();

                if (cheese.equals("yes")) {
                    total = price + cheesePrice + ((price + cheesePrice) * tax);
                    System.out.print("Your order is Double Meat Cyberburger with cheese. Your total is $");
                    System.out.printf("%.2f", total);
                } else {
                    total = price + (price * tax);
                    System.out.print("Your order is Double Meat Cyberburger without cheese. Your total is $");
                    System.out.printf("%.2f", total);
                }
                break;
            case 3:
                price = 10.00;
                System.out.println("Would you like cheese with that? yes/no ");
                cheese = stringScnr.nextLine();

                if (cheese.equals("yes")) {
                    total = price + cheesePrice + ((price + cheesePrice) * tax);
                    System.out.print("Your order is Triple Meat Cyberburger with cheese. Your total is $");
                    System.out.printf("%.2f", total);
                } else {
                    total = price + (price * tax);
                    System.out.print("Your order is Triple Meat Cyberburger without cheese. Your total is $");
                    System.out.printf("%.2f", total);
                }
                break;
            case 4:
                price = 8.00;
                total = price + (price * tax);
                System.out.print("Your order is Jalapeno and Cheese. Your total is $");
                System.out.printf("%.2f", total);
                break;

            case 5:
                price = 9.00;
                total = price + (price * tax);
                System.out.print("Your order is Bacon and Cheese. Your total is $");
                System.out.printf("%.2f", total);
                break;

            case 6:
                price = 7.00;
                total = price + (price * tax);
                System.out.print("Your order is Salad. Your total is $");
                System.out.printf("%.2f", total);
                break;

            default:
                System.out.println("Combo does not exist");
        }


    }
}
