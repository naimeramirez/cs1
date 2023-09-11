import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Random random = new Random();



        int c1 = 0;

        int c2 = 2;

        int c3 = 1;

        int c4 = -2;



        System.out.println("c1= "+c1);

        System.out.println("c2= "+c2);

        System.out.println("c3= "+c3);

        System.out.println("c4= "+c4);



        int x = 2;

        int y = 2;



        if (c1>0){

            x = x+1;

        }

        else if(c1<0){

            x = x-1;

        }



        if (c2>0){

            y = y+1;

        }

        else if (c2<0){

            y = y-1;

        }



        if (c3>0){

            x = x+1;

        }

        else if(c3<0){

            x = x-1;

        }



        if (c4>0){

            y = y+1;

        }

        else if(c4<0){

            y = y-1;

        }



        System.out.println("x= "+x);

        System.out.println("y= "+y);

    }


}
