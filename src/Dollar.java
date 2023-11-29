import java.util.Calendar;

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
        int age = year - currentYear;

        return age;
    }

    public static void showBill() {

    }

    public static void main(String[] args) {
        Dollar dollar = new Dollar(1, "abcdefgh", 2020);



    }
}
