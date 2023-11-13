import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Input a String: ");
        String str = scnr.next();

        int vowels = countVowels(str);
        String reverse = getReverse(str);

        System.out.println("Total number of vowels: " + vowels);
        System.out.println("String in Reverse: " + reverse);

    }

    public static int countVowels (String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count = count + 1;
            }
        }

        return count;
    }
    public static String getReverse (String str) {
        int n = str.length() - 1;
        String reverseStr = "";

        for (int i = n; i >= 0; --i) {
            char ch = str.charAt(i);
            reverseStr += ch;
        }

        return reverseStr;
    }
}
