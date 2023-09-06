import java.util.Scanner;
public class WeatherChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get temperature form user
        System.out.println("Enter temperature");
        int temp = input.nextInt();
        input.close();

        // Print the correct statement
        // Hot temperatures
        if( temp >= 110)
        {
            System.out.println("Do not go outside!");
        }
        else if( temp >= 80)
        {
            System.out.println("wear shorts and t-shirt");
        }
        // Cold temperatures
        else if( temp <= 30)
        {
            System.out.println("Do not go outside!");
        }
        else
        {
            System.out.println("wear pants and jacket");
        }
    }
}
