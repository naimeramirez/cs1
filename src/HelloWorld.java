import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "FName LName";
        System.out.println("Name: " + name);

        int test1 = 95;
        int test2 = 100;

        double testAverage = (test1 + test2) / 2.0;

        int hw1 = 100;
        int hw2 = 90;
        int hw3 = 85;

        double hwAverage = (hw1 + hw2 + hw3) / 3.0;

        int finalExam = 50;

        double finalGrade = (0.6 * testAverage) + (0.1 * hwAverage) + (0.3 * finalExam);

        System.out.println("Final grade (numeric): " + finalGrade);

        char gradeSymbolic = 'N';

        boolean gradeACondition = finalGrade >= 90;
        boolean gradeBCondition = (finalGrade >= 80) && (90 > finalGrade);
        boolean gradeCCondition = (finalGrade >= 70) && (80 > finalGrade);
        boolean gradeDCondition = (finalGrade >= 60) && (70 > finalGrade);
        boolean gradeFCondition = finalGrade < 60;

        System.out.println("gradeACondition: " + gradeACondition);
        System.out.println("gradeBCondition: " + gradeBCondition);
        System.out.println("gradeCCondition: " + gradeCCondition);
        System.out.println("gradeDCondition: " + gradeDCondition);
        System.out.println("gradeFCondition: " + gradeFCondition);

        if (gradeACondition) {
            gradeSymbolic = 'A';
        }

        if (gradeBCondition) {
            gradeSymbolic = 'B';
        }

        if (gradeCCondition) {
            gradeSymbolic = 'C';
        }

        if (gradeDCondition) {
            gradeSymbolic = 'D';
        }

        if (gradeFCondition) {
            gradeSymbolic = 'F';
        }

        System.out.println("Final grade (letter): " + gradeSymbolic);

    }

}
