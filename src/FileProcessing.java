import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessing {
    public static void main(String[]args) throws IOException {

        Scanner fileScanner = new Scanner(new File("/Users/ramirez/IdeaProjects/cs1/src/numbers.txt"));

        double sum = 0;
        double numOfElements = 0;


        while(fileScanner.hasNext()) {
            double currentNum = fileScanner.nextInt();
            sum += currentNum;
            numOfElements++;
//            String current = fileScanner.nextLine();
//            System.out.println(current);
        }
        System.out.println("Mean:");
        System.out.println(sum/numOfElements);


    }
}
