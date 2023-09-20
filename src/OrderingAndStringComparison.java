import java.util.Random;

public class OrderingAndStringComparison {
    public static void main(String[] args) {
        Random random = new Random();

        int x1 = random.nextInt(101);
        int x2 = random.nextInt(101);

        if (x1 <= x2) {
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println(x2);
            System.out.println(x1);
        }


        String str1example = "a";
        String str2example = "b";

        System.out.println(str1example.compareTo(str2)); //-1

        if (str1example.compareTo(str2example) < 0) {
            System.out.println(str1example);
            System.out.println(str2example);
        } else {
            System.out.println(str2example);
            System.out.println(str1example);
        }

        if (str1example.equals(str2example)) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are different");
        }

// -------- chapter 2 assignment 3 --------

        String str1 = "c";
        String str2 = "a";
        String str3 = "b";

        int value1 = str1.compareTo(str2);
        System.out.println(value1); //-1

        int value2 = str2.compareTo(str1);
        System.out.println(value2); //1

        int value3 = str1.compareTo(str1);
        System.out.println(value3); //0

        // two strings
        if(str1.compareTo(str2) < 0){
            //System.out.println("First string: "+str1);
            //System.out.println("Second string: "+str2);

            if(str1.compareTo(str3) < 0){
                if(str2.compareTo(str3) < 0){
                    System.out.println("First string: "+str1);
                    System.out.println("Second string: "+str2);
                    System.out.println("Third string: "+str3);
                }else{
                    System.out.println("First string: "+str1);
                    System.out.println("Second string: "+str3);
                    System.out.println("Third string: "+str2);
                }
            }
            else{
                System.out.println("First string: "+str3);
                System.out.println("Second string: "+str1);
                System.out.println("Third string: "+str2);
            }
        }
        else{
            //System.out.println("First string: "+str2);
            //System.out.println("Second string: "+str1);

            if(str2.compareTo(str3) < 0){
                if(str1.compareTo(str3) < 0){
                    System.out.println("First string: "+str2);
                    System.out.println("Second string: "+str1);
                    System.out.println("Third string: "+str3);
                }
                else{
                    System.out.println("First string: "+str2);
                    System.out.println("Second string: "+str3);
                    System.out.println("Third string: "+str1);
                }
            }
            else{
                System.out.println("First string: "+str3);
                System.out.println("Second string: "+str2);
                System.out.println("Third string: "+str1);
            }
        }

    }
}
