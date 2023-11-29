import java.util.Calendar;
import java.util.Random;

public class Dollar {
    private int denomination;
    private String face;
    private String serial;
    private int year;

    public Dollar(int denomination, String face, String serial, int year) {
        this.denomination = denomination;
        this.face = face;
        this.serial = serial;
        this.year = year;
    }

    public Dollar(int denomination, String serial, int year) {
        this.denomination = denomination;
        this.face = initializeFace(denomination);
        this.serial = serial;
        this.year = year;
    }

    public Dollar(int denomination, int year) {
        this.denomination = denomination;
        this.face = initializeFace(denomination);
        this.serial = generateSerial();
        this.year = year;
    }

    public int getDenomination() {
        return denomination;
    }

    public String getFace() {
        return face;
    }

    public String getSerial() {
        return serial;
    }

    public int getYear() {
        return year;
    }

    public int getAge(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - year;
    }

    public void showBill(){
        System.out.println("$" + denomination + ". Face:" + face + ". Serial:" + serial + " is " + getAge(year) + " years old");

    }

    private String initializeFace(int denomination) {
        String face;

        switch (denomination) {
            case 1:
                face = "George Washington";
                break;
            case 2:
                face = "Thomas Jefferson";
                break;
            case 5:
                face = "Abraham Lincoln";
                break;
            case 10:
                face = "Alexander Hamilton";
                break;
            case 20:
                face = "Andrew Jackson";
                break;
            case 50:
                face = "Ulysses S. Grant";
                break;
            case 100:
                face = "Benjamin Franklin";
                break;
            default:
                face = "unknown";
        }

        return face;
    }

    private String generateSerial() {
        char firstChar = (char) ('a' + new Random().nextInt(26));
        char lastChar = (char) ('a' + new Random().nextInt(26));

        String digits = "";
        for (int i = 0; i < 9; i++) {
            int digit = new Random().nextInt(10);
            digits += digit;
        }

        String serialGenerated = firstChar + digits + lastChar;

        return serialGenerated;
    }

//    public static void main(String[] args) {
//        Dollar dollar1 = new Dollar(1, "a123456789h", 2020);
//        Dollar dollar2 = new Dollar(5, 2001);
//
//        dollar1.showBill();
//        dollar2.showBill();
//    }
}
