import javax.swing.*;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        Random rand = new Random();

        int computerWins = 0;
        int userWins = 0;

        for (int i = 1; i <= 10; i++) {

            int computerDie = rand.nextInt(6) + 1;
            int userDie = rand.nextInt(6) + 1;

            JOptionPane.showMessageDialog(null,
                    "Round " + i +
                            "\nComputer rolled: " + computerDie +
                            "\nUser rolled: " + userDie);

            if (computerDie > userDie) {
                computerWins++;
            } else if (userDie > computerDie) {
                userWins++;
            }
        }

        String result;

        if (computerWins > userWins) {
            result = "Computer is the grand winner!";
        } else if (userWins > computerWins) {
            result = "User is the grand winner!";
        } else {
            result = "It's a tie!";
        }

        JOptionPane.showMessageDialog(null,
                "Computer wins: " + computerWins +
                        "\nUser wins: " + userWins +
                        "\n" + result);
    }
}