public class IfElse {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        System.out.println("Starting coordinates: x=" + x + " y=" + y);

        if (x == 0) {
            y = 0;
        } else if (x == 1) {
            y = 1;
        } else if (x == 2) {
            y = 4;
        } else if (x == 3) {
            y = 9;
        } else if (x == 4) {
            y = 16;
        } else if (x == 5) {
            y = 25;
        }

        System.out.println("Starting coordinates: x=" + x + " y=" + y);

        if ((x == 0) && (y == 1)) {
            x=1;
            System.out.println("Coordinates: x=" + x + " y=" + y);

        } else if ((x == 0) && (y == 0)) {
            x = 1;
            y = 1;
            System.out.println("Coordinates: x=" + x + " y=" + y);

        } else if ((x == 1) && (y == 0)) {
            y = 1;
            System.out.println("Coordinates: x=" + x + " y=" + y);

        } else if ((x == 1) && (y == 1)) {
            System.out.println("Coordinates: x=" + x + " y=" + y);

        } else  {
            System.out.println("Error");
        }





    }
}
