import java.util.Scanner;

public class zybooks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        String str = scnr.nextLine();
//        int num = scnr.nextInt();

        double initMass = 10.0;
        double growthRate = 1.0;
        double yearsGrow = 3;
        double finalMass;
        finalMass = initMass * Math.pow(1.0 + growthRate, yearsGrow);

        System.out.println(finalMass);

    }
}
