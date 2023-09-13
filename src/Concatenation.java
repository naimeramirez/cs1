public class Concatenation {

    public static void main(String[] args) {

        String month = "September";
        String day = "Wednesday";
        String major = "COMPUTER SCIENCE";

        String connected = "Today is " + month + ", 2023. The day is " + day + ". Our study major is " + major + ".";
        System.out.println(connected);

        int length = ((month.concat(day)).concat(major)).length();
        System.out.println(length);

        String firstName = "Naime";
        String lastName = "Ramirez";
        System.out.println(firstName + " " + lastName);

        String initials = firstName.charAt(0) + "." + lastName.charAt(0) + ".";

        System.out.println(initials);





    }
}
