import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

                String question = "how are you today?";
                String answer = "I do not know";

                switch (question){
                    case "2+2":
                        answer = "4";
                        break;
                    case "2+3":
                        answer = "5";
                        break;
                    case "hello":
                        answer = "hello";
                        break;
                    default:
                        answer = "I do not know";
                }

                System.out.println("question="+question);
                System.out.println("answer="+answer);




    }
}
