import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        String str = scnr.next();
//        int num = scnr.nextInt();


                FoodType order1 = new FoodType("Steak");
                FoodType order2 = new FoodType("Salad");
                FoodType order3 = new FoodType("Muffins");
                FoodType order4 = new FoodType("Bread");

                order3.print();

                System.out.println("Next ID: " + FoodType.getNextId());




    }

}
