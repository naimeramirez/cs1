public class MyStringOperation {

    public static void main(String[] args) {

        String word = "pRoGrAmiNg iS, FuN?";
        System.out.println(word);

        int wordLength = word.length();
        System.out.println(wordLength);

        String wordToLowerCase = word.toLowerCase();
        System.out.println(wordToLowerCase);

        char wordFirstLetter = word.charAt(0);
        System.out.println(wordFirstLetter);

        char wordSecondLetter = word.charAt(1);
        System.out.println(wordSecondLetter);

        char wordLastCharacter = word.charAt(wordLength - 1);
        System.out.println(wordLastCharacter);

        String wordFun = (word.substring(15, 18)).toUpperCase();
        System.out.println(wordFun);

        String wordPrograming = (word.substring(0, 10)).toLowerCase();
        System.out.println(wordPrograming);

    }

}
