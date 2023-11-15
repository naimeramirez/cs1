import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndMethods {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter number of scores: ");
        int numScores = scnr.nextInt();

        int[] scoresArray = new int[numScores];

        for (int i = 0; i < scoresArray.length; ++i) {
            System.out.println("Enter score: ");
            scoresArray[i] = scnr.nextInt();
        }

        print(scoresArray);
        getAVG(scoresArray);
        findMaxGrade(scoresArray);

    }

    public static void print(int[] scoresArr) {
        for (int i = 0; i < scoresArr.length; ++i) {
            System.out.println("Score: " + scoresArr[i]);
        }
    }

    public static void getAVG(int[] scoresArr) {
        double gradeAVG = 0;
        double scoreSum = 0;

        for (int i = 0; i < scoresArr.length; ++i) {
            scoreSum = scoreSum + scoresArr[i];
        }

        gradeAVG = scoreSum / scoresArr.length;

        System.out.println("Grade Average: " + gradeAVG);
        getGradeByAVG(gradeAVG);
    }

    public static void getGradeByAVG(double numGrade) {
        char letterGrade = 'F';

        if (numGrade >=60 && numGrade <= 70) {
            letterGrade = 'D';
        } else if (numGrade > 70 && numGrade <= 80) {
            letterGrade = 'C';
        } else if (numGrade > 80 && numGrade <= 90) {
            letterGrade = 'B';
        } else if (numGrade > 90 && numGrade <= 100) {
            letterGrade = 'A';
        } else {
            letterGrade = 'F';
        }

        System.out.println("Grade: " + letterGrade);
    }

    public static void findMaxGrade(int[] scoresArr) {
        int largestGrade = 0;
        for (int i = 0; i < scoresArr.length; ++i) {

            if (scoresArr[i] > largestGrade) {
                largestGrade = scoresArr[i];
            }
        }

        System.out.println("Largest Grade: " + largestGrade);
    }

}
