import javax.swing.*;
import java.util.Random;

public class RockPaperScissors {

    static Random rand = new Random();

    public static void main(String[] args) {

        String userChoice;
        String computerChoice;

        do {
            computerChoice = getComputerChoice();
            userChoice = getUserChoice();

            showComputerChoice(computerChoice);

        } while (isTie(userChoice, computerChoice)); // repeat if tie

        showWinner(userChoice, computerChoice);
    }

    // generate computer choice (1–3)
    static String getComputerChoice() {
        int num = rand.nextInt(3) + 1;

        if (num == 1) return "rock";
        else if (num == 2) return "paper";
        else return "scissors";
    }

    // get user input
    static String getUserChoice() {
        return JOptionPane.showInputDialog(
                "Enter rock, paper, or scissors:");
    }

    // display computer choice
    static void showComputerChoice(String choice) {
        JOptionPane.showMessageDialog(null,
                "Computer chose: " + choice);
    }

    // check for tie
    static boolean isTie(String user, String comp) {
        if (user.equalsIgnoreCase(comp)) {
            JOptionPane.showMessageDialog(null, "It's a tie! Play again.");
            return true;
        }
        return false;
    }

    // determine winner
    static void showWinner(String user, String comp) {

        user = user.toLowerCase();

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("scissors") && comp.equals("paper")) ||
                (user.equals("paper") && comp.equals("rock"))) {

            JOptionPane.showMessageDialog(null, "You win!");
        } else {
            JOptionPane.showMessageDialog(null, "Computer wins!");
        }
    }
}