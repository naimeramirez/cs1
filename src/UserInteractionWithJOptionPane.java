import javax.swing.*;

public class UserInteractionWithJOptionPane {
    public static void main(String[] args) {
        String question1 = "What is your name?";
        String answer1 = JOptionPane.showInputDialog(question1);

        String question2 = "What is your favorite food?";
        String answer2 = JOptionPane.showInputDialog(question2);

        String question3 = "What is your age?";
        String answer3 = JOptionPane.showInputDialog(question3);
        int age = Integer.parseInt(answer3);

        String message1 = "<html>Nice to meet you " + answer1 + ".<br>" + "I also like " + answer2 + "!!<br>" + "Funny, I am also " + age + " years old!.</html>";

        JOptionPane.showMessageDialog(null, message1);

        int yearBorn = 2023 - age;
        String message2 = "<html>Nice to meet you " + answer1 + ".<br>" + "I also like " + answer2 + "!!<br>" + "I bet you were born on " + yearBorn + ", eh?";

        JOptionPane.showMessageDialog(null, message2);

    }
}
