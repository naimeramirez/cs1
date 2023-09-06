public class VariableManipulation {

    public static void main(String[] args) {

        String word = "computer";
        String word2 = "laptop";

        int x = 5;
        double y = 7.2;

        char third = word.charAt(2);

        System.out.println(third);

        double sum = x + y;

        System.out.println(sum);

        String firstChar = String.valueOf(word2.charAt(0));
        String secondChar = String.valueOf(word2.charAt(1)).toUpperCase();
        String wordEnd = word2.substring(2,6);
        String second = firstChar.concat(secondChar).concat(wordEnd);

        System.out.println(second);

        String a = firstChar;
        String b = secondChar;
        String c = String.valueOf(x);
        int length = word.length();
        String d = String.valueOf(word.charAt(length - 1));
        String e = String.valueOf(y);
        String f = "!";

        String password = a + b + c + d + e + f;

        System.out.println(password);

    }
}
