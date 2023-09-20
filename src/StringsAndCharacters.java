public class StringsAndCharacters {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Good Bye";
        String str3 = "World!";

        String thirdCharacters = (str1.charAt(2) + "." + str2.charAt(2) + "." + str3.charAt(2)).toUpperCase();
        System.out.println(thirdCharacters);

        int str1ASCIIValue = 0;
        int str2ASCIIValue = 0;
        int str3ASCIIValue = 0;

//        for (char chr : str1.toCharArray()) {
//            str1ASCIIValue +
//            System.out.println(chr);
//        }

    }
}
