import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessing {
    public static void main(String[]args) throws IOException {

        Scanner fileScanner = new Scanner(new File("/Users/ramirez/IdeaProjects/cs1/src/numbers.txt"));

        double sum = 0;
        double numOfElements = 0;
        double mean = 0;

        double sub = 0;
        double pow = 0;
        double sigma = 0;
        double frac = 0;
        double stdev = 0;

        double smallest = 0;
        double largest = 0;



        while(fileScanner.hasNext()) {
            double currentNum = fileScanner.nextInt();
            sum += currentNum;
            numOfElements++;
            mean = sum/numOfElements;

            sub = currentNum - mean;
            pow = Math.pow(sub, 2);
            sigma = pow + numOfElements;
            frac = sigma / (numOfElements - 1);
            stdev = Math.sqrt(frac);

            if (numOfElements == 1 || currentNum < smallest) {
                smallest = currentNum;
            }

            if (numOfElements == 1 || currentNum > largest) {
                largest = currentNum;
            }
//            String current = fileScanner.nextLine();
//            System.out.println(current);
        }
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdev);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);


    }
}
