import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MoneyProcessor {
    public static void main(String[]args) throws IOException {
        Scanner fileScanner = new Scanner(new File("/Users/ramirez/IdeaProjects/cs1/src/money.txt"));

        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
//            System.out.println(line);
        }

    }
}
